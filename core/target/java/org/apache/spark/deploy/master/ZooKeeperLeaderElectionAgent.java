package org.apache.spark.deploy.master;
  class ZooKeeperLeaderElectionAgent implements org.apache.curator.framework.recipes.leader.LeaderLatchListener, org.apache.spark.deploy.master.LeaderElectionAgent, org.apache.spark.internal.Logging {
  private  class LeadershipStatus {
    static public  scala.Enumeration.Value LEADER ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value NOT_LEADER ()  { throw new RuntimeException(); }
    static protected  java.lang.Object readResolve ()  { throw new RuntimeException(); }
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.ValueSet values ()  { throw new RuntimeException(); }
    static protected  int nextId ()  { throw new RuntimeException(); }
    static protected  void nextId_$eq (int x$1)  { throw new RuntimeException(); }
    static protected  scala.collection.Iterator<java.lang.String> nextName ()  { throw new RuntimeException(); }
    static protected  void nextName_$eq (scala.collection.Iterator<java.lang.String> x$1)  { throw new RuntimeException(); }
    static public final  int maxId ()  { throw new RuntimeException(); }
    static public final  scala.Enumeration.Value apply (int x)  { throw new RuntimeException(); }
    static public final  scala.Enumeration.Value withName (java.lang.String s)  { throw new RuntimeException(); }
    static protected final  scala.Enumeration.Value Value ()  { throw new RuntimeException(); }
    static protected final  scala.Enumeration.Value Value (int i)  { throw new RuntimeException(); }
    static protected final  scala.Enumeration.Value Value (java.lang.String name)  { throw new RuntimeException(); }
    static protected final  scala.Enumeration.Value Value (int i, java.lang.String name)  { throw new RuntimeException(); }
  }
  private  class LeadershipStatus$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LeadershipStatus$ MODULE$ = null;
    public   LeadershipStatus$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value LEADER ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value NOT_LEADER ()  { throw new RuntimeException(); }
  }
  private  org.apache.spark.deploy.master.ZooKeeperLeaderElectionAgent.LeadershipStatus$ LeadershipStatus ()  { throw new RuntimeException(); }
  public  java.lang.String WORKING_DIR ()  { throw new RuntimeException(); }
  // not preceding
  public   ZooKeeperLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable masterInstance, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void isLeader ()  { throw new RuntimeException(); }
  private  org.apache.curator.framework.recipes.leader.LeaderLatch leaderLatch ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.LeaderElectable masterInstance ()  { throw new RuntimeException(); }
  public  void notLeader ()  { throw new RuntimeException(); }
  private  void start ()  { throw new RuntimeException(); }
  private  scala.Enumeration.Value status ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  private  void updateLeadershipStatus (boolean isLeader)  { throw new RuntimeException(); }
  private  org.apache.curator.framework.CuratorFramework zk ()  { throw new RuntimeException(); }
}
