package com.lcc.cloud.consumer.order.feign;

import com.lcc.cloud.domain.CommonResult;
import com.lcc.cloud.domain.Payment;
import org.springframework.stereotype.Component;

/**
 * @author lcc
 * @version 2020/10/3
 */
@Component
public class PaymentFallbackService implements PaymentFeignClient {

  @Override
  public CommonResult<?> create(Payment payment) {
    return new CommonResult<>(400, "feign降级");
  }

  @Override
  public CommonResult<?> query(Long id) {
    return new CommonResult<>(400, "feign降级");
  }

  @Override
  public CommonResult<Payment> circuitBreaker(Integer num) {
    return new CommonResult<>(400, "feign降级");
  }
}
