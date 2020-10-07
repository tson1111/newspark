package org.apache.spark.deploy.history;
  class AppListingListener extends org.apache.spark.scheduler.SparkListener {
  private  class MutableApplicationInfo {
    public   MutableApplicationInfo ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> coresGranted ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> coresPerExecutor ()  { throw new RuntimeException(); }
    public  java.lang.String id ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> maxCores ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> memoryPerExecutorMB ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.deploy.history.ApplicationInfoWrapper toView ()  { throw new RuntimeException(); }
  }
  private  class MutableAttemptInfo {
    public   MutableAttemptInfo (java.lang.String logPath, long fileSize)  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> adminAcls ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> adminAclsGroups ()  { throw new RuntimeException(); }
    public  java.lang.String appSparkVersion ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
    public  boolean completed ()  { throw new RuntimeException(); }
    public  long duration ()  { throw new RuntimeException(); }
    public  java.util.Date endTime ()  { throw new RuntimeException(); }
    public  java.util.Date lastUpdated ()  { throw new RuntimeException(); }
    public  java.lang.String sparkUser ()  { throw new RuntimeException(); }
    public  java.util.Date startTime ()  { throw new RuntimeException(); }
    public  org.apache.spark.deploy.history.AttemptInfoWrapper toView ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> viewAcls ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> viewAclsGroups ()  { throw new RuntimeException(); }
  }
  public   AppListingListener (org.apache.hadoop.fs.FileStatus log, org.apache.spark.util.Clock clock, boolean haltEnabled)  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.history.AppListingListener.MutableApplicationInfo app ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.ApplicationInfoWrapper> applicationInfo ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.history.AppListingListener.MutableAttemptInfo attempt ()  { throw new RuntimeException(); }
  /**
   * Throws a halt exception to stop replay if enough data to create the app listing has been
   * read.
   */
  private  void checkProgress ()  { throw new RuntimeException(); }
  private  boolean gotEnvUpdate ()  { throw new RuntimeException(); }
  private  boolean halted ()  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd event)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart event)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
}
