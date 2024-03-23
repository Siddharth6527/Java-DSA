package Heap;

public class BuildHeap {

  // to heapify a subtree rooted with node i
  // which is an index in arr[]. N is size of heap
  static void heapify(int arr[], int N, int i) {
    int largest = i; // initialize largest as root
    int l = 2 * i + 1; // left = 2*i+1
    int r = 2 * i + 2; // right = 2*i+2

    // if left child is larger than root
    if (l < N && arr[l] > arr[largest]) {
      largest = l;
    }

    // if right child is larger than largest so far
    if (r < N && arr[r] > arr[largest]) {
      largest = r;
    }

    // if largest is not root
    if (largest != i) {
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;

      // recusively heapify the affected sub-tree
      heapify(arr, N, largest);
    }
  }

  // function to build a Max-Heap from the Array
  static void buildHeap(int arr[], int N) {
    // index of last non-leaf
    int startIdx = (N / 2) - 1;

    // Perform reverse level order traversal
    // from last non-lead node and heapify
    // each node
    for (int i = startIdx; i >= 0; i--) {
      heapify(arr, N, i);
    }
  }

  // function to print the array
  // representation of Heap
  static void printHeap(int arr[], int N) {
    System.out.println("Array representation of Heap is: ");

    for (int i = 0; i < N; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
    int N = arr.length;

    buildHeap(arr, N);
    printHeap(arr, N);

  }
}

/*
 * Time Compleixty: O(N)
 * Auxiliary Space: O(N), recursive stack.
 */
