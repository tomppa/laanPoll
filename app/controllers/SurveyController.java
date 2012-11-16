package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;
import views.html.*;

public class SurveyController extends Controller {

  // declarations  
  static Form<Survey> surveyForm = form(Survey.class);

  // methods
  public static Result index() {
    Survey survey = new Survey(true);

    surveyForm = surveyForm.fill(survey);

    return ok(form.render(surveyForm));
  }

  public static Result send() {
    surveyForm = surveyForm.bindFromRequest();
    if (surveyForm.hasErrors()) {
      Logger.info("Validation failed.");
      Logger.info(surveyForm.errorsAsJson().toString());
      return ok(form.render(surveyForm));
    }
    return ok(result.render());
  }

}
