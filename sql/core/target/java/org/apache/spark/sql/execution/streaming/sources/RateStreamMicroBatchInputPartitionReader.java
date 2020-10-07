package org.apache.spark.sql.execution.streaming.sources;
public  class RateStreamMicroBatchInputPartitionReader implements org.apache.spark.sql.sources.v2.reader.InputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> {
  public   RateStreamMicroBatchInputPartitionReader (int partitionId, int numPartitions, long rangeStart, long rangeEnd, long localStartTimeMs, double relativeMsPerValue)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  long count ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow get ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
}
