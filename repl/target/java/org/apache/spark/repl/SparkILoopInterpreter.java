package org.apache.spark.repl;
public  class SparkILoopInterpreter extends scala.tools.nsc.interpreter.IMain {
  // not preceding
  public  class expressionTyper {
    static public  org.apache.spark.repl.SparkILoopInterpreter repl ()  { throw new RuntimeException(); }
    static public  scala.reflect.internal.Types.Type typeOfExpression (java.lang.String expr, boolean silent)  { throw new RuntimeException(); }
    static public  scala.reflect.internal.Types.Type typeOfTypeString (java.lang.String typeString)  { throw new RuntimeException(); }
    static public  boolean typeOfExpression$default$2 ()  { throw new RuntimeException(); }
    static public  scala.tools.nsc.interpreter.Results.Result doInterpret (java.lang.String code)  { throw new RuntimeException(); }
    static public  scala.reflect.internal.Symbols.Symbol symbolOfLine (java.lang.String code)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class expressionTyper$ implements org.apache.spark.repl.SparkExprTyper {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final expressionTyper$ MODULE$ = null;
    public  org.apache.spark.repl.SparkILoopInterpreter repl ()  { throw new RuntimeException(); }
    public   expressionTyper$ ()  { throw new RuntimeException(); }
  }
  public   SparkILoopInterpreter (scala.tools.nsc.Settings settings, java.io.PrintWriter out)  { throw new RuntimeException(); }
  private  scala.collection.immutable.List<scala.Tuple2<scala.tools.nsc.interpreter.IMain.Request, scala.tools.nsc.interpreter.MemberHandlers.MemberHandler>> allReqAndHandlers ()  { throw new RuntimeException(); }
  public  org.apache.spark.repl.SparkILoopInterpreter.expressionTyper$ expressionTyper ()  { throw new RuntimeException(); }
  public  scala.tools.nsc.interpreter.Imports.ComputedImports importsCode (scala.collection.immutable.Set<scala.reflect.internal.Names.Name> wanted, scala.tools.nsc.interpreter.IMain.Request.Wrapper wrapper, boolean definesClass, boolean generousImports)  { throw new RuntimeException(); }
  public  java.lang.Object memberHandlers ()  { throw new RuntimeException(); }
  public  scala.reflect.internal.Symbols.Symbol symbolOfLine (java.lang.String code)  { throw new RuntimeException(); }
  public  scala.reflect.internal.Types.Type typeOfExpression (java.lang.String expr, boolean silent)  { throw new RuntimeException(); }
}
