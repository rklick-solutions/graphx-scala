package com.rklick.graphx.utils

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by supriya on 17/2/16.
  */
object SparkCommon {

  lazy val conf = {
    new SparkConf(false)
      .setMaster("local[*]")
      .setAppName("GraphX Example")
  }

  lazy val sparkContext = new SparkContext(conf)
  lazy val sparkSqlContext = SQLContext.getOrCreate(sparkContext)

}
