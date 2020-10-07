package org.apache.spark.sql.execution.streaming;
/** A common trait for MemorySinks with methods used for testing */
public  interface MemorySinkBase extends org.apache.spark.sql.execution.streaming.BaseStreamingSink {
  public  scala.collection.Seq<org.apache.spark.sql.Row> allData ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.Row> dataSinceBatch (long sinceBatchId)  ;
  public  scala.collection.Seq<org.apache.spark.sql.Row> latestBatchData ()  ;
  public  scala.Option<java.lang.Object> latestBatchId ()  ;
}
