package org.apache.spark.sql.execution.streaming;
public  class CommitMetadata implements scala.Product, scala.Serializable {
  static public  java.lang.Object format ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.CommitMetadata apply (java.lang.String json)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long nextBatchWatermarkMs ()  { throw new RuntimeException(); }
  // not preceding
  public   CommitMetadata (long nextBatchWatermarkMs)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
