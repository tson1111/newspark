package org.apache.spark.sql.execution.streaming.sources;
/**
 * An input partition reader for continuous memory stream.
 * <p>
 * Polls the driver endpoint for new records.
 */
public  class ContinuousMemoryStreamInputPartitionReader implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousInputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> {
  public   ContinuousMemoryStreamInputPartitionReader (java.lang.String driverEndpointName, int partition, int startOffset)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.InternalRow> current ()  { throw new RuntimeException(); }
  private  int currentOffset ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef endpoint ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow get ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.ContinuousRecordPartitionOffset getOffset ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.InternalRow> getRecord ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
}
