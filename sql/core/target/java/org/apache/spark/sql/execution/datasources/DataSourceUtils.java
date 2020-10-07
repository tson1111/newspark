package org.apache.spark.sql.execution.datasources;
public  class DataSourceUtils {
  /**
   * Verify if the schema is supported in datasource in write path.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  static public  void verifyWriteSchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in datasource in read path.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  static public  void verifyReadSchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in datasource. This verification should be done
   * in a driver side.
   * @param format (undocumented)
   * @param schema (undocumented)
   * @param isReadPath (undocumented)
   */
  static private  void verifySchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema, boolean isReadPath)  { throw new RuntimeException(); }
  static   boolean isDataPath (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
}
