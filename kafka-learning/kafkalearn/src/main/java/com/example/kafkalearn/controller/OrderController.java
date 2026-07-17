package com.example.kafkalearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.kafkalearn.dto.OrderEvent;
import com.example.kafkalearn.producer.OrderProducer;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderEvent orderEvent){
        System.out.println("OrderEvent created "+orderEvent);
        orderProducer.sendOrder(orderEvent);
        return "Order Received";
    }
}
