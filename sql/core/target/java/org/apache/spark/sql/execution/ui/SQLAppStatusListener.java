package org.apache.spark.sql.execution.ui;
public  class SQLAppStatusListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  public   SQLAppStatusListener (org.apache.spark.SparkConf conf, org.apache.spark.status.ElementTrackingStore kvstore, boolean live)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.Object, java.lang.String> aggregateMetrics (org.apache.spark.sql.execution.ui.LiveExecutionData exec)  { throw new RuntimeException(); }
  private  void cleanupExecutions (long count)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.ui.LiveExecutionData getOrCreateExecution (long executionId)  { throw new RuntimeException(); }
  private  boolean isSQLStage (int stageId)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.Object, java.lang.String>> liveExecutionMetrics (long executionId)  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.Object, org.apache.spark.sql.execution.ui.LiveExecutionData> liveExecutions ()  { throw new RuntimeException(); }
  private  long liveUpdatePeriodNs ()  { throw new RuntimeException(); }
    boolean noLiveData ()  { throw new RuntimeException(); }
  private  void onDriverAccumUpdates (org.apache.spark.sql.execution.ui.SparkListenerDriverAccumUpdates event)  { throw new RuntimeException(); }
  private  void onExecutionEnd (org.apache.spark.sql.execution.ui.SparkListenerSQLExecutionEnd event)  { throw new RuntimeException(); }
  private  void onExecutionStart (org.apache.spark.sql.execution.ui.SparkListenerSQLExecutionStart event)  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate event)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd event)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted event)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd event)  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.Object, org.apache.spark.sql.execution.ui.LiveStageMetrics> stageMetrics ()  { throw new RuntimeException(); }
  private  void update (org.apache.spark.sql.execution.ui.LiveExecutionData exec, boolean force)  { throw new RuntimeException(); }
  private  void updateStageMetrics (int stageId, int attemptId, long taskId, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates, boolean succeeded)  { throw new RuntimeException(); }
}
