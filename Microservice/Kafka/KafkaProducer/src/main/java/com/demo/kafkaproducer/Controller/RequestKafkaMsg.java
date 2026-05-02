package com.demo.kafkaproducer.Controller;

import com.demo.kafkaproducer.Service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RequestKafkaMsg {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/producerMsg")
    public void getKafkaMsg(@RequestParam("message") String msg) throws InterruptedException {


        for(int ind=0;ind<100;ind++)producerService.sendMsgToTopic(msg);
//        producerService.sendMsgToTopic(msg);

    }

}
