package org.apache.spark.sql.kafka010;
/** A {@link InputPartitionReader} for reading Kafka data in a micro-batch streaming query. */
  class KafkaMicroBatchInputPartitionReader implements org.apache.spark.sql.sources.v2.reader.InputPartitionReader<org.apache.spark.sql.catalyst.InternalRow>, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
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
  public  org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  public  long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  boolean failOnDataLoss ()  { throw new RuntimeException(); }
  public  boolean reuseKafkaConsumer ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaMicroBatchInputPartitionReader (org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, long pollTimeoutMs, boolean failOnDataLoss, boolean reuseKafkaConsumer)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.kafka010.KafkaDataConsumer consumer ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.kafka010.KafkaOffsetRange rangeToRead ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.kafka010.KafkaRecordToUnsafeRowConverter converter ()  { throw new RuntimeException(); }
  private  long nextOffset ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeRow nextRow ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.kafka010.KafkaOffsetRange resolveRange (org.apache.spark.sql.kafka010.KafkaOffsetRange range)  { throw new RuntimeException(); }
}
