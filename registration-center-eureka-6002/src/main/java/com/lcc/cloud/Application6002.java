package com.lcc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lcc
 * @version 2020/8/30
 */
@SpringBootApplication
@EnableEurekaServer
public class Application6002 {

  public static void main(String[] args) {
    SpringApplication.run(Application6002.class,args);
  }
}
