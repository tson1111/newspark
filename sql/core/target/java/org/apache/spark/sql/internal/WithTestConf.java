package org.apache.spark.sql.internal;
/**
 * Helper class for using SessionStateBuilders during tests.
 */
  interface WithTestConf {
  public  org.apache.spark.sql.internal.SQLConf conf ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> overrideConfs ()  ;
}
