package com.lcc.cloud.consumer.order.controller;

import com.lcc.cloud.domain.CommonResult;
import com.lcc.cloud.domain.Payment;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lcc
 * @version 2020/8/23
 */
@RestController
@RequestMapping("/web/order")
@Slf4j
public class ConsumerOrderController {

  public static final String MICRO_SERVER_URL = "http://localhost:8001";

  @Resource
  private RestTemplate restTemplate;

  @PostMapping("/payment/create")
  public CommonResult<?> create(Payment payment) {
    log.info("创建支付信息：" + payment);
    return restTemplate.postForObject(MICRO_SERVER_URL + "/payment", payment, CommonResult.class);
  }

  @GetMapping("/payment/{id}")
  public CommonResult<?> getPayment(@PathVariable("id") Long id) {
    log.info("查询支付信息，id：" + id);
    return restTemplate.getForObject(MICRO_SERVER_URL + "/payment/" + id, CommonResult.class);
  }
}
