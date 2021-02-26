package waitnotify.sync;

public class Producer extends Thread {

  private String[] packets = {"val:a", "val:b", "val:c", "val:d", "val:e", "end"};
  private long delay;
  private Data data;

  public Producer(long delay, Data data) {
    this.delay = delay;
    this.data = data;
  }

  @Override
  public void run() {
//    try {
      for (String packet : packets) {
//        sleep(delay);
        System.out.println("Producer producing packet " + packet);
        data.produce(packet);
      }
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
  }

}
