package org.apache.spark.sql.hive;
/**
 * Legacy catalog for interacting with the Hive metastore.
 * <p>
 * This is still used for things like creating data source tables, but in the future will be
 * cleaned up to integrate more nicely with {@link HiveExternalCatalog}.
 */
  class HiveMetastoreCatalog implements org.apache.spark.internal.Logging {
  static public  org.apache.spark.sql.types.StructType mergeWithMetastoreSchema (org.apache.spark.sql.types.StructType metastoreSchema, org.apache.spark.sql.types.StructType inferredSchema)  { throw new RuntimeException(); }
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
  public   HiveMetastoreCatalog (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.internal.SessionState sessionState ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalogProxy ()  { throw new RuntimeException(); }
  /** These locks guard against multiple attempts to instantiate a table, which wastes memory. */
  private  com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> tableCreationLocks ()  { throw new RuntimeException(); }
  /** Acquires a lock on the table cache for the duration of `f`. */
  private <A extends java.lang.Object> A withTableCreationLock (org.apache.spark.sql.catalyst.QualifiedTableName tableName, scala.Function0<A> f)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.plans.logical.LogicalPlan getCachedDataSourceTable (org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.execution.datasources.LogicalRelation> getCached (org.apache.spark.sql.catalyst.QualifiedTableName tableIdentifier, scala.collection.Seq<org.apache.hadoop.fs.Path> pathsInMetastore, org.apache.spark.sql.types.StructType schemaInMetastore, java.lang.Class<? extends org.apache.spark.sql.execution.datasources.FileFormat> expectedFileFormat, scala.Option<org.apache.spark.sql.types.StructType> partitionSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.LogicalRelation convertToLogicalRelation (org.apache.spark.sql.catalyst.catalog.HiveTableRelation relation, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, java.lang.Class<? extends org.apache.spark.sql.execution.datasources.FileFormat> fileFormatClass, java.lang.String fileType)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTable inferIfNeeded (org.apache.spark.sql.catalyst.catalog.HiveTableRelation relation, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.execution.datasources.FileFormat fileFormat, scala.Option<org.apache.spark.sql.execution.datasources.FileIndex> fileIndexOpt)  { throw new RuntimeException(); }
  private  void updateDataSchema (org.apache.spark.sql.catalyst.TableIdentifier identifier, org.apache.spark.sql.types.StructType newDataSchema)  { throw new RuntimeException(); }
}
