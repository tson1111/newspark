package org.apache.spark.ui.jobs;
/** Table showing list of pools */
  class PoolTable {
  public   PoolTable (scala.collection.immutable.Map<org.apache.spark.scheduler.Schedulable, org.apache.spark.status.PoolData> pools, org.apache.spark.ui.jobs.StagesTab parent)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> poolRow (javax.servlet.http.HttpServletRequest request, org.apache.spark.scheduler.Schedulable s, org.apache.spark.status.PoolData p)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> toNodeSeq (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}
