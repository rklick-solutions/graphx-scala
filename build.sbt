name := """graphx-scala"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val sparkVersion = "1.6.0"
lazy val spark = "org.apache.spark"

libraryDependencies ++= Seq(
  spark %% "spark-core" % sparkVersion,
  spark %% "spark-sql" % sparkVersion,
  spark %% "spark-streaming" % sparkVersion,
  spark %% "spark-graphx" % sparkVersion,
  "com.databricks" %% "spark-csv" % "1.3.0"

)

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

