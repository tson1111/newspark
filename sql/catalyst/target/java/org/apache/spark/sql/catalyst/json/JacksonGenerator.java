package org.apache.spark.sql.catalyst.json;
/**
 * <code>JackGenerator</code> can only be initialized with a <code>StructType</code>, a <code>MapType</code> or an <code>ArrayType</code>.
 * Once it is initialized with <code>StructType</code>, it can be used to write out a struct or an array of
 * struct. Once it is initialized with <code>MapType</code>, it can be used to write out a map or an array
 * of map. An exception will be thrown if trying to write out a struct if it is initialized with
 * a <code>MapType</code>, and vice verse.
 */
  class JacksonGenerator {
  public   JacksonGenerator (org.apache.spark.sql.types.DataType dataType, java.io.Writer writer, org.apache.spark.sql.catalyst.json.JSONOptions options)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> arrElementWriter ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
  private  com.fasterxml.jackson.core.JsonGenerator gen ()  { throw new RuntimeException(); }
  private  java.lang.String lineSeparator ()  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> makeWriter (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> mapElementWriter ()  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit>[] rootFieldWriters ()  { throw new RuntimeException(); }
  /**
   * Transforms a single <code>InternalRow</code> to JSON object using Jackson.
   * This api calling will be validated through accessing <code>rootFieldWriters</code>.
   * <p>
   * @param row The row to convert
   */
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  /**
   * Transforms multiple <code>InternalRow</code>s or <code>MapData</code>s to JSON array using Jackson
   * <p>
   * @param array The array of rows or maps to convert
   */
  public  void write (org.apache.spark.sql.catalyst.util.ArrayData array)  { throw new RuntimeException(); }
  /**
   * Transforms a single <code>MapData</code> to JSON object using Jackson
   * This api calling will will be validated through accessing <code>mapElementWriter</code>.
   * <p>
   * @param map a map to convert
   */
  public  void write (org.apache.spark.sql.catalyst.util.MapData map)  { throw new RuntimeException(); }
  private  void writeArray (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  private  void writeArrayData (org.apache.spark.sql.catalyst.util.ArrayData array, scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> fieldWriter)  { throw new RuntimeException(); }
  private  void writeFields (org.apache.spark.sql.catalyst.InternalRow row, org.apache.spark.sql.types.StructType schema, scala.collection.Seq<scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit>> fieldWriters)  { throw new RuntimeException(); }
  public  void writeLineEnding ()  { throw new RuntimeException(); }
  private  void writeMapData (org.apache.spark.sql.catalyst.util.MapData map, org.apache.spark.sql.types.MapType mapType, scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> fieldWriter)  { throw new RuntimeException(); }
  private  void writeObject (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}