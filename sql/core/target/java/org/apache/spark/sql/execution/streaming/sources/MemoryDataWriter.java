package org.apache.spark.sql.execution.streaming.sources;
public  class MemoryDataWriter implements org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.catalyst.InternalRow>, org.apache.spark.internal.Logging {
  public   MemoryDataWriter (int partition, org.apache.spark.sql.streaming.OutputMode outputMode, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.MemoryWriterCommitMessage commit ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Buffer<org.apache.spark.sql.Row> data ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<org.apache.spark.sql.Row> encoder ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
