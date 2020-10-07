package org.apache.spark.sql.catalyst.json;
/**
 * Options for parsing JSON data into Spark SQL rows.
 * <p>
 * Most of these map directly to Jackson's internal options, specified in {@link JsonParser.Feature}.
 */
  class JSONOptions implements org.apache.spark.internal.Logging, scala.Serializable {
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
  public  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters ()  { throw new RuntimeException(); }
  // not preceding
  public   JSONOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters, java.lang.String defaultTimeZoneId, java.lang.String defaultColumnNameOfCorruptRecord)  { throw new RuntimeException(); }
  public   JSONOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, java.lang.String defaultTimeZoneId, java.lang.String defaultColumnNameOfCorruptRecord)  { throw new RuntimeException(); }
  public  double samplingRatio ()  { throw new RuntimeException(); }
  public  boolean primitivesAsString ()  { throw new RuntimeException(); }
  public  boolean prefersDecimal ()  { throw new RuntimeException(); }
  public  boolean allowComments ()  { throw new RuntimeException(); }
  public  boolean allowUnquotedFieldNames ()  { throw new RuntimeException(); }
  public  boolean allowSingleQuotes ()  { throw new RuntimeException(); }
  public  boolean allowNumericLeadingZeros ()  { throw new RuntimeException(); }
  public  boolean allowNonNumericNumbers ()  { throw new RuntimeException(); }
  public  boolean allowBackslashEscapingAnyCharacter ()  { throw new RuntimeException(); }
  private  boolean allowUnquotedControlChars ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> compressionCodec ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.ParseMode parseMode ()  { throw new RuntimeException(); }
  public  java.lang.String columnNameOfCorruptRecord ()  { throw new RuntimeException(); }
  public  boolean dropFieldIfAllNull ()  { throw new RuntimeException(); }
  public  java.util.TimeZone timeZone ()  { throw new RuntimeException(); }
  public  org.apache.commons.lang3.time.FastDateFormat dateFormat ()  { throw new RuntimeException(); }
  public  org.apache.commons.lang3.time.FastDateFormat timestampFormat ()  { throw new RuntimeException(); }
  public  boolean multiLine ()  { throw new RuntimeException(); }
  /**
   * A string between two consecutive JSON records.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> lineSeparator ()  { throw new RuntimeException(); }
  protected  java.lang.String checkedEncoding (java.lang.String enc)  { throw new RuntimeException(); }
  /**
   * Standard encoding (charset) name. For example UTF-8, UTF-16LE and UTF-32BE.
   * If the encoding is not specified (None) in read, it will be detected automatically
   * when the multiLine option is set to <code>true</code>. If encoding is not specified in write,
   * UTF-8 is used by default.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> encoding ()  { throw new RuntimeException(); }
  public  scala.Option<byte[]> lineSeparatorInRead ()  { throw new RuntimeException(); }
  public  java.lang.String lineSeparatorInWrite ()  { throw new RuntimeException(); }
  /** Sets config options on a Jackson {@link JsonFactory}. */
  public  void setJacksonOptions (com.fasterxml.jackson.core.JsonFactory factory)  { throw new RuntimeException(); }
}
