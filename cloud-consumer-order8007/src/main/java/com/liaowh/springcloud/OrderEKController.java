package com.liaowh.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
@Slf4j
public class OrderEKController
{
    //public static final String PAYMENT_URL = "http://localhost:8005";

    public static final String PAYMENT_URL = "http://cloud-payment-service8005";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/test")
    public String paymentInfo()
    {
        String result = restTemplate.getForObject(PAYMENT_URL +"/payment/eureka",String.class);
        return result;
    }
}
