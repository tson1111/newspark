package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Generates a {@link Projection} that returns an {@link UnsafeRow}.
 * <p>
 * It generates the code for all the expressions, computes the total length for all the columns
 * (can be accessed via variables), and then copies the data into a scratch buffer space in the
 * form of UnsafeRow (the scratch buffer will grow as needed).
 * <p>
 * @note The returned UnsafeRow will be pointed to a scratch buffer inside the projection.
 */
public  class GenerateUnsafeProjection$ extends org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.UnsafeProjection> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GenerateUnsafeProjection$ MODULE$ = null;
  public   GenerateUnsafeProjection$ ()  { throw new RuntimeException(); }
  /** Returns true iff we support this data type. */
  public  boolean canSupport (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  private  java.lang.String writeStructToBuffer (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, java.lang.String index, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.GenerateUnsafeProjection.Schema> schemas, java.lang.String rowWriter)  { throw new RuntimeException(); }
  private  java.lang.String writeExpressionsToBuffer (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String row, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> inputs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.GenerateUnsafeProjection.Schema> schemas, java.lang.String rowWriter, boolean isTopLevel)  { throw new RuntimeException(); }
  private  java.lang.String writeArrayToBuffer (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType elementType, boolean containsNull, java.lang.String rowWriter)  { throw new RuntimeException(); }
  private  java.lang.String writeMapToBuffer (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, java.lang.String index, org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType, boolean valueContainsNull, java.lang.String rowWriter)  { throw new RuntimeException(); }
  private  java.lang.String writeElement (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, java.lang.String index, org.apache.spark.sql.types.DataType dt, java.lang.String writer)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode createCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean useSubexprElimination)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> canonicalize (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> bind (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection generate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean subexpressionEliminationEnabled)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> references)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean subexpressionEliminationEnabled)  { throw new RuntimeException(); }
}
