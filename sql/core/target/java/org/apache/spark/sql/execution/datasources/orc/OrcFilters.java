package org.apache.spark.sql.execution.datasources.orc;
/**
 * Helper object for building ORC <code>SearchArgument</code>s, which are used for ORC predicate push-down.
 * <p>
 * Due to limitation of ORC <code>SearchArgument</code> builder, we had to end up with a pretty weird double-
 * checking pattern when converting <code>And</code>/<code>Or</code>/<code>Not</code> filters.
 * <p>
 * An ORC <code>SearchArgument</code> must be built in one pass using a single builder.  For example, you can't
 * build <code>a = 1</code> and <code>b = 2</code> first, and then combine them into <code>a = 1 AND b = 2</code>.  This is quite
 * different from the cases in Spark SQL or Parquet, where complex filters can be easily built using
 * existing simpler ones.
 * <p>
 * The annoying part is that, <code>SearchArgument</code> builder methods like <code>startAnd()</code>, <code>startOr()</code>, and
 * <code>startNot()</code> mutate internal state of the builder instance.  This forces us to translate all
 * convertible filters with a single builder instance. However, before actually converting a filter,
 * we've no idea whether it can be recognized by ORC or not. Thus, when an inconvertible filter is
 * found, we may already end up with a builder whose internal state is inconsistent.
 * <p>
 * For example, to convert an <code>And</code> filter with builder <code>b</code>, we call <code>b.startAnd()</code> first, and then
 * try to convert its children.  Say we convert <code>left</code> child successfully, but find that <code>right</code>
 * child is inconvertible.  Alas, <code>b.startAnd()</code> call can't be rolled back, and <code>b</code> is inconsistent
 * now.
 * <p>
 * The workaround employed here is that, for <code>And</code>/<code>Or</code>/<code>Not</code>, we first try to convert their
 * children with brand new builders, and only do the actual conversion with the right builder
 * instance when the children are proven to be convertible.
 * <p>
 * P.S.: Hive seems to use <code>SearchArgument</code> together with <code>ExprNodeGenericFuncDesc</code> only.  Usage of
 * builder methods mentioned above can only be found in test code, where all tested filters are
 * known to be convertible.
 */
public  class OrcFilters {
  static   scala.Option<org.apache.spark.sql.sources.Filter> buildTree (scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  { throw new RuntimeException(); }
  static private  java.lang.String quoteAttributeNameIfNeeded (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Create ORC filter as a SearchArgument instance.
   * @param schema (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.orc.storage.ql.io.sarg.SearchArgument> createFilter (org.apache.spark.sql.types.StructType schema, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  { throw new RuntimeException(); }
  /**
   * Return true if this is a searchable type in ORC.
   * Both CharType and VarcharType are cleaned at AstBuilder.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static private  boolean isSearchableType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Get PredicateLeafType which is corresponding to the given DataType.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.orc.storage.ql.io.sarg.PredicateLeaf.Type getPredicateLeafType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Cast literal values for filters.
   * <p>
   * We need to cast to long because ORC raises exceptions
   * at 'checkLiteralType' of SearchArgumentImpl.java.
   * @param value (undocumented)
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static private  Object castLiteralValue (Object value, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Build a SearchArgument and return the builder so far.
   * @param dataTypeMap (undocumented)
   * @param expression (undocumented)
   * @param builder (undocumented)
   * @return (undocumented)
   */
  static private  scala.Option<org.apache.orc.storage.ql.io.sarg.SearchArgument.Builder> buildSearchArgument (scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.DataType> dataTypeMap, org.apache.spark.sql.sources.Filter expression, org.apache.orc.storage.ql.io.sarg.SearchArgument.Builder builder)  { throw new RuntimeException(); }
}
