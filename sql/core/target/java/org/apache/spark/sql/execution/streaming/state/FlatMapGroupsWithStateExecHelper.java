package org.apache.spark.sql.execution.streaming.state;
public  class FlatMapGroupsWithStateExecHelper {
  /**
   * Class to capture deserialized state and timestamp return by the state manager.
   * This is intended for reuse.
   */
  static public  class StateData implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow keyRow ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow stateRow ()  { throw new RuntimeException(); }
    public  Object stateObj ()  { throw new RuntimeException(); }
    public  long timeoutTimestamp ()  { throw new RuntimeException(); }
    // not preceding
    public   StateData (org.apache.spark.sql.catalyst.expressions.UnsafeRow keyRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow stateRow, Object stateObj, long timeoutTimestamp)  { throw new RuntimeException(); }
      org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateData withNew (org.apache.spark.sql.catalyst.expressions.UnsafeRow newKeyRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow newStateRow, Object newStateObj, long newTimeout)  { throw new RuntimeException(); }
  }
  static public  class StateData$ extends scala.runtime.AbstractFunction4<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StateData$ MODULE$ = null;
    public   StateData$ ()  { throw new RuntimeException(); }
  }
  /** Interface for interacting with state data of FlatMapGroupsWithState */
  static public  interface StateManager extends scala.Serializable {
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateData> getAllState (org.apache.spark.sql.execution.streaming.state.StateStore store)  ;
    public  org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateData getState (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow keyRow)  ;
    public  void putState (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow keyRow, Object state, long timeoutTimestamp)  ;
    public  void removeState (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow keyRow)  ;
    public  org.apache.spark.sql.types.StructType stateSchema ()  ;
  }
  /** Commmon methods for StateManager implementations */
  static private abstract class StateManagerImplBase implements org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateManager {
    public   StateManagerImplBase (boolean shouldStoreTimestamp)  { throw new RuntimeException(); }
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateData> getAllState (org.apache.spark.sql.execution.streaming.state.StateStore store)  { throw new RuntimeException(); }
    /** Get deserialized state and corresponding timeout timestamp for a key */
    public  org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateData getState (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow keyRow)  { throw new RuntimeException(); }
    protected  Object getStateObject (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.expressions.UnsafeRow getStateRow (Object obj)  { throw new RuntimeException(); }
    /** Returns the timeout timestamp of a state row is set */
    private  long getTimestamp (org.apache.spark.sql.catalyst.expressions.UnsafeRow stateRow)  { throw new RuntimeException(); }
    /** Put state and timeout timestamp for a key */
    public  void putState (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow key, Object state, long timestamp)  { throw new RuntimeException(); }
    public  void removeState (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow keyRow)  { throw new RuntimeException(); }
    /** Set the timestamp in a state row */
    private  void setTimestamp (org.apache.spark.sql.catalyst.expressions.UnsafeRow stateRow, long timeoutTimestamps)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateData stateDataForGets ()  { throw new RuntimeException(); }
    protected abstract  org.apache.spark.sql.catalyst.expressions.Expression stateDeserializerExpr ()  ;
    private  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object> stateDeserializerFunc ()  { throw new RuntimeException(); }
    protected abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> stateSerializerExprs ()  ;
    private  scala.Function1<java.lang.Object, org.apache.spark.sql.catalyst.expressions.UnsafeRow> stateSerializerFunc ()  { throw new RuntimeException(); }
    protected abstract  int timeoutTimestampOrdinalInRow ()  ;
  }
  /**
   * Version 1 of the StateManager which stores the user-defined state as flattened columns in
   * the UnsafeRow. Say the user-defined state has 3 fields - col1, col2, col3. The
   * unsafe rows will look like this.
   * <p>
   *    UnsafeRow[ col1 | col2 | col3 | timestamp ]
   * <p>
   * The limitation of this format is that timestamp cannot be set when the user-defined
   * state has been removed. This is because the columns cannot be collectively marked to be
   * empty/null.
   */
  static private  class StateManagerImplV1 extends org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateManagerImplBase {
    public   StateManagerImplV1 (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> stateEncoder, boolean shouldStoreTimestamp)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.expressions.UnsafeRow getStateRow (Object obj)  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> stateAttributes ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.Expression stateDeserializerExpr ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType stateSchema ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> stateSerializerExprs ()  { throw new RuntimeException(); }
    public  int timeoutTimestampOrdinalInRow ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.AttributeReference timestampTimeoutAttribute ()  { throw new RuntimeException(); }
  }
  /**
   * Version 2 of the StateManager which stores the user-defined state as a nested struct
   * in the UnsafeRow. Say the user-defined state has 3 fields - col1, col2, col3. The
   * unsafe rows will look like this.
   *                    ___________________________
   *                   |                           |
   *                   |                           V
   *    UnsafeRow[ nested-struct | timestamp |  UnsafeRow[ col1 | col2 | col3 ] ]
   * <p>
   * This allows the entire user-defined state to be collectively marked as empty/null,
   * thus allowing timestamp to be set without requiring the state to be present.
   */
  static private  class StateManagerImplV2 extends org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateManagerImplBase {
    public   StateManagerImplV2 (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> stateEncoder, boolean shouldStoreTimestamp)  { throw new RuntimeException(); }
    private  int nestedStateOrdinal ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.Expression stateDeserializerExpr ()  { throw new RuntimeException(); }
    /** Schema of the state rows saved in the state store */
    public  org.apache.spark.sql.types.StructType stateSchema ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> stateSerializerExprs ()  { throw new RuntimeException(); }
    public  int timeoutTimestampOrdinalInRow ()  { throw new RuntimeException(); }
  }
  static public  scala.collection.Seq<java.lang.Object> supportedVersions ()  { throw new RuntimeException(); }
  static public  int legacyVersion ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateManager createStateManager (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> stateEncoder, boolean shouldStoreTimestamp, int stateFormatVersion)  { throw new RuntimeException(); }
}
