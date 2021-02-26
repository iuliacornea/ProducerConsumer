import queue.sync.QueueSyncRunner;
import simple.threading.TwoProducers;
import waitnotify.sync.LockSyncRunner;

import static java.lang.Thread.sleep;

public class Application {

  public static void main(String[] args) throws InterruptedException {
//    QueueSyncRunner.execute();
    LockSyncRunner.run();
//    TwoProducers.execute();
  }
}
