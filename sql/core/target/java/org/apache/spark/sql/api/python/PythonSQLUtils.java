package org.apache.spark.sql.api.python;
public  class PythonSQLUtils {
  static public  org.apache.spark.sql.types.DataType parseDataType (java.lang.String typeText)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.ExpressionInfo[] listBuiltinFunctionInfos ()  { throw new RuntimeException(); }
  /**
   * Python callable function to read a file in Arrow stream format and create a {@link RDD}
   * using each serialized ArrowRecordBatch as a partition.
   * @param sqlContext (undocumented)
   * @param filename (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.java.JavaRDD<byte[]> readArrowStreamFromFile (org.apache.spark.sql.SQLContext sqlContext, java.lang.String filename)  { throw new RuntimeException(); }
  /**
   * Python callable function to read a file in Arrow stream format and create a {@link DataFrame}
   * from an RDD.
   * @param arrowBatchRDD (undocumented)
   * @param schemaString (undocumented)
   * @param sqlContext (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDataFrame (org.apache.spark.api.java.JavaRDD<byte[]> arrowBatchRDD, java.lang.String schemaString, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
}
