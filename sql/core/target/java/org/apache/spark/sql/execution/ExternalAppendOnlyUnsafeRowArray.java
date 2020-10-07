package org.apache.spark.sql.execution;
/**
 * An append-only array for {@link UnsafeRow}s that strictly keeps content in an in-memory array
 * until {@link numRowsInMemoryBufferThreshold} is reached post which it will switch to a mode which
 * would flush to disk after {@link numRowsSpillThreshold} is met (or before if there is
 * excessive memory consumption). Setting these threshold involves following trade-offs:
 * <p>
 * - If {@link numRowsInMemoryBufferThreshold} is too high, the in-memory array may occupy more memory
 *   than is available, resulting in OOM.
 * - If {@link numRowsSpillThreshold} is too low, data will be spilled frequently and lead to
 *   excessive disk writes. This may lead to a performance regression compared to the normal case
 *   of using an {@link ArrayBuffer} or {@link Array}.
 */
  class ExternalAppendOnlyUnsafeRowArray implements org.apache.spark.internal.Logging {
  private abstract class ExternalAppendOnlyUnsafeRowArrayIterator implements scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> {
    public   ExternalAppendOnlyUnsafeRowArrayIterator ()  { throw new RuntimeException(); }
    private  long expectedModificationsCount ()  { throw new RuntimeException(); }
    protected  boolean isModified ()  { throw new RuntimeException(); }
    protected  void throwExceptionIfModified ()  { throw new RuntimeException(); }
  }
  private  class InMemoryBufferIterator extends org.apache.spark.sql.execution.ExternalAppendOnlyUnsafeRowArray.ExternalAppendOnlyUnsafeRowArrayIterator {
    public   InMemoryBufferIterator (int startIndex)  { throw new RuntimeException(); }
    private  int currentIndex ()  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow next ()  { throw new RuntimeException(); }
  }
  private  class SpillableArrayIterator extends org.apache.spark.sql.execution.ExternalAppendOnlyUnsafeRowArray.ExternalAppendOnlyUnsafeRowArrayIterator {
    public   SpillableArrayIterator (org.apache.spark.util.collection.unsafe.sort.UnsafeSorterIterator iterator, int numFieldPerRow)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.UnsafeRow currentRow ()  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow next ()  { throw new RuntimeException(); }
  }
  static public  int DefaultInitialSizeOfInMemoryBuffer ()  { throw new RuntimeException(); }
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
  public   ExternalAppendOnlyUnsafeRowArray (org.apache.spark.memory.TaskMemoryManager taskMemoryManager, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.TaskContext taskContext, int initialSize, long pageSizeBytes, int numRowsInMemoryBufferThreshold, int numRowsSpillThreshold)  { throw new RuntimeException(); }
  public   ExternalAppendOnlyUnsafeRowArray (int numRowsInMemoryBufferThreshold, int numRowsSpillThreshold)  { throw new RuntimeException(); }
  private  int initialSizeOfInMemoryBuffer ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.catalyst.expressions.UnsafeRow> inMemoryBuffer ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.unsafe.sort.UnsafeExternalSorter spillableArray ()  { throw new RuntimeException(); }
  private  int numRows ()  { throw new RuntimeException(); }
  private  long modificationsCount ()  { throw new RuntimeException(); }
  private  int numFieldsPerRow ()  { throw new RuntimeException(); }
  public  int length ()  { throw new RuntimeException(); }
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  /**
   * Clears up resources (eg. memory) held by the backing storage
   */
  public  void clear ()  { throw new RuntimeException(); }
  public  void add (org.apache.spark.sql.catalyst.expressions.UnsafeRow unsafeRow)  { throw new RuntimeException(); }
  /**
   * Creates an {@link Iterator} for the current rows in the array starting from a user provided index
   * <p>
   * If there are subsequent {@link add()} or {@link clear()} calls made on this array after creation of
   * the iterator, then the iterator is invalidated thus saving clients from thinking that they
   * have read all the data while there were new rows added to this array.
   * @param startIndex (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> generateIterator (int startIndex)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> generateIterator ()  { throw new RuntimeException(); }
}
