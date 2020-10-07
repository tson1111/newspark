package org.apache.spark.sql.execution.streaming.continuous;
public  class RateStreamContinuousInputPartitionReader implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousInputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> {
  public   RateStreamContinuousInputPartitionReader (long startValue, long startTimeMs, int partitionIndex, long increment, double rowsPerSecond)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.InternalRow currentRow ()  { throw new RuntimeException(); }
  private  long currentValue ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow get ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset getOffset ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
  private  long nextReadTime ()  { throw new RuntimeException(); }
  private  long readTimeIncrement ()  { throw new RuntimeException(); }
}
