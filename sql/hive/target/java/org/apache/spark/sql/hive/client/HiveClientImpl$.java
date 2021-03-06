package org.apache.spark.sql.hive.client;
public  class HiveClientImpl$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveClientImpl$ MODULE$ = null;
  public   HiveClientImpl$ ()  { throw new RuntimeException(); }
  /** Converts the native StructField to Hive's FieldSchema. */
  public  org.apache.hadoop.hive.metastore.api.FieldSchema toHiveColumn (org.apache.spark.sql.types.StructField c)  { throw new RuntimeException(); }
  /** Get the Spark SQL native DataType from Hive's FieldSchema. */
  private  org.apache.spark.sql.types.DataType getSparkSQLDataType (org.apache.hadoop.hive.metastore.api.FieldSchema hc)  { throw new RuntimeException(); }
  /** Builds the native StructField from Hive's FieldSchema. */
  public  org.apache.spark.sql.types.StructField fromHiveColumn (org.apache.hadoop.hive.metastore.api.FieldSchema hc)  { throw new RuntimeException(); }
  private  void verifyColumnDataType (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  private  java.lang.Class<? extends org.apache.hadoop.mapred.InputFormat<?, ?>> toInputFormat (java.lang.String name)  { throw new RuntimeException(); }
  private  java.lang.Class<? extends org.apache.hadoop.hive.ql.io.HiveOutputFormat<?, ?>> toOutputFormat (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Converts the native table metadata representation format CatalogTable to Hive's Table.
   * @param table (undocumented)
   * @param userName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.hive.ql.metadata.Table toHiveTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.Option<java.lang.String> userName)  { throw new RuntimeException(); }
  /**
   * Converts the native partition metadata representation format CatalogTablePartition to
   * Hive's Partition.
   * @param p (undocumented)
   * @param ht (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.hive.ql.metadata.Partition toHivePartition (org.apache.spark.sql.catalyst.catalog.CatalogTablePartition p, org.apache.hadoop.hive.ql.metadata.Table ht)  { throw new RuntimeException(); }
  /**
   * Build the native partition metadata from Hive's Partition.
   * @param hp (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition fromHivePartition (org.apache.hadoop.hive.ql.metadata.Partition hp)  { throw new RuntimeException(); }
  /**
   * Reads statistics from Hive.
   * Note that this statistics could be overridden by Spark's statistics if that's available.
   * @param properties (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogStatistics> readHiveStats (scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> HiveStatisticsProperties ()  { throw new RuntimeException(); }
}
