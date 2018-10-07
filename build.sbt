inThisBuild(
  Seq(
    name := "sbt-tld",
    organization := "io.methvin",
    organizationName := "Greg Methvin",
    startYear := Some(2018),
    licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt")),
    scalaVersion := "2.12.7",
    sbtPlugin := true,
    bintrayPackageLabels := Seq("sbt", "plugin"),
    bintrayVcsUrl := Some("git@github.com:gmethvin/sbt-tld.git"),
    initialCommands in console := """import io.methvin.sbt._""",
    scriptedLaunchOpts ++= Seq("-Xmx1024M", "-Dplugin.version=" + version.value),
    scalafmtOnCompile := true
  )
)

enablePlugins(AutomateHeaderPlugin)
enablePlugins(ScriptedPlugin)
