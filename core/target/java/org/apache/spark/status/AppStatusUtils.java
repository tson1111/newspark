package org.apache.spark.status;
public  class AppStatusUtils {
  static private  scala.collection.immutable.Set<java.lang.String> TASK_FINISHED_STATES ()  { throw new RuntimeException(); }
  static private  boolean isTaskFinished (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
  static public  long schedulerDelay (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
  static public  long gettingResultTime (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
  static public  long schedulerDelay (long launchTime, long fetchStart, long duration, long deserializeTime, long serializeTime, long runTime)  { throw new RuntimeException(); }
  static public  long gettingResultTime (long launchTime, long fetchStart, long duration)  { throw new RuntimeException(); }
  static private  long fetchStart (org.apache.spark.status.api.v1.TaskData task)  { throw new RuntimeException(); }
}
