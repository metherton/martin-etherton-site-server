package controllers

import javax.inject._
import play.api.libs.json.Json
import play.api.mvc._
import play.api.libs.json.{JsValue, Json}



/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class PersonController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
//  def search() = Action {
//    val json = Json.toJson(Place.list)
//    Ok(json)
//  }

  def search() = Action {
   // Ok("Hello world")
    val json = Json.toJson(Json.obj("hours" -> 4, "minutes" -> 35))
    Ok(json)
  }

}

