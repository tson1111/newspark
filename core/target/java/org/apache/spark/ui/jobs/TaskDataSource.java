package org.apache.spark.ui.jobs;
  class TaskDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.status.api.v1.TaskData> {
  public   TaskDataSource (org.apache.spark.status.api.v1.StageData stage, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> _tasksToShow ()  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.String>> executorIdToLogs ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs (java.lang.String id)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> sliceData (int from, int to)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> tasks ()  { throw new RuntimeException(); }
}
