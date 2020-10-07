package org.apache.spark.status.api.v1.streaming;
  class ApiStreamingRootResource implements org.apache.spark.status.api.v1.streaming.BaseStreamingAppResource {
  public   ApiStreamingRootResource ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> avgRate (scala.collection.Seq<java.lang.Object> data)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> avgTime (scala.collection.Seq<java.lang.Object> data)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.BatchInfo> batchesList (java.util.List<org.apache.spark.status.api.v1.streaming.BatchStatus> statusParams)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.BatchInfo oneBatch (long batchId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.OutputOperationInfo oneOperation (long batchId, int opId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.ReceiverInfo oneReceiver (int streamId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.OutputOperationInfo> operationsList (long batchId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.ReceiverInfo> receiversList ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.StreamingStatistics streamingStatistics ()  { throw new RuntimeException(); }
}
