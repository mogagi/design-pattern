ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "com.mblinn"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
  )