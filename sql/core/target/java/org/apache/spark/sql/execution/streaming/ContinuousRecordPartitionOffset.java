package org.apache.spark.sql.execution.streaming;
public  class ContinuousRecordPartitionOffset implements org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  int offset ()  { throw new RuntimeException(); }
  // not preceding
  public   ContinuousRecordPartitionOffset (int partitionId, int offset)  { throw new RuntimeException(); }
}
