package org.apache.spark.sql.kafka010;
public  class CachedKafkaProducer {
  static private  long defaultCacheExpireTimeout ()  { throw new RuntimeException(); }
  static private  long cacheExpireTimeout ()  { throw new RuntimeException(); }
  static private  com.google.common.cache.CacheLoader<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]>> cacheLoader ()  { throw new RuntimeException(); }
  static private  java.lang.Object removalListener ()  { throw new RuntimeException(); }
  static private  com.google.common.cache.LoadingCache<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]>> guavaCache ()  { throw new RuntimeException(); }
  static private  org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]> createKafkaProducer (java.util.Map<java.lang.String, java.lang.Object> producerConfiguration)  { throw new RuntimeException(); }
  /**
   * Get a cached KafkaProducer for a given configuration. If matching KafkaProducer doesn't
   * exist, a new KafkaProducer will be created. KafkaProducer is thread safe, it is best to keep
   * one instance per specified kafkaParams.
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  static   org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]> getOrCreate (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> paramsToSeq (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** For explicitly closing kafka producer */
  static   void close (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** Auto close on cache evict */
  static private  void close (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> paramsSeq, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]> producer)  { throw new RuntimeException(); }
  static   void clear ()  { throw new RuntimeException(); }
  static private  java.util.concurrent.ConcurrentMap<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]>> getAsMap ()  { throw new RuntimeException(); }
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
}
