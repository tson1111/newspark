package org.apache.spark.sql.kafka010;
/**
 * A wrapper around Kafka's KafkaConsumer that throws error when data loss is detected.
 * This is not for direct use outside this file.
 */
  class InternalKafkaConsumer implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  /**
   * The internal object to store the fetched data from Kafka consumer and the next offset to poll.
   * <p>
   * param:  _records the pre-fetched Kafka records.
   * param:  _nextOffsetInFetchedData the next offset in <code>records</code>. We use this to verify if we
   *                                 should check if the pre-fetched data is still valid.
   * param:  _offsetAfterPoll the Kafka offset after calling <code>poll</code>. We will use this offset to
   *                           poll when <code>records</code> is drained.
   */
  private  class FetchedData implements scala.Product, scala.Serializable {
    // not preceding
    private  java.util.ListIterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> _records ()  { throw new RuntimeException(); }
    private  long _nextOffsetInFetchedData ()  { throw new RuntimeException(); }
    private  long _offsetAfterPoll ()  { throw new RuntimeException(); }
    // not preceding
    public   FetchedData (java.util.ListIterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> _records, long _nextOffsetInFetchedData, long _offsetAfterPoll)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.kafka010.InternalKafkaConsumer.FetchedData withNewPoll (java.util.ListIterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> records, long offsetAfterPoll)  { throw new RuntimeException(); }
    /** Whether there are more elements */
    public  boolean hasNext ()  { throw new RuntimeException(); }
    /** Move `records` forward and return the next record. */
    public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> next ()  { throw new RuntimeException(); }
    /** Move `records` backward and return the previous record. */
    public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> previous ()  { throw new RuntimeException(); }
    /** Reset the internal pre-fetched data. */
    public  void reset ()  { throw new RuntimeException(); }
    /**
     * Returns the next offset in <code>records</code>. We use this to verify if we should check if the
     * pre-fetched data is still valid.
     * @return (undocumented)
     */
    public  long nextOffsetInFetchedData ()  { throw new RuntimeException(); }
    /**
     * Returns the next offset to poll after draining the pre-fetched records.
     * @return (undocumented)
     */
    public  long offsetAfterPoll ()  { throw new RuntimeException(); }
  }
  private  class FetchedData$ extends scala.runtime.AbstractFunction3<java.util.ListIterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>>, java.lang.Object, java.lang.Object, org.apache.spark.sql.kafka010.InternalKafkaConsumer.FetchedData> implements scala.Serializable {
    public   FetchedData$ ()  { throw new RuntimeException(); }
  }
  /**
   * The internal object returned by the <code>fetchRecord</code> method. If <code>record</code> is empty, it means it is
   * invisible (either a transaction message, or an aborted message when the consumer's
   * <code>isolation.level</code> is <code>read_committed</code>), and the caller should use <code>nextOffsetToFetch</code> to fetch
   * instead.
   */
  private  class FetchedRecord implements scala.Product, scala.Serializable {
    public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> record ()  { throw new RuntimeException(); }
    public  long nextOffsetToFetch ()  { throw new RuntimeException(); }
    // not preceding
    public   FetchedRecord (org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> record, long nextOffsetToFetch)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.kafka010.InternalKafkaConsumer.FetchedRecord withRecord (org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> record, long nextOffsetToFetch)  { throw new RuntimeException(); }
  }
  private  class FetchedRecord$ extends scala.runtime.AbstractFunction2<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>, java.lang.Object, org.apache.spark.sql.kafka010.InternalKafkaConsumer.FetchedRecord> implements scala.Serializable {
    public   FetchedRecord$ ()  { throw new RuntimeException(); }
  }
  static private  long UNKNOWN_OFFSET ()  { throw new RuntimeException(); }
  static private  void reportDataLoss0 (boolean failOnDataLoss, java.lang.String finalMessage, java.lang.Throwable cause)  { throw new RuntimeException(); }
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
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  // not preceding
  public   InternalKafkaConsumer (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  private  java.lang.String groupId ()  { throw new RuntimeException(); }
  private  org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> consumer ()  { throw new RuntimeException(); }
  /** indicates whether this consumer is in use or not */
  public  boolean inUse ()  { throw new RuntimeException(); }
  /** indicate whether this consumer is going to be stopped in the next release */
  public  boolean markedForClose ()  { throw new RuntimeException(); }
  /**
   * The fetched data returned from Kafka consumer. This is a reusable private object to avoid
   * memory allocation.
   * @return (undocumented)
   */
  private  org.apache.spark.sql.kafka010.InternalKafkaConsumer.FetchedData fetchedData ()  { throw new RuntimeException(); }
  /**
   * The fetched record returned from the <code>fetchRecord</code> method. This is a reusable private object to
   * avoid memory allocation.
   * @return (undocumented)
   */
  private  org.apache.spark.sql.kafka010.InternalKafkaConsumer.FetchedRecord fetchedRecord ()  { throw new RuntimeException(); }
  /** Create a KafkaConsumer to fetch records for `topicPartition` */
  private  org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> createConsumer ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T runUninterruptiblyIfPossible (scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Return the available offset range of the current partition. It's a pair of the earliest offset
   * and the latest offset.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaDataConsumer.AvailableOffsetRange getAvailableOffsetRange ()  { throw new RuntimeException(); }
  /** @see {@link KafkaDataConsumer.get} */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> get (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  /**
   * Return the next earliest available offset in [offset, untilOffset). If all offsets in
   * [offset, untilOffset) are invalid (e.g., the topic is deleted and recreated), it will return
   * <code>UNKNOWN_OFFSET</code>.
   * @param offset (undocumented)
   * @param untilOffset (undocumented)
   * @return (undocumented)
   */
  private  long getEarliestAvailableOffsetBetween (long offset, long untilOffset)  { throw new RuntimeException(); }
  /**
   * Get the fetched record for the given offset if available.
   * <p>
   * If the record is invisible (either a  transaction message, or an aborted message when the
   * consumer's <code>isolation.level</code> is <code>read_committed</code>), it will return a <code>FetchedRecord</code> with the
   * next offset to fetch.
   * <p>
   * This method also will try the best to detect data loss. If <code>failOnDataLoss</code> is true<code>, it will
   * throw an exception when we detect an unavailable offset. If </code>failOnDataLoss<code> is </code>false<code>, this
   * method will return </code>null<code> if the next available record is within [offset, untilOffset).</code>
   * <p>
   * @throws OffsetOutOfRangeException if <code>offset</code> is out of range
   * @throws TimeoutException if cannot fetch the record in <code>pollTimeoutMs</code> milliseconds.
   * @param offset (undocumented)
   * @param untilOffset (undocumented)
   * @param pollTimeoutMs (undocumented)
   * @param failOnDataLoss (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.kafka010.InternalKafkaConsumer.FetchedRecord fetchRecord (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  /** Create a new consumer and reset cached states */
  private  void resetConsumer ()  { throw new RuntimeException(); }
  /**
   * Return an addition message including useful message and instruction.
   * @param failOnDataLoss (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String additionalMessage (boolean failOnDataLoss)  { throw new RuntimeException(); }
  /**
   * Throw an exception or log a warning as per <code>failOnDataLoss</code>.
   * @param failOnDataLoss (undocumented)
   * @param message (undocumented)
   * @param cause (undocumented)
   */
  private  void reportDataLoss (boolean failOnDataLoss, java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  void seek (long offset)  { throw new RuntimeException(); }
  /**
   * Poll messages from Kafka starting from <code>offset</code> and update <code>fetchedData</code>. <code>fetchedData</code> may be
   * empty if the Kafka consumer fetches some messages but all of them are not visible messages
   * (either transaction messages, or aborted messages when <code>isolation.level</code> is <code>read_committed</code>).
   * <p>
   * @throws OffsetOutOfRangeException if <code>offset</code> is out of range.
   * @throws TimeoutException if the consumer position is not changed after polling. It means the
   *                          consumer polls nothing before timeout.
   * @param offset (undocumented)
   * @param pollTimeoutMs (undocumented)
   */
  private  void fetchData (long offset, long pollTimeoutMs)  { throw new RuntimeException(); }
}
