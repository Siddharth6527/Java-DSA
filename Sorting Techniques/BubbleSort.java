// Bubble Sort
/*
 * Bubble sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in the wrong order.
 * 
 * This algorithm is not suitable for large data sets as its average and
 * worst-case time complexity is quite high.
 */

/////////////////
// Bubble Sort Algorithm:
/*
 * 1. Traverse from left and compare adjacent elements and the higher one is
 * placed at right side.
 * 
 * 2. In this way, the largest element is moved to the rightmost end at first.
 * 
 * 3. This process is then continued to find the second largest and place it and
 * so on util the data is sorted.
 */

/*
 * Total number of passes: n-1
 * Total number of comparisons: n*(N-1)/2
 * 
 * It can be optimized by stopping the algorithmn if the inner loop didn't cause
 * any swap.
 */

// Code:

class BubbleSort {
  // an optimized version of Bubble sort
  static void bubbleSort(int arr[], int n) {
    int i, j, temp;
    boolean swapped;
    for (i = 0; i < n - 1; i++) {
      swapped = false;
      for (j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // swap arr[j] and arr[j+1]
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }

      // if no two elements were
      // swapped by inner loop, then break
      if (swapped == false) {
        break;
      }
    }
  }

  // Function to print an array
  static void printArray(int arr[], int size) {
    int i;
    for (i = 0; i < size; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // driver program
  public static void main(String args[]) {
    int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
    int n = arr.length;
    bubbleSort(arr, n);
    System.out.println("Sorted array: ");
    printArray(arr, n);
  }
}

/*
 * Compleixty Analysis of Bubble Sort:
 * Time Complexity: O(N^2)
 * Auxiliary Space: O(1)
 */

///////////////////////////////////
// Advantages of Bubble Sort
/*
 * 1. Bubble sort is easy to understand and implement.
 * 2. It does not require any additional memery space.
 * 3. It is a stable sorting algorithm, meaning that elements with the same key
 * value maintain their relative order in the sorted output.
 */

/////////////////////////////////////
// Disadvantages of Bubble Sort:
/*
 * 1. Bubble sort has a time complexity of O(N^2) which makes it very slow for
 * large data sets.
 * 
 * 2. Bubble sort is a comparison-based sorting algorithm, which means that it
 * requries a comparsion operator to determine the relative order of elements in
 * the input data set.
 * It can limit the efficiency of the algorithm in certain cases.
 */

//////////////////////////////////////////////////////////////
// FAQs:
/*
 * Q1. What is the Boundary Case for Bubble sort?
 * Bubble sort takes minimum time (order of N) when elements are already sorted.
 * Hence, it is best to check if the array is already sorted or not beforehand,
 * to avoid O(N^2) time complexity.
 */

/*
 * Q2. Does sorting happen in place in Bubble sort?
 * Yes, Bubble sort performs the swapping of adjacent pairs without the use of
 * any major data structure.
 * Hence Bubble sort algorithm is an in-place algorithm.
 */

/*
 * Q3. Is the Bubble sort algorithm stable?
 * Yes, the bubble sort algorithm is stable.
 */

/*
 * Q4. Where is the Bubble sort algorithm used?
 * Due to its simplicity, bubble sort is often used to introduce the concept to
 * sorting algorithm.
 * In computer graphicd, it is popular for its capability to detect a tiny error
 * (like a swap of just two elements) in almost-sorted array and fix it with
 * just linear complexity (2n).
 * 
 * Example:
 * It is used in a polygon fillind algorithm, where bounding lines are sorted by
 * their x coordinate at a specific scan line (a line parallel to x-axis), and
 * with incrementing y their order changes (two elements are swapped) only at
 * intersections of two lines.
 */
