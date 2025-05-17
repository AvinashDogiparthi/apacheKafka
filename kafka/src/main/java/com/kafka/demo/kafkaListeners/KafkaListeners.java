package com.kafka.demo.kafkaListeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "avinashTopic", groupId = "groupId")
    void Listener(String data){
        System.out.println("Listener received for data : "+data+" 😉");
    }
}
