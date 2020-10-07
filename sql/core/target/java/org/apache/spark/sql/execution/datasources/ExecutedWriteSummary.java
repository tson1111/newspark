package org.apache.spark.sql.execution.datasources;
/**
 * Wrapper class for the metrics of writing data out.
 * <p>
 * param:  updatedPartitions the partitions updated during writing data out. Only valid
 *                          for dynamic partition.
 * param:  stats one <code>WriteTaskStats</code> object for every <code>WriteJobStatsTracker</code> that the job had.
 */
public  class ExecutedWriteSummary implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> updatedPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteTaskStats> stats ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutedWriteSummary (scala.collection.immutable.Set<java.lang.String> updatedPartitions, scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteTaskStats> stats)  { throw new RuntimeException(); }
}
