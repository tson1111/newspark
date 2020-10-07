package org.apache.spark.sql.kafka010;
/** A {@link InputPartition} for reading Kafka data in a micro-batch streaming query. */
  class KafkaMicroBatchInputPartition implements org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  public  long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  boolean failOnDataLoss ()  { throw new RuntimeException(); }
  public  boolean reuseKafkaConsumer ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaMicroBatchInputPartition (org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, long pollTimeoutMs, boolean failOnDataLoss, boolean reuseKafkaConsumer)  { throw new RuntimeException(); }
  public  java.lang.String[] preferredLocations ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.InputPartitionReader<org.apache.spark.sql.catalyst.InternalRow> createPartitionReader ()  { throw new RuntimeException(); }
}
