package com.systena.aghcloud.exception.base;


import static  com.systena.aghcloud.constants.AghCloudConstants.StatusException.BAD_REQUEST;

public class BadRequestException extends BaseException {
  public BadRequestException() {
    setCode("com.systena.aghcloud.exception.base.BadRequestException");
    setStatus(BAD_REQUEST);
  }
}
