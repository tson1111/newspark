package org.apache.spark.sql.execution.streaming.sources;
/**
 * A {@link org.apache.spark.sql.sources.v2.DataSourceV2} for forwarding data into the specified
 * {@link ForeachWriter}.
 * <p>
 * param:  writer The {@link ForeachWriter} to process all data.
 * param:  converter An object to convert internal rows to target type T. Either it can be
 *                  a {@link ExpressionEncoder} or a direct converter function.
 * @param <T>  The expected type of the sink.
 */
public  class ForeachWriterProvider<T extends java.lang.Object> implements org.apache.spark.sql.sources.v2.StreamWriteSupport, scala.Product, scala.Serializable {
  static public <T extends java.lang.Object> org.apache.spark.sql.execution.streaming.sources.ForeachWriterProvider<?> apply (org.apache.spark.sql.ForeachWriter<T> writer, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> encoder)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.ForeachWriter<T> writer ()  { throw new RuntimeException(); }
  public  scala.util.Either<org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T>, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, T>> converter ()  { throw new RuntimeException(); }
  // not preceding
  public   ForeachWriterProvider (org.apache.spark.sql.ForeachWriter<T> writer, scala.util.Either<org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T>, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, T>> converter)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter createStreamWriter (java.lang.String queryId, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.streaming.OutputMode mode, org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
}
