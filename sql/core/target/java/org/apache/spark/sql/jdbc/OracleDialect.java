package org.apache.spark.sql.jdbc;
public  class OracleDialect {
  static   int BINARY_FLOAT ()  { throw new RuntimeException(); }
  static   int BINARY_DOUBLE ()  { throw new RuntimeException(); }
  static   int TIMESTAMPTZ ()  { throw new RuntimeException(); }
  static public  boolean canHandle (java.lang.String url)  { throw new RuntimeException(); }
  static private  boolean supportTimeZoneTypes ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> getCatalystType (int sqlType, java.lang.String typeName, int size, org.apache.spark.sql.types.MetadataBuilder md)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  Object compileValue (Object value)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> isCascadingTruncateTable ()  { throw new RuntimeException(); }
  /**
   * The SQL query used to truncate a table.
   * @param table The table to truncate
   * @param cascade Whether or not to cascade the truncation. Default value is the
   *                value of isCascadingTruncateTable()
   * @return The SQL query to use for truncating a table
   */
  static public  java.lang.String getTruncateQuery (java.lang.String table, scala.Option<java.lang.Object> cascade)  { throw new RuntimeException(); }
  static public  java.lang.String quoteIdentifier (java.lang.String colName)  { throw new RuntimeException(); }
  static public  java.lang.String getTableExistsQuery (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.String getSchemaQuery (java.lang.String table)  { throw new RuntimeException(); }
  static public  void beforeFetch (java.sql.Connection connection, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  static protected  java.lang.String escapeSql (java.lang.String value)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> getTruncateQuery$default$2 ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
