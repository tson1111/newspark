package org.apache.spark.sql.execution.ui;
public  class ExecutionPage extends org.apache.spark.ui.WebUIPage implements org.apache.spark.internal.Logging {
  public   ExecutionPage (org.apache.spark.sql.execution.ui.SQLTab parent)  { throw new RuntimeException(); }
  private  java.lang.String jobURL (javax.servlet.http.HttpServletRequest request, long jobId)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> physicalPlanDescription (java.lang.String physicalPlanDescription)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> planVisualization (javax.servlet.http.HttpServletRequest request, scala.collection.immutable.Map<java.lang.Object, java.lang.String> metrics, org.apache.spark.sql.execution.ui.SparkPlanGraph graph)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> planVisualizationResources (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.ui.SQLAppStatusStore sqlStore ()  { throw new RuntimeException(); }
}
