package org.apache.spark.sql.execution.streaming.state;
/**
 * Helper class to manage state required by a single side of {@link StreamingSymmetricHashJoinExec}.
 * The interface of this class is basically that of a multi-map:
 * - Get: Returns an iterator of multiple values for given key
 * - Append: Append a new value to the given key
 * - Remove Data by predicate: Drop any state using a predicate condition on keys or values
 * <p>
 * param:  joinSide              Defines the join side
 * param:  inputValueAttributes  Attributes of the input row which will be stored as value
 * param:  joinKeys              Expressions to generate rows that will be used to key the value rows
 * param:  stateInfo             Information about how to retrieve the correct version of state
 * param:  storeConf             Configuration for the state store.
 * param:  hadoopConf            Hadoop configuration for reading state data from storage
 * <p>
 * Internally, the key -> multiple values is stored in two {@link StateStore}s.
 * - Store 1 ({@link KeyToNumValuesStore}) maintains mapping between key -> number of values
 * - Store 2 ({@link KeyWithIndexToValueStore}) maintains mapping between (key, index) -> value
 * - Put:   update count in KeyToNumValuesStore,
 *          insert new (key, count) -> value in KeyWithIndexToValueStore
 * - Get:   read count from KeyToNumValuesStore,
 *          read each of the n values in KeyWithIndexToValueStore
 * - Remove state by predicate on keys:
 *          scan all keys in KeyToNumValuesStore to find keys that do match the predicate,
 *          delete from key from KeyToNumValuesStore, delete values in KeyWithIndexToValueStore
 * - Remove state by condition on values:
 *          scan all [(key, index) -> value] in KeyWithIndexToValueStore to find values that match
 *          the predicate, delete corresponding (key, indexToDelete) from KeyWithIndexToValueStore
 *          by overwriting with the value of (key, maxIndex), and removing [(key, maxIndex),
 *          decrement corresponding num values in KeyToNumValuesStore
 */
public  class SymmetricHashJoinStateManager implements org.apache.spark.internal.Logging {
  /**
   * Helper class for representing data returned by {@link KeyWithIndexToValueStore}.
   * Designed for object reuse.
   */
  private  class KeyAndNumValues implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow key ()  { throw new RuntimeException(); }
    public  long numValue ()  { throw new RuntimeException(); }
    // not preceding
    public   KeyAndNumValues (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long numValue)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyAndNumValues withNew (org.apache.spark.sql.catalyst.expressions.UnsafeRow newKey, long newNumValues)  { throw new RuntimeException(); }
  }
  private  class KeyAndNumValues$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object, org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyAndNumValues> implements scala.Serializable {
    public   KeyAndNumValues$ ()  { throw new RuntimeException(); }
  }
  /**
   * Helper class for representing data returned by {@link KeyWithIndexToValueStore}.
   * Designed for object reuse.
   */
  private  class KeyWithIndexAndValue implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow key ()  { throw new RuntimeException(); }
    public  long valueIndex ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow value ()  { throw new RuntimeException(); }
    // not preceding
    public   KeyWithIndexAndValue (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long valueIndex, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyWithIndexAndValue withNew (org.apache.spark.sql.catalyst.expressions.UnsafeRow newKey, long newIndex, org.apache.spark.sql.catalyst.expressions.UnsafeRow newValue)  { throw new RuntimeException(); }
  }
  private  class KeyWithIndexAndValue$ extends scala.runtime.AbstractFunction3<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object, org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyWithIndexAndValue> implements scala.Serializable {
    public   KeyWithIndexAndValue$ ()  { throw new RuntimeException(); }
  }
  /** Helper trait for invoking common functionalities of a state store. */
  private abstract class StateStoreHandler implements org.apache.spark.internal.Logging {
    public   StateStoreHandler (org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.StateStoreType stateStoreType)  { throw new RuntimeException(); }
    public  void abortIfNeeded ()  { throw new RuntimeException(); }
    public  void commit ()  { throw new RuntimeException(); }
    /** Get the StateStore with the given schema */
    protected  org.apache.spark.sql.execution.streaming.state.StateStore getStateStore (org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  { throw new RuntimeException(); }
    /** StateStore that the subclasses of this class is going to operate on */
    protected abstract  org.apache.spark.sql.execution.streaming.state.StateStore stateStore ()  ;
  }
  /** A wrapper around a {@link StateStore} that stores [key -> number of values]. */
  private  class KeyToNumValuesStore extends org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.StateStoreHandler {
    public   KeyToNumValuesStore ()  { throw new RuntimeException(); }
    /** Get the number of values the key has */
    public  long get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyAndNumValues> iterator ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection longToUnsafeRow ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.types.StructType longValueSchema ()  { throw new RuntimeException(); }
    /** Set the number of values the key has */
    public  void put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long numValues)  { throw new RuntimeException(); }
    public  void remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.execution.streaming.state.StateStore stateStore ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.UnsafeRow valueRow ()  { throw new RuntimeException(); }
  }
  /** A wrapper around a {@link StateStore} that stores [(key, index) -> value]. */
  private  class KeyWithIndexToValueStore extends org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.StateStoreHandler {
    public   KeyWithIndexToValueStore ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long valueIndex)  { throw new RuntimeException(); }
    /**
     * Get all values and indices for the provided key.
     * Should not return null.
     * @param key (undocumented)
     * @param numValues (undocumented)
     * @return (undocumented)
     */
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyWithIndexAndValue> getAll (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long numValues)  { throw new RuntimeException(); }
    private  int indexOrdinalInKeyWithIndexRow ()  { throw new RuntimeException(); }
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyWithIndexAndValue> iterator ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection keyRowGenerator ()  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.LeafExpression> keyWithIndexExprs ()  { throw new RuntimeException(); }
    /** Generated a row using the key and index */
    private  org.apache.spark.sql.catalyst.expressions.UnsafeRow keyWithIndexRow (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long valueIndex)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection keyWithIndexRowGenerator ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.types.StructType keyWithIndexSchema ()  { throw new RuntimeException(); }
    /** Put new value for key at the given index */
    public  void put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long valueIndex, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
    /**
     * Remove key and value at given index. Note that this will create a hole in
     * (key, index) and it is upto the caller to deal with it.
     * @param key (undocumented)
     * @param valueIndex (undocumented)
     */
    public  void remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long valueIndex)  { throw new RuntimeException(); }
    /** Remove all values (i.e. all the indices) for the given key. */
    public  void removeAllValues (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, long numValues)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.execution.streaming.state.StateStore stateStore ()  { throw new RuntimeException(); }
  }
  static private  class KeyToNumValuesType$ implements org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.StateStoreType, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KeyToNumValuesType$ MODULE$ = null;
    public   KeyToNumValuesType$ ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static private  class KeyWithIndexToValueType$ implements org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.StateStoreType, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KeyWithIndexToValueType$ MODULE$ = null;
    public   KeyWithIndexToValueType$ ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static   interface StateStoreType {
  }
  static public  scala.collection.Seq<java.lang.String> allStateStoreNames (scala.collection.Seq<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide> joinSides)  { throw new RuntimeException(); }
  static private  java.lang.String getStateStoreName (org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide joinSide, org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.StateStoreType storeType)  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide joinSide ()  { throw new RuntimeException(); }
  // not preceding
  public   SymmetricHashJoinStateManager (org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide joinSide, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputValueAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> joinKeys, scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /** Get all the values of a key */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  /** Append a new value to the key */
  public  void append (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
  /**
   * Remove using a predicate on keys.
   * <p>
   * This produces an iterator over the (key, value) pairs satisfying condition(key), where the
   * underlying store is updated as a side-effect of producing next.
   * <p>
   * This implies the iterator must be consumed fully without any other operations on this manager
   * or the underlying store being interleaved.
   * @param removalCondition (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> removeByKeyCondition (scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> removalCondition)  { throw new RuntimeException(); }
  /**
   * Remove using a predicate on values.
   * <p>
   * At a high level, this produces an iterator over the (key, value) pairs such that value
   * satisfies the predicate, where producing an element removes the value from the state store
   * and producing all elements with a given key updates it accordingly.
   * <p>
   * This implies the iterator must be consumed fully without any other operations on this manager
   * or the underlying store being interleaved.
   * @param removalCondition (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> removeByValueCondition (scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> removalCondition)  { throw new RuntimeException(); }
  /** Commit all the changes to all the state stores */
  public  void commit ()  { throw new RuntimeException(); }
  /** Abort any changes to the state stores if needed */
  public  void abortIfNeeded ()  { throw new RuntimeException(); }
  /** Get the combined metrics of all the state stores */
  public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType keySchema ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> keyAttributes ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyToNumValuesStore keyToNumValues ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyWithIndexToValueStore keyWithIndexToValue ()  { throw new RuntimeException(); }
}
