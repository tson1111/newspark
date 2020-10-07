package org.apache.spark.ml.tree;
/**
 * Parameters for Decision Tree-based algorithms.
 * <p>
 * Note: Marked as private and DeveloperApi since this may be made public in the future.
 */
  interface DecisionTreeParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasCheckpointInterval, org.apache.spark.ml.param.shared.HasSeed {
  /**
   * If false, the algorithm will pass trees to executors to match instances with nodes.
   * If true, the algorithm will cache node IDs for each instance.
   * Caching can speed up training of deeper trees. Users can set how often should the
   * cache be checkpointed or disable it by setting checkpointInterval.
   * (default = false)
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam cacheNodeIds ()  ;
  /** @group expertGetParam */
  public  boolean getCacheNodeIds ()  ;
  /** @group getParam */
  public  int getMaxBins ()  ;
  /** @group getParam */
  public  int getMaxDepth ()  ;
  /** @group expertGetParam */
  public  int getMaxMemoryInMB ()  ;
  /** @group getParam */
  public  double getMinInfoGain ()  ;
  /** @group getParam */
  public  int getMinInstancesPerNode ()  ;
  /** (private[ml]) Create a Strategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, scala.Enumeration.Value oldAlgo, org.apache.spark.mllib.tree.impurity.Impurity oldImpurity, double subsamplingRate)  ;
  /**
   * Maximum number of bins used for discretizing continuous features and for choosing how to split
   * on features at each node.  More bins give higher granularity.
   * Must be >= 2 and >= number of categories in any categorical feature.
   * (default = 32)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxBins ()  ;
  /**
   * Maximum depth of the tree (>= 0).
   * E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   * (default = 5)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxDepth ()  ;
  /**
   * Maximum memory in MB allocated to histogram aggregation. If too small, then 1 node will be
   * split per iteration, and its aggregates may exceed this size.
   * (default = 256 MB)
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxMemoryInMB ()  ;
  /**
   * Minimum information gain for a split to be considered at a tree node.
   * Should be >= 0.0.
   * (default = 0.0)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minInfoGain ()  ;
  /**
   * Minimum number of instances each child must have after split.
   * If a split causes the left or right child to have fewer than minInstancesPerNode,
   * the split will be discarded as invalid.
   * Should be >= 1.
   * (default = 1)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam minInstancesPerNode ()  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeParams setCacheNodeIds (boolean value)  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeParams setCheckpointInterval (int value)  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeParams setMaxBins (int value)  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeParams setMaxDepth (int value)  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeParams setMaxMemoryInMB (int value)  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeParams setMinInfoGain (double value)  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeParams setMinInstancesPerNode (int value)  ;
  /**
   * @deprecated This method is deprecated and will be removed in 3.0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeParams setSeed (long value)  ;
}
