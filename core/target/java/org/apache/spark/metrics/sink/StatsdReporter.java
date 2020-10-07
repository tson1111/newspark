package org.apache.spark.metrics.sink;
  class StatsdReporter extends com.codahale.metrics.ScheduledReporter implements org.apache.spark.internal.Logging {
  static public  void start (long x$1, java.util.concurrent.TimeUnit x$2)  { throw new RuntimeException(); }
  static public  void stop ()  { throw new RuntimeException(); }
  static public  void close ()  { throw new RuntimeException(); }
  static protected  java.lang.String getRateUnit ()  { throw new RuntimeException(); }
  static protected  java.lang.String getDurationUnit ()  { throw new RuntimeException(); }
  static protected  double convertDuration (double x$1)  { throw new RuntimeException(); }
  static protected  double convertRate (double x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  public   StatsdReporter (com.codahale.metrics.MetricRegistry registry, java.lang.String host, int port, java.lang.String prefix, com.codahale.metrics.MetricFilter filter, java.util.concurrent.TimeUnit rateUnit, java.util.concurrent.TimeUnit durationUnit)  { throw new RuntimeException(); }
  private  java.net.InetSocketAddress address ()  { throw new RuntimeException(); }
  private  scala.util.matching.Regex whitespace ()  { throw new RuntimeException(); }
  public  void report (java.util.SortedMap<java.lang.String, com.codahale.metrics.Gauge<?>> gauges, java.util.SortedMap<java.lang.String, com.codahale.metrics.Counter> counters, java.util.SortedMap<java.lang.String, com.codahale.metrics.Histogram> histograms, java.util.SortedMap<java.lang.String, com.codahale.metrics.Meter> meters, java.util.SortedMap<java.lang.String, com.codahale.metrics.Timer> timers)  { throw new RuntimeException(); }
  private  void reportGauge (java.lang.String name, com.codahale.metrics.Gauge<?> gauge, java.net.DatagramSocket socket)  { throw new RuntimeException(); }
  private  void reportCounter (java.lang.String name, com.codahale.metrics.Counter counter, java.net.DatagramSocket socket)  { throw new RuntimeException(); }
  private  void reportHistogram (java.lang.String name, com.codahale.metrics.Histogram histogram, java.net.DatagramSocket socket)  { throw new RuntimeException(); }
  private  void reportMetered (java.lang.String name, com.codahale.metrics.Metered meter, java.net.DatagramSocket socket)  { throw new RuntimeException(); }
  private  void reportTimer (java.lang.String name, com.codahale.metrics.Timer timer, java.net.DatagramSocket socket)  { throw new RuntimeException(); }
  private  void send (java.lang.String name, java.lang.String value, java.lang.String metricType, java.net.DatagramSocket socket)  { throw new RuntimeException(); }
  private  java.lang.String fullName (scala.collection.Seq<java.lang.String> names)  { throw new RuntimeException(); }
  private  java.lang.String sanitize (java.lang.String s)  { throw new RuntimeException(); }
  private  java.lang.String format (Object v)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> formatAny (Object v)  { throw new RuntimeException(); }
}
