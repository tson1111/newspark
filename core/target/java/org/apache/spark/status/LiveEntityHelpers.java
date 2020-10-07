package org.apache.spark.status;
public  class LiveEntityHelpers {
  static private  com.google.common.collect.Interner<java.lang.String> stringInterner ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> newAccumulatorInfos (scala.collection.Iterable<org.apache.spark.scheduler.AccumulableInfo> accums)  { throw new RuntimeException(); }
  /** String interning to reduce the memory usage. */
  static public  java.lang.String weakIntern (java.lang.String s)  { throw new RuntimeException(); }
  static public  org.apache.spark.status.api.v1.TaskMetrics createMetrics (long executorDeserializeTime, long executorDeserializeCpuTime, long executorRunTime, long executorCpuTime, long resultSize, long jvmGcTime, long resultSerializationTime, long memoryBytesSpilled, long diskBytesSpilled, long peakExecutionMemory, long inputBytesRead, long inputRecordsRead, long outputBytesWritten, long outputRecordsWritten, long shuffleRemoteBlocksFetched, long shuffleLocalBlocksFetched, long shuffleFetchWaitTime, long shuffleRemoteBytesRead, long shuffleRemoteBytesReadToDisk, long shuffleLocalBytesRead, long shuffleRecordsRead, long shuffleBytesWritten, long shuffleWriteTime, long shuffleRecordsWritten)  { throw new RuntimeException(); }
  static public  org.apache.spark.status.api.v1.TaskMetrics createMetrics (long default_)  { throw new RuntimeException(); }
  /** Add m2 values to m1. */
  static public  org.apache.spark.status.api.v1.TaskMetrics addMetrics (org.apache.spark.status.api.v1.TaskMetrics m1, org.apache.spark.status.api.v1.TaskMetrics m2)  { throw new RuntimeException(); }
  /** Subtract m2 values from m1. */
  static public  org.apache.spark.status.api.v1.TaskMetrics subtractMetrics (org.apache.spark.status.api.v1.TaskMetrics m1, org.apache.spark.status.api.v1.TaskMetrics m2)  { throw new RuntimeException(); }
  static private  org.apache.spark.status.api.v1.TaskMetrics addMetrics (org.apache.spark.status.api.v1.TaskMetrics m1, org.apache.spark.status.api.v1.TaskMetrics m2, int mult)  { throw new RuntimeException(); }
}
