package exam_task_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateInput {
  static Date inputDate = null;
  static int inputMonth;
  public static void getInputDate() {

    System.out.print("Введите дату последнего полива (формат DD.MM): ");
    String date = new Scanner(System.in).next();

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");

    try {
      inputDate = dateFormat.parse(date);
      inputMonth = inputDate.getMonth() + 1;

      Calendar calendar = Calendar.getInstance();
      calendar.setTime(inputDate);

    } catch (Exception e) {
      System.out.println("Ошибка ввода: "  + e.toString());
    }
  }

  public static String addMonth() {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(inputDate);
    calendar.add(Calendar.MONTH, 1);
    String dateFormat = (new SimpleDateFormat("dd.MM")).format(calendar.getTime());
    return dateFormat;
  }

  public static String addOneWeek() {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(inputDate);
    calendar.add(Calendar.DAY_OF_WEEK, 7);
    String dateFormat = (new SimpleDateFormat("dd.MM")).format(calendar.getTime());
    return dateFormat;
  }

  public static String addTwoDay() {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(inputDate);
    calendar.add(Calendar.DAY_OF_WEEK, 2);
    String dateFormat = (new SimpleDateFormat("dd.MM")).format(calendar.getTime());
    return dateFormat;
  }
}
