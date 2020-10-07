package org.apache.spark.sql.execution.streaming.continuous.shuffle;
/**
 * Messages for the RPCContinuousShuffleReader endpoint. Either an incoming row or an epoch marker.
 * <p>
 * Each message comes tagged with writerId, identifying which writer the message is coming
 * from. The receiver will only begin the next epoch once all writers have sent an epoch
 * marker ending the current epoch.
 */
  interface RPCContinuousShuffleMessage extends scala.Serializable {
  public  int writerId ()  ;
}
