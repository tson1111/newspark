package org.apache.spark.ui.jobs;
  class TaskPagedTable implements org.apache.spark.ui.PagedTable<org.apache.spark.status.api.v1.TaskData> {
  public   TaskPagedTable (org.apache.spark.status.api.v1.StageData stage, java.lang.String basePath, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> accumulatorsInfo (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.TaskDataSource dataSource ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> errorMessageCell (java.lang.String error)  { throw new RuntimeException(); }
  public  java.lang.String goButtonFormPath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> headers ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> metricInfo (org.apache.spark.status.api.v1.TaskData task, scala.Function1<org.apache.spark.status.api.v1.TaskMetrics, scala.collection.Seq<scala.xml.Node>> fn)  { throw new RuntimeException(); }
  public  java.lang.String pageLink (int page)  { throw new RuntimeException(); }
  public  java.lang.String pageNumberFormField ()  { throw new RuntimeException(); }
  public  java.lang.String pageSizeFormField ()  { throw new RuntimeException(); }
  public  java.lang.String prevPageSizeFormField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> row (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
  public  java.lang.String tableCssClass ()  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
}
