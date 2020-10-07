package org.apache.spark.sql.catalyst.optimizer;
/**
 * Combine nested {@link Concat} expressions.
 */
public  class CombineConcats$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CombineConcats$ MODULE$ = null;
  public   CombineConcats$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Concat flattenConcats (org.apache.spark.sql.catalyst.expressions.Concat concat)  { throw new RuntimeException(); }
  private  boolean hasNestedConcats (org.apache.spark.sql.catalyst.expressions.Concat concat)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
