package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Statistics collected for a column.
 * <p>
 * 1. The JVM data type stored in min/max is the internal data type for the corresponding
 *    Catalyst data type. For example, the internal type of DateType is Int, and that the internal
 *    type of TimestampType is Long.
 * 2. There is no guarantee that the statistics collected are accurate. Approximation algorithms
 *    (sketches) might have been used, and the data collected can also be stale.
 * <p>
 * param:  distinctCount number of distinct values
 * param:  min minimum value
 * param:  max maximum value
 * param:  nullCount number of nulls
 * param:  avgLen average length of the values. For fixed-length types, this should be a constant.
 * param:  maxLen maximum length of the values. For fixed-length types, this should be a constant.
 * param:  histogram histogram of the values
 */
public  class ColumnStat implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<scala.math.BigInt> distinctCount ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> min ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> max ()  { throw new RuntimeException(); }
  public  scala.Option<scala.math.BigInt> nullCount ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> avgLen ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxLen ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.Histogram> histogram ()  { throw new RuntimeException(); }
  // not preceding
  public   ColumnStat (scala.Option<scala.math.BigInt> distinctCount, scala.Option<java.lang.Object> min, scala.Option<java.lang.Object> max, scala.Option<scala.math.BigInt> nullCount, scala.Option<java.lang.Object> avgLen, scala.Option<java.lang.Object> maxLen, scala.Option<org.apache.spark.sql.catalyst.plans.logical.Histogram> histogram)  { throw new RuntimeException(); }
  public  boolean hasCountStats ()  { throw new RuntimeException(); }
  public  boolean hasMinMaxStats ()  { throw new RuntimeException(); }
  public  boolean hasLenStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogColumnStat toCatalogColumnStat (java.lang.String colName, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
}
