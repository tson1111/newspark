package org.apache.spark.mllib.clustering;
  class CosineDistanceMeasure extends org.apache.spark.mllib.clustering.DistanceMeasure {
  public   CosineDistanceMeasure ()  { throw new RuntimeException(); }
  /**
   * Returns a centroid for a cluster given its <code>sum</code> vector and its <code>count</code> of points.
   * <p>
   * @param sum   the <code>sum</code> for a cluster
   * @param count the number of points in the cluster
   * @return the centroid of the cluster
   */
  public  org.apache.spark.mllib.clustering.VectorWithNorm centroid (org.apache.spark.mllib.linalg.Vector sum, long count)  { throw new RuntimeException(); }
  /**
   * @return the total cost of the cluster from its aggregated properties
   * @param centroid (undocumented)
   * @param pointsSum (undocumented)
   * @param numberOfPoints (undocumented)
   * @param pointsSquaredNorm (undocumented)
   */
  public  double clusterCost (org.apache.spark.mllib.clustering.VectorWithNorm centroid, org.apache.spark.mllib.clustering.VectorWithNorm pointsSum, long numberOfPoints, double pointsSquaredNorm)  { throw new RuntimeException(); }
  /**
   * @param v1: first vector
   * @param v2: second vector
   * @return the cosine distance between the two input vectors
   */
  public  double distance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2)  { throw new RuntimeException(); }
  /**
   * Returns two new centroids symmetric to the specified centroid applying <code>noise</code> with the
   * with the specified <code>level</code>.
   * <p>
   * @param level the level of <code>noise</code> to apply to the given centroid.
   * @param noise a noise vector
   * @param centroid the parent centroid
   * @return a left and right centroid symmetric to <code>centroid</code>
   */
  public  scala.Tuple2<org.apache.spark.mllib.clustering.VectorWithNorm, org.apache.spark.mllib.clustering.VectorWithNorm> symmetricCentroids (double level, org.apache.spark.mllib.linalg.Vector noise, org.apache.spark.mllib.linalg.Vector centroid)  { throw new RuntimeException(); }
  /**
   * Updates the value of <code>sum</code> adding the <code>point</code> vector.
   * @param point a <code>VectorWithNorm</code> to be added to <code>sum</code> of a cluster
   * @param sum the <code>sum</code> for a cluster to be updated
   */
  public  void updateClusterSum (org.apache.spark.mllib.clustering.VectorWithNorm point, org.apache.spark.mllib.linalg.Vector sum)  { throw new RuntimeException(); }
}
