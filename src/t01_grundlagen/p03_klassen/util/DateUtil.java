package t01_grundlagen.p03_klassen.util;

import java.time.DayOfWeek;
import java.time.LocalDate;

// Utility Class (wie System, Math usw.)
public class DateUtil {

  public static final double PI = 3.1415;

  public static boolean istHeuteFreitag() {
    LocalDate today = LocalDate.now();
    return today.getDayOfWeek() == DayOfWeek.FRIDAY;
  }
}
