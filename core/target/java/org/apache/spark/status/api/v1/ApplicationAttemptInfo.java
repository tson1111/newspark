package org.apache.spark.status.api.v1;
public  class ApplicationAttemptInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
  public  java.util.Date startTime ()  { throw new RuntimeException(); }
  public  java.util.Date endTime ()  { throw new RuntimeException(); }
  public  java.util.Date lastUpdated ()  { throw new RuntimeException(); }
  public  long duration ()  { throw new RuntimeException(); }
  public  java.lang.String sparkUser ()  { throw new RuntimeException(); }
  public  boolean completed ()  { throw new RuntimeException(); }
  public  java.lang.String appSparkVersion ()  { throw new RuntimeException(); }
  // not preceding
     ApplicationAttemptInfo (scala.Option<java.lang.String> attemptId, java.util.Date startTime, java.util.Date endTime, java.util.Date lastUpdated, long duration, java.lang.String sparkUser, boolean completed, java.lang.String appSparkVersion)  { throw new RuntimeException(); }
  public  long getStartTimeEpoch ()  { throw new RuntimeException(); }
  public  long getEndTimeEpoch ()  { throw new RuntimeException(); }
  public  long getLastUpdatedEpoch ()  { throw new RuntimeException(); }
}
