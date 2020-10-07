package org.apache.spark.status;
/**
 * A wrapper around a KVStore that provides methods for accessing the API data stored within.
 */
  class AppStatusStore {
  static public  long CURRENT_VERSION ()  { throw new RuntimeException(); }
  /**
   * Create an in-memory store for a live application.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.status.AppStatusStore createLiveStore (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.util.kvstore.KVStore store ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.AppStatusListener> listener ()  { throw new RuntimeException(); }
  // not preceding
  public   AppStatusStore (org.apache.spark.util.kvstore.KVStore store, scala.Option<org.apache.spark.status.AppStatusListener> listener)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ApplicationInfo applicationInfo ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ApplicationEnvironmentInfo environmentInfo ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobsList (java.util.List<org.apache.spark.JobExecutionStatus> statuses)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.JobData job (int jobId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executorList (boolean activeOnly)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ExecutorSummary executorSummary (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * This is used by ConsoleProgressBar to quickly fetch active stages for drawing the progress
   * bar. It will only return anything useful when called from a live application.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> activeStages ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageList (java.util.List<org.apache.spark.status.api.v1.StageStatus> statuses)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageData (int stageId, boolean details)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData lastStageAttempt (int stageId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData stageAttempt (int stageId, int stageAttemptId, boolean details)  { throw new RuntimeException(); }
  public  long taskCount (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> localitySummary (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  /**
   * Calculates a summary of the task metrics for the given stage attempt, returning the
   * requested quantiles for the recorded metrics.
   * <p>
   * This method can be expensive if the requested quantiles are not cached; the method
   * will only cache certain quantiles (every 0.05 step), so it's recommended to stick to
   * those to avoid expensive scans of all task data.
   * @param stageId (undocumented)
   * @param stageAttemptId (undocumented)
   * @param unsortedQuantiles (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.status.api.v1.TaskMetricDistributions> taskSummary (int stageId, int stageAttemptId, double[] unsortedQuantiles)  { throw new RuntimeException(); }
  /**
   * Whether to cache information about a specific metric quantile. We cache quantiles at every 0.05
   * step, which covers the default values used both in the API and in the stages page.
   * @param q (undocumented)
   * @return (undocumented)
   */
  private  boolean shouldCacheQuantile (double q)  { throw new RuntimeException(); }
  private  java.lang.String quantileToString (double q)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int maxTasks)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int offset, int length, org.apache.spark.status.api.v1.TaskSorting sortBy)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int offset, int length, scala.Option<java.lang.String> sortBy, boolean ascending)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.status.api.v1.ExecutorStageSummary> executorSummary (int stageId, int attemptId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.RDDStorageInfo> rddList (boolean cachedOnly)  { throw new RuntimeException(); }
  /**
   * Calls a closure that may throw a NoSuchElementException and returns <code>None</code> when the exception
   * is thrown.
   * @param fn (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> asOption (scala.Function0<T> fn)  { throw new RuntimeException(); }
  private  org.apache.spark.status.api.v1.StageData stageWithDetails (org.apache.spark.status.api.v1.StageData stage)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.RDDStorageInfo rdd (int rddId)  { throw new RuntimeException(); }
  /**
   * Calls a closure that may throw a NoSuchElementException and returns <code>None</code> when the exception
   * is thrown.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.status.StreamBlockData> streamBlocksList ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.scope.RDDOperationGraph operationGraphForStage (int stageId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationGraph> operationGraphForJob (int jobId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.PoolData pool (java.lang.String name)  { throw new RuntimeException(); }
  public  org.apache.spark.status.AppSummary appSummary ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
