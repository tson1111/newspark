package org.apache.spark.deploy.security;
  class HadoopFSDelegationTokenProvider implements org.apache.spark.deploy.security.HadoopDelegationTokenProvider, org.apache.spark.internal.Logging {
  public   HadoopFSDelegationTokenProvider (scala.Function1<org.apache.hadoop.conf.Configuration, scala.collection.immutable.Set<org.apache.hadoop.fs.FileSystem>> fileSystems)  { throw new RuntimeException(); }
  public  boolean delegationTokensRequired (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  org.apache.hadoop.security.Credentials fetchDelegationTokens (java.lang.String renewer, scala.collection.immutable.Set<org.apache.hadoop.fs.FileSystem> filesystems, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> getTokenRenewalInterval (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, scala.collection.immutable.Set<org.apache.hadoop.fs.FileSystem> filesystems)  { throw new RuntimeException(); }
  private  java.lang.String getTokenRenewer (org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainDelegationTokens (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> tokenRenewalInterval ()  { throw new RuntimeException(); }
}
