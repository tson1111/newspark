package org.apache.spark.sql.hive;
/**
 * Relation conversion from metastore relations to data source relations for better performance
 * <p>
 * - When writing to non-partitioned Hive-serde Parquet/Orc tables
 * - When scanning Hive-serde Parquet/ORC tables
 * <p>
 * This rule must be run before all other DDL post-hoc resolution rules, i.e.
 * <code>PreprocessTableCreation</code>, <code>PreprocessTableInsertion</code>, <code>DataSourceAnalysis</code> and <code>HiveAnalysis</code>.
 */
public  class RelationConversions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
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
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.HiveSessionCatalog sessionCatalog ()  { throw new RuntimeException(); }
  // not preceding
  public   RelationConversions (org.apache.spark.sql.internal.SQLConf conf, org.apache.spark.sql.hive.HiveSessionCatalog sessionCatalog)  { throw new RuntimeException(); }
  private  boolean isConvertible (org.apache.spark.sql.catalyst.catalog.HiveTableRelation relation)  { throw new RuntimeException(); }
  private  boolean isOrcProperty (java.lang.String key)  { throw new RuntimeException(); }
  private  boolean isParquetProperty (java.lang.String key)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.LogicalRelation convert (org.apache.spark.sql.catalyst.catalog.HiveTableRelation relation)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
