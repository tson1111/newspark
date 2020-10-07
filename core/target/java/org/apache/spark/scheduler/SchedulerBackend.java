package org.apache.spark.scheduler;
/**
 * A backend interface for scheduling systems that allows plugging in different ones under
 * TaskSchedulerImpl. We assume a Mesos-like model where the application gets resource offers as
 * machines become available and can launch tasks on them.
 */
  interface SchedulerBackend {
  public  java.lang.String appId ()  ;
  /**
   * Get the attempt ID for this run, if the cluster manager supports multiple
   * attempts. Applications run in client mode will not have attempt IDs.
   * <p>
   * @return The application attempt id, if available.
   */
  public  scala.Option<java.lang.String> applicationAttemptId ()  ;
  /**
   * Get an application ID associated with the job.
   * <p>
   * @return An application ID
   */
  public  java.lang.String applicationId ()  ;
  public  int defaultParallelism ()  ;
  /**
   * Get the URLs for the driver logs. These URLs are used to display the links in the UI
   * Executors tab for the driver.
   * @return Map containing the log names and their respective URLs
   */
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> getDriverLogUrls ()  ;
  public  boolean isReady ()  ;
  /**
   * Requests that an executor kills a running task.
   * <p>
   * @param taskId Id of the task.
   * @param executorId Id of the executor the task is running on.
   * @param interruptThread Whether the executor should interrupt the task thread.
   * @param reason The reason for the task kill.
   */
  public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread, java.lang.String reason)  ;
  /**
   * Get the max number of tasks that can be concurrent launched currently.
   * Note that please don't cache the value returned by this method, because the number can change
   * due to add/remove executors.
   * <p>
   * @return The max number of tasks that can be concurrent launched currently.
   */
  public  int maxNumConcurrentTasks ()  ;
  public  void reviveOffers ()  ;
  public  void start ()  ;
  public  void stop ()  ;
}
