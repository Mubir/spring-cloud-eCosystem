package com.cldsping.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {
    public final RestTemplate restTemplate;

    @Autowired
    public PaymentService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public String processPayment() {
        //String orderResponse = restTemplate.getForObject("http://order-service/order/", String.class);
        return "Payment processed. " ;//+ orderResponse;
    }
}
