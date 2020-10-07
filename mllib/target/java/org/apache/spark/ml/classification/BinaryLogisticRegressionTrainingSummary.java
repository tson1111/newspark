package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Abstraction for binary logistic regression training results.
 * Currently, the training summary ignores the training weights except
 * for the objective trace.
 */
public  interface BinaryLogisticRegressionTrainingSummary extends org.apache.spark.ml.classification.BinaryLogisticRegressionSummary, org.apache.spark.ml.classification.LogisticRegressionTrainingSummary {
}
