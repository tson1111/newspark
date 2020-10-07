package org.apache.spark.sql.execution.streaming.state;
/**
 * Base trait for a versioned key-value store. Each instance of a <code>StateStore</code> represents a specific
 * version of state data, and such instances are created through a {@link StateStoreProvider}.
 */
public  interface StateStore {
  /**
   * Runs the <code>task</code> periodically and automatically cancels it if there is an exception. <code>onError</code>
   * will be called when an exception happens.
   */
  static public  class MaintenanceTask {
    public   MaintenanceTask (long periodMs, scala.Function0<scala.runtime.BoxedUnit> task, scala.Function0<scala.runtime.BoxedUnit> onError)  { throw new RuntimeException(); }
    private  java.util.concurrent.ScheduledExecutorService executor ()  { throw new RuntimeException(); }
    private  java.util.concurrent.ScheduledFuture<?> future ()  { throw new RuntimeException(); }
    public  boolean isRunning ()  { throw new RuntimeException(); }
    private  java.lang.Object runnable ()  { throw new RuntimeException(); }
    public  void stop ()  { throw new RuntimeException(); }
  }
  /** Unique identifier of the store */
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId id ()  ;
  /** Version of the data in this store before committing updates. */
  public  long version ()  ;
  /**
   * Get the current value of a non-null key.
   * @return a non-null row if the key exists in the store, otherwise null.
   * @param key (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  ;
  /**
   * Put a new value for a non-null key. Implementations must be aware that the UnsafeRows in
   * the params can be reused, and must make copies of the data as needed for persistence.
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  ;
  /**
   * Remove a single non-null key.
   * @param key (undocumented)
   */
  public  void remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  ;
  /**
   * Get key value pairs with optional approximate <code>start</code> and <code>end</code> extents.
   * If the State Store implementation maintains indices for the data based on the optional
   * <code>keyIndexOrdinal</code> over fields <code>keySchema</code> (see <code>StateStoreProvider.init()</code>), then it can use
   * <code>start</code> and <code>end</code> to make a best-effort scan over the data. Default implementation returns
   * the full data scan iterator, which is correct but inefficient. Custom implementations must
   * ensure that updates (puts, removes) can be made while iterating over this iterator.
   * <p>
   * @param start UnsafeRow having the <code>keyIndexOrdinal</code> column set with appropriate starting value.
   * @param end UnsafeRow having the <code>keyIndexOrdinal</code> column set with appropriate ending value.
   * @return An iterator of key-value pairs that is guaranteed not miss any key between start and
   *         end, both inclusive.
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> getRange (scala.Option<org.apache.spark.sql.catalyst.expressions.UnsafeRow> start, scala.Option<org.apache.spark.sql.catalyst.expressions.UnsafeRow> end)  ;
  /**
   * Commit all the updates that have been made to the store, and return the new version.
   * Implementations should ensure that no more updates (puts, removes) can be after a commit in
   * order to avoid incorrect usage.
   * @return (undocumented)
   */
  public  long commit ()  ;
  /**
   * Abort all the updates that have been made to the store. Implementations should ensure that
   * no more updates (puts, removes) can be after an abort in order to avoid incorrect usage.
   */
  public  void abort ()  ;
  /**
   * Return an iterator containing all the key-value pairs in the StateStore. Implementations must
   * ensure that updates (puts, removes) can be made while iterating over this iterator.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator ()  ;
  /** Current metrics of the state store */
  public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  ;
  /**
   * Whether all updates have been committed
   * @return (undocumented)
   */
  public  boolean hasCommitted ()  ;
}
