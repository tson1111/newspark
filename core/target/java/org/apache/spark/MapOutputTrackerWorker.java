package org.apache.spark;
/**
 * Executor-side client for fetching map output info from the driver's MapOutputTrackerMaster.
 * Note that this is not used in local-mode; instead, local-mode Executors access the
 * MapOutputTrackerMaster directly (which is possible because the master and worker share a comon
 * superclass).
 */
  class MapOutputTrackerWorker extends org.apache.spark.MapOutputTracker {
  public   MapOutputTrackerWorker (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Remembers which map output locations are currently being fetched on an executor. */
  private  scala.collection.mutable.HashSet<java.lang.Object> fetching ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startPartition, int endPartition)  { throw new RuntimeException(); }
  /**
   * Get or fetch the array of MapStatuses for a given shuffle ID. NOTE: clients MUST synchronize
   * on this array when reading it, because on the driver, we may be changing it in place.
   * <p>
   * (It would be nice to remove this restriction in the future.)
   * @param shuffleId (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.MapStatus[] getStatuses (int shuffleId)  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.Object, org.apache.spark.scheduler.MapStatus[]> mapStatuses ()  { throw new RuntimeException(); }
  /** Unregister shuffle data. */
  public  void unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
  /**
   * Called from executors to update the epoch number, potentially clearing old outputs
   * because of a fetch failure. Each executor task calls this with the latest epoch
   * number on the driver at the time it was created.
   * @param newEpoch (undocumented)
   */
  public  void updateEpoch (long newEpoch)  { throw new RuntimeException(); }
}
