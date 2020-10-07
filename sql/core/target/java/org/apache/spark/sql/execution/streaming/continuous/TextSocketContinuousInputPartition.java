package org.apache.spark.sql.execution.streaming.continuous;
/**
 * Continuous text socket input partition.
 */
public  class TextSocketContinuousInputPartition implements org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>, scala.Product, scala.Serializable {
  static public  java.lang.String[] preferredLocations ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String driverEndpointName ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  int startOffset ()  { throw new RuntimeException(); }
  public  boolean includeTimestamp ()  { throw new RuntimeException(); }
  // not preceding
  public   TextSocketContinuousInputPartition (java.lang.String driverEndpointName, int partitionId, int startOffset, boolean includeTimestamp)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.InputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> createPartitionReader ()  { throw new RuntimeException(); }
}
