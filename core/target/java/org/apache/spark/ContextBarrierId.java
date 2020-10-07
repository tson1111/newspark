package org.apache.spark;
/**
 * For each barrier stage attempt, only at most one barrier() call can be active at any time, thus
 * we can use (stageId, stageAttemptId) to identify the stage attempt where the barrier() call is
 * from.
 */
public  class ContextBarrierId implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  // not preceding
  public   ContextBarrierId (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
