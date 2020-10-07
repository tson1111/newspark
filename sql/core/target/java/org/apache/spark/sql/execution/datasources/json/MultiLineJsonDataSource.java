package org.apache.spark.sql.execution.datasources.json;
public  class MultiLineJsonDataSource {
  static public  boolean isSplitable ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType infer (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> inputPaths, org.apache.spark.sql.catalyst.json.JSONOptions parsedOptions)  { throw new RuntimeException(); }
  static private  org.apache.spark.rdd.RDD<org.apache.spark.input.PortableDataStream> createBaseRdd (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> inputPaths, org.apache.spark.sql.catalyst.json.JSONOptions parsedOptions)  { throw new RuntimeException(); }
  static private  java.io.InputStream dataToInputStream (org.apache.spark.input.PortableDataStream dataStream)  { throw new RuntimeException(); }
  static private  com.fasterxml.jackson.core.JsonParser createParser (com.fasterxml.jackson.core.JsonFactory jsonFactory, org.apache.spark.input.PortableDataStream stream)  { throw new RuntimeException(); }
  static private  com.fasterxml.jackson.core.JsonParser createParser (java.lang.String enc, com.fasterxml.jackson.core.JsonFactory jsonFactory, org.apache.spark.input.PortableDataStream stream)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> readFile (org.apache.hadoop.conf.Configuration conf, org.apache.spark.sql.execution.datasources.PartitionedFile file, org.apache.spark.sql.catalyst.json.JacksonParser parser, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public final  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> inputPaths, org.apache.spark.sql.catalyst.json.JSONOptions parsedOptions)  { throw new RuntimeException(); }
}
