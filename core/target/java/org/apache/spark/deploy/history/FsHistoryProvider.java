package org.apache.spark.deploy.history;
/**
 * A class that provides application history from event logs stored in the file system.
 * This provider checks for new finished applications in the background periodically and
 * renders the history application UI by parsing the associated event logs.
 * <p>
 * == How new and updated attempts are detected ==
 * <p>
 * - New attempts are detected in {@link checkForLogs}: the log dir is scanned, and any entries in the
 * log dir whose size changed since the last scan time are considered new or updated. These are
 * replayed to create a new attempt info entry and update or create a matching application info
 * element in the list of applications.
 * - Updated attempts are also found in {@link checkForLogs} -- if the attempt's log file has grown, the
 * attempt is replaced by another one with a larger log size.
 * <p>
 * The use of log size, rather than simply relying on modification times, is needed to
 * address the following issues
 * - some filesystems do not appear to update the <code>modtime</code> value whenever data is flushed to
 * an open file output stream. Changes to the history may not be picked up.
 * - the granularity of the <code>modtime</code> field may be 2+ seconds. Rapid changes to the FS can be
 * missed.
 * <p>
 * Tracking filesize works given the following invariant: the logs get bigger
 * as new events are added. If a format was used in which this did not hold, the mechanism would
 * break. Simple streaming of JSON-formatted events, as is implemented today, implicitly
 * maintains this invariant.
 */
  class FsHistoryProvider extends org.apache.spark.deploy.history.ApplicationHistoryProvider implements org.apache.spark.internal.Logging {
  static private  java.lang.String SPARK_HISTORY_FS_NUM_REPLAY_THREADS ()  { throw new RuntimeException(); }
  static private  java.lang.String APPL_START_EVENT_PREFIX ()  { throw new RuntimeException(); }
  static private  java.lang.String APPL_END_EVENT_PREFIX ()  { throw new RuntimeException(); }
  static private  java.lang.String LOG_START_EVENT_PREFIX ()  { throw new RuntimeException(); }
  static private  java.lang.String ENV_UPDATE_EVENT_PREFIX ()  { throw new RuntimeException(); }
  /**
   * Current version of the data written to the listing database. When opening an existing
   * db, if the version does not match this value, the FsHistoryProvider will throw away
   * all data and re-generate the listing data from the event logs.
   * @return (undocumented)
   */
  static   long CURRENT_LISTING_VERSION ()  { throw new RuntimeException(); }
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
  public   FsHistoryProvider (org.apache.spark.SparkConf conf, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   FsHistoryProvider (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  long SAFEMODE_CHECK_INTERVAL_S ()  { throw new RuntimeException(); }
  private  long UPDATE_INTERVAL_S ()  { throw new RuntimeException(); }
  private  long CLEAN_INTERVAL_S ()  { throw new RuntimeException(); }
  private  int NUM_PROCESSING_THREADS ()  { throw new RuntimeException(); }
  private  java.lang.String logDir ()  { throw new RuntimeException(); }
  private  boolean HISTORY_UI_ACLS_ENABLE ()  { throw new RuntimeException(); }
  private  java.lang.String HISTORY_UI_ADMIN_ACLS ()  { throw new RuntimeException(); }
  private  java.lang.String HISTORY_UI_ADMIN_ACLS_GROUPS ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
    org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService pool ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicLong lastScanTime ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger pendingReplayTasksCount ()  { throw new RuntimeException(); }
  private  scala.Option<java.io.File> storePath ()  { throw new RuntimeException(); }
  private  boolean fastInProgressParsing ()  { throw new RuntimeException(); }
    org.apache.spark.util.kvstore.KVStore listing ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.deploy.history.HistoryServerDiskManager> diskManager ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> blacklist ()  { throw new RuntimeException(); }
    boolean isBlacklisted (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  private  void blacklist (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Removes expired entries in the blacklist, according to the provided <code>expireTimeInSeconds</code>.
   * @param expireTimeInSeconds (undocumented)
   */
  private  void clearBlacklist (long expireTimeInSeconds)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<scala.Tuple2<java.lang.String, scala.Option<java.lang.String>>, org.apache.spark.deploy.history.LoadedAppUI> activeUIs ()  { throw new RuntimeException(); }
  /**
   * Return a runnable that performs the given operation on the event logs.
   * This operation is expected to be executed periodically.
   * @param operateFun (undocumented)
   * @return (undocumented)
   */
  private  java.lang.Runnable getRunner (scala.Function0<scala.runtime.BoxedUnit> operateFun)  { throw new RuntimeException(); }
  /**
   * Fixed size thread pool to fetch and parse log files.
   * @return (undocumented)
   */
  private  java.util.concurrent.ExecutorService replayExecutor ()  { throw new RuntimeException(); }
  public  java.lang.Thread initThread ()  { throw new RuntimeException(); }
    java.lang.Thread initialize ()  { throw new RuntimeException(); }
    java.lang.Thread startSafeModeCheckThread (scala.Option<java.lang.Thread.UncaughtExceptionHandler> errorHandler)  { throw new RuntimeException(); }
  private  void startPolling ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getListing ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfo (java.lang.String appId)  { throw new RuntimeException(); }
  public  int getEventLogsUnderProcess ()  { throw new RuntimeException(); }
  public  long getLastUpdatedTime ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> getEmptyListingHtml ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getConfig ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void onUIDetached (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  /**
   * Builds the application list based on the current contents of the log directory.
   * Tries to reuse as much of the data already in memory as possible, by not reading
   * applications that haven't been updated since last time the logs were checked.
   */
    void checkForLogs ()  { throw new RuntimeException(); }
    boolean shouldReloadLog (org.apache.spark.deploy.history.LogInfo info, org.apache.hadoop.fs.FileStatus entry)  { throw new RuntimeException(); }
  private  void cleanAppData (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.lang.String logPath)  { throw new RuntimeException(); }
  public  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream)  { throw new RuntimeException(); }
  /**
   * Replay the given log file, saving the application in the listing db.
   * @param fileStatus (undocumented)
   * @param scanTime (undocumented)
   * @param enableOptimizations (undocumented)
   */
  protected  void mergeApplicationListing (org.apache.hadoop.fs.FileStatus fileStatus, long scanTime, boolean enableOptimizations)  { throw new RuntimeException(); }
  /**
   * Invalidate an existing UI for a given app attempt. See LoadedAppUI for a discussion on the
   * UI lifecycle.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   */
  private  void invalidateUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Delete event logs from the log directory according to the clean policy defined by the user.
   */
    void cleanLogs ()  { throw new RuntimeException(); }
  /**
   * Rebuilds the application state store from its event log.
   * @param store (undocumented)
   * @param eventLog (undocumented)
   * @param lastUpdated (undocumented)
   */
  private  void rebuildAppStore (org.apache.spark.util.kvstore.KVStore store, org.apache.hadoop.fs.FileStatus eventLog, long lastUpdated)  { throw new RuntimeException(); }
  /**
   * Checks whether HDFS is in safe mode.
   * <p>
   * Note that DistributedFileSystem is a <code>@LimitedPrivate</code> class, which for all practical reasons
   * makes it more public than not.
   * @return (undocumented)
   */
    boolean isFsInSafeMode ()  { throw new RuntimeException(); }
    boolean isFsInSafeMode (org.apache.hadoop.hdfs.DistributedFileSystem dfs)  { throw new RuntimeException(); }
  /**
   * String description for diagnostics
   * @return a summary of the component state
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.history.ApplicationInfoWrapper load (java.lang.String appId)  { throw new RuntimeException(); }
  /**
   * Write the app's information to the given store. Serialized to avoid the (notedly rare) case
   * where two threads are processing separate attempts of the same application.
   * @param app (undocumented)
   */
  private  void addListing (org.apache.spark.deploy.history.ApplicationInfoWrapper app)  { throw new RuntimeException(); }
  private  org.apache.spark.util.kvstore.KVStore loadDiskStore (org.apache.spark.deploy.history.HistoryServerDiskManager dm, java.lang.String appId, org.apache.spark.deploy.history.AttemptInfoWrapper attempt)  { throw new RuntimeException(); }
  private  org.apache.spark.util.kvstore.KVStore createInMemoryStore (org.apache.spark.deploy.history.AttemptInfoWrapper attempt)  { throw new RuntimeException(); }
  private  scala.collection.Iterable<org.apache.spark.status.AppHistoryServerPlugin> loadPlugins ()  { throw new RuntimeException(); }
  /** For testing. Returns internal data about a single attempt. */
    org.apache.spark.deploy.history.AttemptInfoWrapper getAttempt (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  private  void deleteLog (org.apache.hadoop.fs.Path log)  { throw new RuntimeException(); }
  private  boolean isCompleted (java.lang.String name)  { throw new RuntimeException(); }
}
