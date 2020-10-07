package org.apache.spark.sql.catalyst.plans;
public  class QueryPlan$ implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final QueryPlan$ MODULE$ = null;
  public   QueryPlan$ ()  { throw new RuntimeException(); }
  /**
   * Normalize the exprIds in the given expression, by updating the exprId in <code>AttributeReference</code>
   * with its referenced ordinal from input attributes. It's similar to <code>BindReferences</code> but we
   * do not use <code>BindReferences</code> here as the plan may take the expression as a parameter with type
   * <code>Attribute</code>, and replace it with <code>BoundReference</code> will cause error.
   * @param e (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  public <T extends org.apache.spark.sql.catalyst.expressions.Expression> T normalizeExprId (T e, org.apache.spark.sql.catalyst.expressions.AttributeSeq input)  { throw new RuntimeException(); }
  /**
   * Composes the given predicates into a conjunctive predicate, which is normalized and reordered.
   * Then returns a new sequence of predicates by splitting the conjunctive predicate.
   * @param predicates (undocumented)
   * @param output (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> normalizePredicates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates, org.apache.spark.sql.catalyst.expressions.AttributeSeq output)  { throw new RuntimeException(); }
}
