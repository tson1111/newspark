package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Prunes unnecessary Parquet columns given a {@link PhysicalOperation} over a
 * {@link ParquetRelation}. By "Parquet column", we mean a column as defined in the
 * Parquet format. In Spark SQL, a root-level Parquet column corresponds to a
 * SQL column, and a nested Parquet column corresponds to a {@link StructField}.
 */
public  class ParquetSchemaPruning {
  /**
   * This represents a "root" schema field (aka top-level, no-parent). <code>field</code> is the
   * <code>StructField</code> for field name and datatype. <code>derivedFromAtt</code> indicates whether it
   * was derived from an attribute or had a proper child. <code>contentAccessed</code> means whether
   * it was accessed with its content by the expressions refer it.
   */
  static private  class RootField implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.StructField field ()  { throw new RuntimeException(); }
    public  boolean derivedFromAtt ()  { throw new RuntimeException(); }
    public  boolean contentAccessed ()  { throw new RuntimeException(); }
    // not preceding
    public   RootField (org.apache.spark.sql.types.StructField field, boolean derivedFromAtt, boolean contentAccessed)  { throw new RuntimeException(); }
  }
  static private  class RootField$ extends scala.runtime.AbstractFunction3<org.apache.spark.sql.types.StructField, java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaPruning.RootField> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RootField$ MODULE$ = null;
    public   RootField$ ()  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply0 (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Checks to see if the given relation is Parquet and can be pruned.
   * @param fsRelation (undocumented)
   * @return (undocumented)
   */
  static private  boolean canPruneRelation (org.apache.spark.sql.execution.datasources.HadoopFsRelation fsRelation)  { throw new RuntimeException(); }
  /**
   * Normalizes the names of the attribute references in the given projects and filters to reflect
   * the names in the given logical relation. This makes it possible to compare attributes and
   * fields by name. Returns a tuple with the normalized projects and filters, respectively.
   * @param logicalRelation (undocumented)
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  static private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> normalizeAttributeRefNames (org.apache.spark.sql.execution.datasources.LogicalRelation logicalRelation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /**
   * Returns the set of fields from the Parquet file that the query plan needs.
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  static private  scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaPruning.RootField> identifyRootFields (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /**
   * Builds the new output {@link Project} Spark SQL operator that has the pruned output relation.
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @param prunedRelation (undocumented)
   * @param projectionOverSchema (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.catalyst.plans.logical.Project buildNewProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters, org.apache.spark.sql.execution.datasources.LogicalRelation prunedRelation, org.apache.spark.sql.execution.ProjectionOverSchema projectionOverSchema)  { throw new RuntimeException(); }
  /**
   * Filters the schema from the given file by the requested fields.
   * Schema field ordering from the file is preserved.
   * @param fileDataSchema (undocumented)
   * @param requestedRootFields (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.types.StructType pruneDataSchema (org.apache.spark.sql.types.StructType fileDataSchema, scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaPruning.RootField> requestedRootFields)  { throw new RuntimeException(); }
  /**
   * Builds a pruned logical relation from the output of the output relation and the schema of the
   * pruned base relation.
   * @param outputRelation (undocumented)
   * @param prunedBaseRelation (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.execution.datasources.LogicalRelation buildPrunedRelation (org.apache.spark.sql.execution.datasources.LogicalRelation outputRelation, org.apache.spark.sql.execution.datasources.HadoopFsRelation prunedBaseRelation)  { throw new RuntimeException(); }
  /**
   * Gets the root (aka top-level, no-parent) {@link StructField}s for the given {@link Expression}.
   * When expr is an {@link Attribute}, construct a field around it and indicate that that
   * field was derived from an attribute.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  static private  scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaPruning.RootField> getRootFields (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  /**
   * Counts the "leaf" fields of the given dataType. Informally, this is the
   * number of fields of non-complex data type in the tree representation of
   * {@link DataType}.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static private  int countLeaves (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Sorts the fields and descendant fields of structs in left according to their order in
   * right. This function assumes that the fields of left are a subset of the fields of
   * right, recursively. That is, left is a "subschema" of right, ignoring order of
   * fields.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.types.DataType sortLeftFieldsByRight (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
}
