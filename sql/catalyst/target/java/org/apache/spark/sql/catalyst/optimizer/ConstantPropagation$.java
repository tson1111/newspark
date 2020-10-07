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
public  class ConstantPropagation$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ConstantPropagation$ MODULE$ = null;
  public   ConstantPropagation$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  private  scala.Tuple2<scala.Option<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<scala.Tuple2<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.catalyst.expressions.Literal>, org.apache.spark.sql.catalyst.expressions.BinaryComparison>>> traverse (org.apache.spark.sql.catalyst.expressions.Expression condition, boolean replaceChildren)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression replaceConstants (org.apache.spark.sql.catalyst.expressions.Expression condition, scala.collection.Seq<scala.Tuple2<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.catalyst.expressions.Literal>, org.apache.spark.sql.catalyst.expressions.BinaryComparison>> equalityPredicates)  { throw new RuntimeException(); }
}
