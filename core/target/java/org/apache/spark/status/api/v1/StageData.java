package org.apache.spark.status.api.v1;
public  class StageData {
  // not preceding
     StageData (org.apache.spark.status.api.v1.StageStatus status, int stageId, int attemptId, int numTasks, int numActiveTasks, int numCompleteTasks, int numFailedTasks, int numKilledTasks, int numCompletedIndices, long executorRunTime, long executorCpuTime, scala.Option<java.util.Date> submissionTime, scala.Option<java.util.Date> firstTaskLaunchedTime, scala.Option<java.util.Date> completionTime, scala.Option<java.lang.String> failureReason, long inputBytes, long inputRecords, long outputBytes, long outputRecords, long shuffleReadBytes, long shuffleReadRecords, long shuffleWriteBytes, long shuffleWriteRecords, long memoryBytesSpilled, long diskBytesSpilled, java.lang.String name, scala.Option<java.lang.String> description, java.lang.String details, java.lang.String schedulingPool, scala.collection.Seq<java.lang.Object> rddIds, scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> accumulatorUpdates, scala.Option<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.status.api.v1.TaskData>> tasks, scala.Option<scala.collection.immutable.Map<java.lang.String, org.apache.spark.status.api.v1.ExecutorStageSummary>> executorSummary, scala.collection.immutable.Map<java.lang.String, java.lang.Object> killedTasksSummary)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> accumulatorUpdates ()  { throw new RuntimeException(); }
  public  int attemptId ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> completionTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> description ()  { throw new RuntimeException(); }
  public  java.lang.String details ()  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  public  long executorCpuTime ()  { throw new RuntimeException(); }
  public  long executorRunTime ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, org.apache.spark.status.api.v1.ExecutorStageSummary>> executorSummary ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> failureReason ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> firstTaskLaunchedTime ()  { throw new RuntimeException(); }
  public  long inputBytes ()  { throw new RuntimeException(); }
  public  long inputRecords ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> killedTasksSummary ()  { throw new RuntimeException(); }
  public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  int numActiveTasks ()  { throw new RuntimeException(); }
  public  int numCompleteTasks ()  { throw new RuntimeException(); }
  public  int numCompletedIndices ()  { throw new RuntimeException(); }
  public  int numFailedTasks ()  { throw new RuntimeException(); }
  public  int numKilledTasks ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  long outputBytes ()  { throw new RuntimeException(); }
  public  long outputRecords ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> rddIds ()  { throw new RuntimeException(); }
  public  java.lang.String schedulingPool ()  { throw new RuntimeException(); }
  public  long shuffleReadBytes ()  { throw new RuntimeException(); }
  public  long shuffleReadRecords ()  { throw new RuntimeException(); }
  public  long shuffleWriteBytes ()  { throw new RuntimeException(); }
  public  long shuffleWriteRecords ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageStatus status ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> submissionTime ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.status.api.v1.TaskData>> tasks ()  { throw new RuntimeException(); }
}
