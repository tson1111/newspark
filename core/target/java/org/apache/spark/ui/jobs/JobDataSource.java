package org.apache.spark.ui.jobs;
  class JobDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.ui.jobs.JobTableRowData> {
  public   JobDataSource (org.apache.spark.status.AppStatusStore store, scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobs, java.lang.String basePath, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.Object> _slicedJobIds ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.ui.jobs.JobTableRowData> data ()  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  private  org.apache.spark.ui.jobs.JobTableRowData jobRow (org.apache.spark.status.api.v1.JobData jobData)  { throw new RuntimeException(); }
  /**
   * Return Ordering according to sortColumn and desc
   * @param sortColumn (undocumented)
   * @param desc (undocumented)
   * @return (undocumented)
   */
  private  scala.math.Ordering<org.apache.spark.ui.jobs.JobTableRowData> ordering (java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.jobs.JobTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
}
