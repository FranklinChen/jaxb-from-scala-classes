name := "jaxb-from-scala-classes"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/jaxb-from-scala-classes"))

startYear := Some(2015)

description := "Demo of using JAXB annotations from Scala"

version := "1.0.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.6.4" % Test
)

sourceManaged in xjc in Compile ~= (_ / "xjc")
