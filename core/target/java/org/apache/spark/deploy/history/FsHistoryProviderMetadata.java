package org.apache.spark.deploy.history;
  class FsHistoryProviderMetadata implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long version ()  { throw new RuntimeException(); }
  public  long uiVersion ()  { throw new RuntimeException(); }
  public  java.lang.String logDir ()  { throw new RuntimeException(); }
  // not preceding
  public   FsHistoryProviderMetadata (long version, long uiVersion, java.lang.String logDir)  { throw new RuntimeException(); }
}
