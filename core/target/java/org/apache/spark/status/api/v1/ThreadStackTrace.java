package org.apache.spark.status.api.v1;
public  class ThreadStackTrace implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long threadId ()  { throw new RuntimeException(); }
  public  java.lang.String threadName ()  { throw new RuntimeException(); }
  public  java.lang.Thread.State threadState ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StackTrace stackTrace ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> blockedByThreadId ()  { throw new RuntimeException(); }
  public  java.lang.String blockedByLock ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> holdingLocks ()  { throw new RuntimeException(); }
  // not preceding
  public   ThreadStackTrace (long threadId, java.lang.String threadName, java.lang.Thread.State threadState, org.apache.spark.status.api.v1.StackTrace stackTrace, scala.Option<java.lang.Object> blockedByThreadId, java.lang.String blockedByLock, scala.collection.Seq<java.lang.String> holdingLocks)  { throw new RuntimeException(); }
}
