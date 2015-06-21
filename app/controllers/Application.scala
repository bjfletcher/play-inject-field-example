package controllers

import javax.inject.Inject

import play.api._
import play.api.libs.ws.WSClient
import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class Application extends Controller {

  @Inject var ws: WSClient = null

  def index = Action.async {
    ws.url("http://google.com").get.map(r => Ok(r.body))
  }

}
