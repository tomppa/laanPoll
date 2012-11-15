package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return redirect(routes.Application.surveys());
  }
  
  static Form<Survey> surveyForm = form(Survey.class);

  public static Result surveys() {
    return ok(
      views.html.index.render(Survey.all(), surveyForm)
    );
  } 
  
  public static Result newSurvey() {
    return TODO;
  }
  
  public static Result deleteSurvey(Long id) {
    return TODO;
  }
}
