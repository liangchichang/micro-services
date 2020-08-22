package com.lcc.cloud.payment.dao;

import com.lcc.cloud.payment.domain.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lcc
 * @version 2020/8/22
 */
@Mapper
public interface PaymentDao {

  int create(Payment payment);

  Payment getById(@Param("id") Long id);
}
