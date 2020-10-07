package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Prunes unnecessary Parquet columns given a {@link PhysicalOperation} over a
 * {@link ParquetRelation}. By "Parquet column", we mean a column as defined in the
 * Parquet format. In Spark SQL, a root-level Parquet column corresponds to a
 * SQL column, and a nested Parquet column corresponds to a {@link StructField}.
 */
public  class ParquetSchemaPruning$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetSchemaPruning$ MODULE$ = null;
  public   ParquetSchemaPruning$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply0 (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Checks to see if the given relation is Parquet and can be pruned.
   * @param fsRelation (undocumented)
   * @return (undocumented)
   */
  private  boolean canPruneRelation (org.apache.spark.sql.execution.datasources.HadoopFsRelation fsRelation)  { throw new RuntimeException(); }
  /**
   * Normalizes the names of the attribute references in the given projects and filters to reflect
   * the names in the given logical relation. This makes it possible to compare attributes and
   * fields by name. Returns a tuple with the normalized projects and filters, respectively.
   * @param logicalRelation (undocumented)
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> normalizeAttributeRefNames (org.apache.spark.sql.execution.datasources.LogicalRelation logicalRelation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /**
   * Returns the set of fields from the Parquet file that the query plan needs.
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaPruning.RootField> identifyRootFields (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /**
   * Builds the new output {@link Project} Spark SQL operator that has the pruned output relation.
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @param prunedRelation (undocumented)
   * @param projectionOverSchema (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.Project buildNewProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters, org.apache.spark.sql.execution.datasources.LogicalRelation prunedRelation, org.apache.spark.sql.execution.ProjectionOverSchema projectionOverSchema)  { throw new RuntimeException(); }
  /**
   * Filters the schema from the given file by the requested fields.
   * Schema field ordering from the file is preserved.
   * @param fileDataSchema (undocumented)
   * @param requestedRootFields (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.types.StructType pruneDataSchema (org.apache.spark.sql.types.StructType fileDataSchema, scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaPruning.RootField> requestedRootFields)  { throw new RuntimeException(); }
  /**
   * Builds a pruned logical relation from the output of the output relation and the schema of the
   * pruned base relation.
   * @param outputRelation (undocumented)
   * @param prunedBaseRelation (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.datasources.LogicalRelation buildPrunedRelation (org.apache.spark.sql.execution.datasources.LogicalRelation outputRelation, org.apache.spark.sql.execution.datasources.HadoopFsRelation prunedBaseRelation)  { throw new RuntimeException(); }
  /**
   * Gets the root (aka top-level, no-parent) {@link StructField}s for the given {@link Expression}.
   * When expr is an {@link Attribute}, construct a field around it and indicate that that
   * field was derived from an attribute.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaPruning.RootField> getRootFields (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  /**
   * Counts the "leaf" fields of the given dataType. Informally, this is the
   * number of fields of non-complex data type in the tree representation of
   * {@link DataType}.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  private  int countLeaves (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Sorts the fields and descendant fields of structs in left according to their order in
   * right. This function assumes that the fields of left are a subset of the fields of
   * right, recursively. That is, left is a "subschema" of right, ignoring order of
   * fields.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.types.DataType sortLeftFieldsByRight (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right)  { throw new RuntimeException(); }
}
