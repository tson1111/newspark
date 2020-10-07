package org.apache.spark.sql.execution.streaming.sources;
/**
 * A simple {@link DataWriterFactory} whose tasks just pack rows into the commit message for delivery
 * to a {@link DataSourceWriter} on the driver.
 * <p>
 * Note that, because it sends all rows to the driver, this factory will generally be unsuitable
 * for production-quality sinks. It's intended for use in tests.
 */
public  class PackedRowWriterFactory$ implements org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.catalyst.InternalRow>, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PackedRowWriterFactory$ MODULE$ = null;
  public   PackedRowWriterFactory$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.catalyst.InternalRow> createDataWriter (int partitionId, long taskId, long epochId)  { throw new RuntimeException(); }
}
