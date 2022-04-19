ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "kafka-demo"
  )


libraryDependencies += "org.apache.kafka" % "kafka-clients" % "3.1.0"
//libraryDependencies += "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.17.2"
//libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.11" % Runtime
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.36"
libraryDependencies += "org.slf4j" % "slf4j-reload4j" % "1.7.36"
