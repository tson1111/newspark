package org.apache.spark.sql.execution.streaming.sources;
public  class RateStreamMicroBatchReader implements org.apache.spark.sql.sources.v2.reader.streaming.MicroBatchReader, org.apache.spark.internal.Logging {
  public   RateStreamMicroBatchReader (org.apache.spark.sql.sources.v2.DataSourceOptions options, java.lang.String checkpointLocation)  { throw new RuntimeException(); }
    org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.reader.streaming.Offset end)  { throw new RuntimeException(); }
    long creationTimeMs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.LongOffset end ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getEndOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getStartOffset ()  { throw new RuntimeException(); }
  private  long lastTimeMs ()  { throw new RuntimeException(); }
  private  long maxSeconds ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>> planInputPartitions ()  { throw new RuntimeException(); }
  private  long rampUpTimeSeconds ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  private  long rowsPerSecond ()  { throw new RuntimeException(); }
  public  void setOffsetRange (java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> start, java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> end)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.LongOffset start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
