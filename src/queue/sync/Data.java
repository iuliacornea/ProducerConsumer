package queue.sync;

import java.util.LinkedList;
import java.util.Queue;

public class Data {

  Queue<String> queue = new LinkedList<String>();

  public void produce(String packet) {
    System.out.println("Adding to queue: " + packet);
    queue.add(packet);
  }

  public String consume() {
    String packet = queue.poll();
    System.out.println("Consuming from queue: " + packet);
    return packet;
  }

  public boolean hasPackets() {
    return !queue.isEmpty();
  }

  public String toString() {
    StringBuilder builder = new StringBuilder("Queue: ");
    queue.stream().forEach(element -> builder.append(element + " "));
    return builder.toString();
  }

}
