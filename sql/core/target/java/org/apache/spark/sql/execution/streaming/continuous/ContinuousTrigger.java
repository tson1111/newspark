package org.apache.spark.sql.execution.streaming.continuous;
/**
 * A {@link Trigger} that continuously processes streaming data, asynchronously checkpointing at
 * the specified interval.
 */
public  class ContinuousTrigger extends org.apache.spark.sql.streaming.Trigger implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.streaming.continuous.ContinuousTrigger apply (java.lang.String interval)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.continuous.ContinuousTrigger apply (scala.concurrent.duration.Duration interval)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.continuous.ContinuousTrigger create (java.lang.String interval)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.continuous.ContinuousTrigger create (long interval, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long intervalMs ()  { throw new RuntimeException(); }
  // not preceding
  public   ContinuousTrigger (long intervalMs)  { throw new RuntimeException(); }
}
