package com.atguigu.sparkcore.day02

import java.util.Random

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Author lzc
  * Date 2019-09-12 10:05
  */
object RDDMap {
    def main(args: Array[String]): Unit = {
        val conf = new SparkConf().setAppName("Practice").setMaster("local[2]")
        val sc = new SparkContext(conf)
        val rdd1 = sc.parallelize(Array(30, 50, 70, 60, 10, 20))
        
        
        var rdd2 = rdd1.map(x => {
            // ..
            
            
        })
        rdd2.collect.foreach(println)
        
        sc.stop()
        
    }
}
