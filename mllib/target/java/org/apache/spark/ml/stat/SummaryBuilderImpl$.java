package org.apache.spark.ml.stat;
public  class SummaryBuilderImpl$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SummaryBuilderImpl$ MODULE$ = null;
  public   SummaryBuilderImpl$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> implementedMetrics ()  { throw new RuntimeException(); }
  public  scala.Tuple2<scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric>, scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric>> getRelevantMetrics (scala.collection.Seq<java.lang.String> requested) throws java.lang.IllegalArgumentException { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType structureForMetrics (scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric> metrics)  { throw new RuntimeException(); }
  private  org.apache.spark.ml.linalg.VectorUDT vectorUDT ()  { throw new RuntimeException(); }
  /**
   * All the metrics that can be currently computed by Spark for vectors.
   * <p>
   * This list associates the user name, the internal (typed) name, and the list of computation
   * metrics that need to de computed internally to get the final result.
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.Tuple4<java.lang.String, org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, org.apache.spark.sql.types.DataType, scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric>>> allMetrics ()  { throw new RuntimeException(); }
}
