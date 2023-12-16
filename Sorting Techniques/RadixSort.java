////////////////
// Radix Sort:
/*
 * Radix Sort is a linear sorting algorithm that sorts elements by processing
 * them digit by digit.
 * 
 * It is efficient sorting algorithm for integers or strings with fixed-size
 * keys.
 */

/*
 * Rather than comparing elements directly, Radix Sort distributes the elements
 * into buckets based on each digit's value.
 * 
 * By repeatedly sorting the elements by significant digits, from the least
 * significant to the most significant, Radix Sort achieves the final sorted
 * order.
 */

/////////////////////
// Radix Sort Algorithm:
/*
 * The key idea behind Radix Sort is to exploit the concept of place value.
 * It assums that sorting numbers digit by digit will eventually result in a
 * fully sorted list.
 * 
 * Sort cam be performed by using different variations, such as Least
 * Significant Digit(LSD) Radix Sort or Most Significant Digit(MSD) Radix Sort.
 */

/*
 * Algorithm:
 * Step 1: Find the largest element in the array.
 * For example, it has three digits, so we will iterate three times, once for
 * each significant place.
 * 
 * Step 2: Sort the elements based on the unit place digits (X=0). We use a
 * stable sorting technique, such as counting sort, to sort the digits at each
 * significant place.
 * 
 * Step 3: Sort the elements based on the tens place digits.
 * 
 * Step 4: Sorting the elements based on the hundreds place digits.
 * 
 * Step 5: The array is now sorted in ascending order.
 */

import java.util.*;

class RadixSort {
  // a function to get the maximum value in arr
  static int getMax(int arr[], int n) {
    int mx = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > mx) {
        mx = arr[i];
      }
    }
    return mx;
  }

  // a function to do counting sort fo arr[] according to
  // the digit represented by exp.
  static void countSort(int arr[], int n, int exp) {
    int output[] = new int[n]; // output array
    int i;
    int count[] = new int[10];
    Arrays.fill(count, 0);

    // store count of occurences in count[]
    for (i = 0; i < n; i++) {
      count[(arr[i] / exp) % 10]++;
    }

    // change count[i] so that counot[i] now contains
    // acutal position of this digit in output
    for (i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }

    // build the output array
    for (i = n - 1; i >= 0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }

    // copy the output array to arr[], so that arr[] now
    // contains sorted numbers according to current digit
    for (i = 0; i < n; i++) {
      arr[i] = output[i];
    }
  }

  // the main function to that sorts arr[] of
  // size n using Radix Sort
  static void radixsort(int arr[], int n) {
    // find the maximym number to know number of digit
    int m = getMax(arr, n);

    // do counting sort for every digit. Note
    // that instead of passing digit digit number, exp
    // is passed. exp is 10^i where i is current digit number
    for (int exp = 1; m / exp > 0; exp *= 10) {
      countSort(arr, n, exp);
    }
  }

  // function to print an array
  static void print(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // driver method
  public static void main(String[] args) {
    int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
    int n = arr.length;

    // Function Call
    radixsort(arr, n);
    print(arr, n);

  }
}

/*
 * Time Complexity of Radix Sort:
 * 1. Radix sort is a non-comparable integer sorting algorithm that sorts data
 * with integer keys by grouping the keys by teh individual digits which share
 * the same significant position and value.
 * It has a time complexity of O(d * (n+b)), where d is the number of digits, n
 * is the number of elements, and b is the base of the number system being used.
 * 
 * 2. In practical implementations, radix sort is often faster than other
 * comparison-based sorting algorithm, such as quicksort or merge sort, for
 * large datasets, espically when the keys have many digits.
 * However, its time complexity grows linearly with the number of digits, and so
 * it is not as efficient for small datasets.
 * 
 */

/*
 * Auxiliary Space:
 * 1. Radix sort also has a space complexity of O(n + b), where n is the number
 * of elements and b is the base of the number system.
 * This space complexity comes from the need to create buckets for each digit
 * value and to copy the elements back to the original array after each digit
 * has been sorted.
 */

/////////////////////
// FAQs:
/*
 * Q1. Is Radix sort preferable to comparison basec sorting algorithms like
 * quick sort?
 * If we have log2 n bits for every digit, the running time of radix appears to
 * be better than Quick sort for a wide range of input numbers.
 * 
 * The constant factors hidden in asymtotic notations are higher for Radix Sort
 * and Quick-Sort uses hardware caches more effectively.
 * 
 * Also, Radix sort uses counting sort as a subroutine and counting sort takes
 * extra sapce to sort numbers.
 */

/*
 * Q2. What if the elements are in the range from 1 to n^2?
 * 1. The lower bound for the Comparison based sorting algorithm (Merge Sor,
 * Heap Sort, Quick Sort,.. etc) is omega(nLogn), i.e. they cannot do better
 * than nLogn.
 * 
 * Counting sort is a linear time sorting algorithm that sort in O(n+k) time
 * when elements are in the range from 1 to k.
 * 
 * 2. We can't use counting sort because counting sort will take O(n^2) which is
 * worse than comparison-based sorting algorithms.
 * 
 * Can we sort such an array in linear time?
 * Radix Sort is the answer.
 * The idea of Radix Sort is to digit-by-digit sorting starting from the least
 * significant digit to the most significant digit.
 * Radix sort uses counting sort as a subroutine to sort.
 */
