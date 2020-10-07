package org.apache.spark.sql.execution;
/**
 * The base class for physical operators.
 * <p>
 * The naming convention is that physical operators end with "Exec" suffix, e.g. {@link ProjectExec}.
 */
public abstract class SparkPlan extends org.apache.spark.sql.catalyst.plans.QueryPlan<org.apache.spark.sql.execution.SparkPlan> implements org.apache.spark.internal.Logging, scala.Serializable {
  static   scala.concurrent.ExecutionContextExecutorService subqueryExecutionContext ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.Origin origin ()  { throw new RuntimeException(); }
  static public abstract  scala.collection.Seq<BaseType> children ()  ;
  static public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.trees.TreeNode<?>> containsChild ()  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean fastEquals (org.apache.spark.sql.catalyst.trees.TreeNode<?> other)  { throw new RuntimeException(); }
  static public  scala.Option<BaseType> find (scala.Function1<BaseType, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachUp (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> map (scala.Function1<BaseType, A> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> flatMap (scala.Function1<BaseType, scala.collection.TraversableOnce<A>> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collect (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<BaseType> collectLeaves ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static protected <B extends java.lang.Object> java.lang.Object mapProductIterator (scala.Function1<java.lang.Object, B> f, scala.reflect.ClassTag<B> evidence$1)  { throw new RuntimeException(); }
  static public  BaseType withNewChildren (scala.collection.Seq<BaseType> newChildren)  { throw new RuntimeException(); }
  static public  BaseType transform (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformDown (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformUp (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType mapChildren (scala.Function1<BaseType, BaseType> f)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String argString ()  { throw new RuntimeException(); }
  static public  java.lang.String verboseStringWithSuffix ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString (boolean verbose, boolean addSuffix)  { throw new RuntimeException(); }
  static public  java.lang.String numberedTreeString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.TreeNode<?> apply (int number)  { throw new RuntimeException(); }
  static public  BaseType p (int number)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.collection.mutable.StringBuilder builder, boolean verbose, java.lang.String prefix, boolean addSuffix)  { throw new RuntimeException(); }
  static public  java.lang.String asCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toJSON ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> jsonFields ()  { throw new RuntimeException(); }
  static public  boolean treeString$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String generateTreeString$default$5 ()  { throw new RuntimeException(); }
  static public  boolean generateTreeString$default$6 ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  static public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet inputSet ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsDown (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsUp (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> mapExpressions (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformAllExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  static public  java.lang.String schemaString ()  { throw new RuntimeException(); }
  static public  void printSchema ()  { throw new RuntimeException(); }
  static protected  java.lang.String statePrefix ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<PlanType> subqueries ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  { throw new RuntimeException(); }
  static protected  boolean isCanonicalizedPlan ()  { throw new RuntimeException(); }
  static public final  PlanType canonicalized ()  { throw new RuntimeException(); }
  static protected  PlanType doCanonicalize ()  { throw new RuntimeException(); }
  static public final  boolean sameResult (PlanType other)  { throw new RuntimeException(); }
  static public final  int semanticHash ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSeq allAttributes ()  { throw new RuntimeException(); }
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
  public   SparkPlan ()  { throw new RuntimeException(); }
  /**
   * A handle to the SQL Context that was used to create this plan. Since many operators need
   * access to the sqlContext for RDD operations or configuration this field is automatically
   * populated by the query planning infrastructure.
   * @return (undocumented)
   */
  public final  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  protected  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  public  boolean subexpressionEliminationEnabled ()  { throw new RuntimeException(); }
  private  boolean codeGenFallBack ()  { throw new RuntimeException(); }
  /** Overridden make copy also propagates sqlContext to copied plan. */
  public  org.apache.spark.sql.execution.SparkPlan makeCopy (java.lang.Object[] newArgs)  { throw new RuntimeException(); }
  /**
   * @return All metrics containing metrics of this SparkPlan.
   */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  /**
   * Resets all the metrics.
   */
  public  void resetMetrics ()  { throw new RuntimeException(); }
  /**
   * @return {@link SQLMetric} for the <code>name</code>.
   * @param name (undocumented)
   */
  public  org.apache.spark.sql.execution.metric.SQLMetric longMetric (java.lang.String name)  { throw new RuntimeException(); }
  /** Specifies how data is partitioned across different nodes in the cluster. */
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  /**
   * Specifies the data distribution requirements of all the children for this operator. By default
   * it's {@link UnspecifiedDistribution} for each child, which means each child can have any
   * distribution.
   * <p>
   * If an operator overwrites this method, and specifies distribution requirements(excluding
   * {@link UnspecifiedDistribution} and {@link BroadcastDistribution}) for more than one child, Spark
   * guarantees that the outputs of these children will have same number of partitions, so that the
   * operator can safely zip partitions of these children's result RDDs. Some operators can leverage
   * this guarantee to satisfy some interesting requirement, e.g., non-broadcast joins can specify
   * HashClusteredDistribution(a,b) for its left child, and specify HashClusteredDistribution(c,d)
   * for its right child, then it's guaranteed that left and right child are co-partitioned by
   * a,b/c,d, which means tuples of same value are in the partitions of same index, e.g.,
   * (a=1,b=2) and (c=1,d=2) are both in the second partition of left and right child.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  /** Specifies how data is ordered in each partition. */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  /** Specifies sort order for each partition requirements on the input data for this operator. */
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering ()  { throw new RuntimeException(); }
  /**
   * Returns the result of this query as an RDD[InternalRow] by delegating to <code>doExecute</code> after
   * preparations.
   * <p>
   * Concrete implementations of SparkPlan should override <code>doExecute</code>.
   * @return (undocumented)
   */
  public final  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> execute ()  { throw new RuntimeException(); }
  /**
   * Returns the result of this query as a broadcast variable by delegating to <code>doExecuteBroadcast</code>
   * after preparations.
   * <p>
   * Concrete implementations of SparkPlan should override <code>doExecuteBroadcast</code>.
   * @return (undocumented)
   */
  public final <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> executeBroadcast ()  { throw new RuntimeException(); }
  /**
   * Executes a query after preparing the query and adding query plan information to created RDDs
   * for visualization.
   * @param query (undocumented)
   * @return (undocumented)
   */
  protected final <T extends java.lang.Object> T executeQuery (scala.Function0<T> query)  { throw new RuntimeException(); }
  /**
   * List of (uncorrelated scalar subquery, future holding the subquery result) for this plan node.
   * This list is populated by {@link prepareSubqueries}, which is called in {@link prepare}.
   * @return (undocumented)
   */
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.execution.ExecSubqueryExpression> runningSubqueries ()  { throw new RuntimeException(); }
  /**
   * Finds scalar subquery expressions in this plan node and starts evaluating them.
   */
  protected  void prepareSubqueries ()  { throw new RuntimeException(); }
  /**
   * Blocks the thread until all subqueries finish evaluation and update the results.
   */
  protected  void waitForSubqueries ()  { throw new RuntimeException(); }
  /**
   * Whether the "prepare" method is called.
   * @return (undocumented)
   */
  private  boolean prepared ()  { throw new RuntimeException(); }
  /**
   * Prepares this SparkPlan for execution. It's idempotent.
   */
  public final  void prepare ()  { throw new RuntimeException(); }
  /**
   * Overridden by concrete implementations of SparkPlan. It is guaranteed to run before any
   * <code>execute</code> of SparkPlan. This is helpful if we want to set up some state before executing the
   * query, e.g., <code>BroadcastHashJoin</code> uses it to broadcast asynchronously.
   * <p>
   * @note <code>prepare</code> method has already walked down the tree, so the implementation doesn't have
   * to call children's <code>prepare</code> methods.
   * <p>
   * This will only be called once, protected by <code>this</code>.
   */
  protected  void doPrepare ()  { throw new RuntimeException(); }
  /**
   * Produces the result of the query as an <code>RDD[InternalRow]</code>
   * <p>
   * Overridden by concrete implementations of SparkPlan.
   * @return (undocumented)
   */
  protected abstract  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  ;
  /**
   * Produces the result of the query as a broadcast variable.
   * <p>
   * Overridden by concrete implementations of SparkPlan.
   * @return (undocumented)
   */
  protected <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> doExecuteBroadcast ()  { throw new RuntimeException(); }
  /**
   * Packing the UnsafeRows into byte array for faster serialization.
   * The byte arrays are in the following format:
   * [size] [bytes of UnsafeRow] [size] [bytes of UnsafeRow] ... [-1]
   * <p>
   * UnsafeRow is highly compressible (at least 8 bytes for any column), the byte array is also
   * compressed.
   * @param n (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, byte[]>> getByteArrayRdd (int n)  { throw new RuntimeException(); }
  /**
   * Decodes the byte arrays back to UnsafeRows and put them into buffer.
   * @param bytes (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> decodeUnsafeRows (byte[] bytes)  { throw new RuntimeException(); }
  /**
   * Runs this query returning the result as an array.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow[] executeCollect ()  { throw new RuntimeException(); }
    scala.Tuple2<java.lang.Object, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> executeCollectIterator ()  { throw new RuntimeException(); }
  /**
   * Runs this query returning the result as an iterator of InternalRow.
   * <p>
   * @note Triggers multiple jobs (one for each partition).
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> executeToIterator ()  { throw new RuntimeException(); }
  /**
   * Runs this query returning the result as an array, using external Row format.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Row[] executeCollectPublic ()  { throw new RuntimeException(); }
  /**
   * Runs this query returning the first <code>n</code> rows as an array.
   * <p>
   * This is modeled after <code>RDD.take</code> but never runs any job locally on the driver.
   * @param n (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow[] executeTake (int n)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.MutableProjection newMutableProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, boolean useSubexprElimination)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.InterpretedPredicate genInterpretedPredicate (org.apache.spark.sql.catalyst.expressions.Expression expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.Predicate newPredicate (org.apache.spark.sql.catalyst.expressions.Expression expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  protected  scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> newOrdering (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> order, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  /**
   * Creates a row ordering for the given schema, in natural ascending order.
   * @param dataTypes (undocumented)
   * @return (undocumented)
   */
  protected  scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> newNaturalAscendingOrdering (scala.collection.Seq<org.apache.spark.sql.types.DataType> dataTypes)  { throw new RuntimeException(); }
}
