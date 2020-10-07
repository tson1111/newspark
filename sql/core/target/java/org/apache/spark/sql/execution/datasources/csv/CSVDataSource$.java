package org.apache.spark.sql.execution.datasources.csv;
public  class CSVDataSource$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CSVDataSource$ MODULE$ = null;
  public   CSVDataSource$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.csv.CSVDataSource apply (org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  /**
   * Checks that column names in a CSV header and field names in the schema are the same
   * by taking into account case sensitivity.
   * <p>
   * @param schema - provided (or inferred) schema to which CSV must conform.
   * @param columnNames - names of CSV columns that must be checked against to the schema.
   * @param fileName - name of CSV file that are currently checked. It is used in error messages.
   * @param enforceSchema - if it is <code>true</code>, column names are ignored otherwise the CSV column
   *                        names are checked for conformance to the schema. In the case if
   *                        the column name don't conform to the schema, an exception is thrown.
   * @param caseSensitive - if it is set to <code>false</code>, comparison of column names and schema field
   *                        names is not case sensitive.
   */
  public  void checkHeaderColumnNames (org.apache.spark.sql.types.StructType schema, java.lang.String[] columnNames, java.lang.String fileName, boolean enforceSchema, boolean caseSensitive)  { throw new RuntimeException(); }
}
