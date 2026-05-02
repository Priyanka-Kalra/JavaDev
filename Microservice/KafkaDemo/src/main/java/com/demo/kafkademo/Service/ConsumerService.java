package com.demo.kafkademo.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "KafkaDemo", groupId = "KafkaDemoGroup")
    public void listenToTopic(String receivedMessage){
        System.out.println("Message Received From topic : " + receivedMessage);
    }
}
