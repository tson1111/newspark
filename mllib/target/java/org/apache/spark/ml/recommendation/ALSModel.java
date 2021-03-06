package org.apache.spark.ml.recommendation;
/**
 * Model fitted by ALS.
 * <p>
 * param:  rank rank of the matrix factorization model
 * param:  userFactors a DataFrame that stores user factors in two columns: <code>id</code> and <code>features</code>
 * param:  itemFactors a DataFrame that stores item factors in two columns: <code>id</code> and <code>features</code>
 */
public  class ALSModel extends org.apache.spark.ml.Model<org.apache.spark.ml.recommendation.ALSModel> implements org.apache.spark.ml.recommendation.ALSModelParams, org.apache.spark.ml.util.MLWritable {
  static   class ALSModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   ALSModelWriter (org.apache.spark.ml.recommendation.ALSModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class ALSModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.recommendation.ALSModel> {
    public   ALSModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.recommendation.ALSModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  java.lang.String NaN ()  { throw new RuntimeException(); }
  static private  java.lang.String Drop ()  { throw new RuntimeException(); }
  static  final  java.lang.String[] supportedColdStartStrategies ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.recommendation.ALSModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.recommendation.ALSModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.ml.Estimator<M> parent ()  { throw new RuntimeException(); }
  static public  void parent_$eq (org.apache.spark.ml.Estimator<M> x$1)  { throw new RuntimeException(); }
  static public  M setParent (org.apache.spark.ml.Estimator<M> parent)  { throw new RuntimeException(); }
  static public  boolean hasParent ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> userCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getUserCol ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> itemCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getItemCol ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.expressions.UserDefinedFunction checkedCast ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> coldStartStrategy ()  { throw new RuntimeException(); }
  static public  java.lang.String getColdStartStrategy ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int rank ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> userFactors ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> itemFactors ()  { throw new RuntimeException(); }
  // not preceding
     ALSModel (java.lang.String uid, int rank, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> userFactors, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> itemFactors)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setUserCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setItemCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALSModel setColdStartStrategy (java.lang.String value)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.expressions.UserDefinedFunction predict ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALSModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  /**
   * Returns top <code>numItems</code> items recommended for each user, for all users.
   * @param numItems max number of recommendations for each user
   * @return a DataFrame of (userCol: Int, recommendations), where recommendations are
   *         stored as an array of (itemCol: Int, rating: Float) Rows.
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForAllUsers (int numItems)  { throw new RuntimeException(); }
  /**
   * Returns top <code>numItems</code> items recommended for each user id in the input data set. Note that if
   * there are duplicate ids in the input dataset, only one set of recommendations per unique id
   * will be returned.
   * @param dataset a Dataset containing a column of user ids. The column name must match <code>userCol</code>.
   * @param numItems max number of recommendations for each user.
   * @return a DataFrame of (userCol: Int, recommendations), where recommendations are
   *         stored as an array of (itemCol: Int, rating: Float) Rows.
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForUserSubset (org.apache.spark.sql.Dataset<?> dataset, int numItems)  { throw new RuntimeException(); }
  /**
   * Returns top <code>numUsers</code> users recommended for each item, for all items.
   * @param numUsers max number of recommendations for each item
   * @return a DataFrame of (itemCol: Int, recommendations), where recommendations are
   *         stored as an array of (userCol: Int, rating: Float) Rows.
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForAllItems (int numUsers)  { throw new RuntimeException(); }
  /**
   * Returns top <code>numUsers</code> users recommended for each item id in the input data set. Note that if
   * there are duplicate ids in the input dataset, only one set of recommendations per unique id
   * will be returned.
   * @param dataset a Dataset containing a column of item ids. The column name must match <code>itemCol</code>.
   * @param numUsers max number of recommendations for each item.
   * @return a DataFrame of (itemCol: Int, recommendations), where recommendations are
   *         stored as an array of (userCol: Int, rating: Float) Rows.
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForItemSubset (org.apache.spark.sql.Dataset<?> dataset, int numUsers)  { throw new RuntimeException(); }
  /**
   * Returns a subset of a factor DataFrame limited to only those unique ids contained
   * in the input dataset.
   * @param dataset input Dataset containing id column to user to filter factors.
   * @param factors factor DataFrame to filter.
   * @param column column name containing the ids in the input dataset.
   * @return DataFrame containing factors only for those ids present in both the input dataset and
   *         the factor DataFrame.
   */
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getSourceFactorSubset (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> factors, java.lang.String column)  { throw new RuntimeException(); }
  /**
   * Makes recommendations for all users (or items).
   * <p>
   * Note: the previous approach used for computing top-k recommendations
   * used a cross-join followed by predicting a score for each row of the joined dataset.
   * However, this results in exploding the size of intermediate data. While Spark SQL makes it
   * relatively efficient, the approach implemented here is significantly more efficient.
   * <p>
   * This approach groups factors into blocks and computes the top-k elements per block,
   * using dot product and an efficient {@link BoundedPriorityQueue} (instead of gemm).
   * It then computes the global top-k by aggregating the per block top-k elements with
   * a {@link TopByKeyAggregator}. This significantly reduces the size of intermediate and shuffle data.
   * This is the DataFrame equivalent to the approach used in
   * {@link org.apache.spark.mllib.recommendation.MatrixFactorizationModel}.
   * <p>
   * @param srcFactors src factors for which to generate recommendations
   * @param dstFactors dst factors used to make recommendations
   * @param srcOutputColumn name of the column for the source ID in the output DataFrame
   * @param dstOutputColumn name of the column for the destination ID in the output DataFrame
   * @param num max number of recommendations for each record
   * @return a DataFrame of (srcOutputColumn: Int, recommendations), where recommendations are
   *         stored as an array of (dstOutputColumn: Int, rating: Float) Rows.
   */
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recommendForAll (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> srcFactors, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dstFactors, java.lang.String srcOutputColumn, java.lang.String dstOutputColumn, int num)  { throw new RuntimeException(); }
  /**
   * Blockifies factors to improve the efficiency of cross join
   * TODO: SPARK-20443 - expose blockSize as a param?
   * @param factors (undocumented)
   * @param blockSize (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.Dataset<scala.collection.Seq<scala.Tuple2<java.lang.Object, float[]>>> blockify (org.apache.spark.sql.Dataset<scala.Tuple2<java.lang.Object, float[]>> factors, int blockSize)  { throw new RuntimeException(); }
}
