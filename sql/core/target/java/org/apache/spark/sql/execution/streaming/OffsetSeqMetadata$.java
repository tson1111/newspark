package org.apache.spark.sql.execution.streaming;
public  class OffsetSeqMetadata$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OffsetSeqMetadata$ MODULE$ = null;
  public   OffsetSeqMetadata$ ()  { throw new RuntimeException(); }
  private  java.lang.Object format ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.internal.config.ConfigEntry<? super java.lang.String>> relevantSQLConfs ()  { throw new RuntimeException(); }
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
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> relevantSQLConfDefaultValues ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata apply (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata apply (long batchWatermarkMs, long batchTimestampMs, org.apache.spark.sql.RuntimeConfig sessionConf)  { throw new RuntimeException(); }
  /** Set the SparkSession configuration with the values in the metadata */
  public  void setSessionConf (org.apache.spark.sql.execution.streaming.OffsetSeqMetadata metadata, org.apache.spark.sql.RuntimeConfig sessionConf)  { throw new RuntimeException(); }
}
