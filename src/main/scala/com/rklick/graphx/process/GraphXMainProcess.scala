package com.rklick.graphx.process


import com.rklick.graphx.context.GraphXProcess
import com.rklick.graphx.domain.GraphComponent
import com.rklick.graphx.utils.SparkCommon

import scala.util.{Left, Right}

/**
  * Created by supriya on 2/2/16.
  */
object GraphXMainProcess extends GraphXProcess {

  val sqlContext = SparkCommon.sqlContext

  /**
    *
    * @return
    */
  def main(args: Array[String]) {
    val SCHEMA_OPTIONS = Map("header" -> "true", "inferSchema" -> "true")
    val path = "src/main/resources/graph_data.csv"
    val df = sqlContext.read.format("csv").options(SCHEMA_OPTIONS).load(path)
    val graphComponent = GraphComponent("ID", "User", "Relationship", "RelationId")
    processGraph(df, graphComponent) match {
      case Right(data) => println(s"GraphX process successfully completed.")
        sqlContext.sparkContext.stop()
      case Left(error) => println(s"Error during graphX:::${error}")
        sqlContext.sparkContext.stop()
    }
  }
}
