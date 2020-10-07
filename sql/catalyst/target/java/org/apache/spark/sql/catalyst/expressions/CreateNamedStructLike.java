package org.apache.spark.sql.catalyst.expressions;
/**
 * Common base class for both {@link CreateNamedStruct} and {@link CreateNamedStructUnsafe}.
 */
public  interface CreateNamedStructLike {
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  ;
  public  org.apache.spark.sql.types.StructType dataType ()  ;
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  ;
  /**
   * Returns Aliased {@link Expression}s that could be used to construct a flattened version of this
   * StructType.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> flatten ()  ;
  public  boolean foldable ()  ;
  // not preceding
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.Expression> nameExprs ()  ;
  public  scala.collection.immutable.List<java.lang.Object> names ()  ;
  public  boolean nullable ()  ;
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.Expression> valExprs ()  ;
}
