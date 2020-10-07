package org.apache.spark.ui.jobs;
/** Page showing statistics and stage list for a given job */
  class JobPage extends org.apache.spark.ui.WebUIPage {
  private  java.lang.String EXECUTORS_LEGEND ()  { throw new RuntimeException(); }
  public   JobPage (org.apache.spark.ui.jobs.JobsTab parent, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  private  java.lang.String STAGES_LEGEND ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> makeExecutorEvent (scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executors)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> makeStageEvent (scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageInfos)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> makeTimeline (scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stages, scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executors, long appStartTime)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}
