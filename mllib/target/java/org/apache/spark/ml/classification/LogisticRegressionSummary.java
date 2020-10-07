package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Abstraction for logistic regression results for a given model.
 * <p>
 * Currently, the summary ignores the instance weights.
 */
public  interface LogisticRegressionSummary extends scala.Serializable {
  /**
   * Returns accuracy.
   * (equals to the total number of correctly classified instances
   * out of the total number of instances.)
   * @return (undocumented)
   */
  public  double accuracy ()  ;
  /**
   * Convenient method for casting to binary logistic regression summary.
   * This method will throw an Exception if the summary is not a binary summary.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.BinaryLogisticRegressionSummary asBinary ()  ;
  /** Returns f-measure for each label (category). */
  public  double[] fMeasureByLabel (double beta)  ;
  /** Returns f1-measure for each label (category). */
  public  double[] fMeasureByLabel ()  ;
  /** Returns false positive rate for each label (category). */
  public  double[] falsePositiveRateByLabel ()  ;
  /** Field in "predictions" which gives the features of each instance as a vector. */
  public  java.lang.String featuresCol ()  ;
  /** Field in "predictions" which gives the true label of each instance (if available). */
  public  java.lang.String labelCol ()  ;
  /**
   * Returns the sequence of labels in ascending order. This order matches the order used
   * in metrics which are specified as arrays over labels, e.g., truePositiveRateByLabel.
   * <p>
   * Note: In most cases, it will be values {0.0, 1.0, ..., numClasses-1}, However, if the
   * training set is missing a label, then all of the arrays over labels
   * (e.g., from truePositiveRateByLabel) will be of length numClasses-1 instead of the
   * expected numClasses.
   * @return (undocumented)
   */
  public  double[] labels ()  ;
  public  org.apache.spark.mllib.evaluation.MulticlassMetrics multiclassMetrics ()  ;
  /** Returns precision for each label (category). */
  public  double[] precisionByLabel ()  ;
  /** Field in "predictions" which gives the prediction of each class. */
  public  java.lang.String predictionCol ()  ;
  /**
   * Dataframe output by the model's <code>transform</code> method.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  ;
  /** Field in "predictions" which gives the probability of each class as a vector. */
  public  java.lang.String probabilityCol ()  ;
  /** Returns recall for each label (category). */
  public  double[] recallByLabel ()  ;
  /** Returns true positive rate for each label (category). */
  public  double[] truePositiveRateByLabel ()  ;
  /** Returns weighted averaged f-measure. */
  public  double weightedFMeasure (double beta)  ;
  /** Returns weighted averaged f1-measure. */
  public  double weightedFMeasure ()  ;
  /** Returns weighted false positive rate. */
  public  double weightedFalsePositiveRate ()  ;
  /** Returns weighted averaged precision. */
  public  double weightedPrecision ()  ;
  /**
   * Returns weighted averaged recall.
   * (equals to precision, recall and f-measure)
   * @return (undocumented)
   */
  public  double weightedRecall ()  ;
  /**
   * Returns weighted true positive rate.
   * (equals to precision, recall and f-measure)
   * @return (undocumented)
   */
  public  double weightedTruePositiveRate ()  ;
}
