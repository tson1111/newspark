package org.apache.spark.sql.execution.streaming;
/**
 * A {@link MetadataLog} implementation based on HDFS. {@link HDFSMetadataLog} uses the specified <code>path</code>
 * as the metadata storage.
 * <p>
 * When writing a new batch, {@link HDFSMetadataLog} will firstly write to a temp file and then rename
 * it to the final batch file. If the rename step fails, there must be multiple writers and only
 * one of them will succeed and the others will fail.
 * <p>
 * Note: {@link HDFSMetadataLog} doesn't support S3-like file systems as they don't guarantee listing
 * files in a directory always shows the latest files.
 */
public  class HDFSMetadataLog<T extends java.lang.Object> implements org.apache.spark.sql.execution.streaming.MetadataLog<T>, org.apache.spark.internal.Logging {
  /**
   * Verify if batchIds are continuous and between <code>startId</code> and <code>endId</code>.
   * <p>
   * @param batchIds the sorted ids to verify.
   * @param startId the start id. If it's set, batchIds should start with this id.
   * @param endId the start id. If it's set, batchIds should end with this id.
   */
  static public  void verifyBatchIds (scala.collection.Seq<java.lang.Object> batchIds, scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Ident(scala), TypeName("AnyRef")))))
  public   HDFSMetadataLog (org.apache.spark.sql.SparkSession sparkSession, java.lang.String path, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private  java.lang.Object formats ()  { throw new RuntimeException(); }
  /** Needed to serialize type T into JSON when using Jackson */
  private  scala.reflect.Manifest<T> manifest ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path metadataPath ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.CheckpointFileManager fileManager ()  { throw new RuntimeException(); }
  /**
   * A <code>PathFilter</code> to filter only batch files
   * @return (undocumented)
   */
  protected  java.lang.Object batchFilesFilter ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.fs.Path batchIdToPath (long batchId)  { throw new RuntimeException(); }
  protected  long pathToBatchId (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  protected  boolean isBatchFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  protected  void serialize (T metadata, java.io.OutputStream out)  { throw new RuntimeException(); }
  protected  T deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
  /**
   * Store the metadata for the specified batchId and return <code>true</code> if successful. If the batchId's
   * metadata has already been stored, this method will return <code>false</code>.
   * @param batchId (undocumented)
   * @param metadata (undocumented)
   * @return (undocumented)
   */
  public  boolean add (long batchId, T metadata)  { throw new RuntimeException(); }
  /** Write a batch to a temp file then rename it to the batch file.
   * <p>
   * There may be multiple {@link HDFSMetadataLog} using the same metadata path. Although it is not a
   * valid behavior, we still need to prevent it from destroying the files.
   * @param metadata (undocumented)
   * @param path (undocumented)
   */
  private  void writeBatchToFile (T metadata, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  scala.Option<T> get (long batchId)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, T>[] get (scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<java.lang.Object, T>> getLatest ()  { throw new RuntimeException(); }
  /**
   * Get an array of [FileStatus] referencing batch files.
   * The array is sorted by most recent batch file first to
   * oldest batch file.
   * @return (undocumented)
   */
  public  org.apache.hadoop.fs.FileStatus[] getOrderedBatchFiles ()  { throw new RuntimeException(); }
  /**
   * Removes all the log entry earlier than thresholdBatchId (exclusive).
   * @param thresholdBatchId (undocumented)
   */
  public  void purge (long thresholdBatchId)  { throw new RuntimeException(); }
  /**
   * Removes all log entries later than thresholdBatchId (exclusive).
   * @param thresholdBatchId (undocumented)
   */
  public  void purgeAfter (long thresholdBatchId)  { throw new RuntimeException(); }
  /**
   * Parse the log version from the given <code>text</code> -- will throw exception when the parsed version
   * exceeds <code>maxSupportedVersion</code>, or when <code>text</code> is malformed (such as "xyz", "v", "v-1",
   * "v123xyz" etc.)
   * @param text (undocumented)
   * @param maxSupportedVersion (undocumented)
   * @return (undocumented)
   */
    int parseVersion (java.lang.String text, int maxSupportedVersion)  { throw new RuntimeException(); }
}
