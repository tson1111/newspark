package org.apache.spark.scheduler;
/**
 * An interface for schedulable entities.
 * there are two type of Schedulable entities(Pools and TaskSetManagers)
 */
  interface Schedulable {
  public  void addSchedulable (org.apache.spark.scheduler.Schedulable schedulable)  ;
  public  boolean checkSpeculatableTasks (int minTimeToSpeculation)  ;
  public  void executorLost (java.lang.String executorId, java.lang.String host, org.apache.spark.scheduler.ExecutorLossReason reason)  ;
  public  org.apache.spark.scheduler.Schedulable getSchedulableByName (java.lang.String name)  ;
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.scheduler.TaskSetManager> getSortedTaskSetQueue ()  ;
  public  int minShare ()  ;
  public  java.lang.String name ()  ;
  public  org.apache.spark.scheduler.Pool parent ()  ;
  public  int priority ()  ;
  public  void removeSchedulable (org.apache.spark.scheduler.Schedulable schedulable)  ;
  public  int runningTasks ()  ;
  public  java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.scheduler.Schedulable> schedulableQueue ()  ;
  public  scala.Enumeration.Value schedulingMode ()  ;
  public  int stageId ()  ;
  public  int weight ()  ;
}
