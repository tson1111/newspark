package org.apache.spark.sql.execution.streaming.continuous;
/**
 * RDD for continuous coalescing. Asynchronously writes all partitions of <code>prev</code> into a local
 * continuous shuffle, and then reads them in the task thread using <code>reader</code>.
 */
public  class ContinuousCoalesceRDD extends org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> {
  public   ContinuousCoalesceRDD (org.apache.spark.SparkContext context, int numPartitions, int readerQueueSize, long epochIntervalMs, org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> prev)  { throw new RuntimeException(); }
  public  void clearDependencies ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  private  org.apache.spark.HashPartitioner outputPartitioner ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.IndexedSeq<java.lang.String> readerEndpointNames ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor threadPool ()  { throw new RuntimeException(); }
}
