package code;

import java.util.PriorityQueue;
import java.util.Scanner;

public class OptimalMergePatterns {
  // function to find the minimum computation
  static int minComputation(int size, int files[]) {
    // create a min heap
    PriorityQueue<Integer> pq = new PriorityQueue();

    for (int i = 0; i < size; i++) {
      // add sizes to priorityQueue
      pq.add(files[i]);
    }

    // variable to count total computations
    int count = 0;
    while (pq.size() > 1) {
      // pop two smallest size element
      // from the min heap
      int temp = pq.poll() + pq.poll();

      // add the current computations
      // with the previous one's
      count += temp;

      // add new combined file size
      // to priority queue or min heap
      pq.add(temp);
    }
    return count;
  }

  public static void main(String[] args) {
    int size = 6;

    int files[] = new int[] { 2, 3, 4, 5, 6, 7 };

    System.out.println("Minimum Computations = " + minComputation(size, files));
  }
}

// Time Complexity: O(nlogn)
// Auxiliary Space: O(n)