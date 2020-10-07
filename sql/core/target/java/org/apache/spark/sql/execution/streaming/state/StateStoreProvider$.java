package org.apache.spark.sql.execution.streaming.state;
public  class StateStoreProvider$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StateStoreProvider$ MODULE$ = null;
  public   StateStoreProvider$ ()  { throw new RuntimeException(); }
  /**
   * Return a instance of the given provider class name. The instance will not be initialized.
   * @param providerClassName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.state.StateStoreProvider create (java.lang.String providerClassName)  { throw new RuntimeException(); }
  /**
   * Return a instance of the required provider, initialized with the given configurations.
   * @param stateStoreId (undocumented)
   * @param keySchema (undocumented)
   * @param valueSchema (undocumented)
   * @param indexOrdinal (undocumented)
   * @param storeConf (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.state.StateStoreProvider createAndInit (org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, scala.Option<java.lang.Object> indexOrdinal, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
}
