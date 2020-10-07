package org.apache.spark.sql.execution.streaming.continuous;
public  class ContinuousCoalesceRDDPartition implements org.apache.spark.Partition, scala.Product, scala.Serializable {
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean equals (Object other)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  java.lang.String endpointName ()  { throw new RuntimeException(); }
  public  int queueSize ()  { throw new RuntimeException(); }
  public  int numShuffleWriters ()  { throw new RuntimeException(); }
  public  long epochIntervalMs ()  { throw new RuntimeException(); }
  // not preceding
  public   ContinuousCoalesceRDDPartition (int index, java.lang.String endpointName, int queueSize, int numShuffleWriters, long epochIntervalMs)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.streaming.continuous.shuffle.ContinuousShuffleReader reader ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef endpoint ()  { throw new RuntimeException(); }
    boolean writersInitialized ()  { throw new RuntimeException(); }
}
