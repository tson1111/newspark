package org.apache.spark.sql.execution.streaming.state;
/**
 * The implementation of StreamingAggregationStateManager for state version 2.
 * In state version 2, the schema of key and value in state are follow:
 * <p>
 * - key: Same as key expressions.
 * - value: The diff between input row attributes and key expressions.
 * <p>
 * The schema of value is changed to optimize the memory/space usage in state, via removing
 * duplicated columns in key-value pair. Hence key columns are excluded from the schema of value.
 * <p>
 * param:  keyExpressions The attributes of keys.
 * param:  inputRowAttributes The attributes of input row.
 */
public  class StreamingAggregationStateManagerImplV2 extends org.apache.spark.sql.execution.streaming.state.StreamingAggregationStateManagerBaseImpl {
  public   StreamingAggregationStateManagerImplV2 (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputRowAttributes)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType getStateValueSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator (org.apache.spark.sql.execution.streaming.state.StateStore store)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.codegen.UnsafeRowJoiner joiner ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyValueJoinedExpressions ()  { throw new RuntimeException(); }
  private  boolean needToProjectToRestoreValue ()  { throw new RuntimeException(); }
  public  void put (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeRow restoreOriginalRow (org.apache.spark.sql.execution.streaming.state.UnsafeRowPair rowPair)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeRow restoreOriginalRow (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection restoreValueProjector ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> valueExpressions ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection valueProjector ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> values (org.apache.spark.sql.execution.streaming.state.StateStore store)  { throw new RuntimeException(); }
}
