package org.apache.spark.sql.execution;
public  interface DataSourceScanExec extends org.apache.spark.sql.execution.LeafExecNode, org.apache.spark.sql.execution.CodegenSupport {
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata ()  ;
  public  java.lang.String nodeName ()  ;
  public  java.lang.String nodeNamePrefix ()  ;
  /**
   * Shorthand for calling redactString() without specifying redacting rules
   * @param text (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String redact (java.lang.String text)  ;
  public  org.apache.spark.sql.sources.BaseRelation relation ()  ;
  public  java.lang.String simpleString ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> tableIdentifier ()  ;
  public  java.lang.String treeString (boolean verbose, boolean addSuffix)  ;
  public  java.lang.String verboseString ()  ;
}
