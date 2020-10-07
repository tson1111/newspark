package org.apache.spark.repl;
public  interface SparkExprTyper extends scala.tools.nsc.interpreter.ExprTyper {
  public  scala.tools.nsc.interpreter.Results.Result doInterpret (java.lang.String code)  ;
  public  scala.reflect.internal.Symbols.Symbol symbolOfLine (java.lang.String code)  ;
}
