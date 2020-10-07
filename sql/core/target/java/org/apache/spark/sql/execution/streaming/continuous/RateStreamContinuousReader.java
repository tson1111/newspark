package org.apache.spark.sql.execution.streaming.continuous;
public  class RateStreamContinuousReader implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousReader {
  public   RateStreamContinuousReader (org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.reader.streaming.Offset end)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.RateStreamOffset createInitialOffset (int numPartitions, long creationTimeMs)  { throw new RuntimeException(); }
  public  long creationTime ()  { throw new RuntimeException(); }
  public  org.json4s.DefaultFormats defaultFormats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getStartOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset mergeOffsets (org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset[] offsets)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.sources.v2.reader.streaming.Offset offset ()  { throw new RuntimeException(); }
  public  double perPartitionRate ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>> planInputPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  public  long rowsPerSecond ()  { throw new RuntimeException(); }
  public  void setStartOffset (java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> offset)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
