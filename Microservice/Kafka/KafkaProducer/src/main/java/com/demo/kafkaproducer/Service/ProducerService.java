package com.demo.kafkaproducer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMsgToTopic(String msg) throws InterruptedException {
        kafkaTemplate.send("KafkaDemoPartition", msg);
//        for(int i = 0; i < 100; i++) {
//            kafkaTemplate.send("KafkaDemoPartition", msg);
//            Thread.sleep(10);
//        }
    }
}

