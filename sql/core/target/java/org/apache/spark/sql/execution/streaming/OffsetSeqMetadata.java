package org.apache.spark.sql.execution.streaming;
/**
 * Contains metadata associated with a {@link OffsetSeq}. This information is
 * persisted to the offset log in the checkpoint location via the {@link OffsetSeq} metadata field.
 * <p>
 * param:  batchWatermarkMs: The current eventTime watermark, used to
 * bound the lateness of data that will processed. Time unit: milliseconds
 * param:  batchTimestampMs: The current batch processing timestamp.
 * Time unit: milliseconds
 * param:  conf: Additional conf_s to be persisted across batches, e.g. number of shuffle partitions.
 */
public  class OffsetSeqMetadata implements scala.Product, scala.Serializable {
  static private  java.lang.Object format ()  { throw new RuntimeException(); }
  static private  scala.collection.Seq<org.apache.spark.internal.config.ConfigEntry<? super java.lang.String>> relevantSQLConfs ()  { throw new RuntimeException(); }
  /**
   * Default values of relevant configurations that are used for backward compatibility.
   * As new configurations are added to the metadata, existing checkpoints may not have those
   * confs. The values in this list ensures that the confs without recovered values are
   * set to a default value that ensure the same behavior of the streaming query as it was before
   * the restart.
   * <p>
   * Note, that this is optional; set values here if you *have* to override existing session conf
   * with a specific default value for ensuring same behavior of the query as before.
   * @return (undocumented)
   */
  static private  scala.collection.immutable.Map<java.lang.String, java.lang.String> relevantSQLConfDefaultValues ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata apply (java.lang.String json)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata apply (long batchWatermarkMs, long batchTimestampMs, org.apache.spark.sql.RuntimeConfig sessionConf)  { throw new RuntimeException(); }
  /** Set the SparkSession configuration with the values in the metadata */
  static public  void setSessionConf (org.apache.spark.sql.execution.streaming.OffsetSeqMetadata metadata, org.apache.spark.sql.RuntimeConfig sessionConf)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long batchWatermarkMs ()  { throw new RuntimeException(); }
  public  long batchTimestampMs ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> conf ()  { throw new RuntimeException(); }
  // not preceding
  public   OffsetSeqMetadata (long batchWatermarkMs, long batchTimestampMs, scala.collection.immutable.Map<java.lang.String, java.lang.String> conf)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
