package com.systena.aghcloud.exception.base;

import static com.systena.aghcloud.exception.base.StatusConstants.INTERNAL_SERVER_ERROR;

public class InternalServerError extends BaseException {
  public InternalServerError() {
    setCode("com.systena.aghcloud.exception.base.InternalServerError");
    setStatus(INTERNAL_SERVER_ERROR);
  }

  public InternalServerError(String message) {
    setCode(message);
    setStatus(INTERNAL_SERVER_ERROR);
  }
}
