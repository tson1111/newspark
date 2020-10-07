package org.apache.spark.status;
/**
 * A KVStore wrapper that allows tracking the number of elements of specific types, and triggering
 * actions once they reach a threshold. This allows writers, for example, to control how much data
 * is stored by potentially deleting old data as new data is added.
 * <p>
 * This store is used when populating data either from a live UI or an event log. On top of firing
 * triggers when elements reach a certain threshold, it provides two extra bits of functionality:
 * <p>
 * - a generic worker thread that can be used to run expensive tasks asynchronously; the tasks can
 *   be configured to run on the calling thread when more determinism is desired (e.g. unit tests).
 * - a generic flush mechanism so that listeners can be notified about when they should flush
 *   internal state to the store (e.g. after the SHS finishes parsing an event log).
 * <p>
 * The configured triggers are run on a separate thread by default; they can be forced to run on
 * the calling thread by setting the <code>ASYNC_TRACKING_ENABLED</code> configuration to <code>false</code>.
 */
  class ElementTrackingStore implements org.apache.spark.util.kvstore.KVStore {
  private  class Trigger<T extends java.lang.Object> implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  long threshold ()  { throw new RuntimeException(); }
    public  scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> action ()  { throw new RuntimeException(); }
    // not preceding
    public   Trigger (long threshold, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> action)  { throw new RuntimeException(); }
  }
  private  class Trigger$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Trigger$ MODULE$ = null;
    public   Trigger$ ()  { throw new RuntimeException(); }
  }
  public   ElementTrackingStore (org.apache.spark.util.kvstore.KVStore store, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Register a trigger that will be fired once the number of elements of a given type reaches
   * the given threshold.
   * <p>
   * @param klass The type to monitor.
   * @param threshold The number of elements that should trigger the action.
   * @param action Action to run when the threshold is reached; takes as a parameter the number
   *               of elements of the registered type currently known to be in the store.
   */
  public  void addTrigger (java.lang.Class<?> klass, long threshold, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> action)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /** A close() method that optionally leaves the parent store open. */
  public  void close (boolean closeParent)  { throw new RuntimeException(); }
  public  long count (java.lang.Class<?> klass)  { throw new RuntimeException(); }
  public  long count (java.lang.Class<?> klass, java.lang.String index, Object indexedValue)  { throw new RuntimeException(); }
  public  void delete (java.lang.Class<?> klass, Object naturalKey)  { throw new RuntimeException(); }
  /**
   * Enqueues an action to be executed asynchronously. The task will run on the calling thread if
   * <code>ASYNC_TRACKING_ENABLED</code> is <code>false</code>.
   * @param fn (undocumented)
   */
  public  void doAsync (scala.Function0<scala.runtime.BoxedUnit> fn)  { throw new RuntimeException(); }
  private  java.util.concurrent.ExecutorService executor ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ListBuffer<scala.Function0<scala.runtime.BoxedUnit>> flushTriggers ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T getMetadata (java.lang.Class<T> klass)  { throw new RuntimeException(); }
  /**
   * Adds a trigger to be executed before the store is flushed. This normally happens before
   * closing, and is useful for flushing intermediate state to the store, e.g. when replaying
   * in-progress applications through the SHS.
   * <p>
   * Flush triggers are called synchronously in the same thread that is closing the store.
   * @param action (undocumented)
   */
  public  void onFlush (scala.Function0<scala.runtime.BoxedUnit> action)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T read (java.lang.Class<T> klass, Object naturalKey)  { throw new RuntimeException(); }
  public  void setMetadata (Object value)  { throw new RuntimeException(); }
  private  boolean stopped ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Class<?>, scala.collection.Seq<org.apache.spark.status.ElementTrackingStore.Trigger<?>>> triggers ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.util.kvstore.KVStoreView<T> view (java.lang.Class<T> klass)  { throw new RuntimeException(); }
  public  void write (Object value)  { throw new RuntimeException(); }
  /** Write an element to the store, optionally checking for whether to fire triggers. */
  public  void write (Object value, boolean checkTriggers)  { throw new RuntimeException(); }
}
