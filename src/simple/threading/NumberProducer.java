package simple.threading;

import java.util.Random;

public class NumberProducer extends Thread {

  @Override
  public void run() {
    while (true) {
      try {
        sleep(1000);
        System.out.println(new Random().nextInt());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
