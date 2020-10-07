package org.apache.spark.sql.kafka010;
public  class KafkaDataConsumer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaDataConsumer$ MODULE$ = null;
  public   KafkaDataConsumer$ ()  { throw new RuntimeException(); }
  private  java.util.LinkedHashMap<org.apache.spark.sql.kafka010.KafkaDataConsumer.CacheKey, org.apache.spark.sql.kafka010.InternalKafkaConsumer> cache ()  { throw new RuntimeException(); }
  /**
   * Get a cached consumer for groupId, assigned to topic and partition.
   * If matching consumer doesn't already exist, will be created using kafkaParams.
   * The returned consumer must be released explicitly using {@link KafkaDataConsumer.release()}.
   * <p>
   * Note: This method guarantees that the consumer returned is not currently in use by any one
   * else. Within this guarantee, this method will make a best effort attempt to re-use consumers by
   * caching them and tracking when they are in use.
   * @param topicPartition (undocumented)
   * @param kafkaParams (undocumented)
   * @param useCache (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaDataConsumer acquire (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, boolean useCache)  { throw new RuntimeException(); }
  private  void release (org.apache.spark.sql.kafka010.InternalKafkaConsumer intConsumer)  { throw new RuntimeException(); }
}
