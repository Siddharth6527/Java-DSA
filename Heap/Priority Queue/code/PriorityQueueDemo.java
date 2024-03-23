import java.util.*;

class PriorityQueueDemo {
  public static void main(String[] args) {
    PriorityQueue<Integer> pQueue = new PriorityQueue<>();

    pQueue.add(10);
    pQueue.add(20);
    pQueue.add(15);

    System.out.println(pQueue.peek());
    System.out.println(pQueue.poll());
    System.out.println(pQueue.peek());
  }
}
