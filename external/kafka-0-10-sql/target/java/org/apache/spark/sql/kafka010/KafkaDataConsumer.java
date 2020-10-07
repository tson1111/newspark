package org.apache.spark.sql.kafka010;
  interface KafkaDataConsumer {
  static public  class AvailableOffsetRange implements scala.Product, scala.Serializable {
    public  long earliest ()  { throw new RuntimeException(); }
    public  long latest ()  { throw new RuntimeException(); }
    // not preceding
    public   AvailableOffsetRange (long earliest, long latest)  { throw new RuntimeException(); }
  }
  static public  class AvailableOffsetRange$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.sql.kafka010.KafkaDataConsumer.AvailableOffsetRange> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AvailableOffsetRange$ MODULE$ = null;
    public   AvailableOffsetRange$ ()  { throw new RuntimeException(); }
  }
  static   class CachedKafkaDataConsumer implements org.apache.spark.sql.kafka010.KafkaDataConsumer, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer ()  { throw new RuntimeException(); }
    // not preceding
    public   CachedKafkaDataConsumer (org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer)  { throw new RuntimeException(); }
    public  void release ()  { throw new RuntimeException(); }
  }
  static   class CachedKafkaDataConsumer$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.kafka010.InternalKafkaConsumer, org.apache.spark.sql.kafka010.KafkaDataConsumer.CachedKafkaDataConsumer> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CachedKafkaDataConsumer$ MODULE$ = null;
    public   CachedKafkaDataConsumer$ ()  { throw new RuntimeException(); }
  }
  static   class NonCachedKafkaDataConsumer implements org.apache.spark.sql.kafka010.KafkaDataConsumer, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer ()  { throw new RuntimeException(); }
    // not preceding
    public   NonCachedKafkaDataConsumer (org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer)  { throw new RuntimeException(); }
    public  void release ()  { throw new RuntimeException(); }
  }
  static   class NonCachedKafkaDataConsumer$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.kafka010.InternalKafkaConsumer, org.apache.spark.sql.kafka010.KafkaDataConsumer.NonCachedKafkaDataConsumer> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NonCachedKafkaDataConsumer$ MODULE$ = null;
    public   NonCachedKafkaDataConsumer$ ()  { throw new RuntimeException(); }
  }
  static   class CacheKey implements scala.Product, scala.Serializable {
    public  java.lang.String groupId ()  { throw new RuntimeException(); }
    public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
    // not preceding
    public   CacheKey (java.lang.String groupId, org.apache.kafka.common.TopicPartition topicPartition)  { throw new RuntimeException(); }
    public   CacheKey (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  }
  static   class CacheKey$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.kafka.common.TopicPartition, org.apache.spark.sql.kafka010.KafkaDataConsumer.CacheKey> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CacheKey$ MODULE$ = null;
    public   CacheKey$ ()  { throw new RuntimeException(); }
  }
  /**
   * Get the record for the given offset if available.
   * <p>
   * If the record is invisible (either a
   * transaction message, or an aborted message when the consumer's <code>isolation.level</code> is
   * <code>read_committed</code>), it will be skipped and this method will try to fetch next available record
   * within [offset, untilOffset).
   * <p>
   * This method also will try its best to detect data loss. If <code>failOnDataLoss</code> is <code>true</code>, it will
   * throw an exception when we detect an unavailable offset. If <code>failOnDataLoss</code> is <code>false</code>, this
   * method will try to fetch next available record within [offset, untilOffset).
   * <p>
   * When this method tries to skip offsets due to either invisible messages or data loss and
   * reaches <code>untilOffset</code>, it will return <code>null</code>.
   * <p>
   * @param offset         the offset to fetch.
   * @param untilOffset    the max offset to fetch. Exclusive.
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   * @param failOnDataLoss When <code>failOnDataLoss</code> is <code>true</code>, this method will either return record at
   *                       offset if available, or throw exception.when <code>failOnDataLoss</code> is <code>false</code>,
   *                       this method will either return record at offset if available, or return
   *                       the next earliest available record less than untilOffset, or null. It
   *                       will not throw any exception.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> get (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  ;
  /**
   * Return the available offset range of the current partition. It's a pair of the earliest offset
   * and the latest offset.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaDataConsumer.AvailableOffsetRange getAvailableOffsetRange ()  ;
  /**
   * Release this consumer from being further used. Depending on its implementation,
   * this consumer will be either finalized, or reset for reuse later.
   */
  public  void release ()  ;
  /** Reference to the internal implementation that this wrapper delegates to */
  public  org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer ()  ;
}
