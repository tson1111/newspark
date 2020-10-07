package org.apache.spark.sql.execution.streaming.continuous;
public  class RateStreamContinuousInputPartition implements org.apache.spark.sql.sources.v2.reader.ContinuousInputPartition<org.apache.spark.sql.catalyst.InternalRow>, scala.Product, scala.Serializable {
  static public  java.lang.String[] preferredLocations ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long startValue ()  { throw new RuntimeException(); }
  public  long startTimeMs ()  { throw new RuntimeException(); }
  public  int partitionIndex ()  { throw new RuntimeException(); }
  public  long increment ()  { throw new RuntimeException(); }
  public  double rowsPerSecond ()  { throw new RuntimeException(); }
  // not preceding
  public   RateStreamContinuousInputPartition (long startValue, long startTimeMs, int partitionIndex, long increment, double rowsPerSecond)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.InputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> createContinuousReader (org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset offset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.InputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> createPartitionReader ()  { throw new RuntimeException(); }
}
