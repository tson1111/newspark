package org.apache.spark.storage;
  class BlockManagerSource implements org.apache.spark.metrics.source.Source {
  // not preceding
  public   BlockManagerSource (org.apache.spark.storage.BlockManager blockManager)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManager blockManager ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  private  void registerGauge (java.lang.String name, scala.Function1<org.apache.spark.storage.BlockManagerMaster, java.lang.Object> func)  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
}
