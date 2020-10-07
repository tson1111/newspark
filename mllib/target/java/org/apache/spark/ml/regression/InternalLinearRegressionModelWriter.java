package org.apache.spark.ml.regression;
/** A writer for LinearRegression that handles the "internal" (or default) format */
public  class InternalLinearRegressionModelWriter implements org.apache.spark.ml.util.MLWriterFormat, org.apache.spark.ml.util.MLFormatRegister {
  private  class Data implements scala.Product, scala.Serializable {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    public  double intercept ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
    public  double scale ()  { throw new RuntimeException(); }
    // not preceding
    public   Data (double intercept, org.apache.spark.ml.linalg.Vector coefficients, double scale)  { throw new RuntimeException(); }
  }
  private  class Data$ extends scala.runtime.AbstractFunction3<java.lang.Object, org.apache.spark.ml.linalg.Vector, java.lang.Object, org.apache.spark.ml.regression.InternalLinearRegressionModelWriter.Data> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Data$ MODULE$ = null;
    public   Data$ ()  { throw new RuntimeException(); }
  }
  public   InternalLinearRegressionModelWriter ()  { throw new RuntimeException(); }
  public  java.lang.String format ()  { throw new RuntimeException(); }
  public  java.lang.String stageName ()  { throw new RuntimeException(); }
  public  void write (java.lang.String path, org.apache.spark.sql.SparkSession sparkSession, scala.collection.mutable.Map<java.lang.String, java.lang.String> optionMap, org.apache.spark.ml.PipelineStage stage)  { throw new RuntimeException(); }
}
