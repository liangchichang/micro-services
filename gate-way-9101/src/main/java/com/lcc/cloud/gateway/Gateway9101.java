package com.lcc.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lcc
 * @version 2020/10/8
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9101 {

  public static void main(String[] args) {
    SpringApplication.run(Gateway9101.class, args);
  }
}
