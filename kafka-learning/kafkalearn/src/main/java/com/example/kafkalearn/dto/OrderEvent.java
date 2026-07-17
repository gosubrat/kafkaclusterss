package com.example.kafkalearn.dto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent{
    private String orderId;
    private String customerId;
    private String product;
    private Integer quantity;
    private Double amount;
}