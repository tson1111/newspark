package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents data where tuples have been clustered according to the hash of the given
 * <code>expressions</code>. The hash function is defined as <code>HashPartitioning.partitionIdExpression</code>, so only
 * {@link HashPartitioning} can satisfy this distribution.
 * <p>
 * This is a strictly stronger guarantee than {@link ClusteredDistribution}. Given a tuple and the
 * number of partitions, this distribution strictly requires which partition the tuple should be in.
 */
public  class HashClusteredDistribution implements org.apache.spark.sql.catalyst.plans.physical.Distribution, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> requiredNumPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   HashClusteredDistribution (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.Option<java.lang.Object> requiredNumPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (int numPartitions)  { throw new RuntimeException(); }
}
