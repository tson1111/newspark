package org.apache.spark.sql.catalyst.catalog;
/**
 * Event fired before a database is altered.
 */
public  class AlterDatabasePreEvent implements org.apache.spark.sql.catalyst.catalog.DatabaseEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String database ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterDatabasePreEvent (java.lang.String database)  { throw new RuntimeException(); }
}
