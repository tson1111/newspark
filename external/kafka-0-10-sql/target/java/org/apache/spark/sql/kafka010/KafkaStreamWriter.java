package org.apache.spark.sql.kafka010;
/**
 * A {@link StreamWriter} for Kafka writing. Responsible for generating the writer factory.
 * <p>
 * param:  topic The topic this writer is responsible for. If None, topic will be inferred from
 *              a <code>topic</code> field in the incoming data.
 * param:  producerParams Parameters for Kafka producers in each task.
 * param:  schema The schema of the input data.
 */
public  class KafkaStreamWriter implements org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter {
  public   KafkaStreamWriter (scala.Option<java.lang.String> topic, scala.collection.immutable.Map<java.lang.String, java.lang.String> producerParams, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  void abort (long epochId, org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  void commit (long epochId, org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaStreamWriterFactory createWriterFactory ()  { throw new RuntimeException(); }
}
