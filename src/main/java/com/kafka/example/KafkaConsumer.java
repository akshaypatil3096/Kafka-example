package com.kafka.example;

import com.kafka.example.model.BankDetails;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.ArrayList;

/**
 * This class has a method which is used to subscribed to the particular topic, and then
 * it will print the data.
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"first_topic","second_topic"},
    groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received the Data : "+data+" ;)");
    }

    @KafkaListener(topics = "bank_details",
            groupId = "group_json", containerFactory = "bankDetailsListenerFactory")
    public void bankDetailsListener(ArrayList<BankDetails> bankDetails){
        System.out.println("Listener received the Bank Data : "+bankDetails+" ;)");
    }
}
