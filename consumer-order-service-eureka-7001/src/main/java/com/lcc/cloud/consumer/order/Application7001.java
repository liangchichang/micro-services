package com.lcc.cloud.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lcc
 * @version 2020/8/23
 */
@SpringBootApplication
@EnableEurekaClient
public class Application7001 {

  public static void main(String[] args) {
    SpringApplication.run(Application7001.class, args);
  }
}
