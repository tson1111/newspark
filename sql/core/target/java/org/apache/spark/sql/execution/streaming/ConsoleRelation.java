package org.apache.spark.sql.execution.streaming;
public  class ConsoleRelation extends org.apache.spark.sql.sources.BaseRelation implements scala.Product, scala.Serializable {
  static public  long sizeInBytes ()  { throw new RuntimeException(); }
  static public  boolean needConversion ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.sources.Filter[] unhandledFilters (org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data ()  { throw new RuntimeException(); }
  // not preceding
  public   ConsoleRelation (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
}
