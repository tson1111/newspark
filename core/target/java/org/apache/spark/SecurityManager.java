package org.apache.spark;
/**
 * Spark class responsible for security.
 * <p>
 * In general this class should be instantiated by the SparkEnv and most components
 * should access it from that. There are some cases where the SparkEnv hasn't been
 * initialized yet and this class must be instantiated directly.
 * <p>
 * This class implements all of the configuration related to security features described
 * in the "Security" document. Please refer to that document for specific features implemented
 * here.
 */
  class SecurityManager implements org.apache.spark.internal.Logging, org.apache.spark.network.sasl.SecretKeyHolder {
  static public  java.lang.String SPARK_AUTH_CONF ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_AUTH_SECRET_CONF ()  { throw new RuntimeException(); }
  static public  java.lang.String ENV_AUTH_SECRET ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.io.Text SECRET_LOOKUP_KEY ()  { throw new RuntimeException(); }
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
  public  scala.Option<byte[]> ioEncryptionKey ()  { throw new RuntimeException(); }
  // not preceding
  public   SecurityManager (org.apache.spark.SparkConf sparkConf, scala.Option<byte[]> ioEncryptionKey)  { throw new RuntimeException(); }
  private  java.lang.String WILDCARD_ACL ()  { throw new RuntimeException(); }
  private  boolean authOn ()  { throw new RuntimeException(); }
  private  boolean aclsOn ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> adminAcls ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> adminAclsGroups ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> viewAcls ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> viewAclsGroups ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> modifyAcls ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> modifyAclsGroups ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> defaultAclUsers ()  { throw new RuntimeException(); }
  private  java.lang.String secretKey ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  private  org.apache.spark.SSLOptions defaultSSLOptions ()  { throw new RuntimeException(); }
  public  org.apache.spark.SSLOptions getSSLOptions (java.lang.String module)  { throw new RuntimeException(); }
  /**
   * Split a comma separated String, filter out any empty items, and return a Set of strings
   * @param list (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<java.lang.String> stringToSet (java.lang.String list)  { throw new RuntimeException(); }
  /**
   * Admin acls should be set before the view or modify acls.  If you modify the admin
   * acls you should also set the view and modify acls again to pick up the changes.
   * @param defaultUsers (undocumented)
   * @param allowedUsers (undocumented)
   */
  public  void setViewAcls (scala.collection.immutable.Set<java.lang.String> defaultUsers, java.lang.String allowedUsers)  { throw new RuntimeException(); }
  public  void setViewAcls (java.lang.String defaultUser, java.lang.String allowedUsers)  { throw new RuntimeException(); }
  /**
   * Admin acls groups should be set before the view or modify acls groups. If you modify the admin
   * acls groups you should also set the view and modify acls groups again to pick up the changes.
   * @param allowedUserGroups (undocumented)
   */
  public  void setViewAclsGroups (java.lang.String allowedUserGroups)  { throw new RuntimeException(); }
  /**
   * Checking the existence of "*" is necessary as YARN can't recognize the "*" in "defaultuser,*"
   * @return (undocumented)
   */
  public  java.lang.String getViewAcls ()  { throw new RuntimeException(); }
  public  java.lang.String getViewAclsGroups ()  { throw new RuntimeException(); }
  /**
   * Admin acls should be set before the view or modify acls.  If you modify the admin
   * acls you should also set the view and modify acls again to pick up the changes.
   * @param defaultUsers (undocumented)
   * @param allowedUsers (undocumented)
   */
  public  void setModifyAcls (scala.collection.immutable.Set<java.lang.String> defaultUsers, java.lang.String allowedUsers)  { throw new RuntimeException(); }
  /**
   * Admin acls groups should be set before the view or modify acls groups. If you modify the admin
   * acls groups you should also set the view and modify acls groups again to pick up the changes.
   * @param allowedUserGroups (undocumented)
   */
  public  void setModifyAclsGroups (java.lang.String allowedUserGroups)  { throw new RuntimeException(); }
  /**
   * Checking the existence of "*" is necessary as YARN can't recognize the "*" in "defaultuser,*"
   * @return (undocumented)
   */
  public  java.lang.String getModifyAcls ()  { throw new RuntimeException(); }
  public  java.lang.String getModifyAclsGroups ()  { throw new RuntimeException(); }
  /**
   * Admin acls should be set before the view or modify acls.  If you modify the admin
   * acls you should also set the view and modify acls again to pick up the changes.
   * @param adminUsers (undocumented)
   */
  public  void setAdminAcls (java.lang.String adminUsers)  { throw new RuntimeException(); }
  /**
   * Admin acls groups should be set before the view or modify acls groups. If you modify the admin
   * acls groups you should also set the view and modify acls groups again to pick up the changes.
   * @param adminUserGroups (undocumented)
   */
  public  void setAdminAclsGroups (java.lang.String adminUserGroups)  { throw new RuntimeException(); }
  public  void setAcls (boolean aclSetting)  { throw new RuntimeException(); }
  public  scala.Option<byte[]> getIOEncryptionKey ()  { throw new RuntimeException(); }
  /**
   * Check to see if Acls for the UI are enabled
   * @return true if UI authentication is enabled, otherwise false
   */
  public  boolean aclsEnabled ()  { throw new RuntimeException(); }
  /**
   * Checks the given user against the view acl and groups list to see if they have
   * authorization to view the UI. If the UI acls are disabled
   * via spark.acls.enable, all users have view access. If the user is null
   * it is assumed authentication is off and all users have access. Also if any one of the
   * UI acls or groups specify the WILDCARD(*) then all users have view access.
   * <p>
   * @param user to see if is authorized
   * @return true is the user has permission, otherwise false
   */
  public  boolean checkUIViewPermissions (java.lang.String user)  { throw new RuntimeException(); }
  /**
   * Checks the given user against the modify acl and groups list to see if they have
   * authorization to modify the application. If the modify acls are disabled
   * via spark.acls.enable, all users have modify access. If the user is null
   * it is assumed authentication isn't turned on and all users have access. Also if any one
   * of the modify acls or groups specify the WILDCARD(*) then all users have modify access.
   * <p>
   * @param user to see if is authorized
   * @return true is the user has permission, otherwise false
   */
  public  boolean checkModifyPermissions (java.lang.String user)  { throw new RuntimeException(); }
  /**
   * Check to see if authentication for the Spark communication protocols is enabled
   * @return true if authentication is enabled, otherwise false
   */
  public  boolean isAuthenticationEnabled ()  { throw new RuntimeException(); }
  /**
   * Checks whether network encryption should be enabled.
   * @return Whether to enable encryption when connecting to services that support it.
   */
  public  boolean isEncryptionEnabled ()  { throw new RuntimeException(); }
  /**
   * Gets the user used for authenticating HTTP connections.
   * For now use a single hardcoded user.
   * @return the HTTP user as a String
   */
  public  java.lang.String getHttpUser ()  { throw new RuntimeException(); }
  /**
   * Gets the user used for authenticating SASL connections.
   * For now use a single hardcoded user.
   * @return the SASL user as a String
   */
  public  java.lang.String getSaslUser ()  { throw new RuntimeException(); }
  /**
   * Gets the secret key.
   * @return the secret key as a String if authentication is enabled, otherwise returns null
   */
  public  java.lang.String getSecretKey ()  { throw new RuntimeException(); }
  /**
   * Initialize the authentication secret.
   * <p>
   * If authentication is disabled, do nothing.
   * <p>
   * In YARN and local mode, generate a new secret and store it in the current user's credentials.
   * <p>
   * In other modes, assert that the auth secret is set in the configuration.
   */
  public  void initializeAuth ()  { throw new RuntimeException(); }
  public  java.lang.String getSaslUser (java.lang.String appId)  { throw new RuntimeException(); }
  public  java.lang.String getSecretKey (java.lang.String appId)  { throw new RuntimeException(); }
}
