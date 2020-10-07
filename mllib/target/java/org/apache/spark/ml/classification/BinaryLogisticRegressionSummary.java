package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Abstraction for binary logistic regression results for a given model.
 * <p>
 * Currently, the summary ignores the instance weights.
 */
public  interface BinaryLogisticRegressionSummary extends org.apache.spark.ml.classification.LogisticRegressionSummary {
  /**
   * Computes the area under the receiver operating characteristic (ROC) curve.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double areaUnderROC ()  ;
  public  org.apache.spark.mllib.evaluation.BinaryClassificationMetrics binaryMetrics ()  ;
  /**
   * Returns a dataframe with two fields (threshold, F-Measure) curve with beta = 1.0.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fMeasureByThreshold ()  ;
  /**
   * Returns the precision-recall curve, which is a Dataframe containing
   * two fields recall, precision with (0.0, 1.0) prepended to it.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> pr ()  ;
  /**
   * Returns a dataframe with two fields (threshold, precision) curve.
   * Every possible probability obtained in transforming the dataset are used
   * as thresholds used in calculating the precision.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> precisionByThreshold ()  ;
  /**
   * Returns a dataframe with two fields (threshold, recall) curve.
   * Every possible probability obtained in transforming the dataset are used
   * as thresholds used in calculating the recall.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recallByThreshold ()  ;
  /**
   * Returns the receiver operating characteristic (ROC) curve,
   * which is a Dataframe having two fields (FPR, TPR)
   * with (0.0, 0.0) prepended and (1.0, 1.0) appended to it.
   * See http://en.wikipedia.org/wiki/Receiver_operating_characteristic
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> roc ()  ;
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
}
