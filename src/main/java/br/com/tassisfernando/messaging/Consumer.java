package br.com.tassisfernando.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "hello-topic", groupId = "group-1")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
