package org.apache.spark.sql.execution.python;
/**
 * A helper class to run Python UDFs in Spark.
 */
public  class PythonUDFRunner extends org.apache.spark.api.python.BasePythonRunner<byte[], byte[]> {
  static public  void writeUDFs (java.io.DataOutputStream dataOut, scala.collection.Seq<org.apache.spark.api.python.ChainedPythonFunctions> funcs, int[][] argOffsets)  { throw new RuntimeException(); }
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
  static protected  java.util.Map<java.lang.String, java.lang.String> envVars ()  { throw new RuntimeException(); }
  static protected  java.lang.String pythonExec ()  { throw new RuntimeException(); }
  static protected  java.lang.String pythonVer ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.api.python.PythonAccumulatorV2 accumulator ()  { throw new RuntimeException(); }
  static   scala.Option<java.net.ServerSocket> serverSocket ()  { throw new RuntimeException(); }
  static   void serverSocket_$eq (scala.Option<java.net.ServerSocket> x$1)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<OUT> compute (scala.collection.Iterator<IN> inputIterator, int partitionIndex, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public   PythonUDFRunner (scala.collection.Seq<org.apache.spark.api.python.ChainedPythonFunctions> funcs, int evalType, int[][] argOffsets)  { throw new RuntimeException(); }
  protected  org.apache.spark.api.python.BasePythonRunner<byte[], byte[]>.WriterThread newWriterThread (org.apache.spark.SparkEnv env, java.net.Socket worker, scala.collection.Iterator<byte[]> inputIterator, int partitionIndex, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  scala.collection.Iterator<byte[]> newReaderIterator (java.io.DataInputStream stream, org.apache.spark.api.python.BasePythonRunner<byte[], byte[]>.WriterThread writerThread, long startTime, org.apache.spark.SparkEnv env, java.net.Socket worker, java.util.concurrent.atomic.AtomicBoolean releasedOrClosed, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
