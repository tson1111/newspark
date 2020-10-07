package org.apache.spark.io;
/**
 * :: DeveloperApi ::
 * ZStandard implementation of {@link org.apache.spark.io.CompressionCodec}. For more
 * details see - http://facebook.github.io/zstd/
 * <p>
 * @note The wire protocol for this codec is not guaranteed to be compatible across versions
 * of Spark. This is intended for use as an internal compression utility within a single Spark
 * application.
 */
public  class ZStdCompressionCodec implements org.apache.spark.io.CompressionCodec {
  public   ZStdCompressionCodec (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  int bufferSize ()  { throw new RuntimeException(); }
  public  java.io.InputStream compressedInputStream (java.io.InputStream s)  { throw new RuntimeException(); }
  public  java.io.OutputStream compressedOutputStream (java.io.OutputStream s)  { throw new RuntimeException(); }
  private  int level ()  { throw new RuntimeException(); }
}
