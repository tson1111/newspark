package org.apache.spark.sql.execution.datasources.orc;
/**
 * A serializer to serialize Spark rows to ORC structs.
 */
public  class OrcSerializer {
  public   OrcSerializer (org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, org.apache.hadoop.io.WritableComparable<?>>[] converters ()  { throw new RuntimeException(); }
  /**
   * Return a Orc value object for the given Spark schema.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  private  org.apache.hadoop.io.WritableComparable<?> createOrcValue (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Creates a converter to convert Catalyst data at the given ordinal to ORC values.
   * @param dataType (undocumented)
   * @param reuseObj (undocumented)
   * @return (undocumented)
   */
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, org.apache.hadoop.io.WritableComparable<?>> newConverter (org.apache.spark.sql.types.DataType dataType, boolean reuseObj)  { throw new RuntimeException(); }
  private  org.apache.orc.mapred.OrcStruct result ()  { throw new RuntimeException(); }
  public  org.apache.orc.mapred.OrcStruct serialize (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
