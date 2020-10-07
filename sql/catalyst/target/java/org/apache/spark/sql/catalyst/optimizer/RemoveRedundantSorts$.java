package org.apache.spark.sql.catalyst.optimizer;
/**
 * Removes redundant Sort operation. This can happen:
 * 1) if the child is already sorted
 * 2) if there is another Sort operator separated by 0...n Project/Filter operators
 */
public  class RemoveRedundantSorts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RemoveRedundantSorts$ MODULE$ = null;
  public   RemoveRedundantSorts$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan recursiveRemoveSort (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  boolean canEliminateSort (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
