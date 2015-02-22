package com.fiser

import akka.actor.ActorSystem
import akka.http._
import akka.http.server.Directives._
import akka.stream._

trait SampleApp {
  implicit val system = ActorSystem("akka-http-sample")
  sys.addShutdownHook({
    system.shutdown()
  })

  implicit val materializer = ActorFlowMaterializer()

  import system.dispatcher

  val route =
    path("") {
      getFromResource("web/index.html");
    }

  val serverBinding = Http(system).bind(interface = "localhost", port = 8080)

  serverBinding.startHandlingWith(route)
}

object Main extends App with SampleApp {

}