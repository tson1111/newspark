package org.apache.spark.sql.execution.datasources;
/**
 * Simple {@link WriteJobStatsTracker} implementation that's serializable, capable of
 * instantiating {@link BasicWriteTaskStatsTracker} on executors and processing the
 * {@link BasicWriteTaskStats} they produce by aggregating the metrics and posting them
 * as DriverMetricUpdates.
 */
public  class BasicWriteJobStatsTracker implements org.apache.spark.sql.execution.datasources.WriteJobStatsTracker {
  static private  java.lang.String NUM_FILES_KEY ()  { throw new RuntimeException(); }
  static private  java.lang.String NUM_OUTPUT_BYTES_KEY ()  { throw new RuntimeException(); }
  static private  java.lang.String NUM_OUTPUT_ROWS_KEY ()  { throw new RuntimeException(); }
  static private  java.lang.String NUM_PARTS_KEY ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  // not preceding
  public   BasicWriteJobStatsTracker (org.apache.spark.util.SerializableConfiguration serializableHadoopConf, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.WriteTaskStatsTracker newTaskInstance ()  { throw new RuntimeException(); }
  public  void processStats (scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteTaskStats> stats)  { throw new RuntimeException(); }
}
