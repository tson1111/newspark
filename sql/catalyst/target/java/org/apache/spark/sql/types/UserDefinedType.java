package org.apache.spark.sql.types;
/**
 * The data type for User Defined Types (UDTs).
 * <p>
 * This interface allows a user to make their own classes more interoperable with SparkSQL;
 * e.g., by creating a {@link UserDefinedType} for a class X, it becomes possible to create
 * a <code>DataFrame</code> which has class X in the schema.
 * <p>
 * For SparkSQL to recognize UDTs, the UDT must be annotated with
 * {@link SQLUserDefinedType}.
 * <p>
 * The conversion via <code>serialize</code> occurs when instantiating a <code>DataFrame</code> from another RDD.
 * The conversion via <code>deserialize</code> occurs when reading from a <code>DataFrame</code>.
 * <p>
 * Note: This was previously a developer API in Spark 1.x. We are making this private in Spark 2.0
 * because we will very likely create a new version of this that works better with Datasets.
 */
 abstract class UserDefinedType<UserType extends java.lang.Object> extends org.apache.spark.sql.types.DataType implements scala.Serializable {
  static   boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static public  java.lang.String typeName ()  { throw new RuntimeException(); }
  static public  java.lang.String json ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static   java.lang.String simpleString (int maxNumberFields)  { throw new RuntimeException(); }
  static   boolean sameType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static   boolean existsRecursively (scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> f)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Ident(scala), scala.Null)), TypeTree()))
  public   UserDefinedType ()  { throw new RuntimeException(); }
  /** Underlying storage type for this UDT */
  public abstract  org.apache.spark.sql.types.DataType sqlType ()  ;
  /** Paired Python UDT class, if exists. */
  public  java.lang.String pyUDT ()  { throw new RuntimeException(); }
  /** Serialized Python UDT class, if exists. */
  public  java.lang.String serializedPyClass ()  { throw new RuntimeException(); }
  /**
   * Convert the user type to a SQL datum
   * @param obj (undocumented)
   * @return (undocumented)
   */
  public abstract  Object serialize (UserType obj)  ;
  /** Convert a SQL datum to the user type */
  public abstract  UserType deserialize (Object datum)  ;
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  /**
   * Class object for the UserType
   * @return (undocumented)
   */
  public abstract  java.lang.Class<UserType> userClass ()  ;
  public  int defaultSize ()  { throw new RuntimeException(); }
  /**
   * For UDT, asNullable will not change the nullability of its internal sqlType and just returns
   * itself.
   * @return (undocumented)
   */
    org.apache.spark.sql.types.UserDefinedType<UserType> asNullable ()  { throw new RuntimeException(); }
    boolean acceptsType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  java.lang.String catalogString ()  { throw new RuntimeException(); }
}