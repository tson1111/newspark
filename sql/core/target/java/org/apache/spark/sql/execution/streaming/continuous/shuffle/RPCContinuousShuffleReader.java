package org.apache.spark.sql.execution.streaming.continuous.shuffle;
/**
 * RPC endpoint for receiving rows into a continuous processing shuffle task. Continuous shuffle
 * writers will send rows here, with continuous shuffle readers polling for new rows as needed.
 * <p>
 * TODO: Support multiple source tasks. We need to output a single epoch marker once all
 * source tasks have sent one.
 */
  class RPCContinuousShuffleReader implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.sql.execution.streaming.continuous.shuffle.ContinuousShuffleReader, org.apache.spark.internal.Logging {
  // not preceding
  public   RPCContinuousShuffleReader (int queueSize, int numShuffleWriters, long epochIntervalMs, org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ArrayBlockingQueue<org.apache.spark.sql.execution.streaming.continuous.shuffle.RPCContinuousShuffleMessage>[] queues ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> read ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    java.util.concurrent.atomic.AtomicBoolean stopped ()  { throw new RuntimeException(); }
}
