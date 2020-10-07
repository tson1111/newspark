package org.apache.spark;
/**
 * Class that keeps track of the location of the map output of a stage. This is abstract because the
 * driver and executor have different versions of the MapOutputTracker. In principle the driver-
 * and executor-side classes don't need to share a common base class; the current shared base class
 * is maintained primarily for backwards-compatibility in order to avoid having to update existing
 * test code.
 */
 abstract class MapOutputTracker implements org.apache.spark.internal.Logging {
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static private  int DIRECT ()  { throw new RuntimeException(); }
  static private  int BROADCAST ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<byte[], org.apache.spark.broadcast.Broadcast<byte[]>> serializeMapStatuses (org.apache.spark.scheduler.MapStatus[] statuses, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal, int minBroadcastSize)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.MapStatus[] deserializeMapStatuses (byte[] bytes)  { throw new RuntimeException(); }
  /**
   * Given an array of map statuses and a range of map output partitions, returns a sequence that,
   * for each block manager ID, lists the shuffle block IDs and corresponding shuffle block sizes
   * stored at that block manager.
   * Note that empty blocks are filtered in the result.
   * <p>
   * If any of the statuses is null (indicating a missing location due to a failed mapper),
   * throws a FetchFailedException.
   * <p>
   * @param shuffleId Identifier for the shuffle
   * @param startPartition Start of map output partition ID range (included in range)
   * @param endPartition End of map output partition ID range (excluded from range)
   * @param statuses List of map statuses, indexed by map ID.
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block ID, shuffle block size) tuples
   *         describing the shuffle blocks that are stored at that block manager.
   */
  static public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> convertMapStatuses (int shuffleId, int startPartition, int endPartition, org.apache.spark.scheduler.MapStatus[] statuses)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  public   MapOutputTracker (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Set to the MapOutputTrackerMasterEndpoint living on the driver. */
  public  org.apache.spark.rpc.RpcEndpointRef trackerEndpoint ()  { throw new RuntimeException(); }
  /**
   * The driver-side counter is incremented every time that a map output is lost. This value is sent
   * to executors as part of tasks, where executors compare the new epoch number to the highest
   * epoch number that they received in the past. If the new epoch number is higher then executors
   * will clear their local caches of map output statuses and will re-fetch (possibly updated)
   * statuses from the driver.
   * @return (undocumented)
   */
  protected  long epoch ()  { throw new RuntimeException(); }
  protected  java.lang.Object epochLock ()  { throw new RuntimeException(); }
  /**
   * Send a message to the trackerEndpoint and get its result within a default timeout, or
   * throw a SparkException if this fails.
   * @param message (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  protected <T extends java.lang.Object> T askTracker (Object message, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /** Send a one-way message to the trackerEndpoint, to which we expect it to reply with true. */
  protected  void sendTracker (Object message)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int reduceId)  { throw new RuntimeException(); }
  /**
   * Called from executors to get the server URIs and output sizes for each shuffle block that
   * needs to be read from a given range of map output partitions (startPartition is included but
   * endPartition is excluded from the range).
   * <p>
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block id, shuffle block size) tuples
   *         describing the shuffle blocks that are stored at that block manager.
   * @param shuffleId (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   */
  public abstract  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startPartition, int endPartition)  ;
  /**
   * Deletes map output status information for the specified shuffle stage.
   * @param shuffleId (undocumented)
   */
  public abstract  void unregisterShuffle (int shuffleId)  ;
  public  void stop ()  { throw new RuntimeException(); }
}
