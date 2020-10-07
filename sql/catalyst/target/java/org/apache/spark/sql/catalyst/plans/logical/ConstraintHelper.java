package org.apache.spark.sql.catalyst.plans.logical;
public  interface ConstraintHelper {
  /**
   * Infers a set of <code>isNotNull</code> constraints from null intolerant expressions as well as
   * non-nullable attributes. For e.g., if an expression is of the form (<code>a > 5</code>), this
   * returns a constraint of the form <code>isNotNull(a)</code>
   * @param constraints (undocumented)
   * @param output (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constructIsNotNullConstraints (scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constraints, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  ;
  /**
   * Infers an additional set of constraints from a given set of equality constraints.
   * For e.g., if an operator has constraints of the form (<code>a = 5</code>, <code>a = b</code>), this returns an
   * additional constraint of the form <code>b = 5</code>.
   * @param constraints (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> inferAdditionalConstraints (scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constraints)  ;
  /**
   * Infer the Attribute-specific IsNotNull constraints from the null intolerant child expressions
   * of constraints.
   * @param constraint (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> inferIsNotNullConstraints (org.apache.spark.sql.catalyst.expressions.Expression constraint)  ;
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> replaceConstraints (scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constraints, org.apache.spark.sql.catalyst.expressions.Expression source, org.apache.spark.sql.catalyst.expressions.Attribute destination)  ;
  /**
   * Recursively explores the expressions which are null intolerant and returns all attributes
   * in these expressions.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> scanNullIntolerantAttribute (org.apache.spark.sql.catalyst.expressions.Expression expr)  ;
}
