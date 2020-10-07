package org.apache.spark.sql.execution.columnar;
  interface NullableColumnAccessor extends org.apache.spark.sql.execution.columnar.ColumnAccessor {
  public  void extractTo (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  ;
  public  boolean hasNext ()  ;
  public  void initialize ()  ;
  public  int nextNullIndex ()  ;
  public  int nullCount ()  ;
  public  java.nio.ByteBuffer nullsBuffer ()  ;
  public  int pos ()  ;
  public  int seenNulls ()  ;
}
