package org.apache.spark.broadcast;
  class BroadcastManager implements org.apache.spark.internal.Logging {
  // not preceding
  public   BroadcastManager (boolean isDriver, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager)  { throw new RuntimeException(); }
  private  org.apache.spark.broadcast.BroadcastFactory broadcastFactory ()  { throw new RuntimeException(); }
    org.apache.commons.collections.map.ReferenceMap cachedValues ()  { throw new RuntimeException(); }
  private  void initialize ()  { throw new RuntimeException(); }
  private  boolean initialized ()  { throw new RuntimeException(); }
  public  boolean isDriver ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> newBroadcast (T value_, boolean isLocal, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicLong nextBroadcastId ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void unbroadcast (long id, boolean removeFromDriver, boolean blocking)  { throw new RuntimeException(); }
}
