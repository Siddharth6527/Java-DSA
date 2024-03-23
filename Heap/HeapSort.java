// java progarm to implement Heap Sort
package Heap;

public class HeapSort {
  public void sort(int arr[]) {
    int N = arr.length;

    // build heap (rearrange array)
    for (int i = N / 2 - 1; i >= 0; i--) {
      heapify(arr, N, i);
    }

    // one by one extract an element from heap
    for (int i = N - 1; i > 0; i--) {
      // move current root to end
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      // call max heapify on the reduced heap
      heapify(arr, i, 0);
    }
  }

  // To heapify a subtree rooted with node i which is
  // an index in arr[]. n is size of heap
  void heapify(int arr[], int N, int i) {
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;

    // if leaf child is larger than root
    if (l < N && arr[l] > arr[largest]) {
      largest = l;
    }

    // if right child is larger than largest sofar
    if (r < N && arr[r] > arr[largest]) {
      largest = r;
    }

    // if largest is not root
    if (largest != i) {
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;

      heapify(arr, N, i);
    }
  }

  /* A utility function to print array of size n */
  static void printArray(int arr[]) {
    int N = arr.length;

    for (int i = 0; i < N; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // Driver's code
  public static void main(String args[]) {
    int arr[] = { 12, 11, 13, 5, 6, 7 };
    // int N = arr.length;

    // Function call
    HeapSort ob = new HeapSort();
    ob.sort(arr);

    System.out.println("Sorted array is");
    printArray(arr);
  }
}