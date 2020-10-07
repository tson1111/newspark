package org.apache.spark.sql.catalyst.expressions;
public  class Cast$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Cast$ MODULE$ = null;
  public   Cast$ ()  { throw new RuntimeException(); }
  /**
   * Returns true iff we can cast <code>from</code> type to <code>to</code> type.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  public  boolean canCast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  /**
   * Return true if we need to use the <code>timeZone</code> information casting <code>from</code> type to <code>to</code> type.
   * The patterns matched reflect the current implementation in the Cast node.
   * c.f. usage of <code>timeZone</code> in:
   * * Cast.castToString
   * * Cast.castToDate
   * * Cast.castToTimestamp
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  public  boolean needsTimeZone (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  /**
   * Return true iff we may truncate during casting <code>from</code> type to <code>to</code> type. e.g. long -> int,
   * timestamp -> date.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  public  boolean mayTruncate (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  private  boolean illegalNumericPrecedence (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  /**
   * Returns true iff we can safely cast the <code>from</code> type to <code>to</code> type without any truncating or
   * precision lose, e.g. int -> long, date -> timestamp.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  public  boolean canSafeCast (org.apache.spark.sql.types.AtomicType from, org.apache.spark.sql.types.AtomicType to)  { throw new RuntimeException(); }
  private  boolean legalNumericPrecedence (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  public  boolean canNullSafeCastToDecimal (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DecimalType to)  { throw new RuntimeException(); }
  public  boolean forceNullable (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  public  boolean resolvableNullability (boolean from, boolean to)  { throw new RuntimeException(); }
}
