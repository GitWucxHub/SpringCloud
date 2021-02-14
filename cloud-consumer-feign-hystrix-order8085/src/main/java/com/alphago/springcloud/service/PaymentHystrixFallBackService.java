package com.alphago.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixFallBackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentHystrixFallBackService fall back paymentInfo_OK o(╥﹏╥)o----";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentHystrixFallBackService fall back paymentInfo_TimeOut o(╥﹏╥)o----";
    }
}
