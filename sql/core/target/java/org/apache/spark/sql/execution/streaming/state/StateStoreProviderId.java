package org.apache.spark.sql.execution.streaming.state;
/**
 * Unique identifier for a provider, used to identify when providers can be reused.
 * Note that <code>queryRunId</code> is used uniquely identify a provider, so that the same provider
 * instance is not reused across query restarts.
 */
public  class StateStoreProviderId implements scala.Product, scala.Serializable {
  static   org.apache.spark.sql.execution.streaming.state.StateStoreProviderId apply (org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo stateInfo, int partitionIndex, java.lang.String storeName)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId storeId ()  { throw new RuntimeException(); }
  public  java.util.UUID queryRunId ()  { throw new RuntimeException(); }
  // not preceding
  public   StateStoreProviderId (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId, java.util.UUID queryRunId)  { throw new RuntimeException(); }
}
