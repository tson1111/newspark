package org.apache.spark.sql.types;
/**
 * The base type of all Spark SQL data types.
 * <p>
 * @since 1.3.0
 */
public abstract class DataType extends org.apache.spark.sql.types.AbstractDataType {
  static private  class JSortedObject$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JSortedObject$ MODULE$ = null;
    public   JSortedObject$ ()  { throw new RuntimeException(); }
    public  scala.Option<scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>>> unapplySeq (org.json4s.JsonAST.JValue value)  { throw new RuntimeException(); }
  }
  static private  scala.util.matching.Regex FIXED_DECIMAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType fromDDL (java.lang.String ddl)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType fromJson (java.lang.String json)  { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.DataType> nonDecimalNameToType ()  { throw new RuntimeException(); }
  /** Given the string representation of a type, return its DataType */
  static private  org.apache.spark.sql.types.DataType nameToType (java.lang.String name)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType parseDataType (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.types.StructField parseStructField (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static protected  void buildFormattedString (org.apache.spark.sql.types.DataType dataType, java.lang.String prefix, scala.collection.mutable.StringBuilder builder)  { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring nullability of ArrayType, MapType, StructType.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static   boolean equalsIgnoreNullability (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right)  { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring compatible nullability of ArrayType, MapType, StructType.
   * <p>
   * Compatible nullability is defined as follows:
   *   - If <code>from</code> and <code>to</code> are ArrayTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if <code>to.containsNull</code> is true, or both of <code>from.containsNull</code> and
   *   <code>to.containsNull</code> are false.
   *   - If <code>from</code> and <code>to</code> are MapTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if <code>to.valueContainsNull</code> is true, or both of <code>from.valueContainsNull</code> and
   *   <code>to.valueContainsNull</code> are false.
   *   - If <code>from</code> and <code>to</code> are StructTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if for all every pair of fields, <code>to.nullable</code> is true, or both
   *   of <code>fromField.nullable</code> and <code>toField.nullable</code> are false.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  static   boolean equalsIgnoreCompatibleNullability (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring nullability of ArrayType, MapType, StructType, and ignoring case
   * sensitivity of field names in StructType.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  static   boolean equalsIgnoreCaseAndNullability (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  /**
   * Returns true if the two data types share the same "shape", i.e. the types
   * are the same, but the field names don't need to be the same.
   * <p>
   * @param ignoreNullability whether to ignore nullability when comparing the types
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  static public  boolean equalsStructurally (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to, boolean ignoreNullability)  { throw new RuntimeException(); }
  static private  scala.util.matching.Regex SparkGeneratedName ()  { throw new RuntimeException(); }
  static private  boolean isSparkGeneratedName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Returns true if the write data type can be read using the read data type.
   * <p>
   * The write type is compatible with the read type if:
   * - Both types are arrays, the array element types are compatible, and element nullability is
   *   compatible (read allows nulls or write does not contain nulls).
   * - Both types are maps and the map key and value types are compatible, and value nullability
   *   is compatible  (read allows nulls or write does not contain nulls).
   * - Both types are structs and each field in the read struct is present in the write struct and
   *   compatible (including nullability), or is nullable if the write struct does not contain the
   *   field. Write-side structs are not compatible if they contain fields that are not present in
   *   the read-side struct.
   * - Both types are atomic and the write type can be safely cast to the read type.
   * <p>
   * Extra fields in write-side structs are not allowed to avoid accidentally writing data that
   * the read schema will not read, and to ensure map key equality is not changed when data is read.
   * <p>
   * @param write a write-side data type to validate against the read type
   * @param read a read-side data type
   * @return true if data written with the write type can be read using the read type
   * @param resolver (undocumented)
   * @param context (undocumented)
   * @param addError (undocumented)
   */
  static public  boolean canWrite (org.apache.spark.sql.types.DataType write, org.apache.spark.sql.types.DataType read, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver, java.lang.String context, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> addError)  { throw new RuntimeException(); }
  public   DataType ()  { throw new RuntimeException(); }
  /**
   * Enables matching against DataType for expressions:
   * <pre><code>
   *   case Cast(child &#64; BinaryType(), StringType) =&gt;
   *     ...
   * </code></pre>
   * @param e (undocumented)
   * @return (undocumented)
   */
    boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  /**
   * The default size of a value of this data type, used internally for size estimation.
   * @return (undocumented)
   */
  public abstract  int defaultSize ()  ;
  /** Name of the type used in JSON serialization. */
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  /** The compact JSON representation of this data type. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this data type. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  /** Readable string representation for the type. */
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  /** String representation for the type saved in external catalogs. */
  public  java.lang.String catalogString ()  { throw new RuntimeException(); }
  /** Readable string representation for the type with truncation */
    java.lang.String simpleString (int maxNumberFields)  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  /**
   * Check if <code>this</code> and <code>other</code> are the same data type when ignoring nullability
   * (<code>StructField.nullable</code>, <code>ArrayType.containsNull</code>, and <code>MapType.valueContainsNull</code>).
   * @param other (undocumented)
   * @return (undocumented)
   */
    boolean sameType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  /**
   * Returns the same data type but set all nullability fields are true
   * (<code>StructField.nullable</code>, <code>ArrayType.containsNull</code>, and <code>MapType.valueContainsNull</code>).
   * @return (undocumented)
   */
   abstract  org.apache.spark.sql.types.DataType asNullable ()  ;
  /**
   * Returns true if any <code>DataType</code> of this DataType tree satisfies the given function <code>f</code>.
   * @param f (undocumented)
   * @return (undocumented)
   */
    boolean existsRecursively (scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> f)  { throw new RuntimeException(); }
    org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
    boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
}
