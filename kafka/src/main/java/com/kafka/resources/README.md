Step 1: Get Kafka
* Download Link : https://www.apache.org/dyn/closer.cgi?path=/kafka/4.0.0/kafka_2.13-4.0.0.tgz


Step 2 : Open Terminal and do execute
* tar -xzf kafka_2.13-4.0.0.tgz
* cd kafka_2.13-4.0.0

Step 3 : Start the kafka environment
* Kafka can be run using local scripts and downloaded files or the docker image.
* Open git bash and run :
    * export KAFKA_LOG4J_OPTS="-Dlog4j.configurationFile=file:///C:/kafka_2.13-4.0.0/config/tools-log4j2.yaml"
    * KAFKA_CLUSTER_ID="$(bin/kafka-storage.sh random-uuid)"
    * echo $KAFKA_CLUSTER_ID
    * bin/kafka-storage.sh format --standalone -t $KAFKA_CLUSTER_ID -c config/server.properties
    * Start the Kafka Server : bin/kafka-server-start.sh config/server.properties

Whenever you want to deploy kafka whenever you need everytime you have to run below commands to start kafka server
* export KAFKA_LOG4J_OPTS="-Dlog4j.configurationFile=file:///C:/kafka_2.13-4.0.0/config/tools-log4j2.yaml"
* bin/kafka-server-start.sh config/server.properties

Once the Kafka server has successfully launched, you will have a basic Kafka environment running and ready to use.


Step 4 : Setup topic
* Open one more git bash terminal and execute --> export KAFKA_LOG4J_OPTS="-Dlog4j.configurationFile=file:///C:/kafka_2.13-4.0.0/config/tools-log4j2.yaml"
* Execute below command to create a topic :
    * bin/kafka-topics.sh --create --topic newCustomTopic --bootstrap-server localhost:9092
