name := "http4s-hello-world"
organization := "org.scala.thundzz"
organizationName := "Thundzz's scala learning"
version := "0.1.0"

scalaVersion := "2.13.3" // Also supports 2.11.x

val http4sVersion = "0.21.14"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion
)

