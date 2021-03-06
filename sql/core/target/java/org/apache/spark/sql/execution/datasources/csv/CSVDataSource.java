package org.apache.spark.sql.execution.datasources.csv;
/**
 * Common functions for parsing CSV files
 */
public abstract class CSVDataSource implements scala.Serializable {
  static public  org.apache.spark.sql.execution.datasources.csv.CSVDataSource apply (org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
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
  static public  void checkHeaderColumnNames (org.apache.spark.sql.types.StructType schema, java.lang.String[] columnNames, java.lang.String fileName, boolean enforceSchema, boolean caseSensitive)  { throw new RuntimeException(); }
  public   CSVDataSource ()  { throw new RuntimeException(); }
  public abstract  boolean isSplitable ()  ;
  /**
   * Parse a {@link PartitionedFile} into {@link InternalRow} instances.
   * @param conf (undocumented)
   * @param file (undocumented)
   * @param parser (undocumented)
   * @param requiredSchema (undocumented)
   * @param dataSchema (undocumented)
   * @param caseSensitive (undocumented)
   * @param columnPruning (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> readFile (org.apache.hadoop.conf.Configuration conf, org.apache.spark.sql.execution.datasources.PartitionedFile file, org.apache.spark.sql.execution.datasources.csv.UnivocityParser parser, org.apache.spark.sql.types.StructType requiredSchema, org.apache.spark.sql.types.StructType dataSchema, boolean caseSensitive, boolean columnPruning)  ;
  /**
   * Infers the schema from <code>inputPaths</code> files.
   * @param sparkSession (undocumented)
   * @param inputPaths (undocumented)
   * @param parsedOptions (undocumented)
   * @return (undocumented)
   */
  public final  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> inputPaths, org.apache.spark.sql.execution.datasources.csv.CSVOptions parsedOptions)  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.sql.types.StructType infer (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> inputPaths, org.apache.spark.sql.execution.datasources.csv.CSVOptions parsedOptions)  ;
  /**
   * Generates a header from the given row which is null-safe and duplicate-safe.
   * @param row (undocumented)
   * @param caseSensitive (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  protected  java.lang.String[] makeSafeHeader (java.lang.String[] row, boolean caseSensitive, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
}
