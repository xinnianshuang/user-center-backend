package com.yx.userCenter.exception;

import com.yx.userCenter.common.BaseResponse;
import com.yx.userCenter.common.ErrorCode;
import com.yx.userCenter.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
  @ExceptionHandler(BusinessException.class)
  public BaseResponse businessExceptionHandler(BusinessException e) {
    log.error("业务异常："+e.getMessage(), e);
    return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
  }

  @ExceptionHandler(RuntimeException.class)
  public BaseResponse runtimeExceptionHandler(RuntimeException e) {
    log.error("运行时异常：", e);
    return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(),"运行时异常");
  }

}
