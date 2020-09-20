package com.lcc.cloud.config.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lcc
 * @version 2020/9/20
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringCloudConfigCenter9001 {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudConfigCenter9001.class, args);
  }
}
