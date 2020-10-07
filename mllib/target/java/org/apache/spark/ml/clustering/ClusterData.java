package org.apache.spark.ml.clustering;
/** Helper class for storing model data */
public  class ClusterData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int clusterIdx ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector clusterCenter ()  { throw new RuntimeException(); }
  // not preceding
  public   ClusterData (int clusterIdx, org.apache.spark.ml.linalg.Vector clusterCenter)  { throw new RuntimeException(); }
}
