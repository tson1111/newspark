package org.apache.spark.mllib.clustering;
 abstract class DistanceMeasure implements scala.Serializable {
  static public  java.lang.String EUCLIDEAN ()  { throw new RuntimeException(); }
  static public  java.lang.String COSINE ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.clustering.DistanceMeasure decodeFromString (java.lang.String distanceMeasure)  { throw new RuntimeException(); }
  static   boolean validateDistanceMeasure (java.lang.String distanceMeasure)  { throw new RuntimeException(); }
  public   DistanceMeasure ()  { throw new RuntimeException(); }
  /**
   * @return the index of the closest center to the given point, as well as the cost.
   * @param centers (undocumented)
   * @param point (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point)  { throw new RuntimeException(); }
  /**
   * @return the K-means cost of a given point against the given cluster centers.
   * @param centers (undocumented)
   * @param point (undocumented)
   */
  public  double pointCost (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point)  { throw new RuntimeException(); }
  /**
   * @return whether a center converged or not, given the epsilon parameter.
   * @param oldCenter (undocumented)
   * @param newCenter (undocumented)
   * @param epsilon (undocumented)
   */
  public  boolean isCenterConverged (org.apache.spark.mllib.clustering.VectorWithNorm oldCenter, org.apache.spark.mllib.clustering.VectorWithNorm newCenter, double epsilon)  { throw new RuntimeException(); }
  /**
   * @return the distance between two points.
   * @param v1 (undocumented)
   * @param v2 (undocumented)
   */
  public abstract  double distance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2)  ;
  /**
   * @return the total cost of the cluster from its aggregated properties
   * @param centroid (undocumented)
   * @param pointsSum (undocumented)
   * @param numberOfPoints (undocumented)
   * @param pointsSquaredNorm (undocumented)
   */
  public abstract  double clusterCost (org.apache.spark.mllib.clustering.VectorWithNorm centroid, org.apache.spark.mllib.clustering.VectorWithNorm pointsSum, long numberOfPoints, double pointsSquaredNorm)  ;
  /**
   * Updates the value of <code>sum</code> adding the <code>point</code> vector.
   * @param point a <code>VectorWithNorm</code> to be added to <code>sum</code> of a cluster
   * @param sum the <code>sum</code> for a cluster to be updated
   */
  public  void updateClusterSum (org.apache.spark.mllib.clustering.VectorWithNorm point, org.apache.spark.mllib.linalg.Vector sum)  { throw new RuntimeException(); }
  /**
   * Returns a centroid for a cluster given its <code>sum</code> vector and its <code>count</code> of points.
   * <p>
   * @param sum   the <code>sum</code> for a cluster
   * @param count the number of points in the cluster
   * @return the centroid of the cluster
   */
  public  org.apache.spark.mllib.clustering.VectorWithNorm centroid (org.apache.spark.mllib.linalg.Vector sum, long count)  { throw new RuntimeException(); }
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
   * @return the cost of a point to be assigned to the cluster centroid
   * @param point (undocumented)
   * @param centroid (undocumented)
   */
  public  double cost (org.apache.spark.mllib.clustering.VectorWithNorm point, org.apache.spark.mllib.clustering.VectorWithNorm centroid)  { throw new RuntimeException(); }
}
