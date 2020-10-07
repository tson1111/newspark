package org.apache.spark.ml.feature;
/**
 * Provides some helper methods used by both <code>OneHotEncoder</code> and <code>OneHotEncoderEstimator</code>.
 */
public  class OneHotEncoderCommon$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OneHotEncoderCommon$ MODULE$ = null;
  public   OneHotEncoderCommon$ ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String[]> genOutputAttrNames (org.apache.spark.sql.types.StructField inputCol)  { throw new RuntimeException(); }
  /** Creates an `AttributeGroup` filled by the `BinaryAttribute` named as required. */
  private  org.apache.spark.ml.attribute.AttributeGroup genOutputAttrGroup (scala.Option<java.lang.String[]> outputAttrNames, java.lang.String outputColName)  { throw new RuntimeException(); }
  /**
   * Prepares the <code>StructField</code> with proper metadata for <code>OneHotEncoder</code>'s output column.
   * @param inputCol (undocumented)
   * @param outputColName (undocumented)
   * @param dropLast (undocumented)
   * @param keepInvalid (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructField transformOutputColumnSchema (org.apache.spark.sql.types.StructField inputCol, java.lang.String outputColName, boolean dropLast, boolean keepInvalid)  { throw new RuntimeException(); }
  /**
   * This method is called when we want to generate <code>AttributeGroup</code> from actual data for
   * one-hot encoder.
   * @param dataset (undocumented)
   * @param inputColNames (undocumented)
   * @param outputColNames (undocumented)
   * @param dropLast (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.ml.attribute.AttributeGroup> getOutputAttrGroupFromData (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> inputColNames, scala.collection.Seq<java.lang.String> outputColNames, boolean dropLast)  { throw new RuntimeException(); }
  /** Creates an `AttributeGroup` with the required number of `BinaryAttribute`. */
  public  org.apache.spark.ml.attribute.AttributeGroup createAttrGroupForAttrNames (java.lang.String outputColName, int numAttrs, boolean dropLast, boolean keepInvalid)  { throw new RuntimeException(); }
}
