package org.apache.spark.deploy.history;
public  class ApplicationStoreInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  public  long lastAccess ()  { throw new RuntimeException(); }
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplicationStoreInfo (java.lang.String path, long lastAccess, java.lang.String appId, scala.Option<java.lang.String> attemptId, long size)  { throw new RuntimeException(); }
}
