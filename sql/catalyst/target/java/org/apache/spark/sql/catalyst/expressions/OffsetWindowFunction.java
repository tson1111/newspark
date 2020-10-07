package org.apache.spark.sql.catalyst.expressions;
/**
 * An offset window function is a window function that returns the value of the input column offset
 * by a number of rows within the partition. For instance: an OffsetWindowfunction for value x with
 * offset -2, will get the value of x 2 rows back in the partition.
 */
public abstract class OffsetWindowFunction extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.WindowFunction, org.apache.spark.sql.catalyst.expressions.Unevaluable, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public   OffsetWindowFunction ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  /**
   * Direction of the number of rows between the current row and the row where the input expression
   * is evaluated.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.expressions.SortDirection direction ()  ;
  public  boolean foldable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.WindowFrame frame ()  { throw new RuntimeException(); }
  /**
   * Input expression to evaluate against a row which a number of rows below or above (depending on
   * the value and sign of the offset) the current row.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression input ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  /**
   * (Foldable) expression that contains the number of rows between the current row and the row
   * where the input expression is evaluated.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression offset ()  ;
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
