package org.apache.spark.sql.catalyst;
/**
 * Encapsulates an identifier that is either a alias name or an identifier that has table
 * name and optionally a database name.
 * The SubqueryAlias node keeps track of the qualifier using the information in this structure
 * param:  identifier - Is an alias name or a table name
 * param:  database - Is a database name and is optional
 */
public  class AliasIdentifier implements org.apache.spark.sql.catalyst.IdentifierWithDatabase, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.AliasIdentifier apply (java.lang.String identifier)  { throw new RuntimeException(); }
  static public  java.lang.String quotedString ()  { throw new RuntimeException(); }
  static public  java.lang.String unquotedString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String identifier ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> database ()  { throw new RuntimeException(); }
  // not preceding
  public   AliasIdentifier (java.lang.String identifier, scala.Option<java.lang.String> database)  { throw new RuntimeException(); }
  public   AliasIdentifier (java.lang.String identifier)  { throw new RuntimeException(); }
}
