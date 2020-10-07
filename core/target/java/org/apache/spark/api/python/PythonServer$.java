package org.apache.spark.api.python;
public  class PythonServer$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PythonServer$ MODULE$ = null;
  public   PythonServer$ ()  { throw new RuntimeException(); }
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
  public  scala.Tuple2<java.lang.Object, java.lang.String> setupOneConnectionServer (org.apache.spark.security.SocketAuthHelper authHelper, java.lang.String threadName, scala.Function1<java.net.Socket, scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
}
