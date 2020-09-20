package com.lcc.cloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lcc
 * @version 2020/8/21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8004 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentConsul8004.class, args);
  }
}
