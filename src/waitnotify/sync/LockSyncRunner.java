package waitnotify.sync;

public class LockSyncRunner {

  public static void run() {
    Data dataObj = new Data();

    System.out.println("Initialize threads synchronized by lock");
    Producer p = new Producer(1000, dataObj);
    Consumer c = new Consumer(3000, dataObj);

    System.out.println("Start threads synchronized by lock");
    p.start();
    c.start();
  }
}
