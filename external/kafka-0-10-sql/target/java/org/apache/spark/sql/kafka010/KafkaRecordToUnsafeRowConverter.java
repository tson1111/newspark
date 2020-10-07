package org.apache.spark.sql.kafka010;
/** A simple class for converting Kafka ConsumerRecord to UnsafeRow */
  class KafkaRecordToUnsafeRowConverter {
  public   KafkaRecordToUnsafeRowConverter ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.codegen.UnsafeRowWriter rowWriter ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow toUnsafeRow (org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> record)  { throw new RuntimeException(); }
}
