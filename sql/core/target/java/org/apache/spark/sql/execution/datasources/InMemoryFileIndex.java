package org.apache.spark.sql.execution.datasources;
/**
 * A {@link FileIndex} that generates the list of files to process by recursively listing all the
 * files present in <code>paths</code>.
 * <p>
 * param:  rootPathsSpecified the list of root table paths to scan (some of which might be
 *                           filtered out later)
 * param:  parameters as set of options to control discovery
 * param:  userSpecifiedSchema an optional user specified schema that will be use to provide
 *                            types for the discovered partitions
 */
public  class InMemoryFileIndex extends org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex {
  /** A serializable variant of HDFS's BlockLocation. */
  static private  class SerializableBlockLocation implements scala.Product, scala.Serializable {
    public  java.lang.String[] names ()  { throw new RuntimeException(); }
    public  java.lang.String[] hosts ()  { throw new RuntimeException(); }
    public  long offset ()  { throw new RuntimeException(); }
    public  long length ()  { throw new RuntimeException(); }
    // not preceding
    public   SerializableBlockLocation (java.lang.String[] names, java.lang.String[] hosts, long offset, long length)  { throw new RuntimeException(); }
  }
  static private  class SerializableBlockLocation$ extends scala.runtime.AbstractFunction4<java.lang.String[], java.lang.String[], java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.InMemoryFileIndex.SerializableBlockLocation> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SerializableBlockLocation$ MODULE$ = null;
    public   SerializableBlockLocation$ ()  { throw new RuntimeException(); }
  }
  /** A serializable variant of HDFS's FileStatus. */
  static private  class SerializableFileStatus implements scala.Product, scala.Serializable {
    public  java.lang.String path ()  { throw new RuntimeException(); }
    public  long length ()  { throw new RuntimeException(); }
    public  boolean isDir ()  { throw new RuntimeException(); }
    public  short blockReplication ()  { throw new RuntimeException(); }
    public  long blockSize ()  { throw new RuntimeException(); }
    public  long modificationTime ()  { throw new RuntimeException(); }
    public  long accessTime ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.InMemoryFileIndex.SerializableBlockLocation[] blockLocations ()  { throw new RuntimeException(); }
    // not preceding
    public   SerializableFileStatus (java.lang.String path, long length, boolean isDir, short blockReplication, long blockSize, long modificationTime, long accessTime, org.apache.spark.sql.execution.datasources.InMemoryFileIndex.SerializableBlockLocation[] blockLocations)  { throw new RuntimeException(); }
  }
  static private  class SerializableFileStatus$ extends scala.runtime.AbstractFunction8<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.InMemoryFileIndex.SerializableBlockLocation[], org.apache.spark.sql.execution.datasources.InMemoryFileIndex.SerializableFileStatus> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SerializableFileStatus$ MODULE$ = null;
    public   SerializableFileStatus$ ()  { throw new RuntimeException(); }
  }
  /**
   * Lists a collection of paths recursively. Picks the listing strategy adaptively depending
   * on the number of paths to list.
   * <p>
   * This may only be called on the driver.
   * <p>
   * @return for each input path, the set of discovered files for the path
   * @param paths (undocumented)
   * @param hadoopConf (undocumented)
   * @param filter (undocumented)
   * @param sparkSession (undocumented)
   */
  static   scala.collection.Seq<scala.Tuple2<org.apache.hadoop.fs.Path, scala.collection.Seq<org.apache.hadoop.fs.FileStatus>>> bulkListLeafFiles (scala.collection.Seq<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.PathFilter filter, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /** Checks if we should filter out this path name. */
  static public  boolean shouldFilterOut (java.lang.String pathName)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> metadataOpsTimeNs ()  { throw new RuntimeException(); }
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
  static public  org.apache.spark.sql.types.StructType partitionSchema ()  { throw new RuntimeException(); }
  static protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionDirectory> listFiles (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionFilters, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> dataFilters)  { throw new RuntimeException(); }
  static public  java.lang.String[] inputFiles ()  { throw new RuntimeException(); }
  static public  long sizeInBytes ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> allFiles ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.datasources.PartitionSpec inferPartitioning ()  { throw new RuntimeException(); }
  public   InMemoryFileIndex (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.Path> rootPathsSpecified, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, org.apache.spark.sql.execution.datasources.FileStatusCache fileStatusCache)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> rootPaths ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> cachedLeafFiles ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> cachedLeafDirToChildrenFiles ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.PartitionSpec cachedPartitionSpec ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> leafFiles ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> leafDirToChildrenFiles ()  { throw new RuntimeException(); }
  public  void refresh ()  { throw new RuntimeException(); }
  private  void refresh0 ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  /**
   * List leaf files of given paths. This method will submit a Spark job to do parallel
   * listing whenever there is a path having more files than the parallel partition discovery
   * discovery threshold.
   * <p>
   * This is publicly visible for testing.
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.mutable.LinkedHashSet<org.apache.hadoop.fs.FileStatus> listLeafFiles (scala.collection.Seq<org.apache.hadoop.fs.Path> paths)  { throw new RuntimeException(); }
}
