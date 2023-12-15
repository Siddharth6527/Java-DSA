//////////////////////
// Merge Sort
/*
 * Merge sort is defined as a sorting algorithm that works by dividing an array
 * into smaller subarrays, sorting each subarray, and then merging the sorted
 * subarrrays back together to form the final sorted array.
 */

/*
 * In simple terms, we can say that the process of merge sort is to divide the
 * array into two halves, sort each half, and then merge the sorted halves back
 * together.
 * This process is repeated until the entire array is sorted.
 */

/*
 * How does Merge Sort work?
 * Merge sort is a recursive algorithm that continuously splits the array in
 * half until it cannot be further divided i.e., the array has only one element
 * left (an array with one element is always sorted.)
 * Then the sorted subarray are merged into one sorted array.
 */

// Code:
class MergeSort {

  // Merges two subarrays of arr[]
  // first subarray is arr[l..m]
  // second subarray is arr[m+1...r
  void merge(int arr[], int l, int m, int r) {
    // find the size of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    // create temp arrays
    int L[] = new int[n1];
    int R[] = new int[n2];

    // copy data to temp arrays
    for (int i = 0; i < n1; ++i) {
      L[i] = arr[l + i];
    }

    for (int j = 0; j < n2; ++j) {
      R[j] = arr[m + 1 + j];
    }

    // merge the temp arrays

    // intial indices of first and second subarrays
    int i = 0, j = 0;

    // initial index of merged subarray
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    // copy remaining elements of L[] if any
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    // copy remaining elements of R[] if any
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  // main function that sorts arr[l..r] using
  // merge()
  void sort(int arr[], int l, int r) {
    if (l < r) {
      // find the middle point
      int m = l + (r - l) / 2;

      // sort first and second halves
      sort(arr, l, m);
      sort(arr, m + 1, r);

      // merge the sorted halves
      merge(arr, l, m, r);
    }
  }

  // A utility function to print array of size n
  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // Driver code
  public static void main(String args[]) {
    int arr[] = { 12, 11, 13, 5, 6, 7 };

    System.out.println("Given array is");
    printArray(arr);

    MergeSort ob = new MergeSort();
    ob.sort(arr, 0, arr.length - 1);

    System.out.println("\nSorted array is");
    printArray(arr);
  }

}

/*
 * Compleixy Analysis of Merge Sort:
 * Time Complexity: O(N log(N)), merge sort is a recursive algorithm and time
 * complexity can be expressed as following recurrence relation:
 * 
 * T(n) = 2T(n/2) + theta(n).
 * 
 * The above recurrence can be solved either using Recurrence Tree method or the
 * Masater method.
 * 
 * If falls in case II of the Master Method and the solution of the recurrence
 * is O(N log(N)).
 * 
 * The time complexity of Merge Sort is O(nlogn) in all 3 cases (worst, average,
 * and best) as merge sort always divides the array into two halves and takes
 * linear time to merge two halves.
 * 
 * Auxiliary Space: O(N), In merge sort all elements are copied into an
 * auxiliary array.
 * So N auxiliary space is required for merge sort.
 * 
 */

//////////////////////////////////////
// Applications:
/*
 * 1. Sorting large datasets:
 * Merge sort is particularly well-suited for sorting large datasets due to its
 * gauranteed worst-case time complexity of O(n log n).
 * 
 * 2. External sorting:
 * Merge sort is commonly used in external sorting,
 * wehere the data to be sorted is too large to fit into memory.
 * 
 * 3. Custom sorting: Merge sort can be adapted to handle different input
 * distributions, such as partially sorted, nealy sorted, or completely unsorted
 * data.
 * 
 * 4. Inversion Count Problem.
 */

///////////////////////////////////
// Advantages of Merge Sort:
/*
 * 1. Stability: Merge sort is a stable sorting algorithm, which means it
 * maintains the relative order fo equal elements in the input array.
 * 
 * 2. Guaranteed worst-case performance: Merge sort has a worst-case time
 * complexitty of O(n logn), which means it performs well even on large
 * datasets.
 * 
 * 3. Parallelizable: Merge sort is a natual parallelizable algothim, which
 * means it can be easily parallelixzed to take advantage of multiple processors
 * or threads.
 */

/////////////////////////////
// Drawbacks of Merge Sort:
/*
 * 1. Space Complexity: Merges sort requires additional memory to store the
 * merges
 * sub-arrays during the sorting process.
 * 
 * 2. Not in-place: Merge sort is not an in-place sorting algorithm, which means
 * it requires additional memeory to store the sorted data.
 * This can be a disadvangte in applications where memory usage is a concern.
 * 
 * 3. Not always optimal for small datasets: For small datasets, merge sort has
 * a higher time complexity than some other sorting alorithms, such as insertion
 * sort.
 * This can result in slower performance for very small datasets.
 */