package org.apache.spark.sql.execution.streaming.continuous.shuffle;
/**
 * A {@link ContinuousShuffleWriter} sending data to {@link RPCContinuousShuffleReader} instances.
 * <p>
 * param:  writerId The partition ID of this writer.
 * param:  outputPartitioner The partitioner on the reader side of the shuffle.
 * param:  endpoints The {@link RPCContinuousShuffleReader} endpoints to write to. Indexed by
 *                  partition ID within outputPartitioner.
 */
public  class RPCContinuousShuffleWriter implements org.apache.spark.sql.execution.streaming.continuous.shuffle.ContinuousShuffleWriter {
  public   RPCContinuousShuffleWriter (int writerId, org.apache.spark.Partitioner outputPartitioner, org.apache.spark.rpc.RpcEndpointRef[] endpoints)  { throw new RuntimeException(); }
  public  void write (scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> epoch)  { throw new RuntimeException(); }
}
