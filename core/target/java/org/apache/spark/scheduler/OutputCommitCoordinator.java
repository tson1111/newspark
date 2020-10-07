package org.apache.spark.scheduler;
/**
 * Authority that decides whether tasks can commit output to HDFS. Uses a "first committer wins"
 * policy.
 * <p>
 * OutputCommitCoordinator is instantiated in both the drivers and executors. On executors, it is
 * configured with a reference to the driver's OutputCommitCoordinatorEndpoint, so requests to
 * commit output will be forwarded to the driver's OutputCommitCoordinator.
 * <p>
 * This class was introduced in SPARK-4879; see that JIRA issue (and the associated pull requests)
 * for an extensive design discussion.
 */
  class OutputCommitCoordinator implements org.apache.spark.internal.Logging {
  private  class TaskIdentifier implements scala.Product, scala.Serializable {
    public  int stageAttempt ()  { throw new RuntimeException(); }
    public  int taskAttempt ()  { throw new RuntimeException(); }
    // not preceding
    public   TaskIdentifier (int stageAttempt, int taskAttempt)  { throw new RuntimeException(); }
  }
  private  class TaskIdentifier$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.scheduler.OutputCommitCoordinator.TaskIdentifier> implements scala.Serializable {
    public   TaskIdentifier$ ()  { throw new RuntimeException(); }
  }
  private  class StageState implements scala.Product, scala.Serializable {
    public  int numPartitions ()  { throw new RuntimeException(); }
    // not preceding
    public   StageState (int numPartitions)  { throw new RuntimeException(); }
    public  org.apache.spark.scheduler.OutputCommitCoordinator.TaskIdentifier[] authorizedCommitters ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.Map<java.lang.Object, scala.collection.mutable.Set<org.apache.spark.scheduler.OutputCommitCoordinator.TaskIdentifier>> failures ()  { throw new RuntimeException(); }
  }
  private  class StageState$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.scheduler.OutputCommitCoordinator.StageState> implements scala.Serializable {
    public   StageState$ ()  { throw new RuntimeException(); }
  }
  static   class OutputCommitCoordinatorEndpoint implements org.apache.spark.rpc.RpcEndpoint, org.apache.spark.internal.Logging {
    // not preceding
    public   OutputCommitCoordinatorEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator)  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  }
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
  public   OutputCommitCoordinator (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rpc.RpcEndpointRef> coordinatorRef ()  { throw new RuntimeException(); }
  /**
   * Map from active stages's id =&gt; authorized task attempts for each partition id, which hold an
   * exclusive lock on committing task output for that partition, as well as any known failed
   * attempts in the stage.
   * <p>
   * Entries are added to the top-level map when stages start and are removed they finish
   * (either successfully or unsuccessfully).
   * <p>
   * Access to this map should be guarded by synchronizing on the OutputCommitCoordinator instance.
   * @return (undocumented)
   */
  private  scala.collection.mutable.Map<java.lang.Object, org.apache.spark.scheduler.OutputCommitCoordinator.StageState> stageStates ()  { throw new RuntimeException(); }
  /**
   * Returns whether the OutputCommitCoordinator's internal data structures are all empty.
   * @return (undocumented)
   */
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  /**
   * Called by tasks to ask whether they can commit their output to HDFS.
   * <p>
   * If a task attempt has been authorized to commit, then all other attempts to commit the same
   * task will be denied.  If the authorized task attempt fails (e.g. due to its executor being
   * lost), then a subsequent task attempt may be authorized to commit its output.
   * <p>
   * @param stage the stage number
   * @param partition the partition number
   * @param attemptNumber how many times this task has been attempted
   *                      (see {@link TaskContext.attemptNumber()})
   * @return true if this task is authorized to commit, false otherwise
   * @param stageAttempt (undocumented)
   */
  public  boolean canCommit (int stage, int stageAttempt, int partition, int attemptNumber)  { throw new RuntimeException(); }
  /**
   * Called by the DAGScheduler when a stage starts. Initializes the stage's state if it hasn't
   * yet been initialized.
   * <p>
   * @param stage the stage id.
   * @param maxPartitionId the maximum partition id that could appear in this stage's tasks (i.e.
   *                       the maximum possible value of <code>context.partitionId</code>).
   */
    void stageStart (int stage, int maxPartitionId)  { throw new RuntimeException(); }
    void stageEnd (int stage)  { throw new RuntimeException(); }
    void taskCompleted (int stage, int stageAttempt, int partition, int attemptNumber, org.apache.spark.TaskEndReason reason)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
    boolean handleAskPermissionToCommit (int stage, int stageAttempt, int partition, int attemptNumber)  { throw new RuntimeException(); }
  private  boolean attemptFailed (org.apache.spark.scheduler.OutputCommitCoordinator.StageState stageState, int stageAttempt, int partition, int attempt)  { throw new RuntimeException(); }
}
