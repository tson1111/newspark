package org.apache.spark.sql.catalyst.rules;
public  class QueryExecutionMetering implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public   QueryExecutionMetering ()  { throw new RuntimeException(); }
  private  com.google.common.util.concurrent.AtomicLongMap<java.lang.String> timeMap ()  { throw new RuntimeException(); }
  private  com.google.common.util.concurrent.AtomicLongMap<java.lang.String> numRunsMap ()  { throw new RuntimeException(); }
  private  com.google.common.util.concurrent.AtomicLongMap<java.lang.String> numEffectiveRunsMap ()  { throw new RuntimeException(); }
  private  com.google.common.util.concurrent.AtomicLongMap<java.lang.String> timeEffectiveRunsMap ()  { throw new RuntimeException(); }
  /** Resets statistics about time spent running specific rules */
  public  void resetMetrics ()  { throw new RuntimeException(); }
  public  long totalTime ()  { throw new RuntimeException(); }
  public  long totalNumRuns ()  { throw new RuntimeException(); }
  public  void incExecutionTimeBy (java.lang.String ruleName, long delta)  { throw new RuntimeException(); }
  public  void incTimeEffectiveExecutionBy (java.lang.String ruleName, long delta)  { throw new RuntimeException(); }
  public  void incNumEffectiveExecution (java.lang.String ruleName)  { throw new RuntimeException(); }
  public  void incNumExecution (java.lang.String ruleName)  { throw new RuntimeException(); }
  /** Dump statistics about time spent running specific rules. */
  public  java.lang.String dumpTimeSpent ()  { throw new RuntimeException(); }
}
