inThisBuild(
  Seq(
    organization := "io.methvin",
    organizationName := "Greg Methvin",
    startYear := Some(2018),
    licenses := Seq("Apache-2.0" -> new URL("https://www.apache.org/licenses/LICENSE-2.0.txt")),
    scalaVersion := "2.12.19",
    sbtPlugin := true,
    console / initialCommands := """import io.methvin.sbt._""",
    scriptedLaunchOpts ++= Seq("-Xmx1024M", "-Dplugin.version=" + version.value),
    scalacOptions ++= Seq("-release", "8"),
    scalafmtOnCompile := true
  )
)

import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("gmethvin", "sbt-tld", "greg@methvin.net"))
publishTo := sonatypePublishToBundle.value
publishMavenStyle := true

enablePlugins(AutomateHeaderPlugin)
enablePlugins(ScriptedPlugin)
