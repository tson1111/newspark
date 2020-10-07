package org.apache.spark.sql.execution.streaming.sources;
/**
 * An input partition for continuous memory stream.
 */
public  class ContinuousMemoryStreamInputPartition implements org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow> {
  public   ContinuousMemoryStreamInputPartition (java.lang.String driverEndpointName, int partition, int startOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.ContinuousMemoryStreamInputPartitionReader createPartitionReader ()  { throw new RuntimeException(); }
}
