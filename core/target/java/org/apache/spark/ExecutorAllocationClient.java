package org.apache.spark;
/**
 * A client that communicates with the cluster manager to request or kill executors.
 * This is currently supported only in YARN mode.
 */
  interface ExecutorAllocationClient {
  /** Get the list of currently active executors */
    scala.collection.Seq<java.lang.String> getExecutorIds ()  ;
  /**
   * Request that the cluster manager kill the specified executor.
   * @return whether the request is acknowledged by the cluster manager.
   * @param executorId (undocumented)
   */
  public  boolean killExecutor (java.lang.String executorId)  ;
  /**
   * Request that the cluster manager kill the specified executors.
   * <p>
   * @param executorIds identifiers of executors to kill
   * @param adjustTargetNumExecutors whether the target number of executors will be adjusted down
   *                                 after these executors have been killed
   * @param countFailures if there are tasks running on the executors when they are killed, whether
   *                     to count those failures toward task failure limits
   * @param force whether to force kill busy executors, default false
   * @return the ids of the executors acknowledged by the cluster manager to be removed.
   */
  public  scala.collection.Seq<java.lang.String> killExecutors (scala.collection.Seq<java.lang.String> executorIds, boolean adjustTargetNumExecutors, boolean countFailures, boolean force)  ;
  /**
   * Request that the cluster manager kill every executor on the specified host.
   * <p>
   * @return whether the request is acknowledged by the cluster manager.
   * @param host (undocumented)
   */
  public  boolean killExecutorsOnHost (java.lang.String host)  ;
  /**
   * Request an additional number of executors from the cluster manager.
   * @return whether the request is acknowledged by the cluster manager.
   * @param numAdditionalExecutors (undocumented)
   */
  public  boolean requestExecutors (int numAdditionalExecutors)  ;
  /**
   * Update the cluster manager on our scheduling needs. Three bits of information are included
   * to help it make decisions.
   * @param numExecutors The total number of executors we'd like to have. The cluster manager
   *                     shouldn't kill any running executor to reach this number, but,
   *                     if all existing executors were to die, this is the number of executors
   *                     we'd want to be allocated.
   * @param localityAwareTasks The number of tasks in all active stages that have a locality
   *                           preferences. This includes running, pending, and completed tasks.
   * @param hostToLocalTaskCount A map of hosts to the number of tasks from all active stages
   *                             that would like to like to run on that host.
   *                             This includes running, pending, and completed tasks.
   * @return whether the request is acknowledged by the cluster manager.
   */
    boolean requestTotalExecutors (int numExecutors, int localityAwareTasks, scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount)  ;
}
