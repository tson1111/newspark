package org.apache.spark.sql.execution.aggregate;
public  class ObjectAggregationIterator extends org.apache.spark.sql.execution.aggregate.AggregationIterator implements org.apache.spark.internal.Logging {
  public   ObjectAggregationIterator (int partIndex, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateAttributes, int initialInputBufferOffset, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.expressions.MutableProjection> newMutableProjection, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> originalInputAttributes, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> inputRows, int fallbackCountThreshold, org.apache.spark.sql.execution.metric.SQLMetric numOutputRows)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.SpecificInternalRow createNewAggregationBuffer ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.InternalRow getAggregationBufferByKey (org.apache.spark.sql.execution.aggregate.ObjectAggregationMap hashMap, org.apache.spark.sql.catalyst.expressions.UnsafeRow groupingKey)  { throw new RuntimeException(); }
  public final  boolean hasNext ()  { throw new RuntimeException(); }
  private  void initAggregationBuffer (org.apache.spark.sql.catalyst.expressions.SpecificInternalRow buffer)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow, scala.runtime.BoxedUnit> mergeAggregationBuffers ()  { throw new RuntimeException(); }
  public final  org.apache.spark.sql.catalyst.expressions.UnsafeRow next ()  { throw new RuntimeException(); }
  /**
   * Generate an output row when there is no input and there is no grouping expression.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow outputForEmptyGroupingKeyWithoutInput ()  { throw new RuntimeException(); }
  private  void processInputs ()  { throw new RuntimeException(); }
}
