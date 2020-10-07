package org.apache.spark.sql.execution.streaming.continuous.shuffle;
  class ReceiverRow implements org.apache.spark.sql.execution.streaming.continuous.shuffle.RPCContinuousShuffleMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int writerId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow row ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceiverRow (int writerId, org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
}
