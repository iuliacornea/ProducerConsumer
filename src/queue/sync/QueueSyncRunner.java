package queue.sync;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Thread.sleep;

public final class QueueSyncRunner {

  public static void execute() {
    Data queue = new Data();
    System.out.println("Initialize threads synchronized by queue");
    Consumer c = new Consumer(2000L, queue);
    Thread cThread = new Thread(c);
    Producer p = new Producer(1000L, queue);

//        uncomment to see the state of the queue during the application run
    Thread inspector = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          while (true) {
            System.out.println(queue.toString());
            sleep(500);
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    System.out.println("Start threads synchronized by queue");
    p.start();
    cThread.start();
    inspector.start();
  }
}
