package org.apache.spark.sql.catalyst.json;
  class JSONOptionsInRead extends org.apache.spark.sql.catalyst.json.JSONOptions {
  static public  scala.collection.Seq<java.nio.charset.Charset> blacklist ()  { throw new RuntimeException(); }
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
  static public  double samplingRatio ()  { throw new RuntimeException(); }
  static public  boolean primitivesAsString ()  { throw new RuntimeException(); }
  static public  boolean prefersDecimal ()  { throw new RuntimeException(); }
  static public  boolean allowComments ()  { throw new RuntimeException(); }
  static public  boolean allowUnquotedFieldNames ()  { throw new RuntimeException(); }
  static public  boolean allowSingleQuotes ()  { throw new RuntimeException(); }
  static public  boolean allowNumericLeadingZeros ()  { throw new RuntimeException(); }
  static public  boolean allowNonNumericNumbers ()  { throw new RuntimeException(); }
  static public  boolean allowBackslashEscapingAnyCharacter ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> compressionCodec ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.ParseMode parseMode ()  { throw new RuntimeException(); }
  static public  java.lang.String columnNameOfCorruptRecord ()  { throw new RuntimeException(); }
  static public  boolean dropFieldIfAllNull ()  { throw new RuntimeException(); }
  static public  java.util.TimeZone timeZone ()  { throw new RuntimeException(); }
  static public  org.apache.commons.lang3.time.FastDateFormat dateFormat ()  { throw new RuntimeException(); }
  static public  org.apache.commons.lang3.time.FastDateFormat timestampFormat ()  { throw new RuntimeException(); }
  static public  boolean multiLine ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> lineSeparator ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> encoding ()  { throw new RuntimeException(); }
  static public  scala.Option<byte[]> lineSeparatorInRead ()  { throw new RuntimeException(); }
  static public  java.lang.String lineSeparatorInWrite ()  { throw new RuntimeException(); }
  static public  void setJacksonOptions (com.fasterxml.jackson.core.JsonFactory factory)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters ()  { throw new RuntimeException(); }
  // not preceding
  public   JSONOptionsInRead (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters, java.lang.String defaultTimeZoneId, java.lang.String defaultColumnNameOfCorruptRecord)  { throw new RuntimeException(); }
  public   JSONOptionsInRead (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, java.lang.String defaultTimeZoneId, java.lang.String defaultColumnNameOfCorruptRecord)  { throw new RuntimeException(); }
  protected  java.lang.String checkedEncoding (java.lang.String enc)  { throw new RuntimeException(); }
}
