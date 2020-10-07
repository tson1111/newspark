package org.apache.spark.sql.catalyst.expressions;
public  class InterpretedPredicate extends org.apache.spark.sql.catalyst.expressions.codegen.Predicate implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.InterpretedPredicate create (org.apache.spark.sql.catalyst.expressions.Expression expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.InterpretedPredicate create (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression expression ()  { throw new RuntimeException(); }
  // not preceding
  public   InterpretedPredicate (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  public  boolean eval (org.apache.spark.sql.catalyst.InternalRow r)  { throw new RuntimeException(); }
  public  void initialize (int partitionIndex)  { throw new RuntimeException(); }
}
