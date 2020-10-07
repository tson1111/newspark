package org.apache.spark.sql.execution;
/**
 * A Scala extractor that projects an expression over a given schema. Data types,
 * field indexes and field counts of complex type extractors and attributes
 * are adjusted to fit the schema. All other expressions are left as-is. This
 * class is motivated by columnar nested schema pruning.
 */
  class ProjectionOverSchema implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  // not preceding
  public   ProjectionOverSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> fieldNames ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> unapply (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> getProjection (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
}
