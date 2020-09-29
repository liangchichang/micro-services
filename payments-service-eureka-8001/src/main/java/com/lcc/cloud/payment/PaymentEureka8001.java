package com.lcc.cloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lcc
 * @version 2020/8/21
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentEureka8001 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentEureka8001.class, args);
  }
}
