package org.apache.spark.deploy;
public  class SparkHadoopUtil$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkHadoopUtil$ MODULE$ = null;
  public   SparkHadoopUtil$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.SparkHadoopUtil instance ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_YARN_CREDS_TEMP_EXTENSION ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_YARN_CREDS_COUNTER_DELIM ()  { throw new RuntimeException(); }
  /**
   * Number of records to update input metrics when reading from HadoopRDDs.
   * <p>
   * Each update is potentially expensive because we need to use reflection to access the
   * Hadoop FileSystem API of interest (only available in 2.5), so we should do this sparingly.
   * @return (undocumented)
   */
    int UPDATE_INPUT_METRICS_INTERVAL_RECORDS ()  { throw new RuntimeException(); }
  /**
   * Name of the file containing the gateway's Hadoop configuration, to be overlayed on top of the
   * cluster's Hadoop config. It is up to the Spark code launching the application to create
   * this file if it's desired. If the file doesn't exist, it will just be ignored.
   * @return (undocumented)
   */
    java.lang.String SPARK_HADOOP_CONF_FILE ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.SparkHadoopUtil get ()  { throw new RuntimeException(); }
  /**
   * Given an expiration date for the current set of credentials, calculate the time when new
   * credentials should be created.
   * <p>
   * @param expirationDate Drop-dead expiration date
   * @param conf Spark configuration
   * @return Timestamp when new credentials should be created.
   */
    long nextCredentialRenewalTime (long expirationDate, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Returns a Configuration object with Spark configuration applied on top. Unlike
   * the instance method, this will always return a Configuration instance, and not a
   * cluster manager-specific type.
   * @param conf (undocumented)
   * @return (undocumented)
   */
    org.apache.hadoop.conf.Configuration newConfiguration (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  void appendS3AndSparkHadoopConfigurations (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  void appendSparkHadoopConfigs (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
}
