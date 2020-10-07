package org.apache.spark.examples.sql.streaming;
/** User-defined data type representing the input events */
public  class Event implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String sessionId ()  { throw new RuntimeException(); }
  public  java.sql.Timestamp timestamp ()  { throw new RuntimeException(); }
  // not preceding
  public   Event (java.lang.String sessionId, java.sql.Timestamp timestamp)  { throw new RuntimeException(); }
}
