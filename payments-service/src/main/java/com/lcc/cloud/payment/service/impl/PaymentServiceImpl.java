package com.lcc.cloud.payment.service.impl;

import com.lcc.cloud.payment.dao.PaymentDao;
import com.lcc.cloud.payment.domain.Payment;
import com.lcc.cloud.payment.service.PaymentService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author lcc
 * @version 2020/8/22
 */
@Service
public class PaymentServiceImpl implements PaymentService {

  @Resource
  private PaymentDao paymentDao;

  @Override
  public int create(Payment payment) {
    return paymentDao.create(payment);
  }

  @Override
  public Payment getById(Long id) {
    return paymentDao.getById(id);
  }
}
