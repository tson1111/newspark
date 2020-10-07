package org.apache.spark.deploy;
/**
 * Entry point for a Spark application. Implementations must provide a no-argument constructor.
 */
  interface SparkApplication {
  public  void start (java.lang.String[] args, org.apache.spark.SparkConf conf)  ;
}
