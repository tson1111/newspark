package org.apache.spark.util;
/**
 * Contains basic command line parsing functionality and methods to parse some common Spark CLI
 * options.
 */
  interface CommandLineUtils {
    scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> exitFn ()  ;
  public  void main (java.lang.String[] args)  ;
    void printErrorAndExit (java.lang.String str)  ;
    void printMessage (java.lang.String str)  ;
    java.io.PrintStream printStream ()  ;
}
