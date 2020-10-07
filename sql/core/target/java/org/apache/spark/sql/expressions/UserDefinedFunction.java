package org.apache.spark.sql.expressions;
/**
 * A user-defined function. To create one, use the <code>udf</code> functions in <code>functions</code>.
 * <p>
 * As an example:
 * <pre><code>
 *   // Define a UDF that returns true or false based on some numeric score.
 *   val predict = udf((score: Double) =&gt; score &gt; 0.5)
 *
 *   // Projects a column that adds a prediction column based on the score column.
 *   df.select( predict(df("score")) )
 * </code></pre>
 * <p>
 * @since 1.3.0
 */
public  class UserDefinedFunction implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  /**
   * Returns an expression that invokes the UDF, using the given arguments.
   * <p>
   * @since 1.3.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Column apply (org.apache.spark.sql.Column... exprs)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.Object f ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.sql.types.DataType>> inputTypes ()  { throw new RuntimeException(); }
  // not preceding
  protected   UserDefinedFunction (java.lang.Object f, org.apache.spark.sql.types.DataType dataType, scala.Option<scala.collection.Seq<org.apache.spark.sql.types.DataType>> inputTypes)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> _nameOption ()  { throw new RuntimeException(); }
  private  boolean _nullable ()  { throw new RuntimeException(); }
  private  boolean _deterministic ()  { throw new RuntimeException(); }
    scala.Option<scala.collection.Seq<java.lang.Object>> nullableTypes ()  { throw new RuntimeException(); }
  /**
   * Returns true when the UDF can return a nullable value.
   * <p>
   * @since 2.3.0
   * @return (undocumented)
   */
  public  boolean nullable ()  { throw new RuntimeException(); }
  /**
   * Returns true iff the UDF is deterministic, i.e. the UDF produces the same output given the same
   * input.
   * <p>
   * @since 2.3.0
   * @return (undocumented)
   */
  public  boolean deterministic ()  { throw new RuntimeException(); }
  /**
   * Returns an expression that invokes the UDF, using the given arguments.
   * <p>
   * @since 1.3.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Column apply (scala.collection.Seq<org.apache.spark.sql.Column> exprs)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.expressions.UserDefinedFunction copyAll ()  { throw new RuntimeException(); }
  /**
   * Updates UserDefinedFunction with a given name.
   * <p>
   * @since 2.3.0
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.expressions.UserDefinedFunction withName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Updates UserDefinedFunction to non-nullable.
   * <p>
   * @since 2.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.expressions.UserDefinedFunction asNonNullable ()  { throw new RuntimeException(); }
  /**
   * Updates UserDefinedFunction to nondeterministic.
   * <p>
   * @since 2.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.expressions.UserDefinedFunction asNondeterministic ()  { throw new RuntimeException(); }
}
