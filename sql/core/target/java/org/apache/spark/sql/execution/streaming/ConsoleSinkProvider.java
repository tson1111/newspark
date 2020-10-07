package org.apache.spark.sql.execution.streaming;
public  class ConsoleSinkProvider implements org.apache.spark.sql.sources.v2.DataSourceV2, org.apache.spark.sql.sources.v2.StreamWriteSupport, org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.sql.sources.CreatableRelationProvider {
  public   ConsoleSinkProvider ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.SaveMode mode, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter createStreamWriter (java.lang.String queryId, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.streaming.OutputMode mode, org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
