package org.apache.spark;
/**
 * Scala 2.12 defines the two new transform/transformWith methods mentioned above. Impementing
 * these for 2.12 in the Spark class here requires delegating to these same methods in an
 * underlying Future object. But that only exists in 2.12. But these methods are only called
 * in 2.12. So define helper shims to access these methods on a Future by reflection.
 */
public  class FutureAction$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FutureAction$ MODULE$ = null;
  public   FutureAction$ ()  { throw new RuntimeException(); }
  private  java.lang.reflect.Method transformTryMethod ()  { throw new RuntimeException(); }
  private  java.lang.reflect.Method transformWithTryMethod ()  { throw new RuntimeException(); }
   <T extends java.lang.Object, S extends java.lang.Object> scala.concurrent.Future<S> transform (scala.concurrent.Future<T> future, scala.Function1<scala.util.Try<T>, scala.util.Try<S>> f, scala.concurrent.ExecutionContext executor)  { throw new RuntimeException(); }
   <T extends java.lang.Object, S extends java.lang.Object> scala.concurrent.Future<S> transformWith (scala.concurrent.Future<T> future, scala.Function1<scala.util.Try<T>, scala.concurrent.Future<S>> f, scala.concurrent.ExecutionContext executor)  { throw new RuntimeException(); }
}
