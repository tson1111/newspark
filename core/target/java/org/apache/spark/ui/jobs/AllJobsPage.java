package org.apache.spark.ui.jobs;
/** Page showing list of all ongoing and recently finished jobs */
  class AllJobsPage extends org.apache.spark.ui.WebUIPage {
  public   AllJobsPage (org.apache.spark.ui.jobs.JobsTab parent, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  private  java.lang.String EXECUTORS_LEGEND ()  { throw new RuntimeException(); }
  private  java.lang.String JOBS_LEGEND ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> jobsTable (javax.servlet.http.HttpServletRequest request, java.lang.String tableHeaderId, java.lang.String jobTag, scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobs, boolean killEnabled)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> makeExecutorEvent (scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executors)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> makeJobEvent (scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobs)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> makeTimeline (scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobs, scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executors, long startTime)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}
