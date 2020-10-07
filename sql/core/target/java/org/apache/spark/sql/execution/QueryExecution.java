package org.apache.spark.sql.execution;
/**
 * The primary workflow for executing relational queries using Spark.  Designed to allow easy
 * access to the intermediate phases of query execution for developers.
 * <p>
 * While this is not a public class, we should avoid changing the function names for the sake of
 * changing them, because a lot of developers use the feature for debugging.
 */
public  class QueryExecution {
  /** A special namespace for commands that can be used to debug query execution. */
  public  class debug {
    /**
     * Prints to stdout all the generated code found in this plan (i.e. the output of each
     * WholeStageCodegen subtree).
     */
    static public  void codegen ()  { throw new RuntimeException(); }
    /**
     * Get WholeStageCodegenExec subtrees and the codegen in a query plan
     * <p>
     * @return Sequence of WholeStageCodegen subtrees and corresponding codegen
     */
    static public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> codegenToSeq ()  { throw new RuntimeException(); }
  }
  /** A special namespace for commands that can be used to debug query execution. */
  public  class debug$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final debug$ MODULE$ = null;
    public   debug$ ()  { throw new RuntimeException(); }
    /**
     * Prints to stdout all the generated code found in this plan (i.e. the output of each
     * WholeStageCodegen subtree).
     */
    public  void codegen ()  { throw new RuntimeException(); }
    /**
     * Get WholeStageCodegenExec subtrees and the codegen in a query plan
     * <p>
     * @return Sequence of WholeStageCodegen subtrees and corresponding codegen
     */
    public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> codegenToSeq ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   QueryExecution (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzed ()  { throw new RuntimeException(); }
  public  void assertAnalyzed ()  { throw new RuntimeException(); }
  public  void assertSupported ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.QueryExecution.debug$ debug ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan executedPlan ()  { throw new RuntimeException(); }
  /**
   * Returns the result as a hive compatible sequence of strings. This is used in tests and
   * <code>SparkSQLDriver</code> for CLI applications.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> hiveResultString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimizedPlan ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkPlanner planner ()  { throw new RuntimeException(); }
  /** A sequence of rules that will be applied in order to the physical plan before execution. */
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> preparations ()  { throw new RuntimeException(); }
  /**
   * Prepares a planned {@link SparkPlan} for execution by inserting shuffle operations and internal
   * row format conversions as needed.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.execution.SparkPlan prepareForExecution (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan sparkPlan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  protected <A extends java.lang.Object> java.lang.String stringOrError (scala.Function0<A> f)  { throw new RuntimeException(); }
  public  java.lang.String stringWithStats ()  { throw new RuntimeException(); }
  /** Formats a datum (based on the given data type) and returns the string representation. */
  private  java.lang.String toHiveString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a)  { throw new RuntimeException(); }
  /** Internal version of the RDD. Avoids copies and has no schema */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toRdd ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withCachedData ()  { throw new RuntimeException(); }
  /**
   * Redact the sensitive information in the given string.
   * @param message (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String withRedaction (java.lang.String message)  { throw new RuntimeException(); }
}
