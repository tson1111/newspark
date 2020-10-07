package org.apache.spark.sql.execution.streaming.state;
/** A class that contains configuration parameters for {@link StateStore}s. */
public  class StateStoreConf implements scala.Serializable {
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreConf empty ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreConf apply (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.internal.SQLConf sqlConf ()  { throw new RuntimeException(); }
  // not preceding
  public   StateStoreConf (org.apache.spark.sql.internal.SQLConf sqlConf)  { throw new RuntimeException(); }
  public   StateStoreConf ()  { throw new RuntimeException(); }
  /**
   * Minimum number of delta files in a chain after which HDFSBackedStateStore will
   * consider generating a snapshot.
   * @return (undocumented)
   */
  public  int minDeltasForSnapshot ()  { throw new RuntimeException(); }
  /** Minimum versions a State Store implementation should retain to allow rollbacks */
  public  int minVersionsToRetain ()  { throw new RuntimeException(); }
  /** Maximum count of versions a State Store implementation should retain in memory */
  public  int maxVersionsToRetainInMemory ()  { throw new RuntimeException(); }
  /**
   * Optional fully qualified name of the subclass of {@link StateStoreProvider}
   * managing state data. That is, the implementation of the State Store to use.
   * @return (undocumented)
   */
  public  java.lang.String providerClass ()  { throw new RuntimeException(); }
  /**
   * Additional configurations related to state store. This will capture all configs in
   * @return (undocumented)
   * SQLConf that start with <code>spark.sql.streaming.stateStore.</code> */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> confs ()  { throw new RuntimeException(); }
}
