package org.apache.spark.deploy;
/**
 * Main gateway of launching a Spark application.
 * <p>
 * This program handles setting up the classpath with relevant Spark dependencies and provides
 * a layer over the different cluster managers and deploy modes that Spark supports.
 */
  class SparkSubmit implements org.apache.spark.internal.Logging {
  static private  int YARN ()  { throw new RuntimeException(); }
  static private  int STANDALONE ()  { throw new RuntimeException(); }
  static private  int MESOS ()  { throw new RuntimeException(); }
  static private  int LOCAL ()  { throw new RuntimeException(); }
  static private  int KUBERNETES ()  { throw new RuntimeException(); }
  static private  int ALL_CLUSTER_MGRS ()  { throw new RuntimeException(); }
  static private  int CLIENT ()  { throw new RuntimeException(); }
  static private  int CLUSTER ()  { throw new RuntimeException(); }
  static private  int ALL_DEPLOY_MODES ()  { throw new RuntimeException(); }
  static private  java.lang.String SPARK_SHELL ()  { throw new RuntimeException(); }
  static private  java.lang.String PYSPARK_SHELL ()  { throw new RuntimeException(); }
  static private  java.lang.String SPARKR_SHELL ()  { throw new RuntimeException(); }
  static private  java.lang.String SPARKR_PACKAGE_ARCHIVE ()  { throw new RuntimeException(); }
  static private  java.lang.String R_PACKAGE_ARCHIVE ()  { throw new RuntimeException(); }
  static private  int CLASS_NOT_FOUND_EXIT_STATUS ()  { throw new RuntimeException(); }
  static   java.lang.String YARN_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  static   java.lang.String REST_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  static   java.lang.String STANDALONE_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  static   java.lang.String KUBERNETES_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource represents a user jar.
   * @param res (undocumented)
   * @return (undocumented)
   */
  static   boolean isUserJar (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource represents a shell.
   * @param res (undocumented)
   * @return (undocumented)
   */
  static   boolean isShell (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given main class represents a sql shell.
   * @param mainClass (undocumented)
   * @return (undocumented)
   */
  static   boolean isSqlShell (java.lang.String mainClass)  { throw new RuntimeException(); }
  /**
   * Return whether the given main class represents a thrift server.
   * @param mainClass (undocumented)
   * @return (undocumented)
   */
  static private  boolean isThriftServer (java.lang.String mainClass)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource requires running python.
   * @param res (undocumented)
   * @return (undocumented)
   */
  static   boolean isPython (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource requires running R.
   * @param res (undocumented)
   * @return (undocumented)
   */
  static   boolean isR (java.lang.String res)  { throw new RuntimeException(); }
  static   boolean isInternal (java.lang.String res)  { throw new RuntimeException(); }
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
  public   SparkSubmit ()  { throw new RuntimeException(); }
  public  void doSubmit (java.lang.String[] args)  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.SparkSubmitArguments parseArguments (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * Kill an existing submission using the REST protocol. Standalone and Mesos cluster mode only.
   * @param args (undocumented)
   */
  private  void kill (org.apache.spark.deploy.SparkSubmitArguments args)  { throw new RuntimeException(); }
  /**
   * Request the status of an existing submission using the REST protocol.
   * Standalone and Mesos cluster mode only.
   * @param args (undocumented)
   */
  private  void requestStatus (org.apache.spark.deploy.SparkSubmitArguments args)  { throw new RuntimeException(); }
  /** Print version information to the log. */
  private  void printVersion ()  { throw new RuntimeException(); }
  /**
   * Submit the application using the provided parameters.
   * <p>
   * This runs in two steps. First, we prepare the launch environment by setting up
   * the appropriate classpath, system properties, and application arguments for
   * running the child main class based on the cluster manager and the deploy mode.
   * Second, we use this launch environment to invoke the main method of the child
   * main class.
   * @param args (undocumented)
   * @param uninitLog (undocumented)
   */
  private  void submit (org.apache.spark.deploy.SparkSubmitArguments args, boolean uninitLog)  { throw new RuntimeException(); }
  /**
   * Prepare the environment for submitting an application.
   * <p>
   * @param args the parsed SparkSubmitArguments used for environment preparation.
   * @param conf the Hadoop Configuration, this argument will only be set in unit test.
   * @return a 4-tuple:
   *        (1) the arguments for the child process,
   *        (2) a list of classpath entries for the child,
   *        (3) a map of system properties, and
   *        (4) the main class for the child
   * <p>
   * Exposed for testing.
   */
    scala.Tuple4<scala.collection.Seq<java.lang.String>, scala.collection.Seq<java.lang.String>, org.apache.spark.SparkConf, java.lang.String> prepareSubmitEnvironment (org.apache.spark.deploy.SparkSubmitArguments args, scala.Option<org.apache.hadoop.conf.Configuration> conf)  { throw new RuntimeException(); }
  private  void setRMPrincipal (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Run the main method of the child class using the provided launch environment.
   * <p>
   * Note that this main class will not be the one provided by the user if we're
   * running cluster deploy mode or python applications.
   * @param childArgs (undocumented)
   * @param childClasspath (undocumented)
   * @param sparkConf (undocumented)
   * @param childMainClass (undocumented)
   * @param verbose (undocumented)
   */
  private  void runMain (scala.collection.Seq<java.lang.String> childArgs, scala.collection.Seq<java.lang.String> childClasspath, org.apache.spark.SparkConf sparkConf, java.lang.String childMainClass, boolean verbose)  { throw new RuntimeException(); }
  /** Throw a SparkException with the given error message. */
  private  void error (java.lang.String msg)  { throw new RuntimeException(); }
}
