# Kafka
 
# Kafka Setup Guide

This guide provides step-by-step instructions for setting up Apache Kafka on a Windows environment.

## Step 1: Download and Install Kafka

Download Kafka from [here](https://downloads.apache.org/kafka/3.6.1/kafka_2.13-3.6.1.tgz).

## Step 2: Start Kafka

### Start the Zookeeper service

```bash
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

### Start the Kafka service

.\bin\windows\kafka-server-start.bat .\config\server.properties
```

## Step 3: Create a Topic to Store Events

.\bin\windows\kafka-topics.bat --create --topic topic-example --bootstrap-server localhost:9092

## Step 4: Write Some Events into the Topic (e.g., hello, test) 
.\bin\windows\kafka-console-producer.bat --topic topic-example --bootstrap-server localhost:9092

## Step 5:Read the Events
.\bin\windows\kafka-console-consumer.bat --topic topic-example --from-beginning --bootstrap-server localhost:9092
