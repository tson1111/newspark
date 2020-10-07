package org.apache.spark.sql.catalyst.plans.logical;
public  class HintInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  boolean broadcast ()  { throw new RuntimeException(); }
  // not preceding
  public   HintInfo (boolean broadcast)  { throw new RuntimeException(); }
  /** Must be called when computing stats for a join operator to reset hints. */
  public  org.apache.spark.sql.catalyst.plans.logical.HintInfo resetForJoin ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
