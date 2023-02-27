package exam_task_2;
public class WateringSchedule {
  static String season;

  public static void getSeason(int month) {
    switch (month) {
      case 1:
      case 2:
      case 12:
        season = "winter";
        break;
      case 3:
      case 4:
      case 5:
      case 9:
      case 10:
      case 11:
        season = "offSeason";
        break;
      case 6:
      case 7:
      case 8:
        season = "summer";
        break;
    }
  }

  public static void toPour(String season) {
    int indication = new Sensor().getSensorIndications();

    if (indication < 31) {
      System.out.println("Влажность ниже 30%, полей кактус!");
    } else {
      if (season == "winter") {
        System.out.println("Дата следующего полива кактуса: "
                + DateInput.addMonth());
      } else if (season == "offSeason") {
        System.out.println("Дата следующего полива кактуса: "
                + DateInput.addOneWeek());
      } else if (season == "summer") {
        System.out.println("Дата следующего полива кактуса: "
                + DateInput.addTwoDay());
      }
    }
  }
}
