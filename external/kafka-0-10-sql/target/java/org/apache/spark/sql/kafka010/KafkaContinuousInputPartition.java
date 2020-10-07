package org.apache.spark.sql.kafka010;
/**
 * An input partition for continuous Kafka processing. This will be serialized and transformed
 * into a full reader on executors.
 * <p>
 * param:  topicPartition The (topic, partition) pair this task is responsible for.
 * param:  startOffset The offset to start reading from within the partition.
 * param:  kafkaParams Kafka consumer params to use.
 * param:  pollTimeoutMs The timeout for Kafka consumer polling.
 * param:  failOnDataLoss Flag indicating whether data reader should fail if some offsets
 *                       are skipped.
 */
public  class KafkaContinuousInputPartition implements org.apache.spark.sql.sources.v2.reader.ContinuousInputPartition<org.apache.spark.sql.catalyst.InternalRow>, scala.Product, scala.Serializable {
  static public  java.lang.String[] preferredLocations ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  long startOffset ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  public  long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  boolean failOnDataLoss ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaContinuousInputPartition (org.apache.kafka.common.TopicPartition topicPartition, long startOffset, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.InputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> createContinuousReader (org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset offset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaContinuousInputPartitionReader createPartitionReader ()  { throw new RuntimeException(); }
}
