package simple.threading;

import java.util.Random;

public class TwoProducers {

  public static void execute() {
    // avem thread
    NumberProducer numberProducerThread = new NumberProducer();
    numberProducerThread.start();

    // il băgăm în thread
    BooleanProducer booleanProducerRunnable = new BooleanProducer();
    Thread booleanProducerThread = new Thread(booleanProducerRunnable);
    booleanProducerThread.start();
  }
}
