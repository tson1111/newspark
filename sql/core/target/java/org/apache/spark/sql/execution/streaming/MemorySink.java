package org.apache.spark.sql.execution.streaming;
/**
 * A sink that stores the results in memory. This {@link Sink} is primarily intended for use in unit
 * tests and does not provide durability.
 */
public  class MemorySink implements org.apache.spark.sql.execution.streaming.Sink, org.apache.spark.sql.execution.streaming.MemorySinkBase, org.apache.spark.internal.Logging {
  private  class AddedData implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  long batchId ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Row[] data ()  { throw new RuntimeException(); }
    // not preceding
    public   AddedData (long batchId, org.apache.spark.sql.Row[] data)  { throw new RuntimeException(); }
  }
  private  class AddedData$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.sql.Row[], org.apache.spark.sql.execution.streaming.MemorySink.AddedData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddedData$ MODULE$ = null;
    public   AddedData$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   MemorySink (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  public  void addBatch (long batchId, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
  /** Returns all rows that are stored in this {@link Sink}. */
  public  scala.collection.Seq<org.apache.spark.sql.Row> allData ()  { throw new RuntimeException(); }
  /** An order list of batches that have been written to this {@link Sink}. */
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.execution.streaming.MemorySink.AddedData> batches ()  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> dataSinceBatch (long sinceBatchId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> latestBatchData ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> latestBatchId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
