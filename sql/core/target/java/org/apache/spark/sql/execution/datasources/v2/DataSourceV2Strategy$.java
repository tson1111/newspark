package org.apache.spark.sql.execution.datasources.v2;
public  class DataSourceV2Strategy$ extends org.apache.spark.sql.execution.SparkStrategy {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataSourceV2Strategy$ MODULE$ = null;
  public   DataSourceV2Strategy$ ()  { throw new RuntimeException(); }
  /**
   * Pushes down filters to the data source reader
   * <p>
   * @return pushed filter and post-scan filters.
   * @param reader (undocumented)
   * @param filters (undocumented)
   */
  private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> pushFilters (org.apache.spark.sql.sources.v2.reader.DataSourceReader reader, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /**
   * Applies column pruning to the data source, w.r.t. the references of the given expressions.
   * <p>
   * @return new output attributes after column pruning.
   * @param reader (undocumented)
   * @param relation (undocumented)
   * @param exprs (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> pruneColumns (org.apache.spark.sql.sources.v2.reader.DataSourceReader reader, org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
