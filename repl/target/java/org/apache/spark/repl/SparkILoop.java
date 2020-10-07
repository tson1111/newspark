package org.apache.spark.repl;
/**
 *  A Spark-specific interactive shell.
 */
public  class SparkILoop extends scala.tools.nsc.interpreter.ILoop {
  /**
   * Creates an interpreter loop with default settings and feeds
   * the given code to it as input.
   * @param code (undocumented)
   * @param sets (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String run (java.lang.String code, scala.tools.nsc.Settings sets)  { throw new RuntimeException(); }
  static public  java.lang.String run (scala.collection.immutable.List<java.lang.String> lines)  { throw new RuntimeException(); }
  static protected  java.io.PrintWriter out ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.IMain interpreter ()  { throw new RuntimeException(); }
  static public  void interpreter_$eq (scala.tools.nsc.Interpreter i)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.InteractiveReader in ()  { throw new RuntimeException(); }
  static public  void in_$eq (scala.tools.nsc.interpreter.InteractiveReader x$1)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.Settings settings ()  { throw new RuntimeException(); }
  static public  void settings_$eq (scala.tools.nsc.Settings x$1)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.IMain intp ()  { throw new RuntimeException(); }
  static public  void intp_$eq (scala.tools.nsc.interpreter.IMain x$1)  { throw new RuntimeException(); }
  static protected  void asyncMessage (java.lang.String msg)  { throw new RuntimeException(); }
  static public  void echoCommandMessage (java.lang.String msg)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.Power<scala.tools.nsc.interpreter.StdReplVals> power ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.session.History history ()  { throw new RuntimeException(); }
  static public  java.lang.String addedClasspath ()  { throw new RuntimeException(); }
  static public  void addedClasspath_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<java.lang.String> replayCommandStack ()  { throw new RuntimeException(); }
  static public  void replayCommandStack_$eq (scala.collection.immutable.List<java.lang.String> x$1)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<java.lang.String> replayCommands ()  { throw new RuntimeException(); }
  static public  void addReplay (java.lang.String cmd)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T savingReplayStack (scala.Function0<T> body)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T savingReader (scala.Function0<T> body)  { throw new RuntimeException(); }
  static public  void closeInterpreter ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result helpCommand (java.lang.String line)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.LoopCommand historyCommand ()  { throw new RuntimeException(); }
  static protected  void echoAndRefresh (java.lang.String msg)  { throw new RuntimeException(); }
  static protected  boolean mum ()  { throw new RuntimeException(); }
  static protected  void mum_$eq (boolean x$1)  { throw new RuntimeException(); }
  static protected  void echo (java.lang.String msg)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> A mumly (scala.Function0<A> op)  { throw new RuntimeException(); }
  static public  void searchHistory (java.lang.String _cmdline)  { throw new RuntimeException(); }
  static public  java.lang.String prompt ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> standardCommands ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> powerCommands ()  { throw new RuntimeException(); }
  static protected  scala.tools.nsc.interpreter.JavapClass newJavap ()  { throw new RuntimeException(); }
  static public  java.lang.String replayQuestionMessage ()  { throw new RuntimeException(); }
  static public  boolean processLine (java.lang.String line)  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value loop ()  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value loop (java.lang.String line)  { throw new RuntimeException(); }
  static public  void interpretAllFrom (scala.reflect.io.File file, boolean verbose)  { throw new RuntimeException(); }
  static public  void replayCommand (java.lang.String line)  { throw new RuntimeException(); }
  static public  void reset ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result lineCommand (java.lang.String what)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result editCommand (java.lang.String what)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result editCommand (java.lang.String what, scala.Option<java.lang.String> editor)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.LoopCommand shCommand ()  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Option<A> withFile (java.lang.String filename, scala.Function1<scala.reflect.io.File, A> action)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result loadCommand (java.lang.String arg)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result saveCommand (java.lang.String filename)  { throw new RuntimeException(); }
  static public  void addClasspath (java.lang.String arg)  { throw new RuntimeException(); }
  static public  void require (java.lang.String arg)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result powerCmd ()  { throw new RuntimeException(); }
  static public  void enablePowerMode (boolean isDuringInit)  { throw new RuntimeException(); }
  static public  void asyncEcho (boolean async, scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static public  void verbosity ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result command (java.lang.String line)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result pasteCommand (java.lang.String arg)  { throw new RuntimeException(); }
  static public final  scala.Option<java.lang.String> interpretStartingWith (java.lang.String code)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.InteractiveReader chooseReader (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
  static public  void main (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
  static public  boolean interpretAllFrom$default$2 ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkILoop (scala.Option<java.io.BufferedReader> in0, java.io.PrintWriter out)  { throw new RuntimeException(); }
  public   SparkILoop (java.io.BufferedReader in0, java.io.PrintWriter out)  { throw new RuntimeException(); }
  public   SparkILoop ()  { throw new RuntimeException(); }
  /**
   * TODO: Remove the following <code>override</code> when the support of Scala 2.11 is ended
   * Scala 2.11 has a bug of finding imported types in class constructors, extends clause
   * which is fixed in Scala 2.12 but never be back-ported into Scala 2.11.x.
   * As a result, we copied the fixes into <code>SparkILoopInterpreter</code>. See SPARK-22393 for detail.
   */
  public  void createInterpreter ()  { throw new RuntimeException(); }
  private  boolean isScala2_11 ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> initializationCommands ()  { throw new RuntimeException(); }
  public  void initializeSpark ()  { throw new RuntimeException(); }
  /** Print a welcome message */
  public  void printWelcome ()  { throw new RuntimeException(); }
  /** Available commands */
  public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> commands ()  { throw new RuntimeException(); }
  public  void resetCommand (java.lang.String line)  { throw new RuntimeException(); }
  public  void replay ()  { throw new RuntimeException(); }
  /**
   * TODO: Remove <code>runClosure</code> when the support of Scala 2.11 is ended
   * @param body (undocumented)
   * @return (undocumented)
   */
  private  boolean runClosure (scala.Function0<java.lang.Object> body)  { throw new RuntimeException(); }
  /**
   * The following code is mostly a copy of <code>process</code> implementation in <code>ILoop.scala</code> in Scala
   * <p>
   * In newer version of Scala, <code>printWelcome</code> is the first thing to be called. As a result,
   * SparkUI URL information would be always shown after the welcome message.
   * <p>
   * However, this is inconsistent compared with the existing version of Spark which will always
   * show SparkUI URL first.
   * <p>
   * The only way we can make it consistent will be duplicating the Scala code.
   * <p>
   * We should remove this duplication once Scala provides a way to load our custom initialization
   * code, and also customize the ordering of printing welcome message.
   * @param settings (undocumented)
   * @return (undocumented)
   */
  public  boolean process (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
}
