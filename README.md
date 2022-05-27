# Kafka-example. Please execute the following in given order.
1)Run the zookeeper on terminal using following command
$ bin/zookeeper-server-start.sh config/zookeeper.properties
2) On the new instance of the terminal, run the kafka server
$ bin/kafka-server-start.sh config/server.properties
3)RestAPI endpoint for publisher
http://localhost:8080/requestAPI/messages
4) On the new instance of the terminal, we can add consumers using given command (Note: In this application,
 I have already added a listener method, which will be consuming the data from the topics and it will be priniting them on console)
$ bin/kafka-console-consumer.sh --topic second_topic --from-beginning --bootstrap-server localhost:9092
