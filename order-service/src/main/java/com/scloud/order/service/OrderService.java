package com.scloud.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    private final RestTemplate restTemplate;

    @Autowired
    public OrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String createOrder() {
        String paymentResponse = restTemplate.getForObject("http://payment-service/payment/", String.class);
        return "Order created. " + paymentResponse;
    }
}

