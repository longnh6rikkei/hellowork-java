package com.systena.aghcloud.exception.base;


import static com.systena.aghcloud.constants.AghCloudConstants.StatusException.NOT_FOUND;

public class NotFoundException extends BaseException {
  public NotFoundException(String id, String objectName) {
    setCode("com.systena.aghcloud.exception.base.NotFoundException");
    setStatus(NOT_FOUND);
    addParam("id", id);
    addParam("objectName", objectName);
  }

  public NotFoundException() {
    setCode("");
    setStatus(NOT_FOUND);
  }
}
