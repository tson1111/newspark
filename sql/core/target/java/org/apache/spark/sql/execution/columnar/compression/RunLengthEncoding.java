package org.apache.spark.sql.execution.columnar.compression;
public  class RunLengthEncoding {
  static public  class Encoder<T extends org.apache.spark.sql.types.AtomicType> implements org.apache.spark.sql.execution.columnar.compression.Encoder<T> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.types), org.apache.spark.sql.types.AtomicType))))
    public   Encoder (org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
    private  int _compressedSize ()  { throw new RuntimeException(); }
    private  int _uncompressedSize ()  { throw new RuntimeException(); }
    public  java.nio.ByteBuffer compress (java.nio.ByteBuffer from, java.nio.ByteBuffer to)  { throw new RuntimeException(); }
    public  int compressedSize ()  { throw new RuntimeException(); }
    public  void gatherCompressibilityStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
    private  int lastRun ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.SpecificInternalRow lastValue ()  { throw new RuntimeException(); }
    public  int uncompressedSize ()  { throw new RuntimeException(); }
  }
  static public  class Decoder<T extends org.apache.spark.sql.types.AtomicType> implements org.apache.spark.sql.execution.columnar.compression.Decoder<T> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.types), org.apache.spark.sql.types.AtomicType))))
    public   Decoder (java.nio.ByteBuffer buffer, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
    private  java.lang.Object currentValue ()  { throw new RuntimeException(); }
    public  void decompress (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int capacity)  { throw new RuntimeException(); }
    private  void decompress0 (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int capacity, scala.Function1<java.nio.ByteBuffer, java.lang.Object> getFunction, scala.Function3<org.apache.spark.sql.execution.vectorized.WritableColumnVector, java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> putFunction)  { throw new RuntimeException(); }
    private  long getByte (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
    private  long getInt (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
    private  long getLong (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
    private  long getShort (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  void next (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
    private  void putBoolean (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, long value)  { throw new RuntimeException(); }
    private  void putByte (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, long value)  { throw new RuntimeException(); }
    private  void putInt (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, long value)  { throw new RuntimeException(); }
    private  void putLong (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, long value)  { throw new RuntimeException(); }
    private  void putShort (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, long value)  { throw new RuntimeException(); }
    private  int run ()  { throw new RuntimeException(); }
    private  int valueCount ()  { throw new RuntimeException(); }
  }
  static public  int typeId ()  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.types.AtomicType> org.apache.spark.sql.execution.columnar.compression.RunLengthEncoding.Encoder<T> encoder (org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.types.AtomicType> org.apache.spark.sql.execution.columnar.compression.RunLengthEncoding.Decoder<T> decoder (java.nio.ByteBuffer buffer, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
  static public  boolean supports (org.apache.spark.sql.execution.columnar.ColumnType<?> columnType)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
