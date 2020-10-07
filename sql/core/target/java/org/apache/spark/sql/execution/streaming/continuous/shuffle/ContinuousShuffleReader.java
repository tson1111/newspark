package org.apache.spark.sql.execution.streaming.continuous.shuffle;
/**
 * Trait for reading from a continuous processing shuffle.
 */
public  interface ContinuousShuffleReader {
  /**
   * Returns an iterator over the incoming rows in an epoch. Implementations should block waiting
   * for new rows to arrive, and end the iterator once they've received epoch markers from all
   * shuffle writers.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> read ()  ;
}
