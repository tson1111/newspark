package org.apache.spark.sql.avro;
  class AvroFileFormat implements org.apache.spark.sql.execution.datasources.FileFormat, org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.internal.Logging, java.io.Serializable {
  static public  java.lang.String IgnoreFilesWithoutExtensionProperty ()  { throw new RuntimeException(); }
  static public  boolean supportBatch (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.Seq<java.lang.String>> vectorTypes (org.apache.spark.sql.types.StructType requiredSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.internal.SQLConf sqlConf)  { throw new RuntimeException(); }
  static public  scala.Function1<org.apache.spark.sql.execution.datasources.PartitionedFile, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> buildReaderWithPartitionValues (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.types.StructType requiredSchema, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static public  boolean supportDataType (org.apache.spark.sql.types.DataType dataType, boolean isReadPath)  { throw new RuntimeException(); }
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
  public   AvroFileFormat ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession spark, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
  public  boolean isSplitable (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.SparkSession spark, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.sql.execution.datasources.PartitionedFile, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> buildReader (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.types.StructType requiredSchema, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
}
