package org.apache.spark.sql.execution.streaming.continuous;
/**
 * A ContinuousReader that reads text lines through a TCP socket, designed only for tutorials and
 * debugging. This ContinuousReader will *not* work in production applications due to multiple
 * reasons, including no support for fault recovery.
 * <p>
 * The driver maintains a socket connection to the host-port, keeps the received messages in
 * buckets and serves the messages to the executors via a RPC endpoint.
 */
public  class TextSocketContinuousReader implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousReader, org.apache.spark.internal.Logging {
  public   TextSocketContinuousReader (org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.collection.mutable.ListBuffer<scala.Tuple2<java.lang.String, java.sql.Timestamp>>> buckets ()  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.reader.streaming.Offset end)  { throw new RuntimeException(); }
  private  int currentOffset ()  { throw new RuntimeException(); }
  public  org.json4s.DefaultFormats defaultFormats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef endpointRef ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getStartOffset ()  { throw new RuntimeException(); }
  private  java.lang.String host ()  { throw new RuntimeException(); }
  private  boolean includeTimestamp ()  { throw new RuntimeException(); }
  private  void initialize ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset mergeOffsets (org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset[] offsets)  { throw new RuntimeException(); }
  private  int numPartitions ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>> planInputPartitions ()  { throw new RuntimeException(); }
  private  int port ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  private  java.lang.Thread readThread ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.ContinuousRecordEndpoint recordEndpoint ()  { throw new RuntimeException(); }
  public  void setStartOffset (java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> offset)  { throw new RuntimeException(); }
  private  java.net.Socket socket ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.continuous.TextSocketOffset startOffset ()  { throw new RuntimeException(); }
  /** Stop this source. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
