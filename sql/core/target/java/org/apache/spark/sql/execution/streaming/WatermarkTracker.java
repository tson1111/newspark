package org.apache.spark.sql.execution.streaming;
/** Tracks the watermark value of a streaming query based on a given `policy` */
public  class WatermarkTracker implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.streaming.WatermarkTracker apply (org.apache.spark.sql.RuntimeConfig conf)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.MultipleWatermarkPolicy policy ()  { throw new RuntimeException(); }
  // not preceding
  public   WatermarkTracker (org.apache.spark.sql.execution.streaming.MultipleWatermarkPolicy policy)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> operatorToWatermarkMap ()  { throw new RuntimeException(); }
  private  long globalWatermarkMs ()  { throw new RuntimeException(); }
  public  void setWatermark (long newWatermarkMs)  { throw new RuntimeException(); }
  public  void updateWatermark (org.apache.spark.sql.execution.SparkPlan executedPlan)  { throw new RuntimeException(); }
  public  long currentWatermark ()  { throw new RuntimeException(); }
}
