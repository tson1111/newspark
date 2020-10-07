package org.apache.spark.sql.execution.streaming;
/**
 * Responsible for continually reporting statistics about the amount of data processed as well
 * as latency for a streaming query.  This trait is designed to be mixed into the
 * {@link StreamExecution}, who is responsible for calling <code>startTrigger</code> and <code>finishTrigger</code>
 * at the appropriate times. Additionally, the status can updated with <code>updateStatusMessage</code> to
 * allow reporting on the streams current state (i.e. "Fetching more data").
 */
public  interface ProgressReporter extends org.apache.spark.internal.Logging {
  public  class ExecutionStats implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, java.lang.Object> inputRows ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.streaming.StateOperatorProgress> stateOperators ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> eventTimeStats ()  { throw new RuntimeException(); }
    // not preceding
    public   ExecutionStats (scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, java.lang.Object> inputRows, scala.collection.Seq<org.apache.spark.sql.streaming.StateOperatorProgress> stateOperators, scala.collection.immutable.Map<java.lang.String, java.lang.String> eventTimeStats)  { throw new RuntimeException(); }
  }
  public  class ExecutionStats$ extends scala.runtime.AbstractFunction3<scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, java.lang.Object>, scala.collection.Seq<org.apache.spark.sql.streaming.StateOperatorProgress>, scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.execution.streaming.ProgressReporter.ExecutionStats> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExecutionStats$ MODULE$ = null;
    public   ExecutionStats$ ()  { throw new RuntimeException(); }
  }
  public  long currentBatchId ()  ;
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> currentDurationsMs ()  ;
  public  org.apache.spark.sql.streaming.StreamingQueryStatus currentStatus ()  ;
  public  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, java.lang.String> currentTriggerEndOffsets ()  ;
  public  long currentTriggerEndTimestamp ()  ;
  public  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, java.lang.String> currentTriggerStartOffsets ()  ;
  public  long currentTriggerStartTimestamp ()  ;
  /** Extracts statistics from the most recent query execution. */
  public  org.apache.spark.sql.execution.streaming.ProgressReporter.ExecutionStats extractExecutionStats (boolean hasNewData)  ;
  /** Extract number of input sources for each streaming source in plan */
  public  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, java.lang.Object> extractSourceToNumInputRows ()  ;
  /** Extract statistics about stateful operators from the executed query plan. */
  public  scala.collection.Seq<org.apache.spark.sql.streaming.StateOperatorProgress> extractStateOperatorMetrics (boolean hasNewData)  ;
  /** Finalizes the query progress and adds it to list of recent status updates. */
  public  void finishTrigger (boolean hasNewData)  ;
  public  java.lang.String formatTimestamp (long millis)  ;
  public  java.util.UUID id ()  ;
  public  org.apache.spark.sql.execution.QueryExecution lastExecution ()  ;
  public  long lastNoDataProgressEventTime ()  ;
  /** Returns the most recent query progress update or null if there were no progress updates. */
  public  org.apache.spark.sql.streaming.StreamingQueryProgress lastProgress ()  ;
  public  long lastTriggerStartTimestamp ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan ()  ;
  /** Flag that signals whether any error with input metrics have already been logged */
  public  boolean metricWarningLogged ()  ;
  public  java.lang.String name ()  ;
  public  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.BaseStreamingSource, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> newData ()  ;
  public  long noDataProgressEventInterval ()  ;
  public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata offsetSeqMetadata ()  ;
  public  void postEvent (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  ;
  /** Holds the most recent query progress updates.  Accesses must lock on the queue itself. */
  public  scala.collection.mutable.Queue<org.apache.spark.sql.streaming.StreamingQueryProgress> progressBuffer ()  ;
  /** Returns an array containing the most recent query progress updates. */
  public  org.apache.spark.sql.streaming.StreamingQueryProgress[] recentProgress ()  ;
  /**
   * Record the offsets range this trigger will process. Call this before updating
   * <code>committedOffsets</code> in <code>StreamExecution</code> to make sure that the correct range is recorded.
   * @param from (undocumented)
   * @param to (undocumented)
   */
  public  void recordTriggerOffsets (org.apache.spark.sql.execution.streaming.StreamProgress from, org.apache.spark.sql.execution.streaming.StreamProgress to)  ;
  /** Records the duration of running `body` for the next query progress update. */
  public <T extends java.lang.Object> T reportTimeTaken (java.lang.String triggerDetailKey, scala.Function0<T> body)  ;
  public  java.util.UUID runId ()  ;
  public  org.apache.spark.sql.execution.streaming.BaseStreamingSink sink ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.BaseStreamingSource> sources ()  ;
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
  /** Begins recording statistics about query progress for a given trigger. */
  public  void startTrigger ()  ;
  /** Returns the current status of the query. */
  public  org.apache.spark.sql.streaming.StreamingQueryStatus status ()  ;
  public  java.text.SimpleDateFormat timestampFormat ()  ;
  public  org.apache.spark.util.Clock triggerClock ()  ;
  public  void updateProgress (org.apache.spark.sql.streaming.StreamingQueryProgress newProgress)  ;
  /** Updates the message returned in `status`. */
  public  void updateStatusMessage (java.lang.String message)  ;
}
