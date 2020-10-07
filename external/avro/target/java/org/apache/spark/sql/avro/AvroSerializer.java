package org.apache.spark.sql.avro;
/**
 * A serializer to serialize data in catalyst format to data in avro format.
 */
public  class AvroSerializer {
  public   AvroSerializer (org.apache.spark.sql.types.DataType rootCatalystType, org.apache.avro.Schema rootAvroType, boolean nullable)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> converter ()  { throw new RuntimeException(); }
  private  org.apache.avro.Conversions.DecimalConversion decimalConversions ()  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, java.lang.Object> newConverter (org.apache.spark.sql.types.DataType catalystType, org.apache.avro.Schema avroType)  { throw new RuntimeException(); }
  private  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.avro.generic.GenericData.Record> newStructConverter (org.apache.spark.sql.types.StructType catalystStruct, org.apache.avro.Schema avroStruct)  { throw new RuntimeException(); }
  private  org.apache.avro.Schema resolveNullableType (org.apache.avro.Schema avroType, boolean nullable)  { throw new RuntimeException(); }
  public  Object serialize (Object catalystData)  { throw new RuntimeException(); }
}
