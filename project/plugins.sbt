libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.4")
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.0.0")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.1.0")