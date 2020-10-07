package org.apache.spark.sql.execution.exchange;
/**
 * Ensures that the {@link org.apache.spark.sql.catalyst.plans.physical.Partitioning Partitioning}
 * of input data meets the
 * {@link org.apache.spark.sql.catalyst.plans.physical.Distribution Distribution} requirements for
 * each operator by inserting {@link ShuffleExchangeExec} Operators where required.  Also ensure that
 * the input partition ordering requirements are met.
 */
public  class EnsureRequirements extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   EnsureRequirements (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  private  int defaultNumPreShufflePartitions ()  { throw new RuntimeException(); }
  private  long targetPostShuffleInputSize ()  { throw new RuntimeException(); }
  private  boolean adaptiveExecutionEnabled ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> minNumPostShufflePartitions ()  { throw new RuntimeException(); }
  /**
   * Adds {@link ExchangeCoordinator} to {@link ShuffleExchangeExec}s if adaptive query execution is enabled
   * and partitioning schemes of these {@link ShuffleExchangeExec}s support {@link ExchangeCoordinator}.
   * @param children (undocumented)
   * @param requiredChildDistributions (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> withExchangeCoordinator (scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistributions)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.SparkPlan ensureDistributionAndOrdering (org.apache.spark.sql.execution.SparkPlan operator)  { throw new RuntimeException(); }
  private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> reorder (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expectedOrderOfKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> currentOrderOfKeys)  { throw new RuntimeException(); }
  private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> reorderJoinKeys (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, org.apache.spark.sql.catalyst.plans.physical.Partitioning leftPartitioning, org.apache.spark.sql.catalyst.plans.physical.Partitioning rightPartitioning)  { throw new RuntimeException(); }
  /**
   * When the physical operators are created for JOIN, the ordering of join keys is based on order
   * in which the join keys appear in the user query. That might not match with the output
   * partitioning of the join node's children (thus leading to extra sort / shuffle being
   * introduced). This rule will change the ordering of the join keys to match with the
   * partitioning of the join nodes' children.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.SparkPlan reorderJoinPredicates (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
