package org.apache.spark.deploy;
public  class SparkSubmit$ implements org.apache.spark.util.CommandLineUtils, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkSubmit$ MODULE$ = null;
  public   SparkSubmit$ ()  { throw new RuntimeException(); }
  private  int YARN ()  { throw new RuntimeException(); }
  private  int STANDALONE ()  { throw new RuntimeException(); }
  private  int MESOS ()  { throw new RuntimeException(); }
  private  int LOCAL ()  { throw new RuntimeException(); }
  private  int KUBERNETES ()  { throw new RuntimeException(); }
  private  int ALL_CLUSTER_MGRS ()  { throw new RuntimeException(); }
  private  int CLIENT ()  { throw new RuntimeException(); }
  private  int CLUSTER ()  { throw new RuntimeException(); }
  private  int ALL_DEPLOY_MODES ()  { throw new RuntimeException(); }
  private  java.lang.String SPARK_SHELL ()  { throw new RuntimeException(); }
  private  java.lang.String PYSPARK_SHELL ()  { throw new RuntimeException(); }
  private  java.lang.String SPARKR_SHELL ()  { throw new RuntimeException(); }
  private  java.lang.String SPARKR_PACKAGE_ARCHIVE ()  { throw new RuntimeException(); }
  private  java.lang.String R_PACKAGE_ARCHIVE ()  { throw new RuntimeException(); }
  private  int CLASS_NOT_FOUND_EXIT_STATUS ()  { throw new RuntimeException(); }
    java.lang.String YARN_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
    java.lang.String REST_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
    java.lang.String STANDALONE_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
    java.lang.String KUBERNETES_CLUSTER_SUBMIT_CLASS ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource represents a user jar.
   * @param res (undocumented)
   * @return (undocumented)
   */
    boolean isUserJar (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource represents a shell.
   * @param res (undocumented)
   * @return (undocumented)
   */
    boolean isShell (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given main class represents a sql shell.
   * @param mainClass (undocumented)
   * @return (undocumented)
   */
    boolean isSqlShell (java.lang.String mainClass)  { throw new RuntimeException(); }
  /**
   * Return whether the given main class represents a thrift server.
   * @param mainClass (undocumented)
   * @return (undocumented)
   */
  private  boolean isThriftServer (java.lang.String mainClass)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource requires running python.
   * @param res (undocumented)
   * @return (undocumented)
   */
    boolean isPython (java.lang.String res)  { throw new RuntimeException(); }
  /**
   * Return whether the given primary resource requires running R.
   * @param res (undocumented)
   * @return (undocumented)
   */
    boolean isR (java.lang.String res)  { throw new RuntimeException(); }
    boolean isInternal (java.lang.String res)  { throw new RuntimeException(); }
}
