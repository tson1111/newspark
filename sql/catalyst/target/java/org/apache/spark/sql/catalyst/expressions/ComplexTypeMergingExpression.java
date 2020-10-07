package org.apache.spark.sql.catalyst.expressions;
/**
 * A trait resolving nullable, containsNull, valueContainsNull flags of the output date type.
 * This logic is usually utilized by expressions combining data from multiple child expressions
 * of non-primitive types (e.g. {@link CaseWhen}).
 */
public  interface ComplexTypeMergingExpression {
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  void dataTypeCheck ()  ;
  /**
   * A collection of data types used for resolution the output type of the expression. By default,
   * data types of all child expressions. The collection must not be empty.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypesForMerging ()  ;
}
