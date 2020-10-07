package org.apache.spark.sql.execution.columnar;
public  class CachedRDDBuilder implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  boolean useCompression ()  { throw new RuntimeException(); }
  public  int batchSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan cachedPlan ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> tableName ()  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<org.apache.spark.sql.execution.columnar.CachedBatch> _cachedColumnBuffers ()  { throw new RuntimeException(); }
  // not preceding
  public   CachedRDDBuilder (boolean useCompression, int batchSize, org.apache.spark.storage.StorageLevel storageLevel, org.apache.spark.sql.execution.SparkPlan cachedPlan, scala.Option<java.lang.String> tableName, org.apache.spark.rdd.RDD<org.apache.spark.sql.execution.columnar.CachedBatch> _cachedColumnBuffers)  { throw new RuntimeException(); }
  public  org.apache.spark.util.LongAccumulator sizeInBytesStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.execution.columnar.CachedBatch> cachedColumnBuffers ()  { throw new RuntimeException(); }
  public  void clearCache (boolean blocking)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.CachedRDDBuilder withCachedPlan (org.apache.spark.sql.execution.SparkPlan cachedPlan)  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<org.apache.spark.sql.execution.columnar.CachedBatch> buildBuffers ()  { throw new RuntimeException(); }
}
