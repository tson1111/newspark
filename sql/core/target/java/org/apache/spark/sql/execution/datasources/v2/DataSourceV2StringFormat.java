package org.apache.spark.sql.execution.datasources.v2;
/**
 * A trait that can be used by data source v2 related query plans(both logical and physical), to
 * provide a string format of the data source information for explain.
 */
public  interface DataSourceV2StringFormat {
  public  java.lang.String metadataString ()  ;
  /**
   * The options for this data source reader.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  ;
  /**
   * The output of the data source reader, w.r.t. column pruning.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  /**
   * The filters which have been pushed to the data source.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> pushedFilters ()  ;
  /**
   * The instance of this data source implementation. Note that we only consider its class in
   * equals/hashCode, not the instance itself.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.v2.DataSourceV2 source ()  ;
  public  java.lang.String sourceName ()  ;
}
