package org.apache.spark.sql.execution.streaming;
/**
 * A bus to forward events to {@link StreamingQueryListener}s. This one will send received
 * {@link StreamingQueryListener.Event}s to the Spark listener bus. It also registers itself with
 * Spark listener bus, so that it can receive {@link StreamingQueryListener.Event}s and dispatch them
 * to StreamingQueryListeners.
 * <p>
 * Note that each bus and its registered listeners are associated with a single SparkSession
 * and StreamingQueryManager. So this bus will dispatch events to registered listeners for only
 * those queries that were started in the associated SparkSession.
 */
public  class StreamingQueryListenerBus extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.util.ListenerBus<org.apache.spark.sql.streaming.StreamingQueryListener, org.apache.spark.sql.streaming.StreamingQueryListener.Event> {
  static public  java.lang.String STREAM_EVENT_QUERY ()  { throw new RuntimeException(); }
  static public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  static public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  static public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
  static public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  { throw new RuntimeException(); }
  static public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  static public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  static public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  static public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  { throw new RuntimeException(); }
  static public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  { throw new RuntimeException(); }
  static public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  { throw new RuntimeException(); }
  static public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  { throw new RuntimeException(); }
  static public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  { throw new RuntimeException(); }
  static public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  { throw new RuntimeException(); }
  static public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdate)  { throw new RuntimeException(); }
  static public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  static public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  static public  void onExecutorBlacklisted (org.apache.spark.scheduler.SparkListenerExecutorBlacklisted executorBlacklisted)  { throw new RuntimeException(); }
  static public  void onExecutorBlacklistedForStage (org.apache.spark.scheduler.SparkListenerExecutorBlacklistedForStage executorBlacklistedForStage)  { throw new RuntimeException(); }
  static public  void onNodeBlacklistedForStage (org.apache.spark.scheduler.SparkListenerNodeBlacklistedForStage nodeBlacklistedForStage)  { throw new RuntimeException(); }
  static public  void onExecutorUnblacklisted (org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted executorUnblacklisted)  { throw new RuntimeException(); }
  static public  void onNodeBlacklisted (org.apache.spark.scheduler.SparkListenerNodeBlacklisted nodeBlacklisted)  { throw new RuntimeException(); }
  static public  void onNodeUnblacklisted (org.apache.spark.scheduler.SparkListenerNodeUnblacklisted nodeUnblacklisted)  { throw new RuntimeException(); }
  static public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  { throw new RuntimeException(); }
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
  static   java.util.List<L> listeners ()  { throw new RuntimeException(); }
  static protected  scala.Option<com.codahale.metrics.Timer> getTimer (L listener)  { throw new RuntimeException(); }
  static public final  void addListener (L listener)  { throw new RuntimeException(); }
  static public final  void removeListener (L listener)  { throw new RuntimeException(); }
  static public  void removeListenerOnError (L listener)  { throw new RuntimeException(); }
  static protected  boolean isIgnorableException (java.lang.Throwable e)  { throw new RuntimeException(); }
  static  <T extends L> scala.collection.Seq<T> findListenersByClass (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public   StreamingQueryListenerBus (org.apache.spark.scheduler.LiveListenerBus sparkListenerBus)  { throw new RuntimeException(); }
  /**
   * RunIds of active queries whose events are supposed to be forwarded by this ListenerBus
   * to registered <code>StreamingQueryListeners</code>.
   * <p>
   * Note 1: We need to track runIds instead of ids because the runId is unique for every started
   * query, even it its a restart. So even if a query is restarted, this bus will identify them
   * separately and correctly account for the restart.
   * <p>
   * Note 2: This list needs to be maintained separately from the
   * <code>StreamingQueryManager.activeQueries</code> because a terminated query is cleared from
   * <code>StreamingQueryManager.activeQueries</code> as soon as it is stopped, but the this ListenerBus
   * must clear a query only after the termination event of that query has been posted.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashSet<java.util.UUID> activeQueryRunIds ()  { throw new RuntimeException(); }
  /**
   * Post a StreamingQueryListener event to the added StreamingQueryListeners.
   * Note that only the QueryStarted event is posted to the listener synchronously. Other events
   * are dispatched to Spark listener bus. This method is guaranteed to be called by queries in
   * the same SparkSession as this listener.
   * @param event (undocumented)
   */
  public  void post (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
  /**
   * Override the parent <code>postToAll</code> to remove the query id from <code>activeQueryRunIds</code> after all
   * the listeners process <code>QueryTerminatedEvent</code>. (SPARK-19594)
   * @param event (undocumented)
   */
  public  void postToAll (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  /**
   * Dispatch events to registered StreamingQueryListeners. Only the events associated queries
   * started in the same SparkSession as this ListenerBus will be dispatched to the listeners.
   * @param listener (undocumented)
   * @param event (undocumented)
   */
  protected  void doPostEvent (org.apache.spark.sql.streaming.StreamingQueryListener listener, org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
}
