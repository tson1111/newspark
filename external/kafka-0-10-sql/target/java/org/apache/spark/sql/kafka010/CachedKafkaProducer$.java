package org.apache.spark.sql.kafka010;
public  class CachedKafkaProducer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CachedKafkaProducer$ MODULE$ = null;
  public   CachedKafkaProducer$ ()  { throw new RuntimeException(); }
  private  long defaultCacheExpireTimeout ()  { throw new RuntimeException(); }
  private  long cacheExpireTimeout ()  { throw new RuntimeException(); }
  private  com.google.common.cache.CacheLoader<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]>> cacheLoader ()  { throw new RuntimeException(); }
  private  java.lang.Object removalListener ()  { throw new RuntimeException(); }
  private  com.google.common.cache.LoadingCache<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]>> guavaCache ()  { throw new RuntimeException(); }
  private  org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]> createKafkaProducer (java.util.Map<java.lang.String, java.lang.Object> producerConfiguration)  { throw new RuntimeException(); }
  /**
   * Get a cached KafkaProducer for a given configuration. If matching KafkaProducer doesn't
   * exist, a new KafkaProducer will be created. KafkaProducer is thread safe, it is best to keep
   * one instance per specified kafkaParams.
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
    org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]> getOrCreate (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> paramsToSeq (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** For explicitly closing kafka producer */
    void close (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** Auto close on cache evict */
  private  void close (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> paramsSeq, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]> producer)  { throw new RuntimeException(); }
    void clear ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentMap<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]>> getAsMap ()  { throw new RuntimeException(); }
}
