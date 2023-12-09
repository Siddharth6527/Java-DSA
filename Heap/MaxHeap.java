// import java.util.Arrays;
// import java.util.Scanner;

// // maxHeap
// class MaxHeap {
// // a pointer pointing to the elements
// // in the array in the heap.
// int[] arr;

// // Maximum possible size of
// // the Max Heap
// int maxSize;

// // number of elements in the
// // max heap currently.
// int heapSize;

// // constructor function.
// MaxHeap(int maxSize) {
// this.maxSize = maxSize;
// arr = new int[maxSize];
// heapSize = 0;
// }

// // Heapifies a sub-tree taking the
// // given index as the root.
// void MaxHeapify(int i) {
// int l = lChild(i);
// int r = rChild(i);
// int largest = i;
// if (l < heapSize && arr[l] > arr[i]) {
// largest = l;
// }

// if (r < heapSize && arr[r] > arr[largest]) {
// largest = r;
// }

// if (largest != i) {
// int temp = arr[i];
// arr[i] = arr[largest];
// arr[largest] = temp;
// MaxHeapify(largest);
// }

// }

// // returns the index of the parent
// // of the element at ith index.
// int parent(int i) {
// return (i - 1) / 2;
// }

// // returns the index of the left child.
// int lChild(int i) {
// return (2 * i + 1);
// }

// // returns the index of the
// // right child
// int rChild(int i) {
// return (2 * i + 2);
// }

// // removes the root which in this
// // case contains the maximum element.
// int removeMax() {
// // checking whether the heap array
// // is empty or not.
// if (heapSize <= 0) {
// return Integer.MIN_VALUE;
// }

// if (heapSize == 1) {
// heapSize--;
// return arr[0];
// }

// // storing the maximum element
// // to remove it.
// int root = arr[0];
// arr[0] = arr[heapSize - 1];
// heapSize--;

// // to restore the property
// // of the Max heap.
// MaxHeapify(0);

// return root;
// }

// // increases value of key at
// // index 'i' to new_val.
// void increaseKey(int i, int newVal) {
// arr[i] = newVal;
// while (i != 0 && arr[parent(i)] < arr[i]) {
// int temp = arr[i];
// arr[i] = arr[parent(i)];
// arr[parent(i)] = temp;
// i = parent(i);
// }
// }

// // returns he maximum key
// // (key at root) from maxHeap.
// int getMax() {
// return arr[0];
// }

// int curSize() {
// return heapSize;
// }

// // deletes a key at given index i.
// void deleteKey(int i) {
// // it increases the value of the key
// // to infinity and then removes
// // the maximum value.
// increaseKey(i, Integer.MAX_VALUE);
// removeMax();
// }

// // inserts a new key 'x' in the max heap
// void insertKey(int x) {
// // to check wether the key
// // can be inserted or not.
// if (heapSize == maxSize) {
// System.out.println("\nOverflow: Could not insertKey\n");
// return;
// }

// // the new key is initialy
// // inserted at the end.
// heapSize++;
// int i = heapSize - 1;
// arr[i] = x;

// // the max heap property is checked
// // and if Violation occurs,
// // it is restored.
// while (i != 0 && arr[parent(i)] < arr[i]) {
// int temp = arr[i];
// arr[i] = arr[i];
// arr[parent(i)] = temp;
// i = parent(i);
// }
// }

// public static void main(String[] args) {
// // Assuming the maximum size of the heap to be 15.
// MaxHeap h = new MaxHeap(15);

// // Asking the user to input the keys:
// int k, i, n = 6;
// System.out.println("Entered 6 keys:- 3, 10, 12, 8, 2, 14 \n");
// h.insertKey(3);
// h.insertKey(10);
// h.insertKey(12);
// h.insertKey(8);
// h.insertKey(2);
// h.insertKey(14);

// // Printing the current size
// // of the heap.
// System.out.println("The current size of the heap is "
// + h.curSize() + "\n");

// // Printing the root element which is
// // actually the maximum element.
// System.out.println("The current maximum element is " + h.getMax()
// + "\n");

// // Deleting key at index 2.
// h.deleteKey(2);

// // Printing the size of the heap
// // after deletion.
// System.out.println("The current size of the heap is "
// + h.curSize() + "\n");

// // Inserting 2 new keys into the heap.
// h.insertKey(15);
// h.insertKey(5);
// System.out.println("The current size of the heap is "
// + h.curSize() + "\n");
// System.out.println("The current maximum element is " + h.getMax()
// + "\n");
// }

// }

/////////////////////////////////////////////////////////////
// Deletion in Heap
// public class MaxHeap {

// // to heapify a subtree rooted with node i which is
// // an index in arr[]. n is size of heap.
// static void heapify(int arr[], int n, int i) {
// int largest = i; // initialize largest as root
// int l = 2 * i + 1; // left = 2*i + 1
// int r = 2 * i + 2; // right = 2*i + 2

// // if the left child is larger than root
// if (l < n && arr[l] > arr[largest]) {
// largest = l;
// }

// // if the right child is larger than largest so far
// if (r < n && arr[r] > arr[largest]) {
// largest = r;
// }

// // if largest is not root
// if (largest != i) {
// int swap = arr[i];
// arr[i] = arr[largest];
// arr[largest] = swap;

// // Recursively heapify the affected sub-tree
// heapify(arr, n, largest);
// }
// }

// // function to delete the root from Heap
// static int deleteRoot(int arr[], int n) {
// // get the last element
// int lastElement = arr[n - 1];

// // replace root with first element
// arr[0] = lastElement;

// // decrease size of heap by 1
// n = n - 1;

// // heapify the root node
// heapify(arr, n, 0);

// // return new size of heap\
// return n;
// }

// // function to print array of size N
// static void printArray(int arr[], int n) {
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// // driver code
// public static void main(String[] args) {
// int arr[] = { 10, 5, 3, 2, 4 };

// int n = arr.length;

// n = deleteRoot(arr, n);

// printArray(arr, n);
// }
// }

// Time Complexity: O(log n) where n is no of elements in the heap.
// Auxiliary Space: O(n)

////////////////////////////////////////////////////
// Insertion in Heap
public class MaxHeap {

  // function to heapify ith node in a heap
  // of size n following a Bottom-up approach.
  static void heapify(int[] arr, int n, int i) {
    // find parent
    int parent = (i - 1) / 2;

    if (parent >= 0) {
      // for Max-Heap
      // if current node is greater than its parent
      // Swap both of them and call heapify again
      // for the parent
      if (arr[i] > arr[parent]) {
        // swap arr[i] and arr[parent]
        int temp = arr[i];
        arr[i] = arr[parent];
        arr[parent] = temp;

        // Recursively, heapify the parent node
        heapify(arr, n, parent);
      }
    }
  }

  // function to insert a new node to the heap
  static int insertNode(int[] arr, int n, int key) {
    // increase the siz of heap by 1
    n = n + 1;

    // insert the element at the end of heap
    arr[n - 1] = key;

    // heapify the new node following a
    // bottom-up approach
    heapify(arr, n, n - 1);

    // return new size of heap
    return n;
  }

  /* A utility function to print array of size n */
  static void printArray(int[] arr, int n) {
    for (int i = 0; i < n; ++i)
      System.out.println(arr[i] + " ");

    System.out.println();
  }

  // Driver Code
  public static void main(String args[]) {
    // Array representation of Max-Heap
    // 10
    // / \
    // 5 3
    // / \
    // 2 4

    // maximum size of the array
    int MAX = 1000;
    int[] arr = new int[MAX];

    // initializing some values
    arr[0] = 10;
    arr[1] = 5;
    arr[2] = 3;
    arr[3] = 2;
    arr[4] = 4;

    // Current size of the array
    int n = 5;

    // the element to be inserted
    int Key = 15;

    // The function inserts the new element to the heap and
    // returns the new size of the array
    n = insertNode(arr, n, Key);

    printArray(arr, n);
    // Final Heap will be:
    // 15
    // / \
    // 5 10
    // / \ /
    // 2 4 3
  }
}

// Time Complexity: O(Log(N)), where n is no of elements in the heap.
// Auxiliary Space: O(n).