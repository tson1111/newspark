package org.apache.spark.sql.execution.streaming.sources;
/**
 * A MicroBatchReader that reads text lines through a TCP socket, designed only for tutorials and
 * debugging. This MicroBatchReader will *not* work in production applications due to multiple
 * reasons, including no support for fault recovery.
 */
public  class TextSocketMicroBatchReader implements org.apache.spark.sql.sources.v2.reader.streaming.MicroBatchReader, org.apache.spark.internal.Logging {
  public   TextSocketMicroBatchReader (org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  /**
   * All batches from <code>lastCommittedOffset + 1</code> to <code>currentOffset</code>, inclusive.
   * Stored in a ListBuffer to facilitate removing committed batches.
   * @return (undocumented)
   */
  private  scala.collection.mutable.ListBuffer<scala.Tuple2<org.apache.spark.unsafe.types.UTF8String, java.lang.Object>> batches ()  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.reader.streaming.Offset end)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.LongOffset currentOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.sources.v2.reader.streaming.Offset endOffset ()  { throw new RuntimeException(); }
  /** This method is only used for unit test */
    org.apache.spark.sql.execution.streaming.LongOffset getCurrentOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getEndOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getStartOffset ()  { throw new RuntimeException(); }
  private  java.lang.String host ()  { throw new RuntimeException(); }
  private  void initialize ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean initialized ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.LongOffset lastOffsetCommitted ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>> planInputPartitions ()  { throw new RuntimeException(); }
  private  int port ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  private  java.lang.Thread readThread ()  { throw new RuntimeException(); }
  public  void setOffsetRange (java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> start, java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> end)  { throw new RuntimeException(); }
  private  java.net.Socket socket ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.sources.v2.reader.streaming.Offset startOffset ()  { throw new RuntimeException(); }
  /** Stop this source. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
