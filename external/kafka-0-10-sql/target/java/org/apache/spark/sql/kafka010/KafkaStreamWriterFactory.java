package org.apache.spark.sql.kafka010;
/**
 * A {@link StreamingDataWriterFactory} for Kafka writing. Will be serialized and sent to executors to
 * generate the per-task data writers.
 * param:  topic The topic that should be written to. If None, topic will be inferred from
 *              a <code>topic</code> field in the incoming data.
 * param:  producerParams Parameters for Kafka producers in each task.
 * param:  schema The schema of the input data.
 */
public  class KafkaStreamWriterFactory implements org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.catalyst.InternalRow>, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> topic ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> producerParams ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaStreamWriterFactory (scala.Option<java.lang.String> topic, scala.collection.immutable.Map<java.lang.String, java.lang.String> producerParams, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.catalyst.InternalRow> createDataWriter (int partitionId, long taskId, long epochId)  { throw new RuntimeException(); }
}
