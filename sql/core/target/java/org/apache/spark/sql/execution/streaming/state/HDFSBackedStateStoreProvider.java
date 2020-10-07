package org.apache.spark.sql.execution.streaming.state;
/**
 * An implementation of {@link StateStoreProvider} and {@link StateStore} in which all the data is backed
 * by files in a HDFS-compatible file system. All updates to the store has to be done in sets
 * transactionally, and each set of updates increments the store's version. These versions can
 * be used to re-execute the updates (by retries in RDD operations) on the correct version of
 * the store, and regenerate the store version.
 * <p>
 * Usage:
 * To update the data in the state store, the following order of operations are needed.
 * <p>
 * // get the right store
 * - val store = StateStore.get(
 *      StateStoreId(checkpointLocation, operatorId, partitionId), ..., version, ...)
 * - store.put(...)
 * - store.remove(...)
 * - store.commit()    // commits all the updates to made; the new version will be returned
 * - store.iterator()  // key-value data after last commit as an iterator
 * - store.updates()   // updates made in the last commit as an iterator
 * <p>
 * Fault-tolerance model:
 * - Every set of updates is written to a delta file before committing.
 * - The state store is responsible for managing, collapsing and cleaning up of delta files.
 * - Multiple attempts to commit the same version of updates may overwrite each other.
 *   Consistency guarantees depend on whether multiple attempts have the same updates and
 *   the overwrite semantics of underlying file system.
 * - Background maintenance of files ensures that last versions of the store is always recoverable
 * to ensure re-executed RDD operations re-apply updates on the correct past version of the
 * store.
 */
  class HDFSBackedStateStoreProvider implements org.apache.spark.sql.execution.streaming.state.StateStoreProvider, org.apache.spark.internal.Logging {
  private  class StoreFile implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  long version ()  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.Path path ()  { throw new RuntimeException(); }
    public  boolean isSnapshot ()  { throw new RuntimeException(); }
    // not preceding
    public   StoreFile (long version, org.apache.hadoop.fs.Path path, boolean isSnapshot)  { throw new RuntimeException(); }
  }
  private  class StoreFile$ extends scala.runtime.AbstractFunction3<java.lang.Object, org.apache.hadoop.fs.Path, java.lang.Object, org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.StoreFile> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StoreFile$ MODULE$ = null;
    public   StoreFile$ ()  { throw new RuntimeException(); }
  }
  /** Implementation of {@link StateStore} API which is backed by a HDFS-compatible file system */
  public  class HDFSBackedStateStore implements org.apache.spark.sql.execution.streaming.state.StateStore {
    public  class UPDATING {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    public  class UPDATING$ implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final UPDATING$ MODULE$ = null;
      public   UPDATING$ ()  { throw new RuntimeException(); }
    }
    public  class COMMITTED {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    public  class COMMITTED$ implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final COMMITTED$ MODULE$ = null;
      public   COMMITTED$ ()  { throw new RuntimeException(); }
    }
    public  class ABORTED {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    public  class ABORTED$ implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final ABORTED$ MODULE$ = null;
      public   ABORTED$ ()  { throw new RuntimeException(); }
    }
    /** Trait and classes representing the internal state of the store */
    public  interface STATE {
    }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.ABORTED$ ABORTED ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.COMMITTED$ COMMITTED ()  { throw new RuntimeException(); }
    // not preceding
    public   HDFSBackedStateStore (long version, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> mapToUpdate)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.UPDATING$ UPDATING ()  { throw new RuntimeException(); }
    /** Abort all the updates made on this store. This store will not be usable any more. */
    public  void abort ()  { throw new RuntimeException(); }
    /** Commit all the updates that have been made to the store, and return the new version. */
    public  long commit ()  { throw new RuntimeException(); }
    private  java.io.DataOutputStream compressedStream ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.streaming.CheckpointFileManager.CancellableFSDataOutputStream deltaFileStream ()  { throw new RuntimeException(); }
    private  org.apache.hadoop.fs.Path finalDeltaFile ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> getRange (scala.Option<org.apache.spark.sql.catalyst.expressions.UnsafeRow> start, scala.Option<org.apache.spark.sql.catalyst.expressions.UnsafeRow> end)  { throw new RuntimeException(); }
    /**
     * Whether all updates have been committed
     * @return (undocumented)
     */
    public  boolean hasCommitted ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.StateStoreId id ()  { throw new RuntimeException(); }
    /**
     * Get an iterator of all the store data.
     * This can be called only after committing all the updates made in the current thread.
     * @return (undocumented)
     */
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  { throw new RuntimeException(); }
    private  long newVersion ()  { throw new RuntimeException(); }
    public  void put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
    public  void remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE state ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  long version ()  { throw new RuntimeException(); }
  }
  public   HDFSBackedStateStoreProvider ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path baseDir ()  { throw new RuntimeException(); }
  /**
   * Try to cancel the underlying stream and safely close the compressed stream.
   * <p>
   * @param compressedStream the compressed stream.
   * @param rawStream the underlying stream which needs to be cancelled.
   */
  private  void cancelDeltaFile (java.io.DataOutputStream compressedStream, org.apache.spark.sql.execution.streaming.CheckpointFileManager.CancellableFSDataOutputStream rawStream)  { throw new RuntimeException(); }
  /**
   * Clean up old snapshots and delta files that are not needed any more. It ensures that last
   * few versions of the store can be recovered from the files, so re-executed RDD operations
   * can re-apply updates on the past versions of the store.
   */
    void cleanup ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  void commitUpdates (long newVersion, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> map, java.io.DataOutputStream output)  { throw new RuntimeException(); }
  private  java.io.DataOutputStream compressStream (java.io.DataOutputStream outputStream)  { throw new RuntimeException(); }
  private  java.io.DataInputStream decompressStream (java.io.DataInputStream inputStream)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path deltaFile (long version)  { throw new RuntimeException(); }
  /** Do maintenance backing data files, including creating snapshots and cleaning up old files */
  public  void doMaintenance ()  { throw new RuntimeException(); }
  /** Perform a snapshot of the store to allow delta files to be consolidated */
  private  void doSnapshot ()  { throw new RuntimeException(); }
  /** Fetch all the files that back the store */
  private  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.StoreFile> fetchFiles ()  { throw new RuntimeException(); }
  /** Files needed to recover the given version of the store */
  private  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.StoreFile> filesForVersion (scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.StoreFile> allFiles, long version)  { throw new RuntimeException(); }
  private  void finalizeDeltaFile (java.io.DataOutputStream output)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.CheckpointFileManager fm ()  { throw new RuntimeException(); }
  /** This method is intended to be only used for unit test(s). DO NOT TOUCH ELEMENTS IN MAP! */
    java.util.SortedMap<java.lang.Object, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> getLoadedMaps ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> getMetricsForProvider ()  { throw new RuntimeException(); }
  /** Get the state store for making updates to create a new `version` of the store. */
  public  org.apache.spark.sql.execution.streaming.state.StateStore getStore (long version)  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  public  void init (org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, scala.Option<java.lang.Object> indexOrdinal, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType keySchema ()  { throw new RuntimeException(); }
  /**
   * Get iterator of all the data of the latest version of the store.
   * Note that this will look up the files to determined the latest known version.
   * @return (undocumented)
   */
    scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> latestIterator ()  { throw new RuntimeException(); }
  /** Load the required version of the map data from the backing files */
  private  java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> loadMap (long version)  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.LongAdder loadedMapCacheHitCount ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.LongAdder loadedMapCacheMissCount ()  { throw new RuntimeException(); }
  private  java.util.TreeMap<java.lang.Object, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> loadedMaps ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.state.StateStoreCustomMetric metricLoadedMapCacheHit ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.state.StateStoreCustomMetric metricLoadedMapCacheMiss ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric metricStateOnCurrentVersionSizeBytes ()  { throw new RuntimeException(); }
  private  int numberOfVersionsToRetainInMemory ()  { throw new RuntimeException(); }
  private  void putStateIntoStateCacheMap (long newVersion, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> map)  { throw new RuntimeException(); }
  private  scala.Option<java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> readSnapshotFile (long version)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path snapshotFile (long version)  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId_ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.StateStoreCustomMetric> supportedCustomMetrics ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  private  void updateFromDeltaFile (long version, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> map)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType valueSchema ()  { throw new RuntimeException(); }
  private  void verify (scala.Function0<java.lang.Object> condition, java.lang.String msg)  { throw new RuntimeException(); }
  private  void writeRemoveToDeltaFile (java.io.DataOutputStream output, org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  private  void writeSnapshotFile (long version, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> map)  { throw new RuntimeException(); }
  private  void writeUpdateToDeltaFile (java.io.DataOutputStream output, org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
}
