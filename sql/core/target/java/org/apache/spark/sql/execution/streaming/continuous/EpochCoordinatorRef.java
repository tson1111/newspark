package org.apache.spark.sql.execution.streaming.continuous;
/** Helper object used to create reference to {@link EpochCoordinator}. */
public  class EpochCoordinatorRef {
  static private  java.lang.String endpointName (java.lang.String id)  { throw new RuntimeException(); }
  /**
   * Create a reference to a new {@link EpochCoordinator}.
   * @param writer (undocumented)
   * @param reader (undocumented)
   * @param query (undocumented)
   * @param epochCoordinatorId (undocumented)
   * @param startEpoch (undocumented)
   * @param session (undocumented)
   * @param env (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.rpc.RpcEndpointRef create (org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter writer, org.apache.spark.sql.sources.v2.reader.streaming.ContinuousReader reader, org.apache.spark.sql.execution.streaming.continuous.ContinuousExecution query, java.lang.String epochCoordinatorId, long startEpoch, org.apache.spark.sql.SparkSession session, org.apache.spark.SparkEnv env)  { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEndpointRef get (java.lang.String id, org.apache.spark.SparkEnv env)  { throw new RuntimeException(); }
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
}
