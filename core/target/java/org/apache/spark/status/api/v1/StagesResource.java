package org.apache.spark.status.api.v1;
  class StagesResource implements org.apache.spark.status.api.v1.BaseAppResource {
  public   StagesResource ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData oneAttemptData (int stageId, int stageAttemptId, boolean details)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageData (int stageId, boolean details)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageList (java.util.List<org.apache.spark.status.api.v1.StageStatus> statuses)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int offset, int length, org.apache.spark.status.api.v1.TaskSorting sortBy)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskMetricDistributions taskSummary (int stageId, int stageAttemptId, java.lang.String quantileString)  { throw new RuntimeException(); }
}
