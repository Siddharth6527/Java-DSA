// QuickSort
/*
 * QuickSort is a sorting algorithm based on the Divide and Conquer algorithm
 * that picks an element as pivot and partitions the given array around the
 * picked pivot by placing the pivot in its correct position in the sorted
 * array.
 */

/*
 * The key process in quickSort is a partition().
 * The target of partitions is to place the pivot (any element can be chosen to
 * a pivot) at its correct position in the sorted array and put all smaller
 * elements to the left of the pivot, and all greater elements to the right of
 * the pivot.
 * 
 * Partition is done recusively on each side of the pivot after the pivot is
 * placed in its correct position and this finally sorts the array.
 */

//////////////////
// Choice of Pivot:
/*
 * There are many different choices for picking pivots:
 * 1. Always pick the first element as a pivot.
 * 2. Always pick the last element as a pivot.
 * 3. Pick a random element as pivot.
 * 4. Pick the middle as the pivot.
 */

///////////////
// Parition Algorithm:
/*
 * The logic is simple, we start from the leftmost element and keep track of the
 * index of smaller (or equal) elements as i.
 * 
 * While traversing, if we find a smaller element, we swap the current element
 * with arr[i].
 * 
 * Otherwise, we ignore the current element.
 */

/*
 * As the partition process is done recursively, it keeps on putting the pivot
 * in its actual position in the sorted array.
 * Repeatedly putting pivots in their actual position makes the array sorted.
 */

// Code:
// import java.io.*;

class QuickSort {

  // A utility function to swap two elements
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // This function takes last element as pivot,
  // places the pivot element at its correct position
  // in sorted array, and places all smaller to left
  // of pivot and all greater elements to right of pivot
  static int partition(int[] arr, int low, int high) {
    // Choosing the pivot
    int pivot = arr[high];

    // Index of smaller element and indicates
    // the right position of pivot found so far
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {

      // If current element is smaller than the pivot
      if (arr[j] < pivot) {

        // Increment index of smaller element
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return (i + 1);
  }

  // The main function that implements QuickSort
  // arr[] --> Array to be sorted,
  // low --> Starting index,
  // high --> Ending index
  static void quickSort(int[] arr, int low, int high) {
    if (low < high) {

      // pi is partitioning index, arr[p]
      // is now at right place
      int pi = partition(arr, low, high);

      // Separately sort elements before
      // partition and after partition
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  // To print sorted array
  public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // Driver Code
  public static void main(String[] args) {
    int[] arr = { 10, 7, 8, 9, 1, 5 };
    int N = arr.length;

    // Function call
    quickSort(arr, 0, N - 1);
    System.out.println("Sorted array:");
    printArr(arr);
  }
}

///////////////////////////////////////
// Time Complexity:
/*
 * 1. Best Case: Omega(N log(N))
 * The best-case scenario for quicksort occur when the pivot chosen at each step
 * divides the array into roughly equal halves.
 * 
 * In this case, the algorithm will make balanced partiotions, leading to
 * efficient Sorting.
 * 
 * 2. Average Caes: Theta(N log(N))
 * Quicksort's average-case performenace is usually very good in practice,
 * making it one of the fastest sorting algorithm.
 * 
 * 3. Worst Case: O(N^2)
 * The worst-case Scenario for Quicksort occur when the pivot at each step
 * consistenly results in highly unbalanced paritions.
 * When the array is already sorted and the pivot is always chosen as the
 * smallest or largest element.
 * 
 * To mitigate the worst-case Scenario, various techniques are used such as
 * choosing a good pivot (eg. median of three) and using Randomized algorithm
 * (Randomized Quicksort) to shuffle the element before sorting.
 * 
 * Auxiliary Space: O(1), if we don't consider the recursive stack space.
 * If we consider the recursive stack space then, in the worst case quicksort
 * could make O(N).
 */

///////////////////////////////////
// Advantages of Quick Sort:
/*
 * 1. It is a divide-and-conquer algorithm that makes it easir to solve
 * problems.
 * 2. It is efficient on large data sets.
 * 3. It has a low overhead, as it only requires a small amount of memeory to
 * function.
 */

//////////////////////////////////
// Disadvantages of QuickSort:
/*
 * 1. It has a worst-case time compleixty of O(N^2), which occurs when the
 * pivot is
 * chosen poorly.
 * 
 * 2. It is not good for small data sets.
 * 3. It is not stable sort, meaning that if two elements have the same key,
 * their relative order will not be preserved in the sorted output in case of
 * quick sort, because here we are swapping elements according to the pivot's
 * position (without considering their original positions).
 */