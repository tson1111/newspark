package org.apache.spark.internal.io;
/**
 * An {@link FileCommitProtocol} implementation backed by an underlying Hadoop OutputCommitter
 * (from the newer mapreduce API, not the old mapred API).
 * <p>
 * Unlike Hadoop's OutputCommitter, this implementation is serializable.
 * <p>
 * param:  jobId the job's or stage's id
 * param:  path the job's output path, or null if committer acts as a noop
 * param:  dynamicPartitionOverwrite If true, Spark will overwrite partition directories at runtime
 *                                  dynamically, i.e., we first write files under a staging
 *                                  directory with partition path, e.g.
 *                                  /path/to/staging/a=1/b=1/xxx.parquet. When committing the job,
 *                                  we first clean up the corresponding partition directories at
 *                                  destination path, e.g. /path/to/destination/a=1/b=1, and move
 *                                  files from staging directory to the corresponding partition
 *                                  directories under destination path.
 */
public  class HadoopMapReduceCommitProtocol extends org.apache.spark.internal.io.FileCommitProtocol implements scala.Serializable, org.apache.spark.internal.Logging {
  static public  boolean deleteWithJob (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, boolean recursive)  { throw new RuntimeException(); }
  static public  void onTaskCommit (org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage taskCommit)  { throw new RuntimeException(); }
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
  public   HadoopMapReduceCommitProtocol (java.lang.String jobId, java.lang.String path, boolean dynamicPartitionOverwrite)  { throw new RuntimeException(); }
  /** OutputCommitter from Hadoop is not serializable so marking it transient. */
  private  org.apache.hadoop.mapreduce.OutputCommitter committer ()  { throw new RuntimeException(); }
  /**
   * Checks whether there are files to be committed to a valid output location.
   * <p>
   * As committing and aborting a job occurs on driver, where <code>addedAbsPathFiles</code> is always null,
   * it is necessary to check whether a valid output path is specified.
   * {@link HadoopMapReduceCommitProtocol#path} need not be a valid {@link org.apache.hadoop.fs.Path} for
   * committers not writing to distributed file systems.
   * @return (undocumented)
   */
  private  boolean hasValidPath ()  { throw new RuntimeException(); }
  /**
   * Tracks files staged by this task for absolute output paths. These outputs are not managed by
   * the Hadoop OutputCommitter, so we must move these to their final locations on job commit.
   * <p>
   * The mapping is from the temp output path to the final desired output path of the file.
   * @return (undocumented)
   */
  private  scala.collection.mutable.Map<java.lang.String, java.lang.String> addedAbsPathFiles ()  { throw new RuntimeException(); }
  /**
   * Tracks partitions with default path that have new files written into them by this task,
   * e.g. a=1/b=2. Files under these partitions will be saved into staging directory and moved to
   * destination directory at the end, if <code>dynamicPartitionOverwrite</code> is true.
   * @return (undocumented)
   */
  private  scala.collection.mutable.Set<java.lang.String> partitionPaths ()  { throw new RuntimeException(); }
  /**
   * The staging directory of this write job. Spark uses it to deal with files with absolute output
   * path, or writing data into partitioned directory with dynamicPartitionOverwrite=true.
   * @return (undocumented)
   */
  private  org.apache.hadoop.fs.Path stagingDir ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.OutputCommitter setupCommitter (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, java.lang.String ext)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, java.lang.String ext)  { throw new RuntimeException(); }
  private  java.lang.String getFilename (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String ext)  { throw new RuntimeException(); }
  public  void setupJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext jobContext, scala.collection.Seq<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage> taskCommits)  { throw new RuntimeException(); }
  public  void abortJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
}
