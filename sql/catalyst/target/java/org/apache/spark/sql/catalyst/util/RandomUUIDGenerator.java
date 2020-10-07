package org.apache.spark.sql.catalyst.util;
/**
 * This class is used to generate a UUID from Pseudo-Random Numbers.
 * <p>
 * For the algorithm, see RFC 4122: A Universally Unique IDentifier (UUID) URN Namespace,
 * section 4.4 "Algorithms for Creating a UUID from Truly Random or Pseudo-Random Numbers".
 */
public  class RandomUUIDGenerator implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long randomSeed ()  { throw new RuntimeException(); }
  // not preceding
  public   RandomUUIDGenerator (long randomSeed)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.random.MersenneTwister random ()  { throw new RuntimeException(); }
  public  java.util.UUID getNextUUID ()  { throw new RuntimeException(); }
  public  org.apache.spark.unsafe.types.UTF8String getNextUUIDUTF8String ()  { throw new RuntimeException(); }
}
