package org.apache.spark.sql.execution.streaming;
public  class MicroBatchExecution extends org.apache.spark.sql.execution.streaming.StreamExecution {
  static public  java.lang.String BATCH_ID_KEY ()  { throw new RuntimeException(); }
  static public abstract  org.apache.spark.sql.streaming.StreamingQueryStatus status ()  ;
  static public abstract  org.apache.spark.sql.streaming.StreamingQueryProgress[] recentProgress ()  ;
  static public abstract  org.apache.spark.sql.streaming.StreamingQueryProgress lastProgress ()  ;
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
  static public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.BaseStreamingSink sink ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.streaming.Trigger trigger ()  { throw new RuntimeException(); }
  static public  org.apache.spark.util.Clock triggerClock ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  static protected  long pollingDelayMs ()  { throw new RuntimeException(); }
  static protected  int minLogEntriesToMaintain ()  { throw new RuntimeException(); }
  static protected  java.util.concurrent.locks.ReentrantLock awaitProgressLock ()  { throw new RuntimeException(); }
  static protected  java.util.concurrent.locks.Condition awaitProgressLockCondition ()  { throw new RuntimeException(); }
  static public  java.lang.String resolvedCheckpointRoot ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.StreamProgress committedOffsets ()  { throw new RuntimeException(); }
  static public  void committedOffsets_$eq (org.apache.spark.sql.execution.streaming.StreamProgress x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.StreamProgress availableOffsets ()  { throw new RuntimeException(); }
  static public  void availableOffsets_$eq (org.apache.spark.sql.execution.streaming.StreamProgress x$1)  { throw new RuntimeException(); }
  static protected  long currentBatchId ()  { throw new RuntimeException(); }
  static protected  void currentBatchId_$eq (long x$1)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.streaming.StreamMetadata streamMetadata ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata offsetSeqMetadata ()  { throw new RuntimeException(); }
  static protected  void offsetSeqMetadata_$eq (org.apache.spark.sql.execution.streaming.OffsetSeqMetadata x$1)  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.Map<java.lang.Object, java.lang.Object> watermarkMsMap ()  { throw new RuntimeException(); }
  static public  java.util.UUID id ()  { throw new RuntimeException(); }
  static public  java.util.UUID runId ()  { throw new RuntimeException(); }
  static protected  java.lang.String prettyIdString ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.execution.streaming.BaseStreamingSource> uniqueSources ()  { throw new RuntimeException(); }
  static protected  void uniqueSources_$eq (scala.collection.Seq<org.apache.spark.sql.execution.streaming.BaseStreamingSource> x$1)  { throw new RuntimeException(); }
  static protected  java.util.concurrent.atomic.AtomicReference<org.apache.spark.sql.execution.streaming.State> state ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.IncrementalExecution lastExecution ()  { throw new RuntimeException(); }
  static public  void lastExecution_$eq (org.apache.spark.sql.execution.streaming.IncrementalExecution x$1)  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> newData ()  { throw new RuntimeException(); }
  static protected  void newData_$eq (scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> x$1)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.streaming.StreamingQueryException streamDeathCause ()  { throw new RuntimeException(); }
  static protected  void streamDeathCause_$eq (org.apache.spark.sql.streaming.StreamingQueryException x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.MetricsReporter streamMetrics ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.QueryExecutionThread queryExecutionThread ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.OffsetSeqLog offsetLog ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.CommitLog commitLog ()  { throw new RuntimeException(); }
  static public  boolean isActive ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.streaming.StreamingQueryException> exception ()  { throw new RuntimeException(); }
  static protected  java.lang.String checkpointFile (java.lang.String name)  { throw new RuntimeException(); }
  static public  void start ()  { throw new RuntimeException(); }
  static protected  void postEvent (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
  static protected  void stopSources ()  { throw new RuntimeException(); }
  static   void awaitOffset (int sourceIndex, org.apache.spark.sql.execution.streaming.Offset newOffset, long timeoutMs)  { throw new RuntimeException(); }
  static protected  boolean noNewData ()  { throw new RuntimeException(); }
  static protected  void noNewData_$eq (boolean x$1)  { throw new RuntimeException(); }
  static public  void awaitInitialization (long timeoutMs)  { throw new RuntimeException(); }
  static public  void processAllAvailable ()  { throw new RuntimeException(); }
  static public  void awaitTermination ()  { throw new RuntimeException(); }
  static public  boolean awaitTermination (long timeoutMs)  { throw new RuntimeException(); }
  static public  java.lang.String explainInternal (boolean extended)  { throw new RuntimeException(); }
  static public  void explain (boolean extended)  { throw new RuntimeException(); }
  static public  void explain ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static protected  java.lang.String getBatchDescriptionString ()  { throw new RuntimeException(); }
  // not preceding
  public   MicroBatchExecution (org.apache.spark.sql.SparkSession sparkSession, java.lang.String name, java.lang.String checkpointRoot, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzedPlan, org.apache.spark.sql.execution.streaming.BaseStreamingSink sink, org.apache.spark.sql.streaming.Trigger trigger, org.apache.spark.util.Clock triggerClock, org.apache.spark.sql.streaming.OutputMode outputMode, scala.collection.immutable.Map<java.lang.String, java.lang.String> extraOptions, boolean deleteCheckpointOnStop)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.execution.streaming.BaseStreamingSource> sources ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<org.apache.spark.sql.sources.v2.reader.streaming.MicroBatchReader, scala.Tuple2<org.apache.spark.sql.sources.v2.DataSourceV2, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> readerToDataSourceMap ()  { throw new RuntimeException(); }
  private  scala.Product triggerExecutor ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.WatermarkTracker watermarkTracker ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan ()  { throw new RuntimeException(); }
  /**
   * Signifies whether current batch (i.e. for the batch <code>currentBatchId</code>) has been constructed
   * (i.e. written to the offsetLog) and is ready for execution.
   * @return (undocumented)
   */
  private  boolean isCurrentBatchConstructed ()  { throw new RuntimeException(); }
  /**
   * Signals to the thread executing micro-batches that it should stop running after the next
   * batch. This method blocks until the thread stops running.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Repeatedly attempts to run batches as data arrives.
   * @param sparkSessionForStream (undocumented)
   */
  protected  void runActivatedStream (org.apache.spark.sql.SparkSession sparkSessionForStream)  { throw new RuntimeException(); }
  /**
   * Populate the start offsets to start the execution at the current offsets stored in the sink
   * (i.e. avoid reprocessing data that we have already processed). This function must be called
   * before any processing occurs and will populate the following fields:
   *  - currentBatchId
   *  - committedOffsets
   *  - availableOffsets
   *  The basic structure of this method is as follows:
   * <p>
   *  Identify (from the offset log) the offsets used to run the last batch
   *  IF last batch exists THEN
   *    Set the next batch to be executed as the last recovered batch
   *    Check the commit log to see which batch was committed last
   *    IF the last batch was committed THEN
   *      Call getBatch using the last batch start and end offsets
   *      // ^^^^ above line is needed since some sources assume last batch always re-executes
   *      Setup for a new batch i.e., start = last batch end, and identify new end
   *    DONE
   *  ELSE
   *    Identify a brand new batch
   *  DONE
   * @param sparkSessionToRunBatches (undocumented)
   */
  private  void populateStartOffsets (org.apache.spark.sql.SparkSession sparkSessionToRunBatches)  { throw new RuntimeException(); }
  /**
   * Returns true if there is any new data available to be processed.
   * @return (undocumented)
   */
  private  boolean isNewDataAvailable ()  { throw new RuntimeException(); }
  /**
   * Attempts to construct a batch according to:
   *  - Availability of new data
   *  - Need for timeouts and state cleanups in stateful operators
   * <p>
   * Returns true only if the next batch should be executed.
   * <p>
   * Here is the high-level logic on how this constructs the next batch.
   * - Check each source whether new data is available
   * - Updated the query's metadata and check using the last execution whether there is any need
   *   to run another batch (for state clean up, etc.)
   * - If either of the above is true, then construct the next batch by committing to the offset
   *   log that range of offsets that the next batch will process.
   * @param noDataBatchesEnabled (undocumented)
   * @return (undocumented)
   */
  private  boolean constructNextBatch (boolean noDataBatchesEnabled)  { throw new RuntimeException(); }
  /**
   * Processes any data available between <code>availableOffsets</code> and <code>committedOffsets</code>.
   * @param sparkSessionToRunBatch Isolated {@link SparkSession} to run this batch with.
   */
  private  void runBatch (org.apache.spark.sql.SparkSession sparkSessionToRunBatch)  { throw new RuntimeException(); }
  /** Execute a function while locking the stream from making an progress */
   <T extends java.lang.Object> T withProgressLocked (scala.Function0<T> f)  { throw new RuntimeException(); }
  private  java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> toJava (scala.Option<org.apache.spark.sql.sources.v2.reader.streaming.Offset> scalaOption)  { throw new RuntimeException(); }
}
