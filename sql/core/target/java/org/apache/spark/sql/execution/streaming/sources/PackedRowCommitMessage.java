package org.apache.spark.sql.execution.streaming.sources;
/**
 * Commit message for a {@link PackedRowDataWriter}, containing all the rows written in the most
 * recent interval.
 */
public  class PackedRowCommitMessage implements org.apache.spark.sql.sources.v2.writer.WriterCommitMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] rows ()  { throw new RuntimeException(); }
  // not preceding
  public   PackedRowCommitMessage (org.apache.spark.sql.catalyst.InternalRow[] rows)  { throw new RuntimeException(); }
}
