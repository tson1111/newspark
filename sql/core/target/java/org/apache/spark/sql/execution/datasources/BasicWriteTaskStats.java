package org.apache.spark.sql.execution.datasources;
/**
 * Simple metrics collected during an instance of {@link FileFormatDataWriter}.
 * These were first introduced in https://github.com/apache/spark/pull/18159 (SPARK-20703).
 */
public  class BasicWriteTaskStats implements org.apache.spark.sql.execution.datasources.WriteTaskStats, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  int numFiles ()  { throw new RuntimeException(); }
  public  long numBytes ()  { throw new RuntimeException(); }
  public  long numRows ()  { throw new RuntimeException(); }
  // not preceding
  public   BasicWriteTaskStats (int numPartitions, int numFiles, long numBytes, long numRows)  { throw new RuntimeException(); }
}
