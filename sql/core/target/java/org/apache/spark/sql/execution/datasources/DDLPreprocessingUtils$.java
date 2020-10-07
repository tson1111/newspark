package org.apache.spark.sql.execution.datasources;
public  class DDLPreprocessingUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DDLPreprocessingUtils$ MODULE$ = null;
  public   DDLPreprocessingUtils$ ()  { throw new RuntimeException(); }
  /**
   * Adjusts the name and data type of the input query output columns, to match the expectation.
   * @param query (undocumented)
   * @param expectedOutput (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan castAndRenameQueryOutput (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> expectedOutput, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
}
