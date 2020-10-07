package org.apache.spark.ml.optim.aggregator;
/**
 * HuberAggregator computes the gradient and loss for a huber loss function,
 * as used in robust regression for samples in sparse or dense vector in an online fashion.
 * <p>
 * The huber loss function based on:
 * <a href="http://statweb.stanford.edu/~owen/reports/hhu.pdf">Art B. Owen (2006),
 * A robust hybrid of lasso and ridge regression</a>.
 * <p>
 * Two HuberAggregator can be merged together to have a summary of loss and gradient of
 * the corresponding joint dataset.
 * <p>
 * The huber loss function is given by
 * <p>
 * <blockquote>
 *   $$
 *   \begin{align}
 *   \min_{w, \sigma}\frac{1}{2n}{\sum_{i=1}^n\left(\sigma +
 *   H_m\left(\frac{X_{i}w - y_{i}}{\sigma}\right)\sigma\right) + \frac{1}{2}\lambda {||w||_2}^2}
 *   \end{align}
 *   $$
 * </blockquote>
 * <p>
 * where
 * <p>
 * <blockquote>
 *   $$
 *   \begin{align}
 *   H_m(z) = \begin{cases}
 *            z^2, &amp; \text {if } |z| &amp;lt; \epsilon, \\
 *            2\epsilon|z| - \epsilon^2, &amp; \text{otherwise}
 *            \end{cases}
 *   \end{align}
 *   $$
 * </blockquote>
 * <p>
 * It is advised to set the parameter $\epsilon$ to 1.35 to achieve 95% statistical efficiency
 * for normally distributed data. Please refer to chapter 2 of
 * <a href="http://statweb.stanford.edu/~owen/reports/hhu.pdf">
 * A robust hybrid of lasso and ridge regression</a> for more detail.
 * <p>
 * param:  fitIntercept Whether to fit an intercept term.
 * param:  epsilon The shape parameter to control the amount of robustness.
 * param:  bcFeaturesStd The broadcast standard deviation values of the features.
 * param:  bcParameters including three parts: the regression coefficients corresponding
 *                     to the features, the intercept (if fitIntercept is ture)
 *                     and the scale parameter (sigma).
 */
  class HuberAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.aggregator.HuberAggregator> {
  public   HuberAggregator (boolean fitIntercept, double epsilon, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcParameters)  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this HuberAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This HuberAggregator object.
   */
  public  org.apache.spark.ml.optim.aggregator.HuberAggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
  protected  int dim ()  { throw new RuntimeException(); }
  private  double intercept ()  { throw new RuntimeException(); }
  private  int numFeatures ()  { throw new RuntimeException(); }
  private  double sigma ()  { throw new RuntimeException(); }
}
