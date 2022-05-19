package com.kafka.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * This class will create the topics by which, the Producer can send the messages.
 */
@Configuration
public class KafkaTopicConfig {
    private static final String TOPIC_NAME = "first_topic";

    @Bean
    public NewTopic addNewTopic() {
        return TopicBuilder.name(TOPIC_NAME).build();
    }
}
