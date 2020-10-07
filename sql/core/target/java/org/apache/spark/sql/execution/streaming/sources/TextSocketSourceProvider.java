package org.apache.spark.sql.execution.streaming.sources;
public  class TextSocketSourceProvider implements org.apache.spark.sql.sources.v2.DataSourceV2, org.apache.spark.sql.sources.v2.MicroBatchReadSupport, org.apache.spark.sql.sources.v2.ContinuousReadSupport, org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.internal.Logging {
  public   TextSocketSourceProvider ()  { throw new RuntimeException(); }
  private  void checkParameters (org.apache.spark.sql.sources.v2.DataSourceOptions params)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.ContinuousReader createContinuousReader (java.util.Optional<org.apache.spark.sql.types.StructType> schema, java.lang.String checkpointLocation, org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.MicroBatchReader createMicroBatchReader (java.util.Optional<org.apache.spark.sql.types.StructType> schema, java.lang.String checkpointLocation, org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  /** String that represents the format that this data source provider uses. */
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
