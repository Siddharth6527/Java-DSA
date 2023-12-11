// Insertion Sort:
/*
 * Insertion sort is a simple sorting algorithm that works similar to the way
 * you sort playing cards in your hands.
 * 
 * The array is virtually split into a sorted and an unsorted part.
 * 
 * Values from the unsorted part are picked and placed at the correct position
 * in the sorted part.
 */

///////////////////////
// Insertion Sort Algorithm:
/*
 * To sort an array of size N in ascending order iterate over the array and
 * compare the current element (key) to its predecessor, if the ket element is
 * smaller than it predecessor, compare it to elements before.
 * 
 * Move the greater elements one position up to make space for the swapped
 * element.
 */

///////////////////////
// Code:

public class InsertionSort {
  // function to sort array using insertion sort
  void sort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      int key = arr[i];
      int j = i - 1;

      // move the elements of arr[0...i-1], that are
      // greater than key, to one position ahead
      // of their current position.
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }

  // function to print array of size
  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
  }

  // driver method
  public static void main(String[] args) {
    int arr[] = { 12, 11, 13, 5, 6 };

    InsertionSort ob = new InsertionSort();
    ob.sort(arr);

    printArray(arr);
  }
}

/*
 * Time Complexity: O(N^2)
 * Auxiliary Space: O(1)
 * 
 * Time Complexity of Insertion Sort:
 * 1. The worst-case time complexity of the Insertion sort is O(N^2).
 * 2. The average case time complexity of the insertin sort is O(n^2).
 * 3. The time complexity of the best case is O(N).
 * 
 * Space Complexity of Insertion Sort:
 * The auxiliary space complexity of Insertion Sort is O(1).
 */

////////////////////////////////
// Characteristics of Insertion Sort:
/*
 * 1. This algorithm is one of the simplest algorithms with a simple
 * implementation.
 * 
 * 2. Basically, Insertion sort is efficient for small data values.
 * 
 * 3. Insertion Sort is adaptive in nature, i.e. it is appropritate for data
 * sets that are already partially sorted.
 */

/////////////////////////////
// FAQs:
/*
 * Q1. What are the Boundary Cases of Insertion Sort algorithm?
 * Insertion sort takes the maximum time to sort if elements are sorted in
 * reverse order.
 * And it takes minimum time (order of n) when elements are already sorted.
 */

/*
 * 1. The Insertion Sort algorithm follows an incremental approach.
 * 2. Insertion sort is an in-place sorting algorithm.
 * 3. Insertion sort is a stabel sorting algorithm.
 * 4. Insertion sort is used when number of elements is small. It can also be
 * useful when the input array is almost sorted, and only a few elements are
 * misplaced in a complete big array.
 */