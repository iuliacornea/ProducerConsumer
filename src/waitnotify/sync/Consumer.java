package waitnotify.sync;

public class Consumer extends Thread {

  private long delay;
  private Data data;

  public Consumer(long delay, Data data) {
    this.delay = delay;
    this.data = data;
  }

  @Override
  public void run() {
//    try {
      String packet = null;
      while (!"end".equals(packet)) {
        System.out.println("Consumer asking for packet");
        packet = data.consume();
//        sleep(delay);
      }
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
  }
}
