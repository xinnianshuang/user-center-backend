package com.yx.userCenter.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登录请求
 * @author yx
 */
@Data
public class UserLoginRequest implements Serializable{
  private static final long serialVersionUID = 1L;
  private  String userAccount;
  private String userPassword;

}
