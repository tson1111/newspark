package org.apache.spark.sql.avro;
/**
 * This object contains method that are used to convert sparkSQL schemas to avro schemas and vice
 * versa.
 */
public  class SchemaConverters$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SchemaConverters$ MODULE$ = null;
  public   SchemaConverters$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.util.RandomUUIDGenerator uuidGenerator ()  { throw new RuntimeException(); }
  private  org.apache.avro.Schema nullSchema ()  { throw new RuntimeException(); }
  /**
   * This function takes an avro schema and returns a sql schema.
   * @param avroSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.avro.SchemaConverters.SchemaType toSqlType (org.apache.avro.Schema avroSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.avro.SchemaConverters.SchemaType toSqlTypeHelper (org.apache.avro.Schema avroSchema, scala.collection.immutable.Set<java.lang.String> existingRecordNames)  { throw new RuntimeException(); }
  public  org.apache.avro.Schema toAvroType (org.apache.spark.sql.types.DataType catalystType, boolean nullable, java.lang.String recordName, java.lang.String nameSpace)  { throw new RuntimeException(); }
}
