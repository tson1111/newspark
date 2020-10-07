package org.apache.spark.sql.execution.columnar.compression;
public  class PassThrough {
  static public  class Encoder<T extends org.apache.spark.sql.types.AtomicType> implements org.apache.spark.sql.execution.columnar.compression.Encoder<T> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.types), org.apache.spark.sql.types.AtomicType))))
    public   Encoder (org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
    public  java.nio.ByteBuffer compress (java.nio.ByteBuffer from, java.nio.ByteBuffer to)  { throw new RuntimeException(); }
    public  int compressedSize ()  { throw new RuntimeException(); }
    public  int uncompressedSize ()  { throw new RuntimeException(); }
  }
  static public  class Decoder<T extends org.apache.spark.sql.types.AtomicType> implements org.apache.spark.sql.execution.columnar.compression.Decoder<T> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.types), org.apache.spark.sql.types.AtomicType))))
    public   Decoder (java.nio.ByteBuffer buffer, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
    public  void decompress (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int capacity)  { throw new RuntimeException(); }
    private  void decompress0 (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int capacity, int unitSize, scala.Function4<org.apache.spark.sql.execution.vectorized.WritableColumnVector, java.lang.Object, java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> putFunction)  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  void next (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
    private  void putBooleans (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, int bufferPos, int len)  { throw new RuntimeException(); }
    private  void putBytes (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, int bufferPos, int len)  { throw new RuntimeException(); }
    private  void putDoubles (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, int bufferPos, int len)  { throw new RuntimeException(); }
    private  void putFloats (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, int bufferPos, int len)  { throw new RuntimeException(); }
    private  void putInts (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, int bufferPos, int len)  { throw new RuntimeException(); }
    private  void putLongs (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, int bufferPos, int len)  { throw new RuntimeException(); }
    private  void putShorts (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int pos, int bufferPos, int len)  { throw new RuntimeException(); }
  }
  static public  int typeId ()  { throw new RuntimeException(); }
  static public  boolean supports (org.apache.spark.sql.execution.columnar.ColumnType<?> columnType)  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.types.AtomicType> org.apache.spark.sql.execution.columnar.compression.PassThrough.Encoder<T> encoder (org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.types.AtomicType> org.apache.spark.sql.execution.columnar.compression.PassThrough.Decoder<T> decoder (java.nio.ByteBuffer buffer, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
