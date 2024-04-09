package com.example.kafkaexample.controller;

import com.example.kafkaexample.kafka.JsonKafkaProducer;
import com.example.kafkaexample.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    // localhost:8080/api/v2/kafka/publish
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User userData) {
        jsonKafkaProducer.sendMessage(userData);
        return ResponseEntity.ok("Message sent to topic");
    }

}
