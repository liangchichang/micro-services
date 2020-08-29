package com.lcc.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lcc
 * @version 2020/8/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

  private Integer code;
  private String message;
  private T data;

  public CommonResult(Integer code, String message) {
    this(code, message, null);
  }
}
