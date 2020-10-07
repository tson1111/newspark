package org.apache.spark.sql.catalyst.optimizer;
/**
 * PythonUDF in join condition can not be evaluated, this rule will detect the PythonUDF
 * and pull them out from join condition. For python udf accessing attributes from only one side,
 * they are pushed down by operation push down rules. If not (e.g. user disables filter push
 * down rules), we need to pull them out in this rule too.
 */
public  class PullOutPythonUDFInJoinCondition$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PullOutPythonUDFInJoinCondition$ MODULE$ = null;
  public   PullOutPythonUDFInJoinCondition$ ()  { throw new RuntimeException(); }
  public  boolean hasPythonUDF (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
