package com.systena.aghcloud.constants;

public class AghCloudConstants {

  public static class CommonConstants {
    public static final String ENCODING_UTF_8 = "UTF-8";
    public static final String LANGUAGE = "Accept-Language";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String APPLICATION_NAME = "agh_cloud";
  }

  public static class AuditorConstant {
    public static final String ANONYMOUS = "anonymousUser";
    public static final String SYSTEM = "SYSTEM";
  }

  public static class StatusException {
    public static final Integer NOT_FOUND = 404;
    public static final Integer CONFLICT = 409;
    public static final Integer BAD_REQUEST = 400;
  }

  public static class MessageException {

  }

  public static class AuthConstant {
    public static String TYPE_TOKEN = "Bearer ";
    public static String AUTHORIZATION = "Authorization";
    public static String CLAIM_USERNAME_KEY = "username";
    public static String CLAIM_AUTHORITIES_KEY = "authorities";
    public static Integer ENABLED = 1;
    public static Integer DISABLED = 0;
    public static final int AUTHORIZATION_TYPE_SIZE = 7;
    public static final String INVALID_TOKEN = "Token is invalid";
    public static final String EXPIRED_TOKEN = "Token is expired";
  }

  public static class MessageCode {
    public static final String CONFIRM_PASSWORD_NOT_MATCH = "ValidationConfirmPassword";
    public static String SUCCESS = "Success";
  }

  public static class InvalidMessageException {
    public static final String INVALID_DATE_FORMAT = "com.haunt.agh-cloud.validation.user.invalidDateFormat";
    public static final String NOT_NULL_OR_EMPTY = " can't be null, empty, or blank";
  }

  public static class ContentTypeConstant {
    public static final String OCTET_STREAM = "application/octet-stream";
    public static final String VIDEO_MP4 = "application/octet-stream";
    public static final String IMAGE = "image/png";
    public static final String VIDEO = "video/mp4";
    public static final String IMAGE_FORMAT = ".png";
    public static final String VIDEO_FORMAT = ".mp4";

    private ContentTypeConstant() {
    }
  }

  public static final class MethodRequestConstant {
    public static final String GET_METHOD = "GET";

    private MethodRequestConstant() {
    }
  }
}
