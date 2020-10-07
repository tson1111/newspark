package org.apache.spark;
/**
 * Driver-side class that keeps track of the location of the map output of a stage.
 * <p>
 * The DAGScheduler uses this class to (de)register map output statuses and to look up statistics
 * for performing locality-aware reduce task scheduling.
 * <p>
 * ShuffleMapStage uses this class for tracking available / missing outputs in order to determine
 * which tasks need to be run.
 */
  class MapOutputTrackerMaster extends org.apache.spark.MapOutputTracker {
  /** Message loop used for dispatching messages. */
  private  class MessageLoop implements java.lang.Runnable {
    public   MessageLoop ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  public   MapOutputTrackerMaster (org.apache.spark.SparkConf conf, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal)  { throw new RuntimeException(); }
  /** A poison endpoint that indicates MessageLoop should exit its message loop. */
  private  org.apache.spark.GetMapOutputMessage PoisonPill ()  { throw new RuntimeException(); }
  private  double REDUCER_PREF_LOCS_FRACTION ()  { throw new RuntimeException(); }
  private  int SHUFFLE_PREF_MAP_THRESHOLD ()  { throw new RuntimeException(); }
  private  int SHUFFLE_PREF_REDUCE_THRESHOLD ()  { throw new RuntimeException(); }
  /** Check if the given shuffle is being tracked */
  public  boolean containsShuffle (int shuffleId)  { throw new RuntimeException(); }
  /**
   * To equally divide n elements into m buckets, basically each bucket should have n/m elements,
   * for the remaining n%m elements, add one more element to the first n%m buckets each.
   * @param numElements (undocumented)
   * @param numBuckets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<java.lang.Object>> equallyDivide (int numElements, int numBuckets)  { throw new RuntimeException(); }
  /**
   * Returns the sequence of partition ids that are missing (i.e. needs to be computed), or None
   * if the MapOutputTrackerMaster doesn't know about this shuffle.
   * @param shuffleId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<scala.collection.Seq<java.lang.Object>> findMissingPartitions (int shuffleId)  { throw new RuntimeException(); }
  /** Called to get current epoch number. */
  public  long getEpoch ()  { throw new RuntimeException(); }
  /**
   * Return a list of locations that each have fraction of map output greater than the specified
   * threshold.
   * <p>
   * @param shuffleId id of the shuffle
   * @param reducerId id of the reduce task
   * @param numReducers total number of reducers in the shuffle
   * @param fractionThreshold fraction of total map output size that a location must have
   *                          for it to be considered large.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockManagerId[]> getLocationsWithLargestOutputs (int shuffleId, int reducerId, int numReducers, double fractionThreshold)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startPartition, int endPartition)  { throw new RuntimeException(); }
  public  int getNumAvailableOutputs (int shuffleId)  { throw new RuntimeException(); }
    int getNumCachedSerializedBroadcast ()  { throw new RuntimeException(); }
  /**
   * Return the preferred hosts on which to run the given map output partition in a given shuffle,
   * i.e. the nodes that the most outputs for that partition are on.
   * <p>
   * @param dep shuffle dependency object
   * @param partitionId map output partition that we want to read
   * @return a sequence of host names
   */
  public  scala.collection.Seq<java.lang.String> getPreferredLocationsForShuffle (org.apache.spark.ShuffleDependency<?, ?, ?> dep, int partitionId)  { throw new RuntimeException(); }
  /**
   * Return statistics about all of the outputs for a given shuffle.
   * @param dep (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.MapOutputStatistics getStatistics (org.apache.spark.ShuffleDependency<?, ?, ?> dep)  { throw new RuntimeException(); }
  public  void incrementEpoch ()  { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<org.apache.spark.GetMapOutputMessage> mapOutputRequests ()  { throw new RuntimeException(); }
  private  int maxRpcMessageSize ()  { throw new RuntimeException(); }
  private  int minSizeForBroadcast ()  { throw new RuntimeException(); }
  public  void post (org.apache.spark.GetMapOutputMessage message)  { throw new RuntimeException(); }
  /**
   * Grouped function of Range, this is to avoid traverse of all elements of Range using
   * IterableLike's grouped function.
   * @param range (undocumented)
   * @param size (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.immutable.Range> rangeGrouped (scala.collection.immutable.Range range, int size)  { throw new RuntimeException(); }
  public  void registerMapOutput (int shuffleId, int mapId, org.apache.spark.scheduler.MapStatus status)  { throw new RuntimeException(); }
  public  void registerShuffle (int shuffleId, int numMaps)  { throw new RuntimeException(); }
  /**
   * Removes all shuffle outputs associated with this executor. Note that this will also remove
   * outputs which are served by an external shuffle server (if one exists), as they are still
   * registered with this execId.
   * @param execId (undocumented)
   */
  public  void removeOutputsOnExecutor (java.lang.String execId)  { throw new RuntimeException(); }
  /**
   * Removes all shuffle outputs associated with this host. Note that this will also remove
   * outputs which are served by an external shuffle server (if one exists).
   * @param host (undocumented)
   */
  public  void removeOutputsOnHost (java.lang.String host)  { throw new RuntimeException(); }
  /** Whether to compute locality preferences for reduce tasks */
  private  boolean shuffleLocalityEnabled ()  { throw new RuntimeException(); }
  public  scala.collection.concurrent.Map<java.lang.Object, org.apache.spark.ShuffleStatus> shuffleStatuses ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor threadpool ()  { throw new RuntimeException(); }
  /** Unregister all map output information of the given shuffle. */
  public  void unregisterAllMapOutput (int shuffleId)  { throw new RuntimeException(); }
  /** Unregister map output information of the given shuffle, mapper and block manager */
  public  void unregisterMapOutput (int shuffleId, int mapId, org.apache.spark.storage.BlockManagerId bmAddress)  { throw new RuntimeException(); }
  /** Unregister shuffle data */
  public  void unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
}
