package org.apache.spark.sql.catalyst.optimizer;
/**
 * Encapsulates star-schema detection logic.
 */
public  class StarSchemaDetection$ implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StarSchemaDetection$ MODULE$ = null;
  public   StarSchemaDetection$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  /**
   * Star schema consists of one or more fact tables referencing a number of dimension
   * tables. In general, star-schema joins are detected using the following conditions:
   *  1. Informational RI constraints (reliable detection)
   * + Dimension contains a primary key that is being joined to the fact table.
   * + Fact table contains foreign keys referencing multiple dimension tables.
   * 2. Cardinality based heuristics
   * + Usually, the table with the highest cardinality is the fact table.
   * + Table being joined with the most number of tables is the fact table.
   * <p>
   * To detect star joins, the algorithm uses a combination of the above two conditions.
   * The fact table is chosen based on the cardinality heuristics, and the dimension
   * tables are chosen based on the RI constraints. A star join will consist of the largest
   * fact table joined with the dimension tables on their primary keys. To detect that a
   * column is a primary key, the algorithm uses table and column statistics.
   * <p>
   * The algorithm currently returns only the star join with the largest fact table.
   * Choosing the largest fact table on the driving arm to avoid large inners is in
   * general a good heuristic. This restriction will be lifted to observe multiple
   * star joins.
   * <p>
   * The highlights of the algorithm are the following:
   * <p>
   * Given a set of joined tables/plans, the algorithm first verifies if they are eligible
   * for star join detection. An eligible plan is a base table access with valid statistics.
   * A base table access represents Project or Filter operators above a LeafNode. Conservatively,
   * the algorithm only considers base table access as part of a star join since they provide
   * reliable statistics. This restriction can be lifted with the CBO enablement by default.
   * <p>
   * If some of the plans are not base table access, or statistics are not available, the algorithm
   * returns an empty star join plan since, in the absence of statistics, it cannot make
   * good planning decisions. Otherwise, the algorithm finds the table with the largest cardinality
   * (number of rows), which is assumed to be a fact table.
   * <p>
   * Next, it computes the set of dimension tables for the current fact table. A dimension table
   * is assumed to be in a RI relationship with a fact table. To infer column uniqueness,
   * the algorithm compares the number of distinct values with the total number of rows in the
   * table. If their relative difference is within certain limits (i.e. ndvMaxError * 2, adjusted
   * based on 1TB TPC-DS data), the column is assumed to be unique.
   * @param input (undocumented)
   * @param conditions (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> findStarJoins (scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> conditions)  { throw new RuntimeException(); }
  /**
   * Determines if a column referenced by a base table access is a primary key.
   * A column is a PK if it is not nullable and has unique values.
   * To determine if a column has unique values in the absence of informational
   * RI constraints, the number of distinct values is compared to the total
   * number of rows in the table. If their relative difference
   * is within the expected limits (i.e. 2 * spark.sql.statistics.ndv.maxError based
   * on TPC-DS data results), the column is assumed to have unique values.
   * @param column (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  boolean isUnique (org.apache.spark.sql.catalyst.expressions.Attribute column, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Given a column over a base table access, it returns
   * the leaf node column from which the input column is derived.
   * @param column (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.catalyst.expressions.Attribute> findLeafNodeCol (org.apache.spark.sql.catalyst.expressions.Attribute column, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Checks if a column has statistics.
   * The column is assumed to be over a base table access.
   * @param column (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  boolean hasStatistics (org.apache.spark.sql.catalyst.expressions.Attribute column, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Returns the join predicates between two input plans. It only
   * considers basic comparison operators.
   * @param plan1 (undocumented)
   * @param plan2 (undocumented)
   * @param conditions (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> findJoinConditions (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan1, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan2, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> conditions)  { throw new RuntimeException(); }
  /**
   * Checks if a star join is a selective join. A star join is assumed
   * to be selective if there are local predicates on the dimension
   * tables.
   * @param dimTables (undocumented)
   * @param conditions (undocumented)
   * @return (undocumented)
   */
  private  boolean isSelectiveStarJoin (scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> dimTables, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> conditions)  { throw new RuntimeException(); }
  /**
   * Returns the cardinality of a base table access. A base table access represents
   * a LeafNode, or Project or Filter operators above a LeafNode.
   * @param input (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<scala.math.BigInt> getTableAccessCardinality (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan input)  { throw new RuntimeException(); }
  /**
   * Reorders a star join based on heuristics. It is called from ReorderJoin if CBO is disabled.
   *   1) Finds the star join with the largest fact table.
   *   2) Places the fact table the driving arm of the left-deep tree.
   *     This plan avoids large table access on the inner, and thus favor hash joins.
   *   3) Applies the most selective dimensions early in the plan to reduce the amount of
   *      data flow.
   * @param input (undocumented)
   * @param conditions (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.InnerLike>> reorderStarJoins (scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.InnerLike>> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> conditions)  { throw new RuntimeException(); }
}
