package org.apache.spark.api.python;
  class PythonBroadcast implements java.io.Serializable, org.apache.spark.internal.Logging {
  // not preceding
  public   PythonBroadcast (java.lang.String path)  { throw new RuntimeException(); }
  private  org.apache.spark.api.python.PythonServer<scala.runtime.BoxedUnit> encryptionServer ()  { throw new RuntimeException(); }
  /**
   * Delete the file once the object is GCed.
   */
  public  void finalize ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  /**
   * Write data into disk, using randomly generated name.
   * @param in (undocumented)
   */
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
  public  java.lang.Object[] setupEncryptionServer ()  { throw new RuntimeException(); }
  public  void waitTillDataReceived ()  { throw new RuntimeException(); }
  /**
   * Read data from disks, then copy it to <code>out</code>
   * @param out (undocumented)
   */
  private  void writeObject (java.io.ObjectOutputStream out)  { throw new RuntimeException(); }
}
