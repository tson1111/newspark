package org.apache.spark.sql.execution.metric;
public  class SQLMetrics$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SQLMetrics$ MODULE$ = null;
  public   SQLMetrics$ ()  { throw new RuntimeException(); }
  private  java.lang.String SUM_METRIC ()  { throw new RuntimeException(); }
  private  java.lang.String SIZE_METRIC ()  { throw new RuntimeException(); }
  private  java.lang.String TIMING_METRIC ()  { throw new RuntimeException(); }
  private  java.lang.String AVERAGE_METRIC ()  { throw new RuntimeException(); }
  private  int baseForAvgMetric ()  { throw new RuntimeException(); }
  /**
   * Converts a double value to long value by multiplying a base integer, so we can store it in
   * <code>SQLMetrics</code>. It only works for average metrics. When showing the metrics on UI, we restore
   * it back to a double value up to the decimal places bound by the base integer.
   * @param metric (undocumented)
   * @param v (undocumented)
   */
    void setDoubleForAverageMetrics (org.apache.spark.sql.execution.metric.SQLMetric metric, double v)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.metric.SQLMetric createMetric (org.apache.spark.SparkContext sc, java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Create a metric to report the size information (including total, min, med, max) like data size,
   * spill size, etc.
   * @param sc (undocumented)
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.metric.SQLMetric createSizeMetric (org.apache.spark.SparkContext sc, java.lang.String name)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.metric.SQLMetric createTimingMetric (org.apache.spark.SparkContext sc, java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Create a metric to report the average information (including min, med, max) like
   * avg hash probe. As average metrics are double values, this kind of metrics should be
   * only set with <code>SQLMetric.set</code> method instead of other methods like <code>SQLMetric.add</code>.
   * The initial values (zeros) of this metrics will be excluded after.
   * @param sc (undocumented)
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.metric.SQLMetric createAverageMetric (org.apache.spark.SparkContext sc, java.lang.String name)  { throw new RuntimeException(); }
  /**
   * A function that defines how we aggregate the final accumulator results among all tasks,
   * and represent it in string for a SQL physical operator.
   * @param metricsType (undocumented)
   * @param values (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String stringValue (java.lang.String metricsType, scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
  /**
   * Updates metrics based on the driver side value. This is useful for certain metrics that
   * are only updated on the driver, e.g. subquery execution time, or number of files.
   * @param sc (undocumented)
   * @param executionId (undocumented)
   * @param metrics (undocumented)
   */
  public  void postDriverMetricUpdates (org.apache.spark.SparkContext sc, java.lang.String executionId, scala.collection.Seq<org.apache.spark.sql.execution.metric.SQLMetric> metrics)  { throw new RuntimeException(); }
}