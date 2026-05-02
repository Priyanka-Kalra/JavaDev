package com.demo.kafkaconsumer.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "KafkaDemoPartition", groupId = "KafkaDemoGroup")
    public void listenToTopic(String receivedMessage,
                              @Header(KafkaHeaders.RECEIVED_PARTITION) int partitionId) {

        System.out.println("Message Received From topic : " + receivedMessage+
                "| Partition Id : " + partitionId+
                "| Thread Id : " + Thread.currentThread().getName() );
    }
}