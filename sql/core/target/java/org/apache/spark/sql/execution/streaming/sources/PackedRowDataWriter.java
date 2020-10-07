package org.apache.spark.sql.execution.streaming.sources;
/**
 * A simple {@link DataWriter} that just sends all the rows it's received as a commit message.
 */
public  class PackedRowDataWriter implements org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.catalyst.InternalRow>, org.apache.spark.internal.Logging {
  public   PackedRowDataWriter ()  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.PackedRowCommitMessage commit ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Buffer<org.apache.spark.sql.catalyst.InternalRow> data ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
