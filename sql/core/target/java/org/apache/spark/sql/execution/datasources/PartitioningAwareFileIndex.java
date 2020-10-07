package org.apache.spark.sql.execution.datasources;
/**
 * An abstract class that represents {@link FileIndex}s that are aware of partitioned tables.
 * It provides the necessary methods to parse partition data based on a set of files.
 * <p>
 * param:  parameters as set of options to control partition discovery
 * param:  userSpecifiedSchema an optional user specified schema that will be use to provide
 *                            types for the discovered partitions
 */
public abstract class PartitioningAwareFileIndex implements org.apache.spark.sql.execution.datasources.FileIndex, org.apache.spark.internal.Logging {
  static public  java.lang.String BASE_PATH_PARAM ()  { throw new RuntimeException(); }
  static public abstract  scala.collection.Seq<org.apache.hadoop.fs.Path> rootPaths ()  ;
  static public abstract  void refresh ()  ;
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
  public   PartitioningAwareFileIndex (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, org.apache.spark.sql.execution.datasources.FileStatusCache fileStatusCache)  { throw new RuntimeException(); }
  /** Returns the specification of the partitions inferred from the data. */
  public abstract  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec ()  ;
  public  org.apache.spark.sql.types.StructType partitionSchema ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  protected abstract  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> leafFiles ()  ;
  protected abstract  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> leafDirToChildrenFiles ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionDirectory> listFiles (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionFilters, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> dataFilters)  { throw new RuntimeException(); }
  /** Returns the list of files that will be read when scanning this relation. */
  public  java.lang.String[] inputFiles ()  { throw new RuntimeException(); }
  public  long sizeInBytes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> allFiles ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.PartitionSpec inferPartitioning ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionPath> prunePartitions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates, org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec)  { throw new RuntimeException(); }
  /**
   * Contains a set of paths that are considered as the base dirs of the input datasets.
   * The partitioning discovery logic will make sure it will stop when it reaches any
   * base path.
   * <p>
   * By default, the paths of the dataset provided by users will be base paths.
   * Below are three typical examples,
   * Case 1) <code>spark.read.parquet("/path/something=true/")</code>: the base path will be
   * <code>/path/something=true/</code>, and the returned DataFrame will not contain a column of <code>something</code>.
   * Case 2) <code>spark.read.parquet("/path/something=true/a.parquet")</code>: the base path will be
   * still <code>/path/something=true/</code>, and the returned DataFrame will also not contain a column of
   * <code>something</code>.
   * Case 3) <code>spark.read.parquet("/path/")</code>: the base path will be <code>/path/</code>, and the returned
   * DataFrame will have the column of <code>something</code>.
   * <p>
   * Users also can override the basePath by setting <code>basePath</code> in the options to pass the new base
   * path to the data source.
   * For example, <code>spark.read.option("basePath", "/path/").parquet("/path/something=true/")</code>,
   * and the returned DataFrame will have the column of <code>something</code>.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<org.apache.hadoop.fs.Path> basePaths ()  { throw new RuntimeException(); }
  private  boolean isDataPath (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * In the read path, only managed tables by Hive provide the partition columns properly when
   * initializing this class. All other file based data sources will try to infer the partitioning,
   * and then cast the inferred types to user specified dataTypes if the partition columns exist
   * inside <code>userSpecifiedSchema</code>, otherwise we can hit data corruption bugs like SPARK-18510, or
   * inconsistent data types as reported in SPARK-21463.
   * @param spec A partition inference result
   * @return The PartitionSchema resolved from inference and cast according to <code>userSpecifiedSchema</code>
   */
  private  org.apache.spark.sql.types.StructType combineInferredAndUserSpecifiedPartitionSchema (org.apache.spark.sql.execution.datasources.PartitionSpec spec)  { throw new RuntimeException(); }
}
