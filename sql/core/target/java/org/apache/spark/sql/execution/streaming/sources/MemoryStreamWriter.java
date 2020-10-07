package org.apache.spark.sql.execution.streaming.sources;
public  class MemoryStreamWriter implements org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter {
  // not preceding
  public   MemoryStreamWriter (org.apache.spark.sql.execution.streaming.sources.MemorySinkV2 sink, org.apache.spark.sql.streaming.OutputMode outputMode, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  void abort (long epochId, org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  void commit (long epochId, org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.MemoryWriterFactory createWriterFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.MemorySinkV2 sink ()  { throw new RuntimeException(); }
}
