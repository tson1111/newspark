package org.apache.spark.sql.internal;
/**
 * Static SQL configuration is a cross-session, immutable Spark configuration. External users can
 * see the static sql configs via <code>SparkSession.conf</code>, but can NOT set/unset them.
 */
public  class StaticSQLConf$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StaticSQLConf$ MODULE$ = null;
  public   StaticSQLConf$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> WAREHOUSE_PATH ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> CATALOG_IMPLEMENTATION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> GLOBAL_TEMP_DATABASE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SCHEMA_STRING_LENGTH_THRESHOLD ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILESOURCE_TABLE_RELATION_CACHE_SIZE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CODEGEN_CACHE_MAX_ENTRIES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CODEGEN_COMMENTS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DEBUG_MODE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_THRIFT_SERVER_SINGLESESSION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> SPARK_SESSION_EXTENSIONS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.OptionalConfigEntry<scala.collection.Seq<java.lang.String>> QUERY_EXECUTION_LISTENERS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.OptionalConfigEntry<scala.collection.Seq<java.lang.String>> STREAMING_QUERY_LISTENERS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> UI_RETAINED_EXECUTIONS ()  { throw new RuntimeException(); }
}
