package org.apache.spark.sql.execution.streaming.sources;
public  class ForeachWriterFactory<T extends java.lang.Object> implements org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.catalyst.InternalRow>, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.ForeachWriter<T> writer ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, T> rowConverter ()  { throw new RuntimeException(); }
  // not preceding
  public   ForeachWriterFactory (org.apache.spark.sql.ForeachWriter<T> writer, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, T> rowConverter)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.ForeachDataWriter<T> createDataWriter (int partitionId, long taskId, long epochId)  { throw new RuntimeException(); }
}
