package org.apache.spark.sql.execution.streaming.sources;
public  class RateStreamMicroBatchInputPartition implements org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow> {
  public   RateStreamMicroBatchInputPartition (int partitionId, int numPartitions, long rangeStart, long rangeEnd, long localStartTimeMs, double relativeMsPerValue)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.InputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> createPartitionReader ()  { throw new RuntimeException(); }
}
