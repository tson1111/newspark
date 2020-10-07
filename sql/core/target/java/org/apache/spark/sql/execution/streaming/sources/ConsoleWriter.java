package org.apache.spark.sql.execution.streaming.sources;
/** Common methods used to create writes for the the console sink */
public  class ConsoleWriter implements org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter, org.apache.spark.internal.Logging {
  public   ConsoleWriter (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  public  void abort (long epochId, org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  void commit (long epochId, org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.catalyst.InternalRow> createWriterFactory ()  { throw new RuntimeException(); }
  protected  boolean isTruncated ()  { throw new RuntimeException(); }
  protected  int numRowsToShow ()  { throw new RuntimeException(); }
  protected  void printRows (org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] commitMessages, org.apache.spark.sql.types.StructType schema, java.lang.String printMessage)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
