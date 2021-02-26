package queue.sync;

public class Consumer implements Runnable{

  private long delay;
  private Data data;

  public Consumer(long delay, Data data) {
    super();
    this.delay = delay;
    this.data = data;
  }

  @Override
  public void run() {
    try {
      while(!data.hasPackets()) {
        System.out.println("Nothing to read");
        Thread.sleep(500);
      }
      while(data.hasPackets()) {
        String packet = data.consume();
        System.out.println("Consumer reads: " + packet );
        Thread.sleep(delay);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
