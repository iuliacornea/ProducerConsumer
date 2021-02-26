package queue.sync;

public class Producer extends Thread {

  private long delay;
  private Data data;

  public Producer(long delay, Data data) {
    super();
    this.delay = delay;
    this.data = data;
  }

  @Override
  public void run() {
    try {
      for (int i = 1; i <= 10; i++) {
        sleep(delay);
        String packet = "val:" + i;
        System.out.println("Producing " + packet);
        data.produce(packet);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
