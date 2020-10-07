package org.apache.spark.sql.catalyst.json;
public  class JsonInferSchema$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JsonInferSchema$ MODULE$ = null;
  public   JsonInferSchema$ ()  { throw new RuntimeException(); }
  /**
   * Infer the type of a collection of json records in three stages:
   *   1. Infer the type of each record
   *   2. Merge types by choosing the lowest type necessary to cover equal keys
   *   3. Replace any remaining null fields with string, the top type
   * @param json (undocumented)
   * @param configOptions (undocumented)
   * @param createParser (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.types.StructType infer (org.apache.spark.rdd.RDD<T> json, org.apache.spark.sql.catalyst.json.JSONOptions configOptions, scala.Function2<com.fasterxml.jackson.core.JsonFactory, T, com.fasterxml.jackson.core.JsonParser> createParser)  { throw new RuntimeException(); }
  private  boolean isSorted (org.apache.spark.sql.types.StructField[] arr)  { throw new RuntimeException(); }
  /**
   * Infer the type of a json document from the parser's token stream
   * @param parser (undocumented)
   * @param configOptions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType inferField (com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.catalyst.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  /**
   * Recursively canonicalizes inferred types, e.g., removes StructTypes with no fields,
   * drops NullTypes or converts them to StringType based on provided options.
   * @param tpe (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.types.DataType> canonicalizeType (org.apache.spark.sql.types.DataType tpe, org.apache.spark.sql.catalyst.json.JSONOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType withCorruptField (org.apache.spark.sql.types.StructType struct, org.apache.spark.sql.types.DataType other, java.lang.String columnNameOfCorruptRecords, org.apache.spark.sql.catalyst.util.ParseMode parseMode)  { throw new RuntimeException(); }
  /**
   * Remove top-level ArrayType wrappers and merge the remaining schemas
   * @param columnNameOfCorruptRecords (undocumented)
   * @param parseMode (undocumented)
   * @return (undocumented)
   */
  private  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType> compatibleRootType (java.lang.String columnNameOfCorruptRecords, org.apache.spark.sql.catalyst.util.ParseMode parseMode)  { throw new RuntimeException(); }
  /**
   * Returns the most general data type for two given data types.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType compatibleType (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
}
