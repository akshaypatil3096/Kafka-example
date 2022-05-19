package com.kafka.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("requestAPI/messages")
public class RequestController {
    private static final String TOPIC_NAME="second_topic";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest){
        kafkaTemplate.send(TOPIC_NAME, messageRequest.message());
    }
}
