package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A local variable java expression.
 */
public  class VariableValue implements org.apache.spark.sql.catalyst.expressions.codegen.ExprValue, scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  boolean isPrimitive ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String variableName ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> javaType ()  { throw new RuntimeException(); }
  // not preceding
  public   VariableValue (java.lang.String variableName, java.lang.Class<?> javaType)  { throw new RuntimeException(); }
  public  java.lang.String code ()  { throw new RuntimeException(); }
}
