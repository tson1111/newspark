package org.apache.spark.sql.execution.streaming.sources;
public  class MemoryWriterCommitMessage implements org.apache.spark.sql.sources.v2.writer.WriterCommitMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> data ()  { throw new RuntimeException(); }
  // not preceding
  public   MemoryWriterCommitMessage (int partition, scala.collection.Seq<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}
