#!/bin/sh

datadir=/home/totemtang/sqp/test-scripts/datadir/tpchdata
checkpoint=hdfs://localhost:9000/tpch_checkpoint
spark_sqp=/home/totemtang/sqp/spark-sqp
middlegroundjar=${spark_sqp}/middle-ground/target/scala-2.11/totem-middle-ground_2.11-2.4.0.jar

./bin/spark-submit --class totem.middleground.tpch.LoadTPCH --master local[2] $middlegroundjar localhost:9092 $datadir $checkpoint false


