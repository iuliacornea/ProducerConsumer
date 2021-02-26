package waitnotify.sync;

public class Data {
  String packet;
  boolean producing = false;

  public synchronized void produce(String packet) {
    while(!producing) {
      try {
        System.out.println("Data produce is waiting");
        wait();
        System.out.println("Data produce was notified");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Data replacing packet " + this.packet + " with " + packet);
    this.packet = packet;
    producing = false;
    System.out.println("Data producer notifies all threads");
    notifyAll();
  }

  public synchronized String consume() {
    while (producing) {
      try {
        System.out.println("Data consumer is waiting");
        wait();
        System.out.println("Data consumer was notified");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Data consuming packet " + this.packet);
    System.out.println("Data consumer notifies all threads");
    notifyAll();
    producing = true;
    return packet;
  }
}
