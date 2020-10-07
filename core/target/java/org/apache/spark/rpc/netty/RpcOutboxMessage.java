package org.apache.spark.rpc.netty;
  class RpcOutboxMessage implements org.apache.spark.rpc.netty.OutboxMessage, org.apache.spark.network.client.RpcResponseCallback, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
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
  public  java.nio.ByteBuffer content ()  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> _onFailure ()  { throw new RuntimeException(); }
  public  scala.Function2<org.apache.spark.network.client.TransportClient, java.nio.ByteBuffer, scala.runtime.BoxedUnit> _onSuccess ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcOutboxMessage (java.nio.ByteBuffer content, scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> _onFailure, scala.Function2<org.apache.spark.network.client.TransportClient, java.nio.ByteBuffer, scala.runtime.BoxedUnit> _onSuccess)  { throw new RuntimeException(); }
  private  org.apache.spark.network.client.TransportClient client ()  { throw new RuntimeException(); }
  private  long requestId ()  { throw new RuntimeException(); }
  public  void sendWith (org.apache.spark.network.client.TransportClient client)  { throw new RuntimeException(); }
  public  void onTimeout ()  { throw new RuntimeException(); }
  public  void onFailure (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  void onSuccess (java.nio.ByteBuffer response)  { throw new RuntimeException(); }
}
