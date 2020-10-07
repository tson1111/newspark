package org.apache.spark.sql.execution.streaming;
public  class RateStreamOffset extends org.apache.spark.sql.sources.v2.reader.streaming.Offset implements scala.Product, scala.Serializable {
  static public  boolean equals (Object obj)  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.sql.execution.streaming.ValueRunTimeMsPair> partitionToValueAndRunTimeMs ()  { throw new RuntimeException(); }
  // not preceding
  public   RateStreamOffset (scala.collection.immutable.Map<java.lang.Object, org.apache.spark.sql.execution.streaming.ValueRunTimeMsPair> partitionToValueAndRunTimeMs)  { throw new RuntimeException(); }
  public  org.json4s.DefaultFormats defaultFormats ()  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
