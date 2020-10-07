package org.apache.spark.status;
public  class LiveRDDPartition {
  // not preceding
  public   LiveRDDPartition (java.lang.String blockName)  { throw new RuntimeException(); }
  public  java.lang.String blockName ()  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> executors ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveRDDPartition next ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveRDDPartition prev ()  { throw new RuntimeException(); }
  public  void update (scala.collection.Seq<java.lang.String> executors, java.lang.String storageLevel, long memoryUsed, long diskUsed)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.RDDPartitionInfo value ()  { throw new RuntimeException(); }
}
