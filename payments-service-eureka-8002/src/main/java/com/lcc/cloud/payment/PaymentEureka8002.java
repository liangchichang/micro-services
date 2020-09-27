package com.lcc.cloud.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lcc
 * @version 2020/8/21
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentEureka8002 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentEureka8002.class, args);
  }
}
