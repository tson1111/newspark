package org.apache.spark.sql.catalyst.analysis;
/**
 * Provides a logical query plan analyzer, which translates {@link UnresolvedAttribute}s and
 * {@link UnresolvedRelation}s into fully typed objects using information in a {@link SessionCatalog}.
 */
public  class Analyzer extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.CheckAnalysis {
  /**
   * Analyze cte definitions and substitute child plan with analyzed cte definitions.
   */
  public  class CTESubstitution {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan substituteCTE (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> cteRelations)  { throw new RuntimeException(); }
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
  }
  /**
   * Analyze cte definitions and substitute child plan with analyzed cte definitions.
   */
  public  class CTESubstitution$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CTESubstitution$ MODULE$ = null;
    public   CTESubstitution$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan substituteCTE (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> cteRelations)  { throw new RuntimeException(); }
  }
  /**
   * Substitute child plan with WindowSpecDefinitions.
   */
  public  class WindowsSubstitution {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Substitute child plan with WindowSpecDefinitions.
   */
  public  class WindowsSubstitution$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WindowsSubstitution$ MODULE$ = null;
    public   WindowsSubstitution$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Replaces {@link UnresolvedAlias}s with concrete aliases.
   */
  public  class ResolveAliases {
    static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> assignAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
    static private  boolean hasUnresolvedAlias (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Replaces {@link UnresolvedAlias}s with concrete aliases.
   */
  public  class ResolveAliases$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveAliases$ MODULE$ = null;
    public   ResolveAliases$ ()  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> assignAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
    private  boolean hasUnresolvedAlias (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  class ResolveGroupingAnalytics {
    static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> rollupExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs0 (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    static   boolean hasGroupingFunction (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
    static private  org.apache.spark.sql.catalyst.expressions.Expression replaceGroupingFunc (org.apache.spark.sql.catalyst.expressions.Expression expr, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, org.apache.spark.sql.catalyst.expressions.Expression gid)  { throw new RuntimeException(); }
    static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> constructGroupByAlias (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs)  { throw new RuntimeException(); }
    static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan constructExpand (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> selectedGroupByExprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> groupByAliases, org.apache.spark.sql.catalyst.expressions.Attribute gid)  { throw new RuntimeException(); }
    static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> constructAggregateExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregations, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> groupByAliases, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingAttrs, org.apache.spark.sql.catalyst.expressions.Attribute gid)  { throw new RuntimeException(); }
    static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan constructAggregate (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> selectedGroupByExprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregationExprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> findGroupingExprs (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  public  class ResolveGroupingAnalytics$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveGroupingAnalytics$ MODULE$ = null;
    public   ResolveGroupingAnalytics$ ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> rollupExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs0 (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
      boolean hasGroupingFunction (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.Expression replaceGroupingFunc (org.apache.spark.sql.catalyst.expressions.Expression expr, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, org.apache.spark.sql.catalyst.expressions.Expression gid)  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> constructGroupByAlias (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan constructExpand (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> selectedGroupByExprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> groupByAliases, org.apache.spark.sql.catalyst.expressions.Attribute gid)  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> constructAggregateExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregations, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> groupByAliases, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingAttrs, org.apache.spark.sql.catalyst.expressions.Attribute gid)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan constructAggregate (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> selectedGroupByExprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregationExprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> findGroupingExprs (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  class ResolvePivot {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static private  void checkValidAggregateExpression (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
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
  }
  public  class ResolvePivot$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolvePivot$ MODULE$ = null;
    public   ResolvePivot$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    private  void checkValidAggregateExpression (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  }
  /**
   * Replaces {@link UnresolvedRelation}s with concrete relations from the catalog.
   */
  public  class ResolveRelations {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveRelation (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupTableFromCatalog (org.apache.spark.sql.catalyst.analysis.UnresolvedRelation u, scala.Option<java.lang.String> defaultDatabase)  { throw new RuntimeException(); }
    static private  boolean isRunningDirectlyOnFiles (org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
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
  }
  /**
   * Replaces {@link UnresolvedRelation}s with concrete relations from the catalog.
   */
  public  class ResolveRelations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveRelations$ MODULE$ = null;
    public   ResolveRelations$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveRelation (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupTableFromCatalog (org.apache.spark.sql.catalyst.analysis.UnresolvedRelation u, scala.Option<java.lang.String> defaultDatabase)  { throw new RuntimeException(); }
    private  boolean isRunningDirectlyOnFiles (org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
  }
  /**
   * Replaces {@link UnresolvedAttribute}s with concrete {@link AttributeReference}s from
   * a logical plan node's children.
   */
  public  class ResolveReferences {
    /**
     * Generate a new logical plan for the right child with different expression IDs
     * for all conflicting attributes.
     * @param left (undocumented)
     * @param right (undocumented)
     * @return (undocumented)
     */
    static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan dedupRight (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
    static private  org.apache.spark.sql.catalyst.expressions.Attribute dedupAttr (org.apache.spark.sql.catalyst.expressions.Attribute attr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Attribute> attrMap)  { throw new RuntimeException(); }
    /**
     * The outer plan may have been de-duplicated and the function below updates the
     * outer references to refer to the de-duplicated attributes.
     * <p>
     * For example (SQL):
     * <pre><code>
     *   SELECT * FROM t1
     *   INTERSECT
     *   SELECT * FROM t1
     *   WHERE EXISTS (SELECT 1
     *                 FROM t2
     *                 WHERE t1.c1 = t2.c1)
     * </code></pre>
     * Plan before resolveReference rule.
     *    'Intersect
     *    :- Project [c1#245, c2#246]
     *    :  +- SubqueryAlias t1
     *    :     +- Relation[c1#245,c2#246] parquet
     *    +- 'Project [*]
     *       +- Filter exists#257 [c1#245]
     *       :  +- Project [1 AS 1#258]
     *       :     +- Filter (outer(c1#245) = c1#251)
     *       :        +- SubqueryAlias t2
     *       :           +- Relation[c1#251,c2#252] parquet
     *       +- SubqueryAlias t1
     *          +- Relation[c1#245,c2#246] parquet
     * Plan after the resolveReference rule.
     *    Intersect
     *    :- Project [c1#245, c2#246]
     *    :  +- SubqueryAlias t1
     *    :     +- Relation[c1#245,c2#246] parquet
     *    +- Project [c1#259, c2#260]
     *       +- Filter exists#257 [c1#259]
     *       :  +- Project [1 AS 1#258]
     *       :     +- Filter (outer(c1#259) = c1#251) =&gt; Updated
     *       :        +- SubqueryAlias t2
     *       :           +- Relation[c1#251,c2#252] parquet
     *       +- SubqueryAlias t1
     *          +- Relation[c1#259,c2#260] parquet  =&gt; Outer plan's attributes are de-duplicated.
     * @param plan (undocumented)
     * @param attrMap (undocumented)
     * @return (undocumented)
     */
    static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan dedupOuterReferencesInSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Attribute> attrMap)  { throw new RuntimeException(); }
    static private  org.apache.spark.sql.catalyst.expressions.Expression resolve (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan q)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> newAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.expressions.AttributeSet findAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
    /**
     * Build a project list for Project/Aggregate and expand the star if possible
     * @param exprs (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> buildExpandedProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    /**
     * Returns true if <code>exprs</code> contains a {@link Star}.
     * @param exprs (undocumented)
     * @return (undocumented)
     */
    static public  boolean containsStar (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    /**
     * Expands the matching attribute.*'s in <code>child</code>'s output.
     * @param expr (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    static public  org.apache.spark.sql.catalyst.expressions.Expression expandStarExpression (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
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
  }
  /**
   * Replaces {@link UnresolvedAttribute}s with concrete {@link AttributeReference}s from
   * a logical plan node's children.
   */
  public  class ResolveReferences$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveReferences$ MODULE$ = null;
    public   ResolveReferences$ ()  { throw new RuntimeException(); }
    /**
     * Generate a new logical plan for the right child with different expression IDs
     * for all conflicting attributes.
     * @param left (undocumented)
     * @param right (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan dedupRight (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.Attribute dedupAttr (org.apache.spark.sql.catalyst.expressions.Attribute attr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Attribute> attrMap)  { throw new RuntimeException(); }
    /**
     * The outer plan may have been de-duplicated and the function below updates the
     * outer references to refer to the de-duplicated attributes.
     * <p>
     * For example (SQL):
     * <pre><code>
     *   SELECT * FROM t1
     *   INTERSECT
     *   SELECT * FROM t1
     *   WHERE EXISTS (SELECT 1
     *                 FROM t2
     *                 WHERE t1.c1 = t2.c1)
     * </code></pre>
     * Plan before resolveReference rule.
     *    'Intersect
     *    :- Project [c1#245, c2#246]
     *    :  +- SubqueryAlias t1
     *    :     +- Relation[c1#245,c2#246] parquet
     *    +- 'Project [*]
     *       +- Filter exists#257 [c1#245]
     *       :  +- Project [1 AS 1#258]
     *       :     +- Filter (outer(c1#245) = c1#251)
     *       :        +- SubqueryAlias t2
     *       :           +- Relation[c1#251,c2#252] parquet
     *       +- SubqueryAlias t1
     *          +- Relation[c1#245,c2#246] parquet
     * Plan after the resolveReference rule.
     *    Intersect
     *    :- Project [c1#245, c2#246]
     *    :  +- SubqueryAlias t1
     *    :     +- Relation[c1#245,c2#246] parquet
     *    +- Project [c1#259, c2#260]
     *       +- Filter exists#257 [c1#259]
     *       :  +- Project [1 AS 1#258]
     *       :     +- Filter (outer(c1#259) = c1#251) =&gt; Updated
     *       :        +- SubqueryAlias t2
     *       :           +- Relation[c1#251,c2#252] parquet
     *       +- SubqueryAlias t1
     *          +- Relation[c1#259,c2#260] parquet  =&gt; Outer plan's attributes are de-duplicated.
     * @param plan (undocumented)
     * @param attrMap (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan dedupOuterReferencesInSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Attribute> attrMap)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.Expression resolve (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan q)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> newAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.AttributeSet findAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
    /**
     * Build a project list for Project/Aggregate and expand the star if possible
     * @param exprs (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> buildExpandedProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    /**
     * Returns true if <code>exprs</code> contains a {@link Star}.
     * @param exprs (undocumented)
     * @return (undocumented)
     */
    public  boolean containsStar (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    /**
     * Expands the matching attribute.*'s in <code>child</code>'s output.
     * @param expr (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.catalyst.expressions.Expression expandStarExpression (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  }
  /**
   * In many dialects of SQL it is valid to use ordinal positions in order/sort by and group by
   * clauses. This rule is to convert ordinal positions to the corresponding expressions in the
   * select list. This support is introduced in Spark 2.0.
   * <p>
   * - When the sort references or group by expressions are not integer but foldable expressions,
   * just ignore them.
   * - When spark.sql.orderByOrdinal/spark.sql.groupByOrdinal is set to false, ignore the position
   * numbers too.
   * <p>
   * Before the release of Spark 2.0, the literals in order/sort by and group by clauses
   * have no effect on the results.
   */
  public  class ResolveOrdinalInOrderByAndGroupBy {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * In many dialects of SQL it is valid to use ordinal positions in order/sort by and group by
   * clauses. This rule is to convert ordinal positions to the corresponding expressions in the
   * select list. This support is introduced in Spark 2.0.
   * <p>
   * - When the sort references or group by expressions are not integer but foldable expressions,
   * just ignore them.
   * - When spark.sql.orderByOrdinal/spark.sql.groupByOrdinal is set to false, ignore the position
   * numbers too.
   * <p>
   * Before the release of Spark 2.0, the literals in order/sort by and group by clauses
   * have no effect on the results.
   */
  public  class ResolveOrdinalInOrderByAndGroupBy$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveOrdinalInOrderByAndGroupBy$ MODULE$ = null;
    public   ResolveOrdinalInOrderByAndGroupBy$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Replace unresolved expressions in grouping keys with resolved ones in SELECT clauses.
   * This rule is expected to run after {@link ResolveReferences} applied.
   */
  public  class ResolveAggAliasInGroupBy {
    static private  boolean notResolvableByChild (java.lang.String attrName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mayResolveAttrByAggregateExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Replace unresolved expressions in grouping keys with resolved ones in SELECT clauses.
   * This rule is expected to run after {@link ResolveReferences} applied.
   */
  public  class ResolveAggAliasInGroupBy$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveAggAliasInGroupBy$ MODULE$ = null;
    public   ResolveAggAliasInGroupBy$ ()  { throw new RuntimeException(); }
    private  boolean notResolvableByChild (java.lang.String attrName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mayResolveAttrByAggregateExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * In many dialects of SQL it is valid to sort by attributes that are not present in the SELECT
   * clause.  This rule detects such queries and adds the required attributes to the original
   * projection, so that they will be available during sorting. Another projection is added to
   * remove these attributes after sorting.
   * <p>
   * The HAVING clause could also used a grouping columns that is not presented in the SELECT.
   */
  public  class ResolveMissingReferences {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * This method tries to resolve expressions and find missing attributes recursively. Specially,
     * when the expressions used in <code>Sort</code> or <code>Filter</code> contain unresolved attributes or resolved
     * attributes which are missed from child output. This method tries to find the missing
     * attributes out and add into the projection.
     * @param exprs (undocumented)
     * @param plan (undocumented)
     * @return (undocumented)
     */
    static private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> resolveExprsAndAddMissingAttrs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * In many dialects of SQL it is valid to sort by attributes that are not present in the SELECT
   * clause.  This rule detects such queries and adds the required attributes to the original
   * projection, so that they will be available during sorting. Another projection is added to
   * remove these attributes after sorting.
   * <p>
   * The HAVING clause could also used a grouping columns that is not presented in the SELECT.
   */
  public  class ResolveMissingReferences$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveMissingReferences$ MODULE$ = null;
    public   ResolveMissingReferences$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * This method tries to resolve expressions and find missing attributes recursively. Specially,
     * when the expressions used in <code>Sort</code> or <code>Filter</code> contain unresolved attributes or resolved
     * attributes which are missed from child output. This method tries to find the missing
     * attributes out and add into the projection.
     * @param exprs (undocumented)
     * @param plan (undocumented)
     * @return (undocumented)
     */
    private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> resolveExprsAndAddMissingAttrs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Checks whether a function identifier referenced by an {@link UnresolvedFunction} is defined in the
   * function registry. Note that this rule doesn't try to resolve the {@link UnresolvedFunction}. It
   * only performs simple existence check according to the function identifier to quickly identify
   * undefined functions without triggering relation resolution, which may incur potentially
   * expensive partition/schema discovery process in some cases.
   * In order to avoid duplicate external functions lookup, the external function identifier will
   * store in the local hash set externalFunctionNameSet.
   * @see ResolveFunctions
   * @see https://issues.apache.org/jira/browse/SPARK-19737
   */
  public  class LookupFunctions {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.FunctionIdentifier normalizeFuncName (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
    static protected  java.lang.String formatDatabaseName (java.lang.String name)  { throw new RuntimeException(); }
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
  }
  /**
   * Checks whether a function identifier referenced by an {@link UnresolvedFunction} is defined in the
   * function registry. Note that this rule doesn't try to resolve the {@link UnresolvedFunction}. It
   * only performs simple existence check according to the function identifier to quickly identify
   * undefined functions without triggering relation resolution, which may incur potentially
   * expensive partition/schema discovery process in some cases.
   * In order to avoid duplicate external functions lookup, the external function identifier will
   * store in the local hash set externalFunctionNameSet.
   * @see ResolveFunctions
   * @see https://issues.apache.org/jira/browse/SPARK-19737
   */
  public  class LookupFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LookupFunctions$ MODULE$ = null;
    public   LookupFunctions$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.FunctionIdentifier normalizeFuncName (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
    protected  java.lang.String formatDatabaseName (java.lang.String name)  { throw new RuntimeException(); }
  }
  /**
   * Replaces {@link UnresolvedFunction}s with concrete {@link Expression}s.
   */
  public  class ResolveFunctions {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Replaces {@link UnresolvedFunction}s with concrete {@link Expression}s.
   */
  public  class ResolveFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveFunctions$ MODULE$ = null;
    public   ResolveFunctions$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * This rule resolves and rewrites subqueries inside expressions.
   * <p>
   * Note: CTEs are handled in CTESubstitution.
   */
  public  class ResolveSubquery {
    /**
     * Resolve the correlated expressions in a subquery by using the an outer plans' references. All
     * resolved outer references are wrapped in an {@link OuterReference}
     * @param plan (undocumented)
     * @param outer (undocumented)
     * @return (undocumented)
     */
    static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveOuterReferences (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan outer)  { throw new RuntimeException(); }
    /**
     * Resolves the subquery plan that is referenced in a subquery expression. The normal
     * attribute references are resolved using regular analyzer and the outer references are
     * resolved from the outer plans using the resolveOuterReferences method.
     * <p>
     * Outer references from the correlated predicates are updated as children of
     * Subquery expression.
     * @param e (undocumented)
     * @param plans (undocumented)
     * @param f (undocumented)
     * @return (undocumented)
     */
    static private  org.apache.spark.sql.catalyst.expressions.SubqueryExpression resolveSubQuery (org.apache.spark.sql.catalyst.expressions.SubqueryExpression e, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plans, scala.Function2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.SubqueryExpression> f)  { throw new RuntimeException(); }
    /**
     * Resolves the subquery. Apart of resolving the subquery and outer references (if any)
     * in the subquery plan, the children of subquery expression are updated to record the
     * outer references. This is needed to make sure
     * (1) The column(s) referred from the outer query are not pruned from the plan during
     *     optimization.
     * (2) Any aggregate expression(s) that reference outer attributes are pushed down to
     *     outer plan to get evaluated.
     * @param plan (undocumented)
     * @param plans (undocumented)
     * @return (undocumented)
     */
    static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveSubQueries (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plans)  { throw new RuntimeException(); }
    /**
     * Resolve and rewrite all subqueries in an operator tree..
     * @param plan (undocumented)
     * @return (undocumented)
     */
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  /**
   * This rule resolves and rewrites subqueries inside expressions.
   * <p>
   * Note: CTEs are handled in CTESubstitution.
   */
  public  class ResolveSubquery$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveSubquery$ MODULE$ = null;
    public   ResolveSubquery$ ()  { throw new RuntimeException(); }
    /**
     * Resolve the correlated expressions in a subquery by using the an outer plans' references. All
     * resolved outer references are wrapped in an {@link OuterReference}
     * @param plan (undocumented)
     * @param outer (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveOuterReferences (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan outer)  { throw new RuntimeException(); }
    /**
     * Resolves the subquery plan that is referenced in a subquery expression. The normal
     * attribute references are resolved using regular analyzer and the outer references are
     * resolved from the outer plans using the resolveOuterReferences method.
     * <p>
     * Outer references from the correlated predicates are updated as children of
     * Subquery expression.
     * @param e (undocumented)
     * @param plans (undocumented)
     * @param f (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.expressions.SubqueryExpression resolveSubQuery (org.apache.spark.sql.catalyst.expressions.SubqueryExpression e, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plans, scala.Function2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.SubqueryExpression> f)  { throw new RuntimeException(); }
    /**
     * Resolves the subquery. Apart of resolving the subquery and outer references (if any)
     * in the subquery plan, the children of subquery expression are updated to record the
     * outer references. This is needed to make sure
     * (1) The column(s) referred from the outer query are not pruned from the plan during
     *     optimization.
     * (2) Any aggregate expression(s) that reference outer attributes are pushed down to
     *     outer plan to get evaluated.
     * @param plan (undocumented)
     * @param plans (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveSubQueries (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plans)  { throw new RuntimeException(); }
    /**
     * Resolve and rewrite all subqueries in an operator tree..
     * @param plan (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Replaces unresolved column aliases for a subquery with projections.
   */
  public  class ResolveSubqueryColumnAliases {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Replaces unresolved column aliases for a subquery with projections.
   */
  public  class ResolveSubqueryColumnAliases$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveSubqueryColumnAliases$ MODULE$ = null;
    public   ResolveSubqueryColumnAliases$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Turns projections that contain aggregate expressions into aggregations.
   */
  public  class GlobalAggregates {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  boolean containsAggregates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
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
  }
  /**
   * Turns projections that contain aggregate expressions into aggregations.
   */
  public  class GlobalAggregates$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GlobalAggregates$ MODULE$ = null;
    public   GlobalAggregates$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  boolean containsAggregates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  }
  /**
   * This rule finds aggregate expressions that are not in an aggregate operator.  For example,
   * those in a HAVING clause or ORDER BY clause.  These expressions are pushed down to the
   * underlying aggregate operator and then projected away after the original operator.
   */
  public  class ResolveAggregateFunctions {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  boolean containsAggregate (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
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
  }
  /**
   * This rule finds aggregate expressions that are not in an aggregate operator.  For example,
   * those in a HAVING clause or ORDER BY clause.  These expressions are pushed down to the
   * underlying aggregate operator and then projected away after the original operator.
   */
  public  class ResolveAggregateFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveAggregateFunctions$ MODULE$ = null;
    public   ResolveAggregateFunctions$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  boolean containsAggregate (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  }
  /**
   * Extracts {@link Generator} from the projectList of a {@link Project} operator and creates {@link Generate}
   * operator under {@link Project}.
   * <p>
   * This rule will throw {@link AnalysisException} for following cases:
   * 1. {@link Generator} is nested in expressions, e.g. <code>SELECT explode(list) + 1 FROM tbl</code>
   * 2. more than one {@link Generator} is found in projectList,
   *    e.g. <code>SELECT explode(list), explode(list) FROM tbl</code>
   * 3. {@link Generator} is found in other operators that are not {@link Project} or {@link Generate},
   *    e.g. <code>SELECT * FROM tbl SORT BY explode(list)</code>
   */
  public  class ExtractGenerator {
    static private  class AliasedGenerator$ {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final AliasedGenerator$ MODULE$ = null;
      public   AliasedGenerator$ ()  { throw new RuntimeException(); }
      /**
       * Extracts a {@link Generator} expression, any names assigned by aliases to the outputs
       * and the outer flag. The outer flag is used when joining the generator output.
       * @param e the {@link Expression}
       * @return (the {@link Generator}, seq of output names, outer flag)
       */
      public  scala.Option<scala.Tuple3<org.apache.spark.sql.catalyst.expressions.Generator, scala.collection.Seq<java.lang.String>, java.lang.Object>> unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
    }
    static private  boolean hasGenerator (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
    static private  boolean hasNestedGenerator (org.apache.spark.sql.catalyst.expressions.NamedExpression expr)  { throw new RuntimeException(); }
    static private  org.apache.spark.sql.catalyst.expressions.Expression trimAlias (org.apache.spark.sql.catalyst.expressions.NamedExpression expr)  { throw new RuntimeException(); }
    static private  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractGenerator$.AliasedGenerator$ AliasedGenerator ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Extracts {@link Generator} from the projectList of a {@link Project} operator and creates {@link Generate}
   * operator under {@link Project}.
   * <p>
   * This rule will throw {@link AnalysisException} for following cases:
   * 1. {@link Generator} is nested in expressions, e.g. <code>SELECT explode(list) + 1 FROM tbl</code>
   * 2. more than one {@link Generator} is found in projectList,
   *    e.g. <code>SELECT explode(list), explode(list) FROM tbl</code>
   * 3. {@link Generator} is found in other operators that are not {@link Project} or {@link Generate},
   *    e.g. <code>SELECT * FROM tbl SORT BY explode(list)</code>
   */
  public  class ExtractGenerator$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExtractGenerator$ MODULE$ = null;
    public   ExtractGenerator$ ()  { throw new RuntimeException(); }
    private  boolean hasGenerator (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
    private  boolean hasNestedGenerator (org.apache.spark.sql.catalyst.expressions.NamedExpression expr)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.Expression trimAlias (org.apache.spark.sql.catalyst.expressions.NamedExpression expr)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractGenerator$.AliasedGenerator$ AliasedGenerator ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Rewrites table generating expressions that either need one or more of the following in order
   * to be resolved:
   *  - concrete attribute references for their output.
   *  - to be relocated from a SELECT clause (i.e. from  a {@link Project}) into a {@link Generate}).
   * <p>
   * Names for the output {@link Attribute}s are extracted from {@link Alias} or {@link MultiAlias} expressions
   * that wrap the {@link Generator}.
   */
  public  class ResolveGenerate {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Construct the output attributes for a {@link Generator}, given a list of names.  If the list of
     * names is empty names are assigned from field names in generator.
     * @param generator (undocumented)
     * @param names (undocumented)
     * @return (undocumented)
     */
    static   scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> makeGeneratorOutput (org.apache.spark.sql.catalyst.expressions.Generator generator, scala.collection.Seq<java.lang.String> names)  { throw new RuntimeException(); }
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
  }
  /**
   * Rewrites table generating expressions that either need one or more of the following in order
   * to be resolved:
   *  - concrete attribute references for their output.
   *  - to be relocated from a SELECT clause (i.e. from  a {@link Project}) into a {@link Generate}).
   * <p>
   * Names for the output {@link Attribute}s are extracted from {@link Alias} or {@link MultiAlias} expressions
   * that wrap the {@link Generator}.
   */
  public  class ResolveGenerate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveGenerate$ MODULE$ = null;
    public   ResolveGenerate$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Construct the output attributes for a {@link Generator}, given a list of names.  If the list of
     * names is empty names are assigned from field names in generator.
     * @param generator (undocumented)
     * @param names (undocumented)
     * @return (undocumented)
     */
      scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> makeGeneratorOutput (org.apache.spark.sql.catalyst.expressions.Generator generator, scala.collection.Seq<java.lang.String> names)  { throw new RuntimeException(); }
  }
  /**
   * Fixes nullability of Attributes in a resolved LogicalPlan by using the nullability of
   * corresponding Attributes of its children output Attributes. This step is needed because
   * users can use a resolved AttributeReference in the Dataset API and outer joins
   * can change the nullability of an AttribtueReference. Without the fix, a nullable column's
   * nullable field can be actually set as non-nullable, which cause illegal optimization
   * (e.g., NULL propagation) and wrong answers.
   * See SPARK-13484 and SPARK-13801 for the concrete queries of this case.
   */
  public  class FixNullability {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Fixes nullability of Attributes in a resolved LogicalPlan by using the nullability of
   * corresponding Attributes of its children output Attributes. This step is needed because
   * users can use a resolved AttributeReference in the Dataset API and outer joins
   * can change the nullability of an AttribtueReference. Without the fix, a nullable column's
   * nullable field can be actually set as non-nullable, which cause illegal optimization
   * (e.g., NULL propagation) and wrong answers.
   * See SPARK-13484 and SPARK-13801 for the concrete queries of this case.
   */
  public  class FixNullability$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FixNullability$ MODULE$ = null;
    public   FixNullability$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Extracts {@link WindowExpression}s from the projectList of a {@link Project} operator and
   * aggregateExpressions of an {@link Aggregate} operator and creates individual {@link Window}
   * operators for every distinct {@link WindowSpecDefinition}.
   * <p>
   * This rule handles three cases:
   *  - A {@link Project} having {@link WindowExpression}s in its projectList;
   *  - An {@link Aggregate} having {@link WindowExpression}s in its aggregateExpressions.
   *  - A {@link Filter}->{@link Aggregate} pattern representing GROUP BY with a HAVING
   *    clause and the {@link Aggregate} has {@link WindowExpression}s in its aggregateExpressions.
   * Note: If there is a GROUP BY clause in the query, aggregations and corresponding
   * filters (expressions in the HAVING clause) should be evaluated before any
   * {@link WindowExpression}. If a query has SELECT DISTINCT, the DISTINCT part should be
   * evaluated after all {@link WindowExpression}s.
   * <p>
   * For every case, the transformation works as follows:
   * 1. For a list of {@link Expression}s (a projectList or an aggregateExpressions), partitions
   *    it two lists of {@link Expression}s, one for all {@link WindowExpression}s and another for
   *    all regular expressions.
   * 2. For all {@link WindowExpression}s, groups them based on their {@link WindowSpecDefinition}s
   *    and {@link WindowFunctionType}s.
   * 3. For every distinct {@link WindowSpecDefinition} and {@link WindowFunctionType}, creates a
   *    {@link Window} operator and inserts it into the plan tree.
   */
  public  class ExtractWindowExpressions {
    static private  boolean hasWindowFunction (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    static private  boolean hasWindowFunction (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
    /**
     * From a Seq of {@link NamedExpression}s, extract expressions containing window expressions and
     * other regular expressions that do not contain any window expression. For example, for
     * <code>col1, Sum(col2 + col3) OVER (PARTITION BY col4 ORDER BY col5)</code>, we will extract
     * <code>col1</code>, <code>col2 + col3</code>, <code>col4</code>, and <code>col5</code> out and replace their appearances in
     * the window expression as attribute references. So, the first returned value will be
     * <code>[Sum(_w0) OVER (PARTITION BY _w1 ORDER BY _w2)]</code> and the second returned value will be
     * [col1, col2 + col3 as _w0, col4 as _w1, col5 as _w2].
     * <p>
     * @return (seq of expressions containing at least one window expression,
     *          seq of non-window expressions)
     * @param expressions (undocumented)
     */
    static private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>> extract (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions)  { throw new RuntimeException(); }
    /**
     * Adds operators for Window Expressions. Every Window operator handles a single Window Spec.
     * @param expressionsWithWindowFunctions (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan addWindow (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressionsWithWindowFunctions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Extracts {@link WindowExpression}s from the projectList of a {@link Project} operator and
   * aggregateExpressions of an {@link Aggregate} operator and creates individual {@link Window}
   * operators for every distinct {@link WindowSpecDefinition}.
   * <p>
   * This rule handles three cases:
   *  - A {@link Project} having {@link WindowExpression}s in its projectList;
   *  - An {@link Aggregate} having {@link WindowExpression}s in its aggregateExpressions.
   *  - A {@link Filter}->{@link Aggregate} pattern representing GROUP BY with a HAVING
   *    clause and the {@link Aggregate} has {@link WindowExpression}s in its aggregateExpressions.
   * Note: If there is a GROUP BY clause in the query, aggregations and corresponding
   * filters (expressions in the HAVING clause) should be evaluated before any
   * {@link WindowExpression}. If a query has SELECT DISTINCT, the DISTINCT part should be
   * evaluated after all {@link WindowExpression}s.
   * <p>
   * For every case, the transformation works as follows:
   * 1. For a list of {@link Expression}s (a projectList or an aggregateExpressions), partitions
   *    it two lists of {@link Expression}s, one for all {@link WindowExpression}s and another for
   *    all regular expressions.
   * 2. For all {@link WindowExpression}s, groups them based on their {@link WindowSpecDefinition}s
   *    and {@link WindowFunctionType}s.
   * 3. For every distinct {@link WindowSpecDefinition} and {@link WindowFunctionType}, creates a
   *    {@link Window} operator and inserts it into the plan tree.
   */
  public  class ExtractWindowExpressions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExtractWindowExpressions$ MODULE$ = null;
    public   ExtractWindowExpressions$ ()  { throw new RuntimeException(); }
    private  boolean hasWindowFunction (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    private  boolean hasWindowFunction (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
    /**
     * From a Seq of {@link NamedExpression}s, extract expressions containing window expressions and
     * other regular expressions that do not contain any window expression. For example, for
     * <code>col1, Sum(col2 + col3) OVER (PARTITION BY col4 ORDER BY col5)</code>, we will extract
     * <code>col1</code>, <code>col2 + col3</code>, <code>col4</code>, and <code>col5</code> out and replace their appearances in
     * the window expression as attribute references. So, the first returned value will be
     * <code>[Sum(_w0) OVER (PARTITION BY _w1 ORDER BY _w2)]</code> and the second returned value will be
     * [col1, col2 + col3 as _w0, col4 as _w1, col5 as _w2].
     * <p>
     * @return (seq of expressions containing at least one window expression,
     *          seq of non-window expressions)
     * @param expressions (undocumented)
     */
    private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>> extract (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions)  { throw new RuntimeException(); }
    /**
     * Adds operators for Window Expressions. Every Window operator handles a single Window Spec.
     * @param expressionsWithWindowFunctions (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan addWindow (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressionsWithWindowFunctions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Pulls out nondeterministic expressions from LogicalPlan which is not Project or Filter,
   * put them into an inner Project and finally project them away at the outer Project.
   */
  public  class PullOutNondeterministic {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static private  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.NamedExpression> getNondeterToAttr (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
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
  }
  /**
   * Pulls out nondeterministic expressions from LogicalPlan which is not Project or Filter,
   * put them into an inner Project and finally project them away at the outer Project.
   */
  public  class PullOutNondeterministic$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PullOutNondeterministic$ MODULE$ = null;
    public   PullOutNondeterministic$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    private  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.NamedExpression> getNondeterToAttr (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  }
  /**
   * Set the seed for random number generation.
   */
  public  class ResolveRandomSeed {
    static private  scala.util.Random random ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Set the seed for random number generation.
   */
  public  class ResolveRandomSeed$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveRandomSeed$ MODULE$ = null;
    public   ResolveRandomSeed$ ()  { throw new RuntimeException(); }
    private  scala.util.Random random ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Correctly handle null primitive inputs for UDF by adding extra {@link If} expression to do the
   * null check.  When user defines a UDF with primitive parameters, there is no way to tell if the
   * primitive parameter is null or not, so here we assume the primitive input is null-propagatable
   * and we should return null if the input is null.
   */
  public  class HandleNullInputsForUDF {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Correctly handle null primitive inputs for UDF by adding extra {@link If} expression to do the
   * null check.  When user defines a UDF with primitive parameters, there is no way to tell if the
   * primitive parameter is null or not, so here we assume the primitive input is null-propagatable
   * and we should return null if the input is null.
   */
  public  class HandleNullInputsForUDF$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final HandleNullInputsForUDF$ MODULE$ = null;
    public   HandleNullInputsForUDF$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Check and add proper window frames for all window functions.
   */
  public  class ResolveWindowFrame {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Check and add proper window frames for all window functions.
   */
  public  class ResolveWindowFrame$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveWindowFrame$ MODULE$ = null;
    public   ResolveWindowFrame$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Check and add order to {@link AggregateWindowFunction}s.
   */
  public  class ResolveWindowOrder {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Check and add order to {@link AggregateWindowFunction}s.
   */
  public  class ResolveWindowOrder$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveWindowOrder$ MODULE$ = null;
    public   ResolveWindowOrder$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Removes natural or using joins by calculating output columns based on output from two sides,
   * Then apply a Project on a normal Join to eliminate natural or using join.
   */
  public  class ResolveNaturalAndUsingJoin {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Removes natural or using joins by calculating output columns based on output from two sides,
   * Then apply a Project on a normal Join to eliminate natural or using join.
   */
  public  class ResolveNaturalAndUsingJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveNaturalAndUsingJoin$ MODULE$ = null;
    public   ResolveNaturalAndUsingJoin$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Resolves columns of an output table from the data in a logical plan. This rule will:
   * <p>
   * - Reorder columns when the write is by name
   * - Insert safe casts when data types do not match
   * - Insert aliases when column names do not match
   * - Detect plans that are not compatible with the output table and throw AnalysisException
   */
  public  class ResolveOutputRelation {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveOutputColumns (java.lang.String tableName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> expected, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, boolean byName)  { throw new RuntimeException(); }
    static private  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> checkField (org.apache.spark.sql.catalyst.expressions.Attribute tableAttr, org.apache.spark.sql.catalyst.expressions.NamedExpression queryExpr, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> addError)  { throw new RuntimeException(); }
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
  }
  /**
   * Resolves columns of an output table from the data in a logical plan. This rule will:
   * <p>
   * - Reorder columns when the write is by name
   * - Insert safe casts when data types do not match
   * - Insert aliases when column names do not match
   * - Detect plans that are not compatible with the output table and throw AnalysisException
   */
  public  class ResolveOutputRelation$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveOutputRelation$ MODULE$ = null;
    public   ResolveOutputRelation$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveOutputColumns (java.lang.String tableName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> expected, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, boolean byName)  { throw new RuntimeException(); }
    private  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> checkField (org.apache.spark.sql.catalyst.expressions.Attribute tableAttr, org.apache.spark.sql.catalyst.expressions.NamedExpression queryExpr, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> addError)  { throw new RuntimeException(); }
  }
  /**
   * Replaces {@link UnresolvedDeserializer} with the deserialization expression that has been resolved
   * to the given input attributes.
   */
  public  class ResolveDeserializer {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static private  void fail (org.apache.spark.sql.types.StructType schema, int maxOrdinal)  { throw new RuntimeException(); }
    /**
     * For each top-level Tuple field, we use {@link GetColumnByOrdinal} to get its corresponding column
     * by position.  However, the actual number of columns may be different from the number of Tuple
     * fields.  This method is used to check the number of columns and fields, and throw an
     * exception if they do not match.
     * @param deserializer (undocumented)
     * @param inputs (undocumented)
     */
    static private  void validateTopLevelTupleFields (org.apache.spark.sql.catalyst.expressions.Expression deserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputs)  { throw new RuntimeException(); }
    /**
     * For each nested Tuple field, we use {@link GetStructField} to get its corresponding struct field
     * by position.  However, the actual number of struct fields may be different from the number
     * of nested Tuple fields.  This method is used to check the number of struct fields and nested
     * Tuple fields, and throw an exception if they do not match.
     * @param deserializer (undocumented)
     */
    static private  void validateNestedTupleFields (org.apache.spark.sql.catalyst.expressions.Expression deserializer)  { throw new RuntimeException(); }
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
  }
  /**
   * Replaces {@link UnresolvedDeserializer} with the deserialization expression that has been resolved
   * to the given input attributes.
   */
  public  class ResolveDeserializer$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveDeserializer$ MODULE$ = null;
    public   ResolveDeserializer$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    private  void fail (org.apache.spark.sql.types.StructType schema, int maxOrdinal)  { throw new RuntimeException(); }
    /**
     * For each top-level Tuple field, we use {@link GetColumnByOrdinal} to get its corresponding column
     * by position.  However, the actual number of columns may be different from the number of Tuple
     * fields.  This method is used to check the number of columns and fields, and throw an
     * exception if they do not match.
     * @param deserializer (undocumented)
     * @param inputs (undocumented)
     */
    private  void validateTopLevelTupleFields (org.apache.spark.sql.catalyst.expressions.Expression deserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputs)  { throw new RuntimeException(); }
    /**
     * For each nested Tuple field, we use {@link GetStructField} to get its corresponding struct field
     * by position.  However, the actual number of struct fields may be different from the number
     * of nested Tuple fields.  This method is used to check the number of struct fields and nested
     * Tuple fields, and throw an exception if they do not match.
     * @param deserializer (undocumented)
     */
    private  void validateNestedTupleFields (org.apache.spark.sql.catalyst.expressions.Expression deserializer)  { throw new RuntimeException(); }
  }
  /**
   * Resolves {@link NewInstance} by finding and adding the outer scope to it if the object being
   * constructed is an inner class.
   */
  public  class ResolveNewInstance {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Resolves {@link NewInstance} by finding and adding the outer scope to it if the object being
   * constructed is an inner class.
   */
  public  class ResolveNewInstance$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveNewInstance$ MODULE$ = null;
    public   ResolveNewInstance$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Replace the {@link UpCast} expression by {@link Cast}, and throw exceptions if the cast may truncate.
   */
  public  class ResolveUpCast {
    static private  scala.runtime.Nothing$ fail (org.apache.spark.sql.catalyst.expressions.Expression from, org.apache.spark.sql.types.DataType to, scala.collection.Seq<java.lang.String> walkedTypePath)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  }
  /**
   * Replace the {@link UpCast} expression by {@link Cast}, and throw exceptions if the cast may truncate.
   */
  public  class ResolveUpCast$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveUpCast$ MODULE$ = null;
    public   ResolveUpCast$ ()  { throw new RuntimeException(); }
    private  scala.runtime.Nothing$ fail (org.apache.spark.sql.catalyst.expressions.Expression from, org.apache.spark.sql.types.DataType to, scala.collection.Seq<java.lang.String> walkedTypePath)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public   Analyzer (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.internal.SQLConf conf, int maxIterations)  { throw new RuntimeException(); }
  public   Analyzer (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.CTESubstitution$ CTESubstitution ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractGenerator$ ExtractGenerator ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractWindowExpressions$ ExtractWindowExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.FixNullability$ FixNullability ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.GlobalAggregates$ GlobalAggregates ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.HandleNullInputsForUDF$ HandleNullInputsForUDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.LookupFunctions$ LookupFunctions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.PullOutNondeterministic$ PullOutNondeterministic ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAggAliasInGroupBy$ ResolveAggAliasInGroupBy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAggregateFunctions$ ResolveAggregateFunctions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAliases$ ResolveAliases ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveDeserializer$ ResolveDeserializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveFunctions$ ResolveFunctions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGenerate$ ResolveGenerate ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGroupingAnalytics$ ResolveGroupingAnalytics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveMissingReferences$ ResolveMissingReferences ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveNaturalAndUsingJoin$ ResolveNaturalAndUsingJoin ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveNewInstance$ ResolveNewInstance ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveOrdinalInOrderByAndGroupBy$ ResolveOrdinalInOrderByAndGroupBy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveOutputRelation$ ResolveOutputRelation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolvePivot$ ResolvePivot ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveRandomSeed$ ResolveRandomSeed ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveReferences$ ResolveReferences ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveRelations$ ResolveRelations ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveSubquery$ ResolveSubquery ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveSubqueryColumnAliases$ ResolveSubqueryColumnAliases ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveUpCast$ ResolveUpCast ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveWindowFrame$ ResolveWindowFrame ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveWindowOrder$ ResolveWindowOrder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.WindowsSubstitution$ WindowsSubstitution ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.Project commonNaturalJoinProcessing (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.collection.Seq<java.lang.String> joinNames, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition)  { throw new RuntimeException(); }
  private  boolean containsDeserializer (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan execute (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan executeAndCheck (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan executeSameContext (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Override to provide additional rules for the "Resolution" batch.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> extendedResolutionRules ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.FixedPoint fixedPoint ()  { throw new RuntimeException(); }
  /**
   * Override to provide rules to do post-hoc resolution. Note that these rules will be executed
   * in an individual batch. This batch is to run right after the normal resolution batch and
   * execute its rules in one pass.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> postHocResolutionRules ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression resolveExpression (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, boolean throws_)  { throw new RuntimeException(); }
  /**
   * Literal functions do not require the user to specify braces when calling them
   * When an attributes is not resolvable, we try to resolve it as a literal function.
   * @param nameParts (undocumented)
   * @param attribute (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> resolveLiteralFunction (scala.collection.Seq<java.lang.String> nameParts, org.apache.spark.sql.catalyst.analysis.UnresolvedAttribute attribute, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  { throw new RuntimeException(); }
}
