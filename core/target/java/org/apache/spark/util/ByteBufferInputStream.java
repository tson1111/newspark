package org.apache.spark.util;
/**
 * Reads data from a ByteBuffer.
 */
  class ByteBufferInputStream extends java.io.InputStream {
  // not preceding
  public   ByteBufferInputStream (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  private  java.nio.ByteBuffer buffer ()  { throw new RuntimeException(); }
  /**
   * Clean up the buffer, and potentially dispose of it using StorageUtils.dispose().
   */
  private  void cleanUp ()  { throw new RuntimeException(); }
  public  int read ()  { throw new RuntimeException(); }
  public  int read (byte[] dest)  { throw new RuntimeException(); }
  public  int read (byte[] dest, int offset, int length)  { throw new RuntimeException(); }
  public  long skip (long bytes)  { throw new RuntimeException(); }
}
