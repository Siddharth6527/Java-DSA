// Selection Sort:
/*
 * Selection sort is a simple and efficient sorting algorithm that works by
 * repeatedly selecting the smallest (or largest) element from the unsorted
 * portion of the list and moving it to sorted portion of the list.
 */

/*
 * The algorithm repeatedly selects the smallest (or largest) element from the
 * unsorted portion of the list and swaps it with the first element of the
 * unsorted part.
 * 
 * This process is repeated for the remaining unsorted portion until the entire
 * list is sorted.
 */

/////////////////////
// code:
// import java.io.*;

public class SelectionSort {
  void sort(int arr[]) {
    int n = arr.length;

    // one by one move boundary of unsorted subarray
    for (int i = 0; i < n - 1; i++) {
      // find the minimum element in unsorted array
      int min_idx = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }

      // swap the found minimum element with the first
      // element
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  // prints the array
  void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // driver code
  public static void main(String[] args) {
    SelectionSort ob = new SelectionSort();
    int arr[] = { 64, 25, 12, 22, 11 };
    ob.sort(arr);
    System.out.println("Sorted array");
    ob.printArray(arr);
  }
}

/*
 * Complexity Analysis of Selection Sort:
 * Time Complexity: The time complexity of Selection Sort is O(N^2) as there are
 * two nested loops:
 * 1. One loop to select an element of Array one by one = O(N)
 * 2. Another loop to compare that element with every other Array element = O(N)
 * 3. Therefore overall complexity: O(N)*(N) = O(N^2).
 * 
 * Auxiliary Space: O(1) as the only extra memory used is for temporary
 * variables while swapping two values in Array.
 * The selection sort never makes more that O(N) swaps and can be useful when
 * memeory writing is costly.
 */

///////////////////////////////////
// Advantages of Selection Sort Algorithm:
/*
 * 1. Simple and easy to understand.
 * 2. Works well with small datasets.
 */

/////////////////////////////////
// Disadvantages of the Selection Sort Algorithm:
/*
 * 1. Selection sort has a time complexity of O(N^2) in the worst and average
 * case.
 * 2. Does not work well on large datasets.
 * 3. Does not preserve the relative order of items with equal keys which means
 * it is not stable.
 */

///////////////////////////////////////////////////////////
// FAQs:
/*
 * Q1. Is Selection Sort algorithm stable?
 * The default implementation of the Selection Sort algorithm is not stable.
 * However, it can be made stable.
 * 
 * Q2. Is Selection Sort algorithm in-place?
 * Yes, Selection Sort algorithm is an in-place algorithm, as it does not
 * require extra space.
 */