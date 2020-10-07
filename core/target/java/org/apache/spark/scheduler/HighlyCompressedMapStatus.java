package org.apache.spark.scheduler;
/**
 * A {@link MapStatus} implementation that stores the accurate size of huge blocks, which are larger
 * than spark.shuffle.accurateBlockThreshold. It stores the average size of other non-empty blocks,
 * plus a bitmap for tracking which blocks are empty.
 * <p>
 * param:  loc location where the task is being executed
 * param:  numNonEmptyBlocks the number of non-empty blocks
 * param:  emptyBlocks a bitmap tracking which blocks are empty
 * param:  avgSize average size of the non-empty and non-huge blocks
 * param:  hugeBlockSizes sizes of huge blocks by their reduceId.
 */
  class HighlyCompressedMapStatus implements org.apache.spark.scheduler.MapStatus, java.io.Externalizable {
  static public  org.apache.spark.scheduler.HighlyCompressedMapStatus apply (org.apache.spark.storage.BlockManagerId loc, long[] uncompressedSizes)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> hugeBlockSizes ()  { throw new RuntimeException(); }
  // not preceding
  private   HighlyCompressedMapStatus (org.apache.spark.storage.BlockManagerId loc, int numNonEmptyBlocks, org.roaringbitmap.RoaringBitmap emptyBlocks, long avgSize, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> hugeBlockSizes)  { throw new RuntimeException(); }
  protected   HighlyCompressedMapStatus ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId location ()  { throw new RuntimeException(); }
  public  long getSizeForBlock (int reduceId)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
}
