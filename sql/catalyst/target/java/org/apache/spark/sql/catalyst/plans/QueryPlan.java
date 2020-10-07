package org.apache.spark.sql.catalyst.plans;
public abstract class QueryPlan<PlanType extends org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType>> extends org.apache.spark.sql.catalyst.trees.TreeNode<PlanType> {
  /**
   * Normalize the exprIds in the given expression, by updating the exprId in <code>AttributeReference</code>
   * with its referenced ordinal from input attributes. It's similar to <code>BindReferences</code> but we
   * do not use <code>BindReferences</code> here as the plan may take the expression as a parameter with type
   * <code>Attribute</code>, and replace it with <code>BoundReference</code> will cause error.
   * @param e (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public <T extends org.apache.spark.sql.catalyst.expressions.Expression> T normalizeExprId (T e, org.apache.spark.sql.catalyst.expressions.AttributeSeq input)  { throw new RuntimeException(); }
  /**
   * Composes the given predicates into a conjunctive predicate, which is normalized and reordered.
   * Then returns a new sequence of predicates by splitting the conjunctive predicate.
   * @param predicates (undocumented)
   * @param output (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> normalizePredicates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates, org.apache.spark.sql.catalyst.expressions.AttributeSeq output)  { throw new RuntimeException(); }
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
  static public  BaseType makeCopy (java.lang.Object[] newArgs)  { throw new RuntimeException(); }
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
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.sql.catalyst.plans.QueryPlan), List(TypeTree().setOriginal(Ident(TypeName("PlanType"))))))))
  public   QueryPlan ()  { throw new RuntimeException(); }
  /**
   * The active config object within the current scope.
   * See {@link SQLConf.get} for more information.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  /**
   * Returns the set of attributes that are output by this node.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet ()  { throw new RuntimeException(); }
  /**
   * All Attributes that appear in expressions from this operator.  Note that this set does not
   * include attributes that are implicitly referenced by being passed through to the output tuple.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  /**
   * The set of all attributes that are input to this operator by its children.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet inputSet ()  { throw new RuntimeException(); }
  /**
   * The set of all attributes that are produced by this node.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  /**
   * Attributes that are referenced by expressions but not provided by this node's children.
   * Subclasses should override this method if they produce attributes internally as it is used by
   * assertions designed to prevent the construction of invalid plans.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput ()  { throw new RuntimeException(); }
  /**
   * Runs {@link transformExpressionsDown} with <code>rule</code> on all expressions present
   * in this query operator.
   * Users should not expect a specific directionality. If a specific directionality is needed,
   * transformExpressionsDown or transformExpressionsUp should be used.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Runs {@link transformDown} with <code>rule</code> on all expressions present in this query operator.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsDown (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Runs {@link transformUp} with <code>rule</code> on all expressions present in this query operator.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsUp (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Apply a map function to each expression present in this query operator, and return a new
   * query operator based on the mapped expressions.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> mapExpressions (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> f)  { throw new RuntimeException(); }
  /**
   * Returns the result of running {@link transformExpressions} on this node
   * and all its children.
   * @param rule (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformAllExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /** Returns all of the expressions present in this query plan operator. */
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /** Returns the output schema in the tree format. */
  public  java.lang.String schemaString ()  { throw new RuntimeException(); }
  /** Prints out the schema in the tree format */
  public  void printSchema ()  { throw new RuntimeException(); }
  /**
   * A prefix string used when printing the plan.
   * <p>
   * We use "!" to indicate an invalid plan, and "'" to indicate an unresolved plan.
   * @return (undocumented)
   */
  protected  java.lang.String statePrefix ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  public  java.lang.String verboseString ()  { throw new RuntimeException(); }
  /**
   * All the subqueries of current plan.
   * @return (undocumented)
   */
  public  scala.collection.Seq<PlanType> subqueries ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  { throw new RuntimeException(); }
  /**
   * A private mutable variable to indicate whether this plan is the result of canonicalization.
   * This is used solely for making sure we wouldn't execute a canonicalized plan.
   * See {@link canonicalized} on how this is set.
   * @return (undocumented)
   */
  private  boolean _isCanonicalizedPlan ()  { throw new RuntimeException(); }
  protected  boolean isCanonicalizedPlan ()  { throw new RuntimeException(); }
  /**
   * Returns a plan where a best effort attempt has been made to transform <code>this</code> in a way
   * that preserves the result but removes cosmetic variations (case sensitivity, ordering for
   * commutative operations, expression id, etc.)
   * <p>
   * Plans where <code>this.canonicalized == other.canonicalized</code> will always evaluate to the same
   * result.
   * <p>
   * Plan nodes that require special canonicalization should override {@link doCanonicalize()}.
   * They should remove expressions cosmetic variations themselves.
   * @return (undocumented)
   */
  public final  PlanType canonicalized ()  { throw new RuntimeException(); }
  /**
   * Defines how the canonicalization should work for the current plan.
   * @return (undocumented)
   */
  protected  PlanType doCanonicalize ()  { throw new RuntimeException(); }
  /**
   * Returns true when the given query plan will return the same results as this query plan.
   * <p>
   * Since its likely undecidable to generally determine if two given plans will produce the same
   * results, it is okay for this function to return false, even if the results are actually
   * the same.  Such behavior will not affect correctness, only the application of performance
   * enhancements like caching.  However, it is not acceptable to return true if the results could
   * possibly be different.
   * <p>
   * This function performs a modified version of equality that is tolerant of cosmetic
   * differences like attribute naming and or expression id differences.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public final  boolean sameResult (PlanType other)  { throw new RuntimeException(); }
  /**
   * Returns a <code>hashCode</code> for the calculation performed by this plan. Unlike the standard
   * <code>hashCode</code>, an attempt has been made to eliminate cosmetic differences.
   * @return (undocumented)
   */
  public final  int semanticHash ()  { throw new RuntimeException(); }
  /**
   * All the attributes that are used for this plan.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSeq allAttributes ()  { throw new RuntimeException(); }
}
