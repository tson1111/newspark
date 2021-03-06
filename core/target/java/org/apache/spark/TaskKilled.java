package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Task was killed intentionally and needs to be rescheduled.
 */
public  class TaskKilled implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates ()  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskKilled (java.lang.String reason, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums)  { throw new RuntimeException(); }
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
}
