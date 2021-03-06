package org.apache.spark.sql.kafka010;
public  class KafkaSourceProvider$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaSourceProvider$ MODULE$ = null;
  public   KafkaSourceProvider$ ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> STRATEGY_OPTION_KEYS ()  { throw new RuntimeException(); }
    java.lang.String STARTING_OFFSETS_OPTION_KEY ()  { throw new RuntimeException(); }
    java.lang.String ENDING_OFFSETS_OPTION_KEY ()  { throw new RuntimeException(); }
  private  java.lang.String FAIL_ON_DATA_LOSS_OPTION_KEY ()  { throw new RuntimeException(); }
  private  java.lang.String MIN_PARTITIONS_OPTION_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String TOPIC_OPTION_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String INSTRUCTION_FOR_FAIL_ON_DATA_LOSS_FALSE ()  { throw new RuntimeException(); }
  public  java.lang.String INSTRUCTION_FOR_FAIL_ON_DATA_LOSS_TRUE ()  { throw new RuntimeException(); }
  private  java.lang.String deserClassName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit getKafkaOffsetRangeLimit (scala.collection.immutable.Map<java.lang.String, java.lang.String> params, java.lang.String offsetOptionKey, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit defaultOffsets)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParamsForDriver (scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParamsForExecutors (scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams, java.lang.String uniqueGroupId)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParamsForProducer (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
}
