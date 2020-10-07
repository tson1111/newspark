package org.apache.spark.api.python;
/**
 * The inverse of pyspark's ChunkedStream for sending data of unknown size.
 * <p>
 * We might be serializing a really large object from python -- we don't want
 * python to buffer the whole thing in memory, nor can it write to a file,
 * so we don't know the length in advance.  So python writes it in chunks, each chunk
 * preceeded by a length, till we get a "length" of -1 which serves as EOF.
 * <p>
 * Tested from python tests.
 */
  class DechunkedInputStream extends java.io.InputStream implements org.apache.spark.internal.Logging {
  /**
   * Dechunks the input, copies to output, and closes both input and the output safely.
   * @param chunked (undocumented)
   * @param out (undocumented)
   */
  static public  void dechunkAndCopyToOutput (java.io.InputStream chunked, java.io.OutputStream out)  { throw new RuntimeException(); }
  static public  long skip (long x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  int available () throws java.io.IOException { throw new RuntimeException(); }
  static public  void mark (int x$1)  { throw new RuntimeException(); }
  static public  void reset () throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean markSupported ()  { throw new RuntimeException(); }
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
  public   DechunkedInputStream (java.io.InputStream wrapped)  { throw new RuntimeException(); }
  private  java.io.DataInputStream din ()  { throw new RuntimeException(); }
  private  int remainingInChunk ()  { throw new RuntimeException(); }
  public  int read ()  { throw new RuntimeException(); }
  public  int read (byte[] dest, int off, int len)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
