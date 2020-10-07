package org.apache.spark.deploy;
public  class DependencyUtils {
  static public  java.lang.String resolveMavenDependencies (java.lang.String packagesExclusions, java.lang.String packages, java.lang.String repositories, java.lang.String ivyRepoPath, scala.Option<java.lang.String> ivySettingsPath)  { throw new RuntimeException(); }
  static public  java.lang.String resolveAndDownloadJars (java.lang.String jars, java.lang.String userJar, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SecurityManager secMgr)  { throw new RuntimeException(); }
  static public  void addJarsToClassPath (java.lang.String jars, org.apache.spark.util.MutableURLClassLoader loader)  { throw new RuntimeException(); }
  /**
   * Download a list of remote files to temp local files. If the file is local, the original file
   * will be returned.
   * <p>
   * @param fileList A comma separated file list.
   * @param targetDir A temporary directory for which downloaded files.
   * @param sparkConf Spark configuration.
   * @param hadoopConf Hadoop configuration.
   * @param secMgr Spark security manager.
   * @return A comma separated local files list.
   */
  static public  java.lang.String downloadFileList (java.lang.String fileList, java.io.File targetDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SecurityManager secMgr)  { throw new RuntimeException(); }
  /**
   * Download a file from the remote to a local temporary directory. If the input path points to
   * a local path, returns it with no operation.
   * <p>
   * @param path A file path from where the files will be downloaded.
   * @param targetDir A temporary directory for which downloaded files.
   * @param sparkConf Spark configuration.
   * @param hadoopConf Hadoop configuration.
   * @param secMgr Spark security manager.
   * @return Path to the local file.
   */
  static public  java.lang.String downloadFile (java.lang.String path, java.io.File targetDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SecurityManager secMgr)  { throw new RuntimeException(); }
  static public  java.lang.String resolveGlobPaths (java.lang.String paths, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static public  void addJarToClasspath (java.lang.String localJar, org.apache.spark.util.MutableURLClassLoader loader)  { throw new RuntimeException(); }
  /**
   * Merge a sequence of comma-separated file lists, some of which may be null to indicate
   * no files, into a single comma-separated string.
   * @param lists (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String mergeFileLists (scala.collection.Seq<java.lang.String> lists)  { throw new RuntimeException(); }
  static private  scala.Tuple2<java.net.URI, scala.Option<java.lang.String>> splitOnFragment (java.lang.String path)  { throw new RuntimeException(); }
  static private  java.lang.String[] resolveGlobPath (java.net.URI uri, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
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
}
