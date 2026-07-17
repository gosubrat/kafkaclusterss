package com.example.kafkalearn.consumer;

import com.example.kafkalearn.dto.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer{
    
    @KafkaListener(topics = "orders", groupId = "order-group")
    public void consumeOrder(OrderEvent orderEvent){
        System.out.println("Message Received");
        System.out.println("OrderEvent consumed "+orderEvent);
    }
}