package com.lcc.cloud.payment.controller;

import com.lcc.cloud.domain.CommonResult;
import com.lcc.cloud.domain.Payment;
import com.lcc.cloud.payment.service.PaymentService;
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

  private PaymentService paymentService;
  @Value("${test}")
  private String isTest;

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
    return new CommonResult<>(200, "成功，测试模式：" + isTest, payment);
  }
}
