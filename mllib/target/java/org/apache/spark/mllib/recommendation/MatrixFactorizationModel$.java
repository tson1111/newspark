package org.apache.spark.mllib.recommendation;
public  class MatrixFactorizationModel$ implements org.apache.spark.mllib.util.Loader<org.apache.spark.mllib.recommendation.MatrixFactorizationModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MatrixFactorizationModel$ MODULE$ = null;
  public   MatrixFactorizationModel$ ()  { throw new RuntimeException(); }
  /**
   * Makes recommendations for a single user (or product).
   * @param recommendToFeatures (undocumented)
   * @param recommendableFeatures (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<java.lang.Object, java.lang.Object>[] recommend (double[] recommendToFeatures, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> recommendableFeatures, int num)  { throw new RuntimeException(); }
  /**
   * Makes recommendations for all users (or products).
   * <p>
   * Note: the previous approach used for computing top-k recommendations aimed to group
   * individual factor vectors into blocks, so that Level 3 BLAS operations (gemm) could
   * be used for efficiency. However, this causes excessive GC pressure due to the large
   * arrays required for intermediate result storage, as well as a high sensitivity to the
   * block size used.
   * <p>
   * The following approach still groups factors into blocks, but instead computes the
   * top-k elements per block, using dot product and an efficient {@link BoundedPriorityQueue}
   * (instead of gemm). This avoids any large intermediate data structures and results
   * in significantly reduced GC pressure as well as shuffle data, which far outweighs
   * any cost incurred from not using Level 3 BLAS operations.
   * <p>
   * @param rank rank
   * @param srcFeatures src features to receive recommendations
   * @param dstFeatures dst features used to make recommendations
   * @param num number of recommendations for each record
   * @return an RDD of (srcId: Int, recommendations), where recommendations are stored as an array
   *         of (dstId, rating) pairs.
   */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.Tuple2<java.lang.Object, java.lang.Object>[]>> recommendForAll (int rank, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> srcFeatures, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> dstFeatures, int num)  { throw new RuntimeException(); }
  /**
   * Blockifies features to improve the efficiency of cartesian product
   * TODO: SPARK-20443 - expose blockSize as a param?
   * @param features (undocumented)
   * @param blockSize (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.rdd.RDD<scala.collection.Seq<scala.Tuple2<java.lang.Object, double[]>>> blockify (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> features, int blockSize)  { throw new RuntimeException(); }
  /**
   * Load a model from the given path.
   * <p>
   * The model should have been saved by <code>Saveable.save</code>.
   * <p>
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
