package com.lcc.cloud.payment.controller;

import com.lcc.cloud.domain.CommonResult;
import com.lcc.cloud.domain.Payment;
import com.lcc.cloud.payment.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lcc
 * @version 2020/8/22
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

  private final PaymentService paymentService;
  @Value("${test}")
  private String isTest;
  @Value("${server.port}")
  private String port;

  public PaymentController(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  @PostMapping
  public CommonResult<?> create(@RequestBody Payment payment) {
    int result = paymentService.create(payment);
    log.info("插入结果：" + result);
    if (result > 0) {
      return new CommonResult<>(200, "success");
    } else {
      return new CommonResult<>(400, "fail");
    }
  }

  @GetMapping("/{id}")
  public CommonResult<Payment> getById(@PathVariable("id") Long id) {
    Payment payment = paymentService.getById(id);
    log.info("查询结果：" + payment);
    return new CommonResult<>(200, "成功，服务端口号：:" + port + "，测试模式：" + isTest, payment);
  }

  @HystrixCommand(fallbackMethod = "circuitBreakerHandler", commandProperties = {
      @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
  })
  @GetMapping("/circuitBreaker/{num}")
  public CommonResult<Payment> circuitBreaker(@PathVariable("num") Integer num) throws InterruptedException {
    int i = num % 3;
    if (i == 0) {
      Thread.sleep(3000);
    } else if (i == 1) {
      throw new RuntimeException("失败");
    }
    return new CommonResult<>(200, "成功，服务端口号：:" + port);
  }

  private CommonResult<Payment> circuitBreakerHandler(Integer num) {
    return new CommonResult<>(400, "服务端降级，端口号：" + port);
  }
}
