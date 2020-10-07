package org.apache.spark.deploy.security;
/**
 * Manages all the registered HadoopDelegationTokenProviders and offer APIs for other modules to
 * obtain delegation tokens and their renewal time. By default {@link HadoopFSDelegationTokenProvider},
 * {@link HiveDelegationTokenProvider} and {@link HBaseDelegationTokenProvider} will be loaded in if not
 * explicitly disabled.
 * <p>
 * Also, each HadoopDelegationTokenProvider is controlled by
 * spark.security.credentials.{service}.enabled, and will not be loaded if this config is set to
 * false. For example, Hive's delegation token provider {@link HiveDelegationTokenProvider} can be
 * enabled/disabled by the configuration spark.security.credentials.hive.enabled.
 * <p>
 * param:  sparkConf Spark configuration
 * param:  hadoopConf Hadoop configuration
 * param:  fileSystems Delegation tokens will be fetched for these Hadoop filesystems.
 */
  class HadoopDelegationTokenManager implements org.apache.spark.internal.Logging {
  public   HadoopDelegationTokenManager (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, scala.Function1<org.apache.hadoop.conf.Configuration, scala.collection.immutable.Set<org.apache.hadoop.fs.FileSystem>> fileSystems)  { throw new RuntimeException(); }
  /** Construct a {@link HadoopDelegationTokenManager} for the default Hadoop filesystem */
  public   HadoopDelegationTokenManager (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.security.HadoopDelegationTokenProvider> delegationTokenProviders ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.String> deprecatedProviderEnabledConfigs ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.security.HadoopDelegationTokenProvider> getDelegationTokenProviders ()  { throw new RuntimeException(); }
  /**
   * Get delegation token provider for the specified service.
   * @param service (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.deploy.security.HadoopDelegationTokenProvider> getServiceDelegationTokenProvider (java.lang.String service)  { throw new RuntimeException(); }
  public  boolean isServiceEnabled (java.lang.String serviceName)  { throw new RuntimeException(); }
  /**
   * Writes delegation tokens to creds.  Delegation tokens are fetched from all registered
   * providers.
   * <p>
   * @param hadoopConf hadoop Configuration
   * @param creds Credentials that will be updated in place (overwritten)
   * @return Time after which the fetched delegation tokens should be renewed.
   */
  public  long obtainDelegationTokens (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  private  java.lang.String providerEnabledConfig ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.deploy.security.HadoopDelegationTokenProvider> safeCreateProvider (scala.Function0<org.apache.spark.deploy.security.HadoopDelegationTokenProvider> createFn)  { throw new RuntimeException(); }
}
