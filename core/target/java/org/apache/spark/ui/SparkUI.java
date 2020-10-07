package org.apache.spark.ui;
/**
 * Top level user interface for a Spark application.
 */
  class SparkUI extends org.apache.spark.ui.WebUI implements org.apache.spark.internal.Logging, org.apache.spark.status.api.v1.UIRoot {
  static public  int DEFAULT_PORT ()  { throw new RuntimeException(); }
  static public  java.lang.String STATIC_RESOURCE_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String DEFAULT_POOL_NAME ()  { throw new RuntimeException(); }
  static public  int getUIPort (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Create a new UI backed by an AppStatusStore.
   * @param sc (undocumented)
   * @param store (undocumented)
   * @param conf (undocumented)
   * @param securityManager (undocumented)
   * @param appName (undocumented)
   * @param basePath (undocumented)
   * @param startTime (undocumented)
   * @param appSparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ui.SparkUI create (scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.status.AppStatusStore store, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, long startTime, java.lang.String appSparkVersion)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SSLOptions sslOptions ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.ArrayBuffer<org.apache.spark.ui.WebUITab> tabs ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.ArrayBuffer<org.eclipse.jetty.servlet.ServletContextHandler> handlers ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.HashMap<org.apache.spark.ui.WebUIPage, scala.collection.mutable.ArrayBuffer<org.eclipse.jetty.servlet.ServletContextHandler>> pageToHandlers ()  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.ui.ServerInfo> serverInfo ()  { throw new RuntimeException(); }
  static protected  void serverInfo_$eq (scala.Option<org.apache.spark.ui.ServerInfo> x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String publicHostName ()  { throw new RuntimeException(); }
  static public  java.lang.String getBasePath ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.ui.WebUITab> getTabs ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.eclipse.jetty.servlet.ServletContextHandler> getHandlers ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SecurityManager getSecurityManager ()  { throw new RuntimeException(); }
  static public  void attachTab (org.apache.spark.ui.WebUITab tab)  { throw new RuntimeException(); }
  static public  void detachTab (org.apache.spark.ui.WebUITab tab)  { throw new RuntimeException(); }
  static public  void detachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  static public  void attachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  static public  void attachHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  static public  void detachHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  static public  void detachHandler (java.lang.String path)  { throw new RuntimeException(); }
  static public  void addStaticHandler (java.lang.String resourceBase, java.lang.String path)  { throw new RuntimeException(); }
  static public  void bind ()  { throw new RuntimeException(); }
  static public  java.lang.String webUrl ()  { throw new RuntimeException(); }
  static public  int boundPort ()  { throw new RuntimeException(); }
  static public  java.lang.String addStaticHandler$default$2 ()  { throw new RuntimeException(); }
  static public  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream)  { throw new RuntimeException(); }
  static public abstract  org.apache.spark.SecurityManager securityManager ()  ;
  public  org.apache.spark.status.AppStatusStore store ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.SparkContext> sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  java.lang.String appName ()  { throw new RuntimeException(); }
  public  java.lang.String basePath ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  public  java.lang.String appSparkVersion ()  { throw new RuntimeException(); }
  // not preceding
  private   SparkUI (org.apache.spark.status.AppStatusStore store, scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, long startTime, java.lang.String appSparkVersion)  { throw new RuntimeException(); }
  public  boolean killEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.scheduler.SparkListener> streamingJobProgressListener ()  { throw new RuntimeException(); }
  /** Initialize all components of the server. */
  public  void initialize ()  { throw new RuntimeException(); }
  public  java.lang.String getSparkUser ()  { throw new RuntimeException(); }
  public  java.lang.String getAppName ()  { throw new RuntimeException(); }
  public  void setAppId (java.lang.String id)  { throw new RuntimeException(); }
  /** Stop the server behind this web interface. Only valid after bind(). */
  public  void stop ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T withSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, scala.Function1<org.apache.spark.ui.SparkUI, T> fn)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfoList ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfo (java.lang.String appId)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.scheduler.SparkListener> getStreamingJobProgressListener ()  { throw new RuntimeException(); }
  public  void setStreamingJobProgressListener (org.apache.spark.scheduler.SparkListener sparkListener)  { throw new RuntimeException(); }
}
