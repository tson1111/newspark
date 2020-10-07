package org.apache.spark;
public  class Partitioner$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Partitioner$ MODULE$ = null;
  public   Partitioner$ ()  { throw new RuntimeException(); }
  /**
   * Choose a partitioner to use for a cogroup-like operation between a number of RDDs.
   * <p>
   * If spark.default.parallelism is set, we'll use the value of SparkContext defaultParallelism
   * as the default partitions number, otherwise we'll use the max number of upstream partitions.
   * <p>
   * When available, we choose the partitioner from rdds with maximum number of partitions. If this
   * partitioner is eligible (number of partitions within an order of maximum number of partitions
   * in rdds), or has partition number higher than default partitions number - we use this
   * partitioner.
   * <p>
   * Otherwise, we'll use a new HashPartitioner with the default partitions number.
   * <p>
   * Unless spark.default.parallelism is set, the number of partitions will be the same as the
   * number of partitions in the largest upstream RDD, as this should be least likely to cause
   * out-of-memory errors.
   * <p>
   * We use two method parameters (rdd, others) to enforce callers passing at least 1 RDD.
   * @param rdd (undocumented)
   * @param others (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.Partitioner defaultPartitioner (org.apache.spark.rdd.RDD<?> rdd, scala.collection.Seq<org.apache.spark.rdd.RDD<?>> others)  { throw new RuntimeException(); }
  /**
   * Returns true if the number of partitions of the RDD is either greater than or is less than and
   * within a single order of magnitude of the max number of upstream partitions, otherwise returns
   * false.
   * @param hasMaxPartitioner (undocumented)
   * @param rdds (undocumented)
   * @return (undocumented)
   */
  private  boolean isEligiblePartitioner (org.apache.spark.rdd.RDD<?> hasMaxPartitioner, scala.collection.Seq<org.apache.spark.rdd.RDD<?>> rdds)  { throw new RuntimeException(); }
}
