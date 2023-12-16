/////////////////
// Counting Sort:
/*
 * Counting Sort is a non-comparison-based sorting algorithm that works well
 * when there is limited range of input values.
 * It is particularly efficient when the range of input values is small compared
 * to the number of elements to be sorted.
 * The basic idea behind Counting Sort is to count the frequency of each
 * distinct element in the input array and use that information to place the
 * elements in their correct sorted positions.
 */

/*
 * Algorithm:
 * 1. Declare an auxiliary array countArray[] of size max(inputArray[]+1) and
 * initialize it with 0.
 * 
 * 2. Traverse array inputArray[] and map each element of inputArray[] as an
 * index of countArray[] array, i.e., execute.
 * countArray[inputArray[i]]++ for 0<=i<N
 * 
 * 3. Calculate the prefix sum at every index of array inputArray[].
 * 
 * 4. Create an array outputArray[] of size N.
 * 
 * 5. Traverse array inputArray[] from end and update
 * outputArray[countArray[inputArray[i]]-1]= inputArray[i].
 * Also, update countArray[inputArray[i]] = countArray[inputArray[i]]--
 */

// code:
import java.util.Arrays;

public class CountSort {
  public static int[] countSort(int[] inputArray) {
    int N = inputArray.length;
    int M = 0;

    // find max val
    for (int i = 0; i < N; i++) {
      M = Math.max(M, inputArray[i]);
    }

    // create count array
    int[] countArray = new int[M + 1];

    // tracking frequency
    for (int i = 0; i < N; i++) {
      countArray[inputArray[i]]++;
    }

    for (int i = 1; i <= M; i++) {
      countArray[i] += countArray[i - 1];
    }

    int[] outputArray = new int[N];

    for (int i = N - 1; i >= 0; i--) {
      outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
      countArray[inputArray[i]]--;
    }

    return outputArray;
  }

  public static void main(String[] args) {
    int[] inputArray = { 4, 3, 12, 1, 5, 5, 3, 9 };
    int[] outputArray = countSort(inputArray);

    for (int i = 0; i < inputArray.length; i++) {
      System.out.print(outputArray[i] + " ");
    }
  }

}

/*
 * Complexity Analysis of Counting Sort:
 * 1. Time Complexity: O(N+M), where N and M are the size of inputArray[] and
 * countArray[] respectively.
 * Worst Case: O(N+M)
 * Average Case: O(N+M)
 * Best-Case: O(N+M)
 * 
 * 2. Auxiliary Space: O(N+M), where N and M are the space taken by
 * outputArray[] and countArray[] respectively.
 */

///////////////////////////////////
// Advantage Of Counting Sort:
/*
 * 1. Counting sort generally performs faster than all comparison-based soring
 * algorithms, such as merge sort and quicksort, if the range of input is of
 * order of the number of input.
 * 
 * 2. Counting sort is easy to code.
 * 
 * 3. Counting sort is a stable algorithm.
 */

/////////////////////////////////////
// Disadvantages of Counting Sort:
/*
 * 1. Counting sort doesn't work on decimal values.
 * 2. Counting sort is inefficient if the range of values to be sorted is very
 * large.
 * 3. Counting sort in not an In-place sorting alorithm, It uses extra space for
 * sorting the array elements.
 */