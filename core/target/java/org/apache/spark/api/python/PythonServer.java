package org.apache.spark.api.python;
/**
 * Creates a server in the jvm to communicate with python for handling one batch of data, with
 * authentication and error handling.
 */
 abstract class PythonServer<T extends java.lang.Object> {
  /**
   * Create a socket server and run user function on the socket in a background thread.
   * <p>
   * The socket server can only accept one connection, or close if no connection
   * in 15 seconds.
   * <p>
   * The thread will terminate after the supplied user function, or if there are any exceptions.
   * <p>
   * If you need to get a result of the supplied function, create a subclass of {@link PythonServer}
   * <p>
   * @return The port number of a local socket and the secret for authentication.
   * @param authHelper (undocumented)
   * @param threadName (undocumented)
   * @param func (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, java.lang.String> setupOneConnectionServer (org.apache.spark.security.SocketAuthHelper authHelper, java.lang.String threadName, scala.Function1<java.net.Socket, scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PythonServer (org.apache.spark.security.SocketAuthHelper authHelper, java.lang.String threadName)  { throw new RuntimeException(); }
  public   PythonServer (org.apache.spark.SparkEnv env, java.lang.String threadName)  { throw new RuntimeException(); }
  public   PythonServer (java.lang.String threadName)  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  java.lang.String secret ()  { throw new RuntimeException(); }
  /**
   * Handle a connection which has already been authenticated.  Any error from this function
   * will clean up this connection and the entire server, and get propogated to {@link getResult}.
   * @param sock (undocumented)
   * @return (undocumented)
   */
  public abstract  T handleConnection (java.net.Socket sock)  ;
  public  scala.concurrent.Promise<T> promise ()  { throw new RuntimeException(); }
  /**
   * Blocks indefinitely for {@link handleConnection} to finish, and returns that result.  If
   * handleConnection throws an exception, this will throw an exception which includes the original
   * exception as a cause.
   * @return (undocumented)
   */
  public  T getResult ()  { throw new RuntimeException(); }
  public  T getResult (scala.concurrent.duration.Duration wait)  { throw new RuntimeException(); }
}
