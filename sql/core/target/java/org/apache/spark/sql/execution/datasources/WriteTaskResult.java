package org.apache.spark.sql.execution.datasources;
/** The result of a successful write task. */
public  class WriteTaskResult implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitMsg ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.ExecutedWriteSummary summary ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteTaskResult (org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitMsg, org.apache.spark.sql.execution.datasources.ExecutedWriteSummary summary)  { throw new RuntimeException(); }
}
