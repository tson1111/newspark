package org.apache.spark.util;
  class SerializableConfiguration implements scala.Serializable {
  // not preceding
  public   SerializableConfiguration (org.apache.hadoop.conf.Configuration value)  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration value ()  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream out)  { throw new RuntimeException(); }
}
