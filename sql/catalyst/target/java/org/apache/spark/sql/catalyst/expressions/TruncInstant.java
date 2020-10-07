package org.apache.spark.sql.catalyst.expressions;
public  interface TruncInstant extends org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode codeGenHelper (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, int maxLevel, boolean orderReversed, scala.Function2<java.lang.String, java.lang.String, java.lang.String> truncFunc)  ;
  /**
   * @param input internalRow (time)
   * @param maxLevel Maximum level that can be used for truncation (e.g MONTH for Date input)
   * @param truncFunc function: (time, level) =&gt; time
   * @return (undocumented)
   */
  public  Object evalHelper (org.apache.spark.sql.catalyst.InternalRow input, int maxLevel, scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> truncFunc)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression format ()  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression instant ()  ;
  public  boolean nullable ()  ;
  public  int truncLevel ()  ;
}
