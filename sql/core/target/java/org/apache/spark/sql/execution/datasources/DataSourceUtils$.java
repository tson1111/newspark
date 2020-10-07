package org.apache.spark.sql.execution.datasources;
public  class DataSourceUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataSourceUtils$ MODULE$ = null;
  public   DataSourceUtils$ ()  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in datasource in write path.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  public  void verifyWriteSchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in datasource in read path.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  public  void verifyReadSchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in datasource. This verification should be done
   * in a driver side.
   * @param format (undocumented)
   * @param schema (undocumented)
   * @param isReadPath (undocumented)
   */
  private  void verifySchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema, boolean isReadPath)  { throw new RuntimeException(); }
    boolean isDataPath (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
}
