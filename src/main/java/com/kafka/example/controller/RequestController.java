package com.kafka.example.controller;

import com.kafka.example.model.BankDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("requestAPI/messages")
public class RequestController {
    private static final String TOPIC_NAME="second_topic";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, ArrayList<BankDetails>> bankDetailsKafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest){
        kafkaTemplate.send(TOPIC_NAME, messageRequest.message());
    }

    @PostMapping("/bankDetailsPublish")
    public void publish(@RequestBody ArrayList<BankDetails> data){
        bankDetailsKafkaTemplate.send("bank_details", data);
    }
}
