package org.apache.spark.sql.catalyst.expressions.aggregate;
public abstract class AverageLike extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate {
  public   AverageLike (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference count ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> initialValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.FractionalType resultType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference sum ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.FractionalType sumDataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressionsDef ()  { throw new RuntimeException(); }
}
