package com.example.kafkaexample.kafka;

import com.example.kafkaexample.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consumerListenMessage(User message) {
        LOGGER.info(String.format("Json get from Kafka is: %s", message.toString()));
    }
}
