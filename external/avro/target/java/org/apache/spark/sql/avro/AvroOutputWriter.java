package org.apache.spark.sql.avro;
  class AvroOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter {
  public   AvroOutputWriter (java.lang.String path, org.apache.hadoop.mapreduce.TaskAttemptContext context, org.apache.spark.sql.types.StructType schema, org.apache.avro.Schema avroSchema)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Overrides the couple of methods responsible for generating the output streams / files so
   * that the data can be correctly partitioned
   * @return (undocumented)
   */
  private  org.apache.hadoop.mapreduce.RecordWriter<org.apache.avro.mapred.AvroKey<org.apache.avro.generic.GenericRecord>, org.apache.hadoop.io.NullWritable> recordWriter ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.avro.AvroSerializer serializer ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
