package org.apache.spark.ui.jobs;
/** Page showing statistics and task list for a given stage */
  class StagePage extends org.apache.spark.ui.WebUIPage {
  private  int MAX_TIMELINE_TASKS ()  { throw new RuntimeException(); }
  public   StagePage (org.apache.spark.ui.jobs.StagesTab parent, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  private  scala.xml.Elem TIMELINE_LEGEND ()  { throw new RuntimeException(); }
  private  java.lang.String getLocalitySummaryString (scala.collection.immutable.Map<java.lang.String, java.lang.Object> localitySummary)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> makeTimeline (scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> tasks, long currentTime)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}
