package exam_task_2;

public class Main {
  public static void main(String[] args) {

    DateInput.getInputDate();
    WateringSchedule.getSeason(DateInput.inputMonth);
    WateringSchedule.toPour(WateringSchedule.season);
  }
}

