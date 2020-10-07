package org.apache.spark.deploy.history;
/**
 * Tracking info for event logs detected in the configured log directory. Tracks both valid and
 * invalid logs (e.g. unparseable logs, recorded as logs with no app ID) so that the cleaner
 * can know what log files are safe to delete.
 */
  class LogInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String logPath ()  { throw new RuntimeException(); }
  public  long lastProcessed ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
  public  long fileSize ()  { throw new RuntimeException(); }
  // not preceding
  public   LogInfo (java.lang.String logPath, long lastProcessed, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> attemptId, long fileSize)  { throw new RuntimeException(); }
}
