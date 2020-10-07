package org.apache.spark.sql.execution.streaming.continuous;
/**
 * Continuous text socket input partition reader.
 * <p>
 * Polls the driver endpoint for new records.
 */
public  class TextSocketContinuousInputPartitionReader implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousInputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> {
  public   TextSocketContinuousInputPartitionReader (java.lang.String driverEndpointName, int partitionId, int startOffset, boolean includeTimestamp)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.InternalRow> current ()  { throw new RuntimeException(); }
  private  int currentOffset ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef endpoint ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow get ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset getOffset ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.InternalRow> getRecord ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
}
