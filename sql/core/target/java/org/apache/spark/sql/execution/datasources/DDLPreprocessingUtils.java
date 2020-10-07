package org.apache.spark.sql.execution.datasources;
public  class DDLPreprocessingUtils {
  /**
   * Adjusts the name and data type of the input query output columns, to match the expectation.
   * @param query (undocumented)
   * @param expectedOutput (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan castAndRenameQueryOutput (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> expectedOutput, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
}
