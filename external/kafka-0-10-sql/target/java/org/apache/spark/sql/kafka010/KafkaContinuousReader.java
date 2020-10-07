package org.apache.spark.sql.kafka010;
/**
 * A {@link ContinuousReader} for data from kafka.
 * <p>
 * param:  offsetReader  a reader used to get kafka offsets. Note that the actual data will be
 *                      read by per-task consumers generated later.
 * param:  kafkaParams   String params for per-task Kafka consumers.
 * param:  sourceOptions The {@link org.apache.spark.sql.sources.v2.DataSourceOptions} params which
 *                      are not Kafka consumer params.
 * param:  metadataPath Path to a directory this reader can use for writing metadata.
 * param:  initialOffsets The Kafka offsets to start reading data at.
 * param:  failOnDataLoss Flag indicating whether reading should fail in data loss
 *                       scenarios, where some offsets after the specified initial ones can't be
 *                       properly read.
 */
public  class KafkaContinuousReader implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousReader, org.apache.spark.internal.Logging {
  public   KafkaContinuousReader (org.apache.spark.sql.kafka010.KafkaOffsetReader offsetReader, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, scala.collection.immutable.Map<java.lang.String, java.lang.String> sourceOptions, java.lang.String metadataPath, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit initialOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.reader.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getStartOffset ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<org.apache.kafka.common.TopicPartition> knownPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset mergeOffsets (org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset[] offsets)  { throw new RuntimeException(); }
  public  boolean needsReconfiguration ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.sources.v2.reader.streaming.Offset offset ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow>> planInputPartitions ()  { throw new RuntimeException(); }
  private  long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  /**
   * If <code>failOnDataLoss</code> is true, this method will throw an <code>IllegalStateException</code>.
   * Otherwise, just log a warning.
   * @param message (undocumented)
   */
  private  void reportDataLoss (java.lang.String message)  { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.SparkSession session ()  { throw new RuntimeException(); }
  public  void setStartOffset (java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> start)  { throw new RuntimeException(); }
  /** Stop this source and free any resources it has allocated. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
