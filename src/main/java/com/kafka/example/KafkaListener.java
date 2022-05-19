package com.kafka.example;

import org.springframework.stereotype.Component;

/**
 * This class has a method which is used to subscribed to the particular topic, and then
 * it will print the data.
 */
@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = {"first_topic","second_topic"},
    groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received the Data : "+data+" ;)");
    }
}
