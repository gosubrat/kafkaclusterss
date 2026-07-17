package com.example.kafkalearn.producer;

import com.example.kafkalearn.dto.OrderEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderProducer{
  
    private KafkaTemplate<String,OrderEvent> kafkaTemplate;

    public OrderProducer(KafkaTemplate<String,OrderEvent> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendOrder(OrderEvent orderEvent){
        kafkaTemplate.send("orders" , orderEvent);
    }
}