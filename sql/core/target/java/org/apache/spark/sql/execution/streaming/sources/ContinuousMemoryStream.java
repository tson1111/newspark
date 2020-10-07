package org.apache.spark.sql.execution.streaming.sources;
/**
 * The overall strategy here is:
 *  * ContinuousMemoryStream maintains a list of records for each partition. addData() will
 *    distribute records evenly-ish across partitions.
 *  * RecordEndpoint is set up as an endpoint for executor-side
 *    ContinuousMemoryStreamInputPartitionReader instances to poll. It returns the record at
 *    the specified offset within the list, or null if that offset doesn't yet have a record.
 */
public  class ContinuousMemoryStream<A extends java.lang.Object> extends org.apache.spark.sql.execution.streaming.MemoryStreamBase<A> implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousReader, org.apache.spark.sql.sources.v2.ContinuousReadSupport {
  static protected  java.util.concurrent.atomic.AtomicInteger memoryStreamId ()  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.apache.spark.sql.execution.streaming.sources.ContinuousMemoryStream<A> apply (org.apache.spark.sql.Encoder<A> evidence$2, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.apache.spark.sql.execution.streaming.sources.ContinuousMemoryStream<A> singlePartition (org.apache.spark.sql.Encoder<A> evidence$3, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<A> encoder ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attributes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<A> toDS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  static public abstract  org.apache.spark.sql.types.StructType readSchema ()  ;
  static public  boolean needsReconfiguration ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ContinuousMemoryStream (int id, org.apache.spark.sql.SQLContext sqlContext, int numPartitions, org.apache.spark.sql.Encoder<A> evidence$1)  { throw new RuntimeException(); }
  private  java.lang.Object formats ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.StreamingRelationV2 logicalPlan ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.collection.mutable.ListBuffer<A>> records ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.sources.ContinuousMemoryStreamOffset startOffset ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.ContinuousRecordEndpoint recordEndpoint ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef endpointRef ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset addData (scala.collection.TraversableOnce<A> data)  { throw new RuntimeException(); }
  public  void setStartOffset (java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> start)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getStartOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.ContinuousMemoryStreamOffset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.ContinuousMemoryStreamOffset mergeOffsets (org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset[] offsets)  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>> planInputPartitions ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.reader.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.ContinuousReader createContinuousReader (java.util.Optional<org.apache.spark.sql.types.StructType> schema, java.lang.String checkpointLocation, org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
}
