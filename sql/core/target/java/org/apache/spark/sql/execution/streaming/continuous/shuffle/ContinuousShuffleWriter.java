package org.apache.spark.sql.execution.streaming.continuous.shuffle;
/**
 * Trait for writing to a continuous processing shuffle.
 */
public  interface ContinuousShuffleWriter {
  public  void write (scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> epoch)  ;
}
