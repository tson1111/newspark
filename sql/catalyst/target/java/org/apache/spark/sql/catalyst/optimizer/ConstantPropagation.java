package org.apache.spark.sql.catalyst.optimizer;
/**
 * Substitutes {@link Attribute Attributes} which can be statically evaluated with their corresponding
 * value in conjunctive {@link Expression Expressions}
 * eg.
 * <pre><code>
 *   SELECT * FROM table WHERE i = 5 AND j = i + 3
 *   ==&gt;  SELECT * FROM table WHERE i = 5 AND j = 8
 * </code></pre>
 * <p>
 * Approach used:
 * - Populate a mapping of attribute =&gt; constant value by looking at all the equals predicates
 * - Using this mapping, replace occurrence of the attributes with the corresponding constant values
 *   in the AND node.
 */
public  class ConstantPropagation {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Traverse a condition as a tree and replace attributes with constant values.
   * - On matching {@link And}, recursively traverse each children and get propagated mappings.
   *   If the current node is not child of another {@link And}, replace all occurrences of the
   *   attributes with the corresponding constant values.
   * - If a child of {@link And} is {@link EqualTo} or {@link EqualNullSafe}, propagate the mapping
   *   of attribute =&gt; constant.
   * - On matching {@link Or} or {@link Not}, recursively traverse each children, propagate empty mapping.
   * - Otherwise, stop traversal and propagate empty mapping.
   * @param condition condition to be traversed
   * @param replaceChildren whether to replace attributes with constant values in children
   * @return A tuple including:
   *         1. Option[Expression]: optional changed condition after traversal
   *         2. EqualityPredicates: propagated mapping of attribute =&gt; constant
   */
  static private  scala.Tuple2<scala.Option<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<scala.Tuple2<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.catalyst.expressions.Literal>, org.apache.spark.sql.catalyst.expressions.BinaryComparison>>> traverse (org.apache.spark.sql.catalyst.expressions.Expression condition, boolean replaceChildren)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression replaceConstants (org.apache.spark.sql.catalyst.expressions.Expression condition, scala.collection.Seq<scala.Tuple2<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.catalyst.expressions.Literal>, org.apache.spark.sql.catalyst.expressions.BinaryComparison>> equalityPredicates)  { throw new RuntimeException(); }
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
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
}
