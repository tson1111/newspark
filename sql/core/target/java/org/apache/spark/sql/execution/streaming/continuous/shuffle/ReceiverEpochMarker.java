package org.apache.spark.sql.execution.streaming.continuous.shuffle;
  class ReceiverEpochMarker implements org.apache.spark.sql.execution.streaming.continuous.shuffle.RPCContinuousShuffleMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int writerId ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceiverEpochMarker (int writerId)  { throw new RuntimeException(); }
}
