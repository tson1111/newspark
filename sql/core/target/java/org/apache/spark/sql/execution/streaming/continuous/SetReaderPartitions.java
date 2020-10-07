package org.apache.spark.sql.execution.streaming.continuous;
/**
 * Set the reader and writer partition counts. Tasks may not be started until the coordinator
 * has acknowledged these messages.
 */
  class SetReaderPartitions implements org.apache.spark.sql.execution.streaming.continuous.EpochCoordinatorMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   SetReaderPartitions (int numPartitions)  { throw new RuntimeException(); }
}
