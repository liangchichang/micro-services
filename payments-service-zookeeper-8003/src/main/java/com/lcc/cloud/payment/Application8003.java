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
public class Application8003 {

  public static void main(String[] args) {
    SpringApplication.run(Application8003.class, args);
  }
}
