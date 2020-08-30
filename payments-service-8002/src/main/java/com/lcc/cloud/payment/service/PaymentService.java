package com.lcc.cloud.payment.service;

import com.lcc.cloud.domain.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lcc
 * @version 2020/8/22
 */
public interface PaymentService {

  int create(Payment payment);

  Payment getById(@Param("id") Long id);
}
