package org.apache.spark.sql.execution.command;
public  class CommandUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CommandUtils$ MODULE$ = null;
  public   CommandUtils$ ()  { throw new RuntimeException(); }
  /** Change statistics after changing data by commands. */
  public  void updateTableStats (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  public  scala.math.BigInt calculateTotalSize (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.catalyst.catalog.CatalogTable catalogTable)  { throw new RuntimeException(); }
  public  long calculateLocationSize (org.apache.spark.sql.internal.SessionState sessionState, org.apache.spark.sql.catalyst.TableIdentifier identifier, scala.Option<java.net.URI> locationUri)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogStatistics> compareAndGetNewStats (scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogStatistics> oldStats, scala.math.BigInt newTotalSize, scala.Option<scala.math.BigInt> newRowCount)  { throw new RuntimeException(); }
}
