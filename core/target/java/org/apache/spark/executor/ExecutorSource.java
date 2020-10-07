package org.apache.spark.executor;
  class ExecutorSource implements org.apache.spark.metrics.source.Source {
  public   ExecutorSource (java.util.concurrent.ThreadPoolExecutor threadPool, java.lang.String executorId)  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_CPU_TIME ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_DESERIALIZE_CPU_TIME ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_DESERIALIZE_TIME ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_DISK_BYTES_SPILLED ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_INPUT_BYTES_READ ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_INPUT_RECORDS_READ ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_JVM_GC_TIME ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_MEMORY_BYTES_SPILLED ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_OUTPUT_BYTES_WRITTEN ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_OUTPUT_RECORDS_WRITTEN ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_RESULT_SERIALIZE_TIME ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_RESULT_SIZE ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_RUN_TIME ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_BYTES_WRITTEN ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_FETCH_WAIT_TIME ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_LOCAL_BLOCKS_FETCHED ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_LOCAL_BYTES_READ ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_RECORDS_READ ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_RECORDS_WRITTEN ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_REMOTE_BLOCKS_FETCHED ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_REMOTE_BYTES_READ ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_REMOTE_BYTES_READ_TO_DISK ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_TOTAL_BYTES_READ ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter METRIC_SHUFFLE_WRITE_TIME ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.hadoop.fs.FileSystem.Statistics> fileStats (java.lang.String scheme)  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> java.lang.Object registerFileSystemStat (java.lang.String scheme, java.lang.String name, scala.Function1<org.apache.hadoop.fs.FileSystem.Statistics, T> f, T defaultValue)  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
}
