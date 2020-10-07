package org.apache.spark.ui.storage;
/** Page showing list of RDD's currently stored in the cluster */
  class StoragePage extends org.apache.spark.ui.WebUIPage {
  public   StoragePage (org.apache.spark.ui.SparkUITab parent, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> executorMetricsTable (scala.collection.Seq<org.apache.spark.status.StreamBlockData> blocks)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> executorMetricsTableHeader ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> executorMetricsTableRow (org.apache.spark.ui.storage.ExecutorStreamSummary status)  { throw new RuntimeException(); }
  /** Header fields for the RDD table */
  private  scala.collection.Seq<java.lang.String> rddHeader ()  { throw new RuntimeException(); }
  /** Render an HTML row representing an RDD */
  private  scala.collection.Seq<scala.xml.Node> rddRow (javax.servlet.http.HttpServletRequest request, org.apache.spark.status.api.v1.RDDStorageInfo rdd)  { throw new RuntimeException(); }
    scala.collection.Seq<scala.xml.Node> rddTable (javax.servlet.http.HttpServletRequest request, scala.collection.Seq<org.apache.spark.status.api.v1.RDDStorageInfo> rdds)  { throw new RuntimeException(); }
    scala.collection.Seq<scala.xml.Node> receiverBlockTables (scala.collection.Seq<org.apache.spark.status.StreamBlockData> blocks)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
    scala.Tuple2<java.lang.String, java.lang.Object> streamBlockStorageLevelDescriptionAndSize (org.apache.spark.status.StreamBlockData block)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> streamBlockTable (scala.collection.Seq<scala.Tuple2<java.lang.String, scala.collection.Seq<org.apache.spark.status.StreamBlockData>>> blocks)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> streamBlockTableHeader ()  { throw new RuntimeException(); }
  /** Render a stream block */
  private  scala.collection.Seq<scala.xml.Node> streamBlockTableRow (scala.Tuple2<java.lang.String, scala.collection.Seq<org.apache.spark.status.StreamBlockData>> block)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> streamBlockTableSubrow (java.lang.String blockId, org.apache.spark.status.StreamBlockData block, int replication, boolean firstSubrow)  { throw new RuntimeException(); }
}
