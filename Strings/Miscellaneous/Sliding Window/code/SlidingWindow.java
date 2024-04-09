// Java code for 
// O(N) solution for finding
// maximum sum of a subarray
// of size k

class SlidingWindow {
  // returns maximum sum in
  // a subarray of size k.
  static int maxSum(int arr[], int n, int k) {
    // n must be greater
    if (n < k) {
      System.out.println("INVALID");
      return -1;
    }

    // compute sum of first window of size k
    int max_sum = 0;
    for (int i = 0; i < k; i++) {
      max_sum += arr[i];
    }

    // compute the sum of remaining windows by
    // removing first element of previous
    // window and adding last element of
    // current window.
    int window_sum = max_sum;
    for (int i = k; i < n; i++) {
      window_sum += arr[i] - arr[i - k];
      max_sum = Math.max(max_sum, window_sum);
    }
    return max_sum;
  }

  // driver code
  public static void main(String[] args) {
    int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
    int k = 4;
    int n = arr.length;
    System.out.println(maxSum(arr, n, k));
  }
}
