#!/bin/bash
for i in {1..6}
do
	mv 0707/q${i}.scala examples/src/main/scala/org/apache/spark/examples/sql/SQLDataSourceExample.scala
	./build/sbt "project examples" package
	mv /home/congding/dataloading/examples/target/scala-2.11/jars/spark-examples_2.11-2.4.0.jar q${i}.jar
done

