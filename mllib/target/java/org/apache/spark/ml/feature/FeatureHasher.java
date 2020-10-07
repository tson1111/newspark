package org.apache.spark.ml.feature;
/**
 * Feature hashing projects a set of categorical or numerical features into a feature vector of
 * specified dimension (typically substantially smaller than that of the original feature
 * space). This is done using the hashing trick (https://en.wikipedia.org/wiki/Feature_hashing)
 * to map features to indices in the feature vector.
 * <p>
 * The {@link FeatureHasher} transformer operates on multiple columns. Each column may contain either
 * numeric or categorical features. Behavior and handling of column data types is as follows:
 *  -Numeric columns: For numeric features, the hash value of the column name is used to map the
 *                    feature value to its index in the feature vector. By default, numeric features
 *                    are not treated as categorical (even when they are integers). To treat them
 *                    as categorical, specify the relevant columns in <code>categoricalCols</code>.
 *  -String columns: For categorical features, the hash value of the string "column_name=value"
 *                   is used to map to the vector index, with an indicator value of <code>1.0</code>.
 *                   Thus, categorical features are "one-hot" encoded
 *                   (similarly to using {@link OneHotEncoder} with <code>dropLast=false</code>).
 *  -Boolean columns: Boolean values are treated in the same way as string columns. That is,
 *                    boolean features are represented as "column_name=true" or "column_name=false",
 *                    with an indicator value of <code>1.0</code>.
 * <p>
 * Null (missing) values are ignored (implicitly zero in the resulting feature vector).
 * <p>
 * The hash function used here is also the MurmurHash 3 used in {@link HashingTF}. Since a simple modulo
 * on the hashed value is used to determine the vector index, it is advisable to use a power of two
 * as the numFeatures parameter; otherwise the features will not be mapped evenly to the vector
 * indices.
 * <p>
 * <pre><code>
 *   val df = Seq(
 *    (2.0, true, "1", "foo"),
 *    (3.0, false, "2", "bar")
 *   ).toDF("real", "bool", "stringNum", "string")
 *
 *   val hasher = new FeatureHasher()
 *    .setInputCols("real", "bool", "stringNum", "string")
 *    .setOutputCol("features")
 *
 *   hasher.transform(df).show(false)
 *
 *   +----+-----+---------+------+------------------------------------------------------+
 *   |real|bool |stringNum|string|features                                              |
 *   +----+-----+---------+------+------------------------------------------------------+
 *   |2.0 |true |1        |foo   |(262144,[51871,63643,174475,253195],[1.0,1.0,2.0,1.0])|
 *   |3.0 |false|2        |bar   |(262144,[6031,80619,140467,174475],[1.0,1.0,1.0,3.0]) |
 *   +----+-----+---------+------+------------------------------------------------------+
 * </code></pre>
 */
public  class FeatureHasher extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.FeatureHasher load (java.lang.String path)  { throw new RuntimeException(); }
  static private  int seed ()  { throw new RuntimeException(); }
  /**
   * Calculate a hash code value for the term object using
   * Austin Appleby's MurmurHash 3 algorithm (MurmurHash3_x86_32).
   * This is the default hash algorithm used from Spark 2.0 onwards.
   * Use hashUnsafeBytes2 to match the original algorithm with the value.
   * See SPARK-23381.
   * @param term (undocumented)
   * @return (undocumented)
   */
  static   int murmur3Hash (Object term)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  static public  java.lang.String explainParam (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  java.lang.String explainParams ()  { throw new RuntimeException(); }
  static public final  boolean isSet (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final  boolean isDefined (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  boolean hasParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (java.lang.String param, Object value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.ParamPair<?> paramPair)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Params clear (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> T getOrDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> T $ (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> org.apache.spark.ml.param.Params setDefault (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params setDefault (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> getDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> boolean hasDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends org.apache.spark.ml.param.Params> T defaultCopy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap ()  { throw new RuntimeException(); }
  static   org.apache.spark.ml.param.ParamMap paramMap ()  { throw new RuntimeException(); }
  static   org.apache.spark.ml.param.ParamMap defaultParamMap ()  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> T copyValues (T to, org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> org.apache.spark.ml.param.ParamMap copyValues$default$2 ()  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  static public final  java.lang.String[] getInputCols ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getOutputCol ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   FeatureHasher (java.lang.String uid)  { throw new RuntimeException(); }
  public   FeatureHasher ()  { throw new RuntimeException(); }
  /**
   * Numeric columns to treat as categorical features. By default only string and boolean
   * columns are treated as categorical, so this param can be used to explicitly specify the
   * numerical columns to treat as categorical. Note, the relevant columns must also be set in
   * <code>inputCols</code>.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam categoricalCols ()  { throw new RuntimeException(); }
  /**
   * Number of features. Should be greater than 0.
   * (default = 2^18^)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numFeatures ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  int getNumFeatures ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setNumFeatures (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setInputCols (scala.collection.Seq<java.lang.String> values)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String[] getCategoricalCols ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setCategoricalCols (java.lang.String[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.FeatureHasher copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}