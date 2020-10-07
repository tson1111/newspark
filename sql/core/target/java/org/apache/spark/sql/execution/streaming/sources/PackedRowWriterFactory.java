package org.apache.spark.sql.execution.streaming.sources;
/**
 * A simple {@link DataWriterFactory} whose tasks just pack rows into the commit message for delivery
 * to a {@link DataSourceWriter} on the driver.
 * <p>
 * Note that, because it sends all rows to the driver, this factory will generally be unsuitable
 * for production-quality sinks. It's intended for use in tests.
 */
public  class PackedRowWriterFactory {
  static public  org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.catalyst.InternalRow> createDataWriter (int partitionId, long taskId, long epochId)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
