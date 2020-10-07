package org.apache.spark.sql.catalyst.plans.logical.statsEstimation;
public  class JoinEstimation implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Join join ()  { throw new RuntimeException(); }
  // not preceding
  public   JoinEstimation (org.apache.spark.sql.catalyst.plans.logical.Join join)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.Statistics leftStats ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.Statistics rightStats ()  { throw new RuntimeException(); }
  /**
   * Estimate statistics after join. Return <code>None</code> if the join type is not supported, or we don't
   * have enough statistics for estimation.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.Statistics> estimate ()  { throw new RuntimeException(); }
  /**
   * Estimate output size and number of rows after a join operator, and update output column stats.
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.catalyst.plans.logical.Statistics> estimateInnerOuterJoin ()  { throw new RuntimeException(); }
  /**
   * The number of rows of A inner join B on A.k1 = B.k1 is estimated by this basic formula:
   * T(A IJ B) = T(A) * T(B) / max(V(A.k1), V(B.k1)),
   * where V is the number of distinct values (ndv) of that column. The underlying assumption for
   * this formula is: each value of the smaller domain is included in the larger domain.
   * <p>
   * Generally, inner join with multiple join keys can be estimated based on the above formula:
   * T(A IJ B) = T(A) * T(B) / (max(V(A.k1), V(B.k1)) * max(V(A.k2), V(B.k2)) * ... * max(V(A.kn), V(B.kn)))
   * However, the denominator can become very large and excessively reduce the result, so we use a
   * conservative strategy to take only the largest max(V(A.ki), V(B.ki)) as the denominator.
   * <p>
   * That is, join estimation is based on the most selective join keys. We follow this strategy
   * when different types of column statistics are available. E.g., if card1 is the cardinality
   * estimated by ndv of join key A.k1 and B.k1, card2 is the cardinality estimated by histograms
   * of join key A.k2 and B.k2, then the result cardinality would be min(card1, card2).
   * <p>
   * @param keyPairs pairs of join keys
   * <p>
   * @return join cardinality, and column stats for join keys after the join
   */
  private  scala.Tuple2<scala.math.BigInt, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.plans.logical.ColumnStat>> computeCardinalityAndStats (scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.catalyst.expressions.AttributeReference>> keyPairs)  { throw new RuntimeException(); }
  /** Returns join cardinality and the column stat for this pair of join keys. */
  private  scala.Tuple2<scala.math.BigInt, org.apache.spark.sql.catalyst.plans.logical.ColumnStat> computeByNdv (org.apache.spark.sql.catalyst.expressions.AttributeReference leftKey, org.apache.spark.sql.catalyst.expressions.AttributeReference rightKey, scala.Option<java.lang.Object> min, scala.Option<java.lang.Object> max)  { throw new RuntimeException(); }
  /** Compute join cardinality using equi-height histograms. */
  private  scala.Tuple2<scala.math.BigInt, org.apache.spark.sql.catalyst.plans.logical.ColumnStat> computeByHistogram (org.apache.spark.sql.catalyst.expressions.AttributeReference leftKey, org.apache.spark.sql.catalyst.expressions.AttributeReference rightKey, org.apache.spark.sql.catalyst.plans.logical.Histogram leftHistogram, org.apache.spark.sql.catalyst.plans.logical.Histogram rightHistogram, scala.Option<java.lang.Object> newMin, scala.Option<java.lang.Object> newMax)  { throw new RuntimeException(); }
  /**
   * Propagate or update column stats for output attributes.
   * @param outputRows (undocumented)
   * @param output (undocumented)
   * @param oldAttrStats (undocumented)
   * @param keyStatsAfterJoin (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, org.apache.spark.sql.catalyst.plans.logical.ColumnStat>> updateOutputStats (scala.math.BigInt outputRows, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.plans.logical.ColumnStat> oldAttrStats, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.plans.logical.ColumnStat> keyStatsAfterJoin)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.catalyst.expressions.AttributeReference>> extractJoinKeysWithColStats (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.plans.logical.Statistics> estimateLeftSemiAntiJoin ()  { throw new RuntimeException(); }
}
