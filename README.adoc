# Exercise: Developing Kafka Producer

## How to run (Windows)

- zookeeper:

````
    cd C:\kafka\bin\windows
    zookeeper-server-start.bat C:\kafka\config\zookeeper.properties
````

- kafka server:

````
    cd C:\kafka\bin\windows
    kafka-server-start.bat C:\kafka\config\server.properties
````

- read message:

 ````
    cd C:\kafka\bin\windows
    kafka-console-consumer.bat --topic output --from-beginning --bootstrap-server localhost:9092
 ````
 - write message:

 ````
    cd C:\kafka\bin\windows
    kafka-console-producer.bat --topic input --bootstrap-server localhost:9092
 ````
## How to run (macOS)

````
    cd kafka
    ./bin/zookeeper-server-start.sh /Users/danielfiedosiuk/kafka/config/zookeeper.properties
````

- kafka server:

````
    cd kafka
    ./bin/kafka-server-start.sh /Users/danielfiedosiuk/kafka/config/server.properties
````

- read message:

 ````
    cd kafka
    ./bin/kafka-console-consumer.sh --topic output --from-beginning --bootstrap-server localhost:9092
 ````
 - write message:

 ````
    cd kafka
    ./bin/kafka-console-producer.sh --topic input --bootstrap-server localhost:9092
 ````
 
## Procedure

1. Read the javadoc of [KafkaProducer](https://kafka.apache.org/20/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html) to know how to use the Producer API (to send messages to Kafka)
2. Create a new Scala/sbt project in IntelliJ IDEA
    1. Leave the defaults for the versions of sbt and Scala
    2. They usually are the latest versions
3. Define dependency for Kafka Clients API library
    1. Use [mvnrepository](https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients/2.0.0) to know the proper entry for `kafka-clients` dependency
4. Write the code of a Kafka producer
    1. Name of the object: **KafkaProducerApp**
    2. Start with an empty `Properties` object and fill out the missing properties per exceptions at runtime
    3. Use [ProducerConfig](https://kafka.apache.org/20/javadoc/org/apache/kafka/clients/producer/ProducerConfig.html) constants (not string values for properties)
    4. Don't forget to `close` the producer (so the messages are actually sent out to the broker)
5. Run the producer
    1. Use `kafka-console-consumer` to receive the messages
6. Fix the slf4j logging errors
    1. Define dependencies for `slf4j-api` and `slf4j-log4j12` in `build.sbt`
    2. Create `src/main/resources/log4j.properties` as the configuration file
    3. Use Apache Kafka's `config/log4j.properties` as the sample (4 first non-comment lines)
7. Duration: 30 mins
