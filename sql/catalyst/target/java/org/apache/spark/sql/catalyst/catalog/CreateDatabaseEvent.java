package org.apache.spark.sql.catalyst.catalog;
/**
 * Event fired after a database has been created.
 */
public  class CreateDatabaseEvent implements org.apache.spark.sql.catalyst.catalog.DatabaseEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String database ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateDatabaseEvent (java.lang.String database)  { throw new RuntimeException(); }
}
