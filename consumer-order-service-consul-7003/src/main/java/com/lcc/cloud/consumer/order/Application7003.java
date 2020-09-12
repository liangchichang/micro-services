package com.lcc.cloud.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lcc
 * @version 2020/8/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application7003 {

  public static void main(String[] args) {
    SpringApplication.run(Application7003.class, args);
  }
}
