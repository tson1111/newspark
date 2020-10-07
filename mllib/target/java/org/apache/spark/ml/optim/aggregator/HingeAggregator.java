package org.apache.spark.ml.optim.aggregator;
/**
 * HingeAggregator computes the gradient and loss for Hinge loss function as used in
 * binary classification for instances in sparse or dense vector in an online fashion.
 * <p>
 * Two HingeAggregators can be merged together to have a summary of loss and gradient of
 * the corresponding joint dataset.
 * <p>
 * This class standardizes feature values during computation using bcFeaturesStd.
 * <p>
 * param:  bcCoefficients The coefficients corresponding to the features.
 * param:  fitIntercept Whether to fit an intercept term.
 * param:  bcFeaturesStd The standard deviation values of the features.
 */
  class HingeAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.aggregator.HingeAggregator> {
  public   HingeAggregator (org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, boolean fitIntercept, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcCoefficients)  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this HingeAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This HingeAggregator object.
   */
  public  org.apache.spark.ml.optim.aggregator.HingeAggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
  private  double[] coefficientsArray ()  { throw new RuntimeException(); }
  protected  int dim ()  { throw new RuntimeException(); }
  private  int numFeatures ()  { throw new RuntimeException(); }
  private  int numFeaturesPlusIntercept ()  { throw new RuntimeException(); }
}
