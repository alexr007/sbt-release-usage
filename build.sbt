Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val `sbt-release-usage` = project in file(".")

organization := "alexr"
name := "sbt-release-usage"

mainClass in (Compile, run) := Some("alexr.Application2")
