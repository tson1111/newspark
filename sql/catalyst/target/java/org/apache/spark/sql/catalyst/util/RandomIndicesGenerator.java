package org.apache.spark.sql.catalyst.util;
/**
 * This class is used to generate a random indices of given length.
 * <p>
 * This implementation uses the "inside-out" version of Fisher-Yates algorithm.
 * Reference:
 *   https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#The_%22inside-out%22_algorithm
 */
public  class RandomIndicesGenerator implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long randomSeed ()  { throw new RuntimeException(); }
  // not preceding
  public   RandomIndicesGenerator (long randomSeed)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.random.MersenneTwister random ()  { throw new RuntimeException(); }
  public  int[] getNextIndices (int length)  { throw new RuntimeException(); }
}