package org.apache.spark.metrics.sink;
  interface Sink {
  public  void report ()  ;
  public  void start ()  ;
  public  void stop ()  ;
}
