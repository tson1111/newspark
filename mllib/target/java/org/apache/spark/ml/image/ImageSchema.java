package org.apache.spark.ml.image;
/**
 * :: Experimental ::
 * Defines the image schema and methods to read and manipulate images.
 */
public  class ImageSchema {
  static public  java.lang.String undefinedImageType ()  { throw new RuntimeException(); }
  /**
   * (Scala-specific) OpenCV type mapping supported
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> ocvTypes ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) OpenCV type mapping supported
   * @return (undocumented)
   */
  static public  java.util.Map<java.lang.String, java.lang.Object> javaOcvTypes ()  { throw new RuntimeException(); }
  /**
   * Schema for the image column: Row(String, Int, Int, Int, Int, Array[Byte])
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType columnSchema ()  { throw new RuntimeException(); }
  static public  java.lang.String[] imageFields ()  { throw new RuntimeException(); }
  /**
   * DataFrame with a single column of images named "image" (nullable)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType imageSchema ()  { throw new RuntimeException(); }
  /**
   * Gets the origin of the image
   * <p>
   * @return The origin of the image
   * @param row (undocumented)
   */
  static public  java.lang.String getOrigin (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  /**
   * Gets the height of the image
   * <p>
   * @return The height of the image
   * @param row (undocumented)
   */
  static public  int getHeight (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  /**
   * Gets the width of the image
   * <p>
   * @return The width of the image
   * @param row (undocumented)
   */
  static public  int getWidth (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  /**
   * Gets the number of channels in the image
   * <p>
   * @return The number of channels in the image
   * @param row (undocumented)
   */
  static public  int getNChannels (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  /**
   * Gets the OpenCV representation as an int
   * <p>
   * @return The OpenCV representation as an int
   * @param row (undocumented)
   */
  static public  int getMode (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  /**
   * Gets the image data
   * <p>
   * @return The image data
   * @param row (undocumented)
   */
  static public  byte[] getData (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  /**
   * Default values for the invalid image
   * <p>
   * @param origin Origin of the invalid image
   * @return Row with the default values
   */
  static   org.apache.spark.sql.Row invalidImageRow (java.lang.String origin)  { throw new RuntimeException(); }
  /**
   * Convert the compressed image (jpeg, png, etc.) into OpenCV
   * representation and store it in DataFrame Row
   * <p>
   * @param origin Arbitrary string that identifies the image
   * @param bytes Image bytes (for example, jpeg)
   * @return DataFrame Row or None (if the decompression fails)
   */
  static   scala.Option<org.apache.spark.sql.Row> decode (java.lang.String origin, byte[] bytes)  { throw new RuntimeException(); }
  /**
   * Read the directory of images from the local or remote source
   * <p>
   * @note If multiple jobs are run in parallel with different sampleRatio or recursive flag,
   * there may be a race condition where one job overwrites the hadoop configs of another.
   * @note If sample ratio is less than 1, sampling uses a PathFilter that is efficient but
   * potentially non-deterministic.
   * <p>
   * @param path Path to the image directory
   * @return DataFrame with a single column "image" of images;
   *         see ImageSchema for the details
   *
   * @deprecated use `spark.read.format("image").load(path)` and this `readImages` will be removed in 3.0.0. Since 2.4.0. 
  */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> readImages (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Read the directory of images from the local or remote source
   * <p>
   * @note If multiple jobs are run in parallel with different sampleRatio or recursive flag,
   * there may be a race condition where one job overwrites the hadoop configs of another.
   * @note If sample ratio is less than 1, sampling uses a PathFilter that is efficient but
   * potentially non-deterministic.
   * <p>
   * @param path Path to the image directory
   * @param sparkSession Spark Session, if omitted gets or creates the session
   * @param recursive Recursive path search flag
   * @param numPartitions Number of the DataFrame partitions,
   *                      if omitted uses defaultParallelism instead
   * @param dropImageFailures Drop the files that are not valid images from the result
   * @param sampleRatio Fraction of the files loaded
   * @return DataFrame with a single column "image" of images;
   *         see ImageSchema for the details
   * @param seed (undocumented)
   *
   * @deprecated use `spark.read.format("image").load(path)` and this `readImages` will be removed in 3.0.0. Since 2.4.0. 
  */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> readImages (java.lang.String path, org.apache.spark.sql.SparkSession sparkSession, boolean recursive, int numPartitions, boolean dropImageFailures, double sampleRatio, long seed)  { throw new RuntimeException(); }
}
