package simple.threading;

import java.util.Random;

public class BooleanProducer implements Runnable {
  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Bool " + new Random().nextBoolean());
    }
  }
}
