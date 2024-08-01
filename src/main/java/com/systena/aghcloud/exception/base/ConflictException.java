package com.systena.aghcloud.exception.base;


import static com.systena.aghcloud.constants.AghCloudConstants.StatusException.CONFLICT;

public class ConflictException extends BaseException {
  public ConflictException(String id, String objectName) {
    setStatus(CONFLICT);
    setCode("com.systena.aghcloud.exception.base.ConflictException");
    addParam("id", id);
    addParam("objectName", objectName);
  }

  public ConflictException(){
    setStatus(CONFLICT);
    setCode("");
  }
}
