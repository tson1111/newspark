package org.apache.spark.status;
public  class AppStatusUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AppStatusUtils$ MODULE$ = null;
  public   AppStatusUtils$ ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> TASK_FINISHED_STATES ()  { throw new RuntimeException(); }
  private  boolean isTaskFinished (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
  public  long schedulerDelay (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
  public  long gettingResultTime (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
  public  long schedulerDelay (long launchTime, long fetchStart, long duration, long deserializeTime, long serializeTime, long runTime)  { throw new RuntimeException(); }
  public  long gettingResultTime (long launchTime, long fetchStart, long duration)  { throw new RuntimeException(); }
  private  long fetchStart (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
}
