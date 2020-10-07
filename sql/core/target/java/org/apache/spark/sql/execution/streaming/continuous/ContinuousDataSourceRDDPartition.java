package org.apache.spark.sql.execution.streaming.continuous;
public  class ContinuousDataSourceRDDPartition implements org.apache.spark.Partition, scala.Serializable {
  // not preceding
  public   ContinuousDataSourceRDDPartition (int index, org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow> inputPartition)  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.InputPartition<org.apache.spark.sql.catalyst.InternalRow> inputPartition ()  { throw new RuntimeException(); }
    org.apache.spark.sql.execution.streaming.continuous.ContinuousQueuedDataReader queueReader ()  { throw new RuntimeException(); }
}
