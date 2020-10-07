package org.apache.spark.status.api.v1;
public  class ApplicationInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> coresGranted ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxCores ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> coresPerExecutor ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> memoryPerExecutorMB ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ApplicationAttemptInfo> attempts ()  { throw new RuntimeException(); }
  // not preceding
     ApplicationInfo (java.lang.String id, java.lang.String name, scala.Option<java.lang.Object> coresGranted, scala.Option<java.lang.Object> maxCores, scala.Option<java.lang.Object> coresPerExecutor, scala.Option<java.lang.Object> memoryPerExecutorMB, scala.collection.Seq<org.apache.spark.status.api.v1.ApplicationAttemptInfo> attempts)  { throw new RuntimeException(); }
}
