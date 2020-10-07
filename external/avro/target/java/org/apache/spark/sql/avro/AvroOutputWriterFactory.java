package org.apache.spark.sql.avro;
/**
 * A factory that produces {@link AvroOutputWriter}.
 * param:  catalystSchema Catalyst schema of input data.
 * param:  avroSchemaAsJsonString Avro schema of output result, in JSON string format.
 */
  class AvroOutputWriterFactory extends org.apache.spark.sql.execution.datasources.OutputWriterFactory {
  public   AvroOutputWriterFactory (org.apache.spark.sql.types.StructType catalystSchema, java.lang.String avroSchemaAsJsonString)  { throw new RuntimeException(); }
  private  org.apache.avro.Schema avroSchema ()  { throw new RuntimeException(); }
  public  java.lang.String getFileExtension (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.OutputWriter newInstance (java.lang.String path, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
}
