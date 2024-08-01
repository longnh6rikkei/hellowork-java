package com.systena.aghcloud.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
  public static String getCurrentTimeString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return LocalDateTime.now().format(formatter);
  }
  public static Long currentTimeMillis() {
    return System.currentTimeMillis();
  }
}
