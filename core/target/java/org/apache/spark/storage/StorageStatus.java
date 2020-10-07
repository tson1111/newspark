package org.apache.spark.storage;
/**
 * Storage information for each BlockManager.
 * <p>
 * This class assumes BlockId and BlockStatus are immutable, such that the consumers of this
 * class cannot mutate the source of the information. Accesses are not thread-safe.
 */
  class StorageStatus {
  private  class RddStorageInfo implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  long memoryUsage ()  { throw new RuntimeException(); }
    public  long diskUsage ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.StorageLevel level ()  { throw new RuntimeException(); }
    // not preceding
    public   RddStorageInfo (long memoryUsage, long diskUsage, org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
  }
  private  class RddStorageInfo$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, org.apache.spark.storage.StorageLevel, org.apache.spark.storage.StorageStatus.RddStorageInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RddStorageInfo$ MODULE$ = null;
    public   RddStorageInfo$ ()  { throw new RuntimeException(); }
  }
  private  class NonRddStorageInfo implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  long onHeapUsage ()  { throw new RuntimeException(); }
    public  long offHeapUsage ()  { throw new RuntimeException(); }
    public  long diskUsage ()  { throw new RuntimeException(); }
    // not preceding
    public   NonRddStorageInfo (long onHeapUsage, long offHeapUsage, long diskUsage)  { throw new RuntimeException(); }
  }
  private  class NonRddStorageInfo$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.storage.StorageStatus.NonRddStorageInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NonRddStorageInfo$ MODULE$ = null;
    public   NonRddStorageInfo$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   StorageStatus (org.apache.spark.storage.BlockManagerId blockManagerId, long maxMemory, scala.Option<java.lang.Object> maxOnHeapMem, scala.Option<java.lang.Object> maxOffHeapMem)  { throw new RuntimeException(); }
  /** Create a storage status with an initial set of blocks, leaving the source unmodified. */
  public   StorageStatus (org.apache.spark.storage.BlockManagerId bmid, long maxMemory, scala.Option<java.lang.Object> maxOnHeapMem, scala.Option<java.lang.Object> maxOffHeapMem, scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> initialBlocks)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> _nonRddBlocks ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.StorageStatus.NonRddStorageInfo _nonRddStorageInfo ()  { throw new RuntimeException(); }
  /**
   * Internal representation of the blocks stored in this block manager.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> _rddBlocks ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.storage.StorageStatus.RddStorageInfo> _rddStorageInfo ()  { throw new RuntimeException(); }
  /** Add the given block to this storage status. If it already exists, overwrite it. */
    void addBlock (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus blockStatus)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  /**
   * Return the blocks stored in this block manager.
   * <p>
   * @note This is somewhat expensive, as it involves cloning the underlying maps and then
   * concatenating them together. Much faster alternatives exist for common operations such as
   * contains, get, and size.
   * @return (undocumented)
   */
  public  scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> blocks ()  { throw new RuntimeException(); }
  /** Return the disk space used by this block manager. */
  public  long diskUsed ()  { throw new RuntimeException(); }
  /** Return the disk space used by the given RDD in this block manager in O(1) time. */
  public  long diskUsedByRdd (int rddId)  { throw new RuntimeException(); }
  /**
   * Return the given block stored in this block manager in O(1) time.
   * <p>
   * @note This is much faster than <code>this.blocks.get</code>, which is O(blocks) time.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockStatus> getBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /** Return the max memory can be used by this block manager. */
  public  long maxMem ()  { throw new RuntimeException(); }
  public  long maxMemory ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxOffHeapMem ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxOnHeapMem ()  { throw new RuntimeException(); }
  /** Return the memory remaining in this block manager. */
  public  long memRemaining ()  { throw new RuntimeException(); }
  /** Return the memory used by this block manager. */
  public  long memUsed ()  { throw new RuntimeException(); }
  /** Return the memory used by off-heap caching RDDs */
  public  scala.Option<java.lang.Object> offHeapCacheSize ()  { throw new RuntimeException(); }
  /** Return the off-heap memory remaining in this block manager. */
  public  scala.Option<java.lang.Object> offHeapMemRemaining ()  { throw new RuntimeException(); }
  /** Return the off-heap memory used by this block manager. */
  public  scala.Option<java.lang.Object> offHeapMemUsed ()  { throw new RuntimeException(); }
  /** Return the memory used by on-heap caching RDDs */
  public  scala.Option<java.lang.Object> onHeapCacheSize ()  { throw new RuntimeException(); }
  /** Return the on-heap memory remaining in this block manager. */
  public  scala.Option<java.lang.Object> onHeapMemRemaining ()  { throw new RuntimeException(); }
  /** Return the on-heap memory used by this block manager. */
  public  scala.Option<java.lang.Object> onHeapMemUsed ()  { throw new RuntimeException(); }
  /**
   * Return the RDD blocks stored in this block manager.
   * <p>
   * @note This is somewhat expensive, as it involves cloning the underlying maps and then
   * concatenating them together. Much faster alternatives exist for common operations such as
   * getting the memory, disk, and off-heap memory sizes occupied by this RDD.
   * @return (undocumented)
   */
  public  scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> rddBlocks ()  { throw new RuntimeException(); }
  /**
   * Update the relevant storage info, taking into account any existing status for this block.
   * @param blockId (undocumented)
   * @param newBlockStatus (undocumented)
   */
  private  void updateStorageInfo (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus newBlockStatus)  { throw new RuntimeException(); }
}
