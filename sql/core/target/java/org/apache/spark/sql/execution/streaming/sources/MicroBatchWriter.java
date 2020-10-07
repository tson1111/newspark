package org.apache.spark.sql.execution.streaming.sources;
/**
 * A {@link DataSourceWriter} used to hook V2 stream writers into a microbatch plan. It implements
 * the non-streaming interface, forwarding the batch ID determined at construction to a wrapped
 * streaming writer.
 */
public  class MicroBatchWriter implements org.apache.spark.sql.sources.v2.writer.DataSourceWriter {
  // not preceding
  public   MicroBatchWriter (long batchId, org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter writer)  { throw new RuntimeException(); }
  public  void abort (org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.catalyst.InternalRow> createWriterFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter writer ()  { throw new RuntimeException(); }
}
