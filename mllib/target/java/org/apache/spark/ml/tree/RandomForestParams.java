package org.apache.spark.ml.tree;
/**
 * Parameters for Random Forest algorithms.
 */
  interface RandomForestParams extends org.apache.spark.ml.tree.TreeEnsembleParams {
  /** @group getParam */
  public  int getNumTrees ()  ;
  /**
   * Number of trees to train (>= 1).
   * If 1, then no bootstrapping is used.  If > 1, then bootstrapping is done.
   * TODO: Change to always do bootstrapping (simpler).  SPARK-7130
   * (default = 20)
   * <p>
   * Note: The reason that we cannot add this to both GBT and RF (i.e. in TreeEnsembleParams)
   * is the param <code>maxIter</code> controls how many trees a GBT has. The semantics in the algorithms
   * are a bit different.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numTrees ()  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.RandomForestParams setNumTrees (int value)  ;
}
