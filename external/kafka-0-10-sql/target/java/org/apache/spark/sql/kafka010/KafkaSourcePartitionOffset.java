package org.apache.spark.sql.kafka010;
  class KafkaSourcePartitionOffset implements org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  long partitionOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaSourcePartitionOffset (org.apache.kafka.common.TopicPartition topicPartition, long partitionOffset)  { throw new RuntimeException(); }
}
