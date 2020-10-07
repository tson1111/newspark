package org.apache.spark.util;
/**
 * The default uncaught exception handler for Spark daemons. It terminates the whole process for
 * any Errors, and also terminates the process for Exceptions when the exitOnException flag is true.
 * <p>
 * param:  exitOnUncaughtException Whether to exit the process on UncaughtException.
 */
  class SparkUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler, org.apache.spark.internal.Logging {
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
  public  boolean exitOnUncaughtException ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkUncaughtExceptionHandler (boolean exitOnUncaughtException)  { throw new RuntimeException(); }
  public  void uncaughtException (java.lang.Thread thread, java.lang.Throwable exception)  { throw new RuntimeException(); }
  public  void uncaughtException (java.lang.Throwable exception)  { throw new RuntimeException(); }
}
