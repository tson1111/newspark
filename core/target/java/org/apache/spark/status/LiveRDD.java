package org.apache.spark.status;
public  class LiveRDD extends org.apache.spark.status.LiveEntity {
  // not preceding
  public   LiveRDD (org.apache.spark.storage.RDDInfo info)  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveRDDDistribution distribution (org.apache.spark.status.LiveExecutor exec)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.LiveRDDDistribution> distributionOpt (org.apache.spark.status.LiveExecutor exec)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.status.LiveRDDDistribution> distributions ()  { throw new RuntimeException(); }
  protected  Object doUpdate ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, org.apache.spark.status.LiveRDDDistribution> getDistributions ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, org.apache.spark.status.LiveRDDPartition> getPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.RDDInfo info ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveRDDPartition partition (java.lang.String blockName)  { throw new RuntimeException(); }
  private  org.apache.spark.status.RDDPartitionSeq partitionSeq ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.status.LiveRDDPartition> partitions ()  { throw new RuntimeException(); }
  public  boolean removeDistribution (org.apache.spark.status.LiveExecutor exec)  { throw new RuntimeException(); }
  public  void removePartition (java.lang.String blockName)  { throw new RuntimeException(); }
  public  void setStorageLevel (java.lang.String level)  { throw new RuntimeException(); }
  public  java.lang.String storageLevel ()  { throw new RuntimeException(); }
}
