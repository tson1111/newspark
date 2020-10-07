package org.apache.spark.sql.execution.datasources;
/**
 * Writes data to using dynamic partition writes, meaning this single function can write to
 * multiple directories (partitions) or files (bucketing).
 */
public  class DynamicPartitionDataWriter extends org.apache.spark.sql.execution.datasources.FileFormatDataWriter {
  public   DynamicPartitionDataWriter (org.apache.spark.sql.execution.datasources.WriteJobDescription description, org.apache.hadoop.mapreduce.TaskAttemptContext taskAttemptContext, org.apache.spark.internal.io.FileCommitProtocol committer)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> currentBucketId ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.expressions.UnsafeRow> currentPartionValues ()  { throw new RuntimeException(); }
  private  int fileCounter ()  { throw new RuntimeException(); }
  /** Given an input row, returns the corresponding `bucketId` */
  private  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object> getBucketId ()  { throw new RuntimeException(); }
  /** Returns the data columns to be written given an input row */
  private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection getOutputRow ()  { throw new RuntimeException(); }
  /** Evaluates the <code>partitionPathExpression</code> above on a row of <code>partitionValues</code> and returns
   * @return (undocumented)
   * the partition string. */
  private  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, java.lang.String> getPartitionPath ()  { throw new RuntimeException(); }
  /** Extracts the partition values out of an input row. */
  private  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> getPartitionValues ()  { throw new RuntimeException(); }
  /** Flag saying whether or not the data to be written out is bucketed. */
  private  boolean isBucketed ()  { throw new RuntimeException(); }
  /** Flag saying whether or not the data to be written out is partitioned. */
  private  boolean isPartitioned ()  { throw new RuntimeException(); }
  /**
   * Opens a new OutputWriter given a partition key and/or a bucket id.
   * If bucket id is specified, we will append it to the end of the file name, but before the
   * file extension, e.g. part-r-00009-ea518ad4-455a-4431-b471-d24e03814677-00002.gz.parquet
   * <p>
   * @param partitionValues the partition which all tuples being written by this <code>OutputWriter</code>
   *                        belong to
   * @param bucketId the bucket which all tuples being written by this <code>OutputWriter</code> belong to
   */
  private  void newOutputWriter (scala.Option<org.apache.spark.sql.catalyst.InternalRow> partitionValues, scala.Option<java.lang.Object> bucketId)  { throw new RuntimeException(); }
  /** Expression that given partition columns builds a path string like: col1=val/col2=val/... */
  private  org.apache.spark.sql.catalyst.expressions.Expression partitionPathExpression ()  { throw new RuntimeException(); }
  private  long recordsInFile ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow record)  { throw new RuntimeException(); }
}
