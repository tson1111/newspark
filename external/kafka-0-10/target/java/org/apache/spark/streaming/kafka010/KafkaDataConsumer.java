package org.apache.spark.streaming.kafka010;
  interface KafkaDataConsumer<K extends java.lang.Object, V extends java.lang.Object> {
  static   class CachedKafkaDataConsumer<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.streaming.kafka010.KafkaDataConsumer<K, V>, scala.Product, scala.Serializable {
    public  org.apache.spark.streaming.kafka010.InternalKafkaConsumer<K, V> internalConsumer ()  { throw new RuntimeException(); }
    // not preceding
    public   CachedKafkaDataConsumer (org.apache.spark.streaming.kafka010.InternalKafkaConsumer<K, V> internalConsumer)  { throw new RuntimeException(); }
    public  void release ()  { throw new RuntimeException(); }
  }
  static   class CachedKafkaDataConsumer$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CachedKafkaDataConsumer$ MODULE$ = null;
    public   CachedKafkaDataConsumer$ ()  { throw new RuntimeException(); }
  }
  static   class NonCachedKafkaDataConsumer<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.streaming.kafka010.KafkaDataConsumer<K, V>, scala.Product, scala.Serializable {
    public  org.apache.spark.streaming.kafka010.InternalKafkaConsumer<K, V> internalConsumer ()  { throw new RuntimeException(); }
    // not preceding
    public   NonCachedKafkaDataConsumer (org.apache.spark.streaming.kafka010.InternalKafkaConsumer<K, V> internalConsumer)  { throw new RuntimeException(); }
    public  void release ()  { throw new RuntimeException(); }
  }
  static   class NonCachedKafkaDataConsumer$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NonCachedKafkaDataConsumer$ MODULE$ = null;
    public   NonCachedKafkaDataConsumer$ ()  { throw new RuntimeException(); }
  }
  /**
   * Get the record for the given offset if available.
   * <p>
   * @param offset         the offset to fetch.
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> get (long offset, long pollTimeoutMs)  ;
  /**
   * Start a batch on a compacted topic
   * <p>
   * @param offset         the offset to fetch.
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   */
  public  void compactedStart (long offset, long pollTimeoutMs)  ;
  /**
   * Get the next record in the batch from a compacted topic.
   * Assumes compactedStart has been called first, and ignores gaps.
   * <p>
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> compactedNext (long pollTimeoutMs)  ;
  /**
   * Rewind to previous record in the batch from a compacted topic.
   * <p>
   * @throws NoSuchElementException if no previous element
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> compactedPrevious ()  ;
  /**
   * Release this consumer from being further used. Depending on its implementation,
   * this consumer will be either finalized, or reset for reuse later.
   */
  public  void release ()  ;
  /** Reference to the internal implementation that this wrapper delegates to */
  public  org.apache.spark.streaming.kafka010.InternalKafkaConsumer<K, V> internalConsumer ()  ;
}
