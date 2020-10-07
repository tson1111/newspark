package org.apache.spark.sql.execution.streaming.continuous;
/**
 * Commit a partition at the specified epoch with the given message.
 */
  class CommitPartitionEpoch implements org.apache.spark.sql.execution.streaming.continuous.EpochCoordinatorMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  long epoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.WriterCommitMessage message ()  { throw new RuntimeException(); }
  // not preceding
  public   CommitPartitionEpoch (int partitionId, long epoch, org.apache.spark.sql.sources.v2.writer.WriterCommitMessage message)  { throw new RuntimeException(); }
}
