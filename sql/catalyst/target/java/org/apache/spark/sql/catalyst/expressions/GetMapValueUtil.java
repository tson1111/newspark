package org.apache.spark.sql.catalyst.expressions;
/**
 * Common base class for {@link GetMapValue} and {@link ElementAt}.
 */
public abstract class GetMapValueUtil extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public   GetMapValueUtil ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGetValueGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, org.apache.spark.sql.types.MapType mapType)  { throw new RuntimeException(); }
  public  Object getValueEval (Object value, Object ordinal, org.apache.spark.sql.types.DataType keyType, scala.math.Ordering<java.lang.Object> ordering)  { throw new RuntimeException(); }
}
