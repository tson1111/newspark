package org.apache.spark.ml.evaluation;
 abstract class Silhouette {
  public   Silhouette ()  { throw new RuntimeException(); }
  protected  int getNumberOfFeatures (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataFrame, java.lang.String columnName)  { throw new RuntimeException(); }
  /**
   * Compute the mean Silhouette values of all samples.
   * @param df (undocumented)
   * @param scoreColumn (undocumented)
   * @return (undocumented)
   */
  public  double overallScore (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.Column scoreColumn)  { throw new RuntimeException(); }
  /**
   * It computes the Silhouette coefficient for a point.
   * @param clusterIds (undocumented)
   * @param pointClusterId (undocumented)
   * @param pointClusterNumOfPoints (undocumented)
   * @param averageDistanceToCluster (undocumented)
   * @return (undocumented)
   */
  public  double pointSilhouetteCoefficient (scala.collection.immutable.Set<java.lang.Object> clusterIds, double pointClusterId, long pointClusterNumOfPoints, scala.Function1<java.lang.Object, java.lang.Object> averageDistanceToCluster)  { throw new RuntimeException(); }
}
