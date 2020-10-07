package org.apache.spark.status;
/**
 * A Spark listener that writes application information to a data store. The types written to the
 * store are defined in the <code>storeTypes.scala</code> file and are based on the public REST API.
 * <p>
 * param:  lastUpdateTime When replaying logs, the log's last update time, so that the duration of
 *                       unfinished tasks can be more accurately calculated (see SPARK-21922).
 */
  class AppStatusListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  static public  void onSpeculativeTaskSubmitted (org.apache.spark.scheduler.SparkListenerSpeculativeTaskSubmitted speculativeTask)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  public   AppStatusListener (org.apache.spark.status.ElementTrackingStore kvstore, org.apache.spark.SparkConf conf, boolean live, scala.Option<java.lang.Object> lastUpdateTime)  { throw new RuntimeException(); }
  private  java.lang.String sparkVersion ()  { throw new RuntimeException(); }
  private  org.apache.spark.status.api.v1.ApplicationInfo appInfo ()  { throw new RuntimeException(); }
  private  org.apache.spark.status.AppSummary appSummary ()  { throw new RuntimeException(); }
  private  int coresPerTask ()  { throw new RuntimeException(); }
  private  long liveUpdatePeriodNs ()  { throw new RuntimeException(); }
  private  int maxTasksPerStage ()  { throw new RuntimeException(); }
  private  int maxGraphRootNodes ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.status.LiveStage> liveStages ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.status.LiveJob> liveJobs ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.status.LiveExecutor> liveExecutors ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.status.LiveTask> liveTasks ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.status.LiveRDD> liveRDDs ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.status.SchedulerPool> pools ()  { throw new RuntimeException(); }
  private  int activeExecutorCount ()  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart event)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate event)  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd event)  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded event)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved event)  { throw new RuntimeException(); }
  public  void onExecutorBlacklisted (org.apache.spark.scheduler.SparkListenerExecutorBlacklisted event)  { throw new RuntimeException(); }
  public  void onExecutorBlacklistedForStage (org.apache.spark.scheduler.SparkListenerExecutorBlacklistedForStage event)  { throw new RuntimeException(); }
  public  void onNodeBlacklistedForStage (org.apache.spark.scheduler.SparkListenerNodeBlacklistedForStage event)  { throw new RuntimeException(); }
  private  void addBlackListedStageTo (org.apache.spark.status.LiveExecutor exec, int stageId, long now)  { throw new RuntimeException(); }
  private  void setStageBlackListStatus (org.apache.spark.status.LiveStage stage, long now, scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  public  void onExecutorUnblacklisted (org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted event)  { throw new RuntimeException(); }
  public  void onNodeBlacklisted (org.apache.spark.scheduler.SparkListenerNodeBlacklisted event)  { throw new RuntimeException(); }
  public  void onNodeUnblacklisted (org.apache.spark.scheduler.SparkListenerNodeUnblacklisted event)  { throw new RuntimeException(); }
  private  void updateBlackListStatus (java.lang.String execId, boolean blacklisted)  { throw new RuntimeException(); }
  private  void updateNodeBlackList (java.lang.String host, boolean blacklisted)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart event)  { throw new RuntimeException(); }
  private  org.apache.spark.status.RDDOperationClusterWrapper newRDDOperationCluster (org.apache.spark.ui.scope.RDDOperationCluster cluster)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd event)  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted event)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart event)  { throw new RuntimeException(); }
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult event)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd event)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted event)  { throw new RuntimeException(); }
  private  void removeBlackListedStageFrom (org.apache.spark.status.LiveExecutor exec, int stageId, long now)  { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded event)  { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved event)  { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD event)  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate event)  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated event)  { throw new RuntimeException(); }
  /** Flush all live entities' data to the underlying store. */
  private  void flush ()  { throw new RuntimeException(); }
  /**
   * Shortcut to get active stages quickly in a live application, for use by the console
   * progress bar.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> activeStages ()  { throw new RuntimeException(); }
  /**
   * Apply a delta to a value, but ensure that it doesn't go negative.
   * @param old (undocumented)
   * @param delta (undocumented)
   * @return (undocumented)
   */
  private  long addDeltaToValue (long old, long delta)  { throw new RuntimeException(); }
  private  void updateRDDBlock (org.apache.spark.scheduler.SparkListenerBlockUpdated event, org.apache.spark.storage.RDDBlockId block)  { throw new RuntimeException(); }
  private  org.apache.spark.status.LiveExecutor getOrCreateExecutor (java.lang.String executorId, long addTime)  { throw new RuntimeException(); }
  private  void updateStreamBlock (org.apache.spark.scheduler.SparkListenerBlockUpdated event, org.apache.spark.storage.StreamBlockId stream)  { throw new RuntimeException(); }
  private  org.apache.spark.status.LiveStage getOrCreateStage (org.apache.spark.scheduler.StageInfo info)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> killedTasksSummary (org.apache.spark.TaskEndReason reason, scala.collection.immutable.Map<java.lang.String, java.lang.Object> oldSummary)  { throw new RuntimeException(); }
  private  void update (org.apache.spark.status.LiveEntity entity, long now, boolean last)  { throw new RuntimeException(); }
  /** Update a live entity only if it hasn't been updated in the last configured period. */
  private  void maybeUpdate (org.apache.spark.status.LiveEntity entity, long now)  { throw new RuntimeException(); }
  /** Update an entity only if in a live app; avoids redundant writes when replaying logs. */
  private  void liveUpdate (org.apache.spark.status.LiveEntity entity, long now)  { throw new RuntimeException(); }
  private  void conditionalLiveUpdate (org.apache.spark.status.LiveEntity entity, long now, boolean condition)  { throw new RuntimeException(); }
  private  void cleanupExecutors (long count)  { throw new RuntimeException(); }
  private  void cleanupJobs (long count)  { throw new RuntimeException(); }
  private  void cleanupStages (long count)  { throw new RuntimeException(); }
  private  void cleanupTasks (org.apache.spark.status.LiveStage stage)  { throw new RuntimeException(); }
  private  void cleanupCachedQuantiles (int[] stageKey)  { throw new RuntimeException(); }
  /**
   * Remove at least (retainedSize / 10) items to reduce friction. Because tracking may be done
   * asynchronously, this method may return 0 in case enough items have been deleted already.
   * @param dataSize (undocumented)
   * @param retainedSize (undocumented)
   * @return (undocumented)
   */
  private  long calculateNumberToRemove (long dataSize, long retainedSize)  { throw new RuntimeException(); }
}
