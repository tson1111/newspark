package org.apache.spark.sql.kafka010;
/**
 * A {@link MicroBatchReader} that reads data from Kafka.
 * <p>
 * The {@link KafkaSourceOffset} is the custom {@link Offset} defined for this source that contains
 * a map of TopicPartition -> offset. Note that this offset is 1 + (available offset). For
 * example if the last record in a Kafka topic "t", partition 2 is offset 5, then
 * KafkaSourceOffset will contain TopicPartition("t", 2) -> 6. This is done keep it consistent
 * with the semantics of <code>KafkaConsumer.position()</code>.
 * <p>
 * Zero data lost is not guaranteed when topics are deleted. If zero data lost is critical, the user
 * must make sure all messages in a topic have been processed when deleting a topic.
 * <p>
 * There is a known issue caused by KAFKA-1894: the query using Kafka maybe cannot be stopped.
 * To avoid this issue, you should make sure stopping the query before stopping the Kafka brokers
 * and not use wrong broker addresses.
 */
  class KafkaMicroBatchReader implements org.apache.spark.sql.sources.v2.reader.streaming.MicroBatchReader, org.apache.spark.internal.Logging {
  /** A version of {@link HDFSMetadataLog} specialized for saving the initial offsets. */
  public  class KafkaSourceInitialOffsetWriter extends org.apache.spark.sql.execution.streaming.HDFSMetadataLog<org.apache.spark.sql.kafka010.KafkaSourceOffset> {
    public   KafkaSourceInitialOffsetWriter (org.apache.spark.sql.SparkSession sparkSession, java.lang.String metadataPath)  { throw new RuntimeException(); }
    public  int VERSION ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.kafka010.KafkaSourceOffset deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
    public  void serialize (org.apache.spark.sql.kafka010.KafkaSourceOffset metadata, java.io.OutputStream out)  { throw new RuntimeException(); }
  }
  public   KafkaMicroBatchReader (org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaOffsetReader, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, org.apache.spark.sql.sources.v2.DataSourceOptions options, java.lang.String metadataPath, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.reader.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> endPartitionOffsets ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getEndOffset ()  { throw new RuntimeException(); }
  /**
   * Read initial partition offsets from the checkpoint, or decide the offsets and write them to
   * the checkpoint.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> getOrCreateInitialPartitionOffsets ()  { throw new RuntimeException(); }
  private  java.lang.String[] getSortedExecutorList ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getStartOffset ()  { throw new RuntimeException(); }
  /**
   * Lazily initialize <code>initialPartitionOffsets</code> to make sure that <code>KafkaConsumer.poll</code> is only
   * called in StreamExecutionThread. Otherwise, interrupting a thread while running
   * <code>KafkaConsumer.poll</code> may hang forever (KAFKA-1894).
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> initialPartitionOffsets ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> maxOffsetsPerTrigger ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>> planInputPartitions ()  { throw new RuntimeException(); }
  private  long pollTimeoutMs ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.kafka010.KafkaOffsetRangeCalculator rangeCalculator ()  { throw new RuntimeException(); }
  /** Proportionally distribute limit number of offsets among topicpartitions */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> rateLimit (long limit, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> from, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> until)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  /**
   * If <code>failOnDataLoss</code> is true, this method will throw an <code>IllegalStateException</code>.
   * Otherwise, just log a warning.
   * @param message (undocumented)
   */
  private  void reportDataLoss (java.lang.String message)  { throw new RuntimeException(); }
  public  void setOffsetRange (java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> start, java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> end)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> startPartitionOffsets ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
