import sbt._
import Keys._
import sbtrelease.ReleasePlugin.autoImport._
import ReleaseTransformations._

object JobServerRelease {

  import ls.Plugin._
  import LsKeys._

  lazy val ourReleaseSettings = Seq(

    releaseProcess := Seq(
      checkSnapshotDependencies,
      inquireVersions,
      setReleaseVersion,
      tagRelease,
      pushChanges
    )
  )

}