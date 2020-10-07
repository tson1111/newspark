package org.apache.spark.streaming.kafka010;
/**
 * A wrapper around Kafka's KafkaConsumer.
 * This is not for direct use outside this file.
 */
  class InternalKafkaConsumer<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.internal.Logging {
  static private  long UNKNOWN_OFFSET ()  { throw new RuntimeException(); }
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
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  // not preceding
  public   InternalKafkaConsumer (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
    java.lang.String groupId ()  { throw new RuntimeException(); }
  private  org.apache.kafka.clients.consumer.KafkaConsumer<K, V> consumer ()  { throw new RuntimeException(); }
  /** indicates whether this consumer is in use or not */
  public  boolean inUse ()  { throw new RuntimeException(); }
  /** indicate whether this consumer is going to be stopped in the next release */
  public  boolean markedForClose ()  { throw new RuntimeException(); }
  private  java.util.ListIterator<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> buffer ()  { throw new RuntimeException(); }
  private  long nextOffset ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** Create a KafkaConsumer to fetch records for `topicPartition` */
  private  org.apache.kafka.clients.consumer.KafkaConsumer<K, V> createConsumer ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Get the record for the given offset, waiting up to timeout ms if IO is necessary.
   * Sequential forward access will use buffers, but random access will be horribly inefficient.
   * @param offset (undocumented)
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> get (long offset, long timeout)  { throw new RuntimeException(); }
  /**
   * Start a batch on a compacted topic
   * @param offset (undocumented)
   * @param pollTimeoutMs (undocumented)
   */
  public  void compactedStart (long offset, long pollTimeoutMs)  { throw new RuntimeException(); }
  /**
   * Get the next record in the batch from a compacted topic.
   * Assumes compactedStart has been called first, and ignores gaps.
   * @param pollTimeoutMs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> compactedNext (long pollTimeoutMs)  { throw new RuntimeException(); }
  /**
   * Rewind to previous record in the batch from a compacted topic.
   * @throws NoSuchElementException if no previous element
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> compactedPrevious ()  { throw new RuntimeException(); }
  private  void seek (long offset)  { throw new RuntimeException(); }
  private  void poll (long timeout)  { throw new RuntimeException(); }
}
