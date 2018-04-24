name := """LoginAuthenticationExample"""
organization := "com.alvinalexander"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

// @see https://mvnrepository.com/artifact/mysql/mysql-connector-java
libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
    jdbc,
    "mysql" % "mysql-connector-java" % "5.1.46",
    "com.typesafe.play" %% "anorm" % "2.5.3"
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.alvinalexander.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.alvinalexander.binders._"
