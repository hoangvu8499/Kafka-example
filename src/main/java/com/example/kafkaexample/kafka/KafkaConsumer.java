package com.example.kafkaexample.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    // Topic get from Kafka Producer --> Topic Name
    // Group Id get from application.properties --> spring.kafka.consumer.group-id=myGroup
    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consumerListenMessage(String message) {
        LOGGER.info(String.format("Message get from Kafka is: %s", message));
    }


}
