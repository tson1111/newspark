package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Some utility function to convert Spark data source filters to Parquet filters.
 */
  class ParquetFilters {
  /**
   * Holds a single field information stored in the underlying parquet file.
   * <p>
   * param:  fieldName field name in parquet file
   * param:  fieldType field type related info in parquet file
   */
  private  class ParquetField implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  java.lang.String fieldName ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType fieldType ()  { throw new RuntimeException(); }
    // not preceding
    public   ParquetField (java.lang.String fieldName, org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType fieldType)  { throw new RuntimeException(); }
  }
  private  class ParquetField$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType, org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetField> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ParquetField$ MODULE$ = null;
    public   ParquetField$ ()  { throw new RuntimeException(); }
  }
  private  class ParquetSchemaType implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  org.apache.parquet.schema.OriginalType originalType ()  { throw new RuntimeException(); }
    public  org.apache.parquet.schema.PrimitiveType.PrimitiveTypeName primitiveTypeName ()  { throw new RuntimeException(); }
    public  int length ()  { throw new RuntimeException(); }
    public  org.apache.parquet.schema.DecimalMetadata decimalMetadata ()  { throw new RuntimeException(); }
    // not preceding
    public   ParquetSchemaType (org.apache.parquet.schema.OriginalType originalType, org.apache.parquet.schema.PrimitiveType.PrimitiveTypeName primitiveTypeName, int length, org.apache.parquet.schema.DecimalMetadata decimalMetadata)  { throw new RuntimeException(); }
  }
  private  class ParquetSchemaType$ extends scala.runtime.AbstractFunction4<org.apache.parquet.schema.OriginalType, org.apache.parquet.schema.PrimitiveType.PrimitiveTypeName, java.lang.Object, org.apache.parquet.schema.DecimalMetadata, org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ParquetSchemaType$ MODULE$ = null;
    public   ParquetSchemaType$ ()  { throw new RuntimeException(); }
  }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetBinaryType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetBooleanType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetByteType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetDateType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetDoubleType ()  { throw new RuntimeException(); }
  public   ParquetFilters (boolean pushDownDate, boolean pushDownTimestamp, boolean pushDownDecimal, boolean pushDownStartWith, int pushDownInFilterThreshold, boolean caseSensitive)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetFloatType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetIntegerType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetLongType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetShortType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetStringType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetTimestampMicrosType ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType ParquetTimestampMillisType ()  { throw new RuntimeException(); }
  /**
   * Converts data sources filters to Parquet filter predicates.
   * @param schema (undocumented)
   * @param predicate (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.parquet.filter2.predicate.FilterPredicate> createFilter (org.apache.parquet.schema.MessageType schema, org.apache.spark.sql.sources.Filter predicate)  { throw new RuntimeException(); }
  private  int dateToDays (java.sql.Date date)  { throw new RuntimeException(); }
  private  org.apache.parquet.io.api.Binary decimalToByteArray (java.math.BigDecimal decimal, int numBytes)  { throw new RuntimeException(); }
  private  java.lang.Integer decimalToInt32 (java.math.BigDecimal decimal)  { throw new RuntimeException(); }
  private  java.lang.Long decimalToInt64 (java.math.BigDecimal decimal)  { throw new RuntimeException(); }
  /**
   * Returns a map, which contains parquet field name and data type, if predicate push down applies.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetField> getFieldMap (org.apache.parquet.schema.MessageType dataType)  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeEq ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeGt ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeGtEq ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeLt ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeLtEq ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.execution.datasources.parquet.ParquetFilters.ParquetSchemaType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeNotEq ()  { throw new RuntimeException(); }
}
