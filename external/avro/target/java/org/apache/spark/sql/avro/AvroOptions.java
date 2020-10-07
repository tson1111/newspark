package org.apache.spark.sql.avro;
/**
 * Options for Avro Reader and Writer stored in case insensitive manner.
 */
public  class AvroOptions implements org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  public   AvroOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public   AvroOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * The <code>compression</code> option allows to specify a compression codec used in write.
   * Currently supported codecs are <code>uncompressed</code>, <code>snappy</code>, <code>deflate</code>, <code>bzip2</code> and <code>xz</code>.
   * If the option is not set, the <code>spark.sql.avro.compression.codec</code> config is taken into
   * account. If the former one is not set too, the <code>snappy</code> codec is used by default.
   * @return (undocumented)
   */
  public  java.lang.String compression ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf ()  { throw new RuntimeException(); }
  /**
   * The <code>ignoreExtension</code> option controls ignoring of files without <code>.avro</code> extensions in read.
   * If the option is enabled, all files (with and without <code>.avro</code> extension) are loaded.
   * If the option is not set, the Hadoop's config <code>avro.mapred.ignore.inputs.without.extension</code>
   * is taken into account. If the former one is not set too, file extensions are ignored.
   * @return (undocumented)
   */
  public  boolean ignoreExtension ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters ()  { throw new RuntimeException(); }
  /**
   * Top level record name in write result, which is required in Avro spec.
   * See https://avro.apache.org/docs/1.8.2/spec.html#schema_record .
   * Default value is "topLevelRecord"
   * @return (undocumented)
   */
  public  java.lang.String recordName ()  { throw new RuntimeException(); }
  /**
   * Record namespace in write result. Default value is "".
   * See Avro spec for details: https://avro.apache.org/docs/1.8.2/spec.html#schema_record .
   * @return (undocumented)
   */
  public  java.lang.String recordNamespace ()  { throw new RuntimeException(); }
  /**
   * Optional schema provided by an user in JSON format.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> schema ()  { throw new RuntimeException(); }
}
