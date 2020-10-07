package org.apache.spark.sql.catalyst.expressions.codegen;
public  class CodeFormatter {
  static public  scala.util.matching.Regex commentHolder ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex commentRegexp ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex extraNewLinesRegexp ()  { throw new RuntimeException(); }
  static public  java.lang.String format (org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment code, int maxLines)  { throw new RuntimeException(); }
  static public  java.lang.String stripExtraNewLines (java.lang.String input)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment stripOverlappingComments (org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment codeAndComment)  { throw new RuntimeException(); }
  static public  java.lang.String stripExtraNewLinesAndComments (java.lang.String input)  { throw new RuntimeException(); }
  public   CodeFormatter ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.StringBuilder code ()  { throw new RuntimeException(); }
  private  int indentSize ()  { throw new RuntimeException(); }
  private  int indentLevel ()  { throw new RuntimeException(); }
  private  java.lang.String indentString ()  { throw new RuntimeException(); }
  private  int currentLine ()  { throw new RuntimeException(); }
  private  boolean inCommentBlock ()  { throw new RuntimeException(); }
  private  int indentLevelOutsideCommentBlock ()  { throw new RuntimeException(); }
  private  void addLine (java.lang.String line)  { throw new RuntimeException(); }
  private  java.lang.String result ()  { throw new RuntimeException(); }
}
