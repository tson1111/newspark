package org.apache.spark.sql.catalyst.expressions;
/**
 * Helper functions for creating an {@link InterpretedUnsafeProjection}.
 */
public  class InterpretedUnsafeProjection$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InterpretedUnsafeProjection$ MODULE$ = null;
  public   InterpretedUnsafeProjection$ ()  { throw new RuntimeException(); }
  /**
   * Returns an {@link UnsafeProjection} for given sequence of bound Expressions.
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection createProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  /**
   * Generate a struct writer function. The generated function writes an {@link InternalRow} to the
   * given buffer using the given {@link UnsafeRowWriter}.
   * @param rowWriter (undocumented)
   * @param fields (undocumented)
   * @return (undocumented)
   */
  private  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, scala.runtime.BoxedUnit> generateStructWriter (org.apache.spark.sql.catalyst.expressions.codegen.UnsafeRowWriter rowWriter, org.apache.spark.sql.types.StructField[] fields)  { throw new RuntimeException(); }
  /**
   * Generate a writer function for a struct field, array element, map key or map value. The
   * generated function writes the element at an index in a {@link SpecializedGetters} object (row
   * or array) to the given buffer using the given {@link UnsafeWriter}.
   * @param writer (undocumented)
   * @param dt (undocumented)
   * @param nullable (undocumented)
   * @return (undocumented)
   */
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> generateFieldWriter (org.apache.spark.sql.catalyst.expressions.codegen.UnsafeWriter writer, org.apache.spark.sql.types.DataType dt, boolean nullable)  { throw new RuntimeException(); }
  /**
   * Get the number of bytes elements of a data type will occupy in the fixed part of an
   * {@link UnsafeArrayData} object. Reference types are stored as an 8 byte combination of an
   * offset (upper 4 bytes) and a length (lower 4 bytes), these point to the variable length
   * portion of the array object. Primitives take up to 8 bytes, depending on the size of the
   * underlying data type.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  private  int getElementSize (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Write an array to the buffer. If the array is already in serialized form (an instance of
   * {@link UnsafeArrayData}) then we copy the bytes directly, otherwise we do an element-by-element
   * copy.
   * @param arrayWriter (undocumented)
   * @param elementWriter (undocumented)
   * @param array (undocumented)
   */
  private  void writeArray (org.apache.spark.sql.catalyst.expressions.codegen.UnsafeArrayWriter arrayWriter, scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> elementWriter, org.apache.spark.sql.catalyst.util.ArrayData array)  { throw new RuntimeException(); }
}
