package org.apache.spark.sql.catalyst.analysis;
/**
 * Resolve the lambda variables exposed by a higher order functions.
 * <p>
 * This rule works in two steps:
 * [1]. Bind the anonymous variables exposed by the higher order function to the lambda function's
 *      arguments; this creates named and typed lambda variables. The argument names are checked
 *      for duplicates and the number of arguments are checked during this step.
 * [2]. Resolve the used lambda variables used in the lambda function's function expression tree.
 *      Note that we allow the use of variables from outside the current lambda, this can either
 *      be a lambda function defined in an outer scope, or a attribute in produced by the plan's
 *      child. If names are duplicate, the name defined in the most inner scope is used.
 */
public  class ResolveLambdaVariables extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolveLambdaVariables (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.String, java.lang.String> canonicalizer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Create a bound lambda function by binding the arguments of a lambda function to the given
   * partial arguments (dataType and nullability only). If the expression happens to be an already
   * bound lambda function then we assume it has been bound to the correct arguments and do
   * nothing. This function will produce a lambda function with hidden arguments when it is passed
   * an arbitrary expression.
   * @param e (undocumented)
   * @param argInfo (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.LambdaFunction createLambda (org.apache.spark.sql.catalyst.expressions.Expression e, scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.types.DataType, java.lang.Object>> argInfo)  { throw new RuntimeException(); }
  /**
   * Resolve lambda variables in the expression subtree, using the passed lambda variable registry.
   * @param e (undocumented)
   * @param parentLambdaMap (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.Expression resolve (org.apache.spark.sql.catalyst.expressions.Expression e, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.expressions.NamedExpression> parentLambdaMap)  { throw new RuntimeException(); }
}
