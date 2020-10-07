package org.apache.spark.sql.hive.orc;
/**
 * <code>FileFormat</code> for reading ORC files. If this is moved or renamed, please update
 * <code>DataSource</code>'s backwardCompatibilityMap.
 */
public  class OrcFileFormat implements org.apache.spark.sql.execution.datasources.FileFormat, org.apache.spark.sql.sources.DataSourceRegister, scala.Serializable {
  static   java.lang.String SARG_PUSHDOWN ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extensionsForCompressionCodecNames ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> unwrapOrcStructs (org.apache.hadoop.conf.Configuration conf, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType requiredSchema, scala.Option<org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector> maybeStructOI, scala.collection.Iterator<org.apache.hadoop.io.Writable> iterator)  { throw new RuntimeException(); }
  static public  void setRequiredColumns (org.apache.hadoop.conf.Configuration conf, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType requestedSchema)  { throw new RuntimeException(); }
  static public  boolean supportBatch (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.Seq<java.lang.String>> vectorTypes (org.apache.spark.sql.types.StructType requiredSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.internal.SQLConf sqlConf)  { throw new RuntimeException(); }
  static public  scala.Function1<org.apache.spark.sql.execution.datasources.PartitionedFile, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> buildReaderWithPartitionValues (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.types.StructType requiredSchema, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public   OrcFileFormat ()  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.SparkSession sparkSession, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  public  boolean isSplitable (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.sql.execution.datasources.PartitionedFile, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> buildReader (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.types.StructType requiredSchema, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  boolean supportDataType (org.apache.spark.sql.types.DataType dataType, boolean isReadPath)  { throw new RuntimeException(); }
}
