package org.apache.spark.sql.util;
/**
 * Utils for handling schemas.
 * <p>
 * TODO: Merge this file with {@link org.apache.spark.ml.util.SchemaUtils}.
 */
public  class SchemaUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SchemaUtils$ MODULE$ = null;
  public   SchemaUtils$ ()  { throw new RuntimeException(); }
  /**
   * Checks if an input schema has duplicate column names. This throws an exception if the
   * duplication exists.
   * <p>
   * @param schema schema to check
   * @param colType column type name, used in an exception message
   * @param caseSensitiveAnalysis whether duplication checks should be case sensitive or not
   */
  public  void checkSchemaColumnNameDuplication (org.apache.spark.sql.types.StructType schema, java.lang.String colType, boolean caseSensitiveAnalysis)  { throw new RuntimeException(); }
  private  boolean isCaseSensitiveAnalysis (scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  /**
   * Checks if input column names have duplicate identifiers. This throws an exception if
   * the duplication exists.
   * <p>
   * @param columnNames column names to check
   * @param colType column type name, used in an exception message
   * @param resolver resolver used to determine if two identifiers are equal
   */
  public  void checkColumnNameDuplication (scala.collection.Seq<java.lang.String> columnNames, java.lang.String colType, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  /**
   * Checks if input column names have duplicate identifiers. This throws an exception if
   * the duplication exists.
   * <p>
   * @param columnNames column names to check
   * @param colType column type name, used in an exception message
   * @param caseSensitiveAnalysis whether duplication checks should be case sensitive or not
   */
  public  void checkColumnNameDuplication (scala.collection.Seq<java.lang.String> columnNames, java.lang.String colType, boolean caseSensitiveAnalysis)  { throw new RuntimeException(); }
}
