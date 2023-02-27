package exam_task_2;

import java.util.Random;

public class Sensor {
  public int getSensorIndications () {
    Random r = new Random();
    return r.nextInt(1,100);
  }
}
