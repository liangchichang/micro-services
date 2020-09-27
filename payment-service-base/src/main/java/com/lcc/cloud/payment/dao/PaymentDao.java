package com.lcc.cloud.payment.dao;

import com.lcc.cloud.domain.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author lcc
 * @version 2020/8/22
 */
@Mapper
public interface PaymentDao {

  @Insert("insert into payment(serial)  values(#{payment.serial})")
  int create(Payment payment);

  @Select("select * from payment where id=#{id}")
  Payment getById(@Param("id") Long id);
}
