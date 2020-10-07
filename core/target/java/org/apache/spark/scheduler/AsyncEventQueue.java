package org.apache.spark.scheduler;
/**
 * An asynchronous queue for events. All events posted to this queue will be delivered to the child
 * listeners in a separate thread.
 * <p>
 * Delivery will only begin when the <code>start()</code> method is called. The <code>stop()</code> method should be
 * called when no more events need to be delivered.
 */
public  class AsyncEventQueue implements org.apache.spark.scheduler.SparkListenerBus, org.apache.spark.internal.Logging {
  static public  java.lang.Object POISON_PILL ()  { throw new RuntimeException(); }
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
  static   java.util.List<L> listeners ()  { throw new RuntimeException(); }
  static public final  void addListener (L listener)  { throw new RuntimeException(); }
  static public final  void removeListener (L listener)  { throw new RuntimeException(); }
  static public  void postToAll (E event)  { throw new RuntimeException(); }
  static protected  boolean isIgnorableException (java.lang.Throwable e)  { throw new RuntimeException(); }
  static  <T extends L> scala.collection.Seq<T> findListenersByClass (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  static protected  void doPostEvent (org.apache.spark.scheduler.SparkListenerInterface listener, org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public   AsyncEventQueue (java.lang.String name, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.LiveListenerBusMetrics metrics, org.apache.spark.scheduler.LiveListenerBus bus)  { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<org.apache.spark.scheduler.SparkListenerEvent> eventQueue ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicLong eventCount ()  { throw new RuntimeException(); }
  /** A counter for dropped events. It will be reset every time we log it. */
  private  java.util.concurrent.atomic.AtomicLong droppedEventsCounter ()  { throw new RuntimeException(); }
  /** When `droppedEventsCounter` was logged last time in milliseconds. */
  private  long lastReportTimestamp ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean logDroppedEvent ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean started ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean stopped ()  { throw new RuntimeException(); }
  private  com.codahale.metrics.Counter droppedEvents ()  { throw new RuntimeException(); }
  private  com.codahale.metrics.Timer processingTime ()  { throw new RuntimeException(); }
  private  java.lang.Thread dispatchThread ()  { throw new RuntimeException(); }
  private  void dispatch ()  { throw new RuntimeException(); }
  protected  scala.Option<com.codahale.metrics.Timer> getTimer (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
  /**
   * Start an asynchronous thread to dispatch events to the underlying listeners.
   * <p>
   * @param sc Used to stop the SparkContext in case the async dispatcher fails.
   */
    void start (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Stop the listener bus. It will wait until the queued events have been processed, but new
   * events will be dropped.
   */
    void stop ()  { throw new RuntimeException(); }
  public  void post (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  /**
   * For testing only. Wait until there are no more events in the queue.
   * <p>
   * @return true if the queue is empty.
   * @param deadline (undocumented)
   */
  public  boolean waitUntilEmpty (long deadline)  { throw new RuntimeException(); }
  public  void removeListenerOnError (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
}
