package org.apache.spark.sql.catalyst.expressions.objects;
public  class CatalystToExternalMap$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CatalystToExternalMap$ MODULE$ = null;
  public   CatalystToExternalMap$ ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger curId ()  { throw new RuntimeException(); }
  /**
   * Construct an instance of CatalystToExternalMap case class.
   * <p>
   * @param keyFunction The function applied on the key collection elements.
   * @param valueFunction The function applied on the value collection elements.
   * @param inputData An expression that when evaluated returns a map object.
   * @param collClass The type of the resulting collection.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.objects.CatalystToExternalMap apply (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> keyFunction, scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> valueFunction, org.apache.spark.sql.catalyst.expressions.Expression inputData, java.lang.Class<?> collClass)  { throw new RuntimeException(); }
}
