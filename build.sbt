Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val `sbt-release-usage` = project in file(".")

organization := "alexr"
name := "sbt-release-usage"

//publishLocal / skip := true
mainClass in (Compile, run) := Some("alexr.Application2")

import ReleaseTransformations._

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,              // : ReleaseStep
  inquireVersions,                        // : ReleaseStep
  runClean,                               // : ReleaseStep
//  runTest,                                // : ReleaseStep
  setReleaseVersion,                      // : ReleaseStep
//  commitReleaseVersion,                   // : ReleaseStep, performs the initial git checks
  tagRelease,                             // : ReleaseStep
//  publishArtifacts,                       // : ReleaseStep, checks whether `publishTo` is properly set up
  setNextVersion,                         // : ReleaseStep
  commitNextVersion,                      // : ReleaseStep
//  pushChanges                             // : ReleaseStep, also checks that an upstream branch is properly configured
)