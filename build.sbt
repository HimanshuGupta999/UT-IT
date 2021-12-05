name := "UT-IT"

version := "0.1"

scalaVersion := "2.13.4"
lazy val root = (project in file("."))
  .settings(
    name := "UT-IT"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.46" % Test