package org.apache.spark.sql.execution.streaming.state;
public  class StateStoreCustomSizeMetric implements org.apache.spark.sql.execution.streaming.state.StateStoreCustomMetric, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String desc ()  { throw new RuntimeException(); }
  // not preceding
  public   StateStoreCustomSizeMetric (java.lang.String name, java.lang.String desc)  { throw new RuntimeException(); }
}
