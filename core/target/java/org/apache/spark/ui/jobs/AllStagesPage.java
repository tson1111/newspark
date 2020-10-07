package org.apache.spark.ui.jobs;
/** Page showing list of all ongoing and recently finished stages and pools */
  class AllStagesPage extends org.apache.spark.ui.WebUIPage {
  public   AllStagesPage (org.apache.spark.ui.jobs.StagesTab parent)  { throw new RuntimeException(); }
  private  java.lang.String headerDescription (org.apache.spark.status.api.v1.StageStatus status)  { throw new RuntimeException(); }
  private  boolean isFairScheduler ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.SparkContext> sc ()  { throw new RuntimeException(); }
  private  java.lang.String stageTag (org.apache.spark.status.api.v1.StageStatus status)  { throw new RuntimeException(); }
  private  java.lang.String statusName (org.apache.spark.status.api.v1.StageStatus status)  { throw new RuntimeException(); }
  private  java.lang.String subPath ()  { throw new RuntimeException(); }
  private  scala.xml.Elem summary (org.apache.spark.status.AppSummary appSummary, org.apache.spark.status.api.v1.StageStatus status, int size)  { throw new RuntimeException(); }
  private  scala.Tuple2<scala.Option<scala.xml.Elem>, scala.Option<scala.xml.NodeSeq>> summaryAndTableForStatus (scala.collection.Seq<org.apache.spark.status.api.v1.StageData> allStages, org.apache.spark.status.AppSummary appSummary, org.apache.spark.status.api.v1.StageStatus status, javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  private  java.lang.String summaryContent (org.apache.spark.status.AppSummary appSummary, org.apache.spark.status.api.v1.StageStatus status, int size)  { throw new RuntimeException(); }
  private  scala.xml.NodeSeq table (org.apache.spark.status.AppSummary appSummary, org.apache.spark.status.api.v1.StageStatus status, org.apache.spark.ui.jobs.StageTableBase stagesTable, int size)  { throw new RuntimeException(); }
}
