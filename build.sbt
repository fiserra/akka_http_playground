name := "akka_http_playgroud"

version := "1.0"

scalaVersion := "2.11.5"

organization := "com.fiser"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-experimental" % "1.0-M3",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)