package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A piece of java code snippet inlines all types of input arguments into a string without
 * tracking any reference of <code>JavaCode</code> instances.
 */
public  class Inline implements org.apache.spark.sql.catalyst.expressions.codegen.JavaCode, scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String codeString ()  { throw new RuntimeException(); }
  // not preceding
  public   Inline (java.lang.String codeString)  { throw new RuntimeException(); }
  public  java.lang.String code ()  { throw new RuntimeException(); }
}
