package org.apache.spark.sql.execution.streaming;
/**
 * Manages the execution of a streaming Spark SQL query that is occurring in a separate thread.
 * Unlike a standard query, a streaming query executes repeatedly each time new data arrives at any
 * {@link Source} present in the query plan. Whenever new data arrives, a {@link QueryExecution} is created
 * and the results are committed transactionally to the given {@link Sink}.
 * <p>
 * param:  deleteCheckpointOnStop whether to delete the checkpoint if the query is stopped without
 *                               errors
 */
public abstract class StreamExecution implements org.apache.spark.sql.streaming.StreamingQuery, org.apache.spark.sql.execution.streaming.ProgressReporter, org.apache.spark.internal.Logging {
  static public  java.lang.String QUERY_ID_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String IS_CONTINUOUS_PROCESSING ()  { throw new RuntimeException(); }
  static public  boolean isInterruptionException (java.lang.Throwable e)  { throw new RuntimeException(); }
  static public abstract  org.apache.spark.sql.streaming.StreamingQueryStatus status ()  ;
  static public abstract  org.apache.spark.sql.streaming.StreamingQueryProgress[] recentProgress ()  ;
  static public abstract  org.apache.spark.sql.streaming.StreamingQueryProgress lastProgress ()  ;
  static public abstract  void stop ()  ;
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
  static protected abstract  scala.collection.Seq<org.apache.spark.sql.execution.streaming.BaseStreamingSource> sources ()  ;
  static protected  org.apache.spark.sql.streaming.StreamingQueryStatus currentStatus ()  { throw new RuntimeException(); }
  static protected  void currentStatus_$eq (org.apache.spark.sql.streaming.StreamingQueryStatus x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.streaming.StreamingQueryStatus status ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.streaming.StreamingQueryProgress[] recentProgress ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.streaming.StreamingQueryProgress lastProgress ()  { throw new RuntimeException(); }
  static protected  void startTrigger ()  { throw new RuntimeException(); }
  static protected  void recordTriggerOffsets (org.apache.spark.sql.execution.streaming.StreamProgress from, org.apache.spark.sql.execution.streaming.StreamProgress to)  { throw new RuntimeException(); }
  static protected  void finishTrigger (boolean hasNewData)  { throw new RuntimeException(); }
  static protected <T extends java.lang.Object> T reportTimeTaken (java.lang.String triggerDetailKey, scala.Function0<T> body)  { throw new RuntimeException(); }
  static protected  void updateStatusMessage (java.lang.String message)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  private  java.lang.String checkpointRoot ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.BaseStreamingSink sink ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.Trigger trigger ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock triggerClock ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamExecution (org.apache.spark.sql.SparkSession sparkSession, java.lang.String name, java.lang.String checkpointRoot, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzedPlan, org.apache.spark.sql.execution.streaming.BaseStreamingSink sink, org.apache.spark.sql.streaming.Trigger trigger, org.apache.spark.util.Clock triggerClock, org.apache.spark.sql.streaming.OutputMode outputMode, boolean deleteCheckpointOnStop)  { throw new RuntimeException(); }
  protected  long pollingDelayMs ()  { throw new RuntimeException(); }
  protected  int minLogEntriesToMaintain ()  { throw new RuntimeException(); }
  /**
   * A lock used to wait/notify when batches complete. Use a fair lock to avoid thread starvation.
   * @return (undocumented)
   */
  protected  java.util.concurrent.locks.ReentrantLock awaitProgressLock ()  { throw new RuntimeException(); }
  protected  java.util.concurrent.locks.Condition awaitProgressLockCondition ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch initializationLatch ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch startLatch ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch terminationLatch ()  { throw new RuntimeException(); }
  public  java.lang.String resolvedCheckpointRoot ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan ()  ;
  /**
   * Tracks how much data we have processed and committed to the sink or state store from each
   * input source.
   * Only the scheduler thread should modify this field, and only in atomic steps.
   * Other threads should make a shallow copy if they are going to access this field more than
   * once, since the field's value may change at any time.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.StreamProgress committedOffsets ()  { throw new RuntimeException(); }
  /**
   * Tracks the offsets that are available to be processed, but have not yet be committed to the
   * sink.
   * Only the scheduler thread should modify this field, and only in atomic steps.
   * Other threads should make a shallow copy if they are going to access this field more than
   * once, since the field's value may change at any time.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.StreamProgress availableOffsets ()  { throw new RuntimeException(); }
  /** The current batchId or -1 if execution has not yet been initialized. */
  protected  long currentBatchId ()  { throw new RuntimeException(); }
  /** Metadata associated with the whole query */
  protected  org.apache.spark.sql.execution.streaming.StreamMetadata streamMetadata ()  { throw new RuntimeException(); }
  /** Metadata associated with the offset seq of a batch in the query. */
  protected  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata offsetSeqMetadata ()  { throw new RuntimeException(); }
  /**
   * A map of current watermarks, keyed by the position of the watermark operator in the
   * physical plan.
   * <p>
   * This state is 'soft state', which does not affect the correctness and semantics of watermarks
   * and is not persisted across query restarts.
   * The fault-tolerant watermark state is in offsetSeqMetadata.
   * @return (undocumented)
   */
  protected  scala.collection.mutable.Map<java.lang.Object, java.lang.Object> watermarkMsMap ()  { throw new RuntimeException(); }
  public  java.util.UUID id ()  { throw new RuntimeException(); }
  public  java.util.UUID runId ()  { throw new RuntimeException(); }
  /**
   * Pretty identified string of printing in logs. Format is
   * If name is set "queryName [id = xyz, runId = abc]" else "[id = xyz, runId = abc]"
   * @return (undocumented)
   */
  protected  java.lang.String prettyIdString ()  { throw new RuntimeException(); }
  /**
   * A list of unique sources in the query plan. This will be set when generating logical plan.
   * @return (undocumented)
   */
  protected  scala.collection.Seq<org.apache.spark.sql.execution.streaming.BaseStreamingSource> uniqueSources ()  { throw new RuntimeException(); }
  /** Defines the internal state of execution */
  protected  java.util.concurrent.atomic.AtomicReference<org.apache.spark.sql.execution.streaming.State> state ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.IncrementalExecution lastExecution ()  { throw new RuntimeException(); }
  /** Holds the most recent input data for each source. */
  protected  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> newData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamingQueryException streamDeathCause ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
  /** Used to report metrics to coda-hale. This uses id for easier tracking across restarts. */
  public  org.apache.spark.sql.execution.streaming.MetricsReporter streamMetrics ()  { throw new RuntimeException(); }
  /**
   * The thread that runs the micro-batches of this stream. Note that this thread must be
   * {@link org.apache.spark.util.UninterruptibleThread} to workaround KAFKA-1894: interrupting a
   * running <code>KafkaConsumer</code> may cause endless loop.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.QueryExecutionThread queryExecutionThread ()  { throw new RuntimeException(); }
  /**
   * A write-ahead-log that records the offsets that are present in each batch. In order to ensure
   * that a given batch will always consist of the same data, we write to this log *before* any
   * processing is done.  Thus, the Nth record in this log indicated data that is currently being
   * processed and the N-1th entry indicates which offsets have been durably committed to the sink.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.OffsetSeqLog offsetLog ()  { throw new RuntimeException(); }
  /**
   * A log that records the batch ids that have completed. This is used to check if a batch was
   * fully processed, and its output was committed to the sink, hence no need to process it again.
   * This is used (for instance) during restart, to help identify which batch to run next.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.CommitLog commitLog ()  { throw new RuntimeException(); }
  /** Whether all fields of the query have been initialized */
  private  boolean isInitialized ()  { throw new RuntimeException(); }
  /** Whether the query is currently active or not */
  public  boolean isActive ()  { throw new RuntimeException(); }
  /** Returns the {@link StreamingQueryException} if the query was terminated by an exception. */
  public  scala.Option<org.apache.spark.sql.streaming.StreamingQueryException> exception ()  { throw new RuntimeException(); }
  /** Returns the path of a file with `name` in the checkpoint directory. */
  protected  java.lang.String checkpointFile (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Starts the execution. This returns only after the thread has started and {@link QueryStartedEvent}
   * has been posted to all the listeners.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Run the activated stream until stopped.
   * @param sparkSessionForStream (undocumented)
   */
  protected abstract  void runActivatedStream (org.apache.spark.sql.SparkSession sparkSessionForStream)  ;
  /**
   * Activate the stream and then wrap a callout to runActivatedStream, handling start and stop.
   * <p>
   * Note that this method ensures that {@link QueryStartedEvent} and {@link QueryTerminatedEvent} are
   * posted such that listeners are guaranteed to get a start event before a termination.
   * Furthermore, this method also ensures that {@link QueryStartedEvent} event is posted before the
   * <code>start()</code> method returns.
   */
  private  void runStream ()  { throw new RuntimeException(); }
  private  boolean isInterruptedByStop (java.lang.Throwable e)  { throw new RuntimeException(); }
  protected  void postEvent (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
  /** Stops all streaming sources safely. */
  protected  void stopSources ()  { throw new RuntimeException(); }
  /**
   * Blocks the current thread until processing for data from the given <code>source</code> has reached at
   * least the given <code>Offset</code>. This method is intended for use primarily when writing tests.
   * @param sourceIndex (undocumented)
   * @param newOffset (undocumented)
   * @param timeoutMs (undocumented)
   */
    void awaitOffset (int sourceIndex, org.apache.spark.sql.execution.streaming.Offset newOffset, long timeoutMs)  { throw new RuntimeException(); }
  /** A flag to indicate that a batch has completed with no new data available. */
  protected  boolean noNewData ()  { throw new RuntimeException(); }
  /**
   * Assert that the await APIs should not be called in the stream thread. Otherwise, it may cause
   * dead-lock, e.g., calling any await APIs in <code>StreamingQueryListener.onQueryStarted</code> will block
   * the stream thread forever.
   */
  private  void assertAwaitThread ()  { throw new RuntimeException(); }
  /**
   * Await until all fields of the query have been initialized.
   * @param timeoutMs (undocumented)
   */
  public  void awaitInitialization (long timeoutMs)  { throw new RuntimeException(); }
  public  void processAllAvailable ()  { throw new RuntimeException(); }
  public  void awaitTermination ()  { throw new RuntimeException(); }
  public  boolean awaitTermination (long timeoutMs)  { throw new RuntimeException(); }
  /** Expose for tests */
  public  java.lang.String explainInternal (boolean extended)  { throw new RuntimeException(); }
  public  void explain (boolean extended)  { throw new RuntimeException(); }
  public  void explain ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  private  java.lang.String toDebugString (boolean includeLogicalPlan)  { throw new RuntimeException(); }
  protected  java.lang.String getBatchDescriptionString ()  { throw new RuntimeException(); }
}
