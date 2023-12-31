public class Main {

  // funtion to perform binary search on array ar2[] for
  // the closest element to x
  public static int binarySearch(int ar2[], int left, int right, int x) {
    if (left > right) {
      return left - 1;
    }
    int mid = (left + right) / 2;

    if (ar2[mid] == x) {
      return mid;
    } else if (ar2[mid] > x) {
      return binarySearch(ar2, left, mid - 1, x);
    } else {
      return binarySearch(ar2, mid + 1, right, x);
    }
  }

  // ar1[0...m-1] and ar2[0...n-1] are two sorted arrays
  // and x is given number. This function prints the pair from
  // both arrays such that the sum of the pair is closest to x.
  public static void printClosest(int ar1[], int ar2[], int m, int n, int x) {
    // initialize the diff between pair sum and x.
    int diff = Integer.MAX_VALUE;

    // res_l and res_r are result indexes from ar1[] and ar2[]
    // respectively
    int res_l = 0, res_r = 0;

    // start from left side of ar1[] and right side of ar2[]
    int l = 0, r = n - 1;
    while (l < m && r >= 0) {
      // if this pair is closert to x than the previously
      // found closest, then update res_l, res_r and diff
      if (Math.abs(ar1[l] + ar2[r] - x) < diff) {
        res_l = l;
        res_r = r;
        diff = Math.abs(ar1[l] + ar2[r] - x);
      }

      // if sum of this pair is more than x, move to smaller side
      if (ar1[l] + ar2[r] > x) {
        r--;
      } else { // move to greater side
        l++;
      }

    }

    // print the result
    System.out.println("The closest pair is [" + ar1[res_l] + ", " + ar2[res_r] +
        "]");
  }

  public static void main(String[] args) {
    int ar1[] = { 1, 4, 5, 7 };
    int ar2[] = { 10, 20, 30, 40 };
    int m = ar1.length;
    int n = ar2.length;
    int x = 38;

    // perform binart search on ar2[] for the element closest
    // to x-ar1[i]
    for (int i = 0; i < m; i++) {
      int index = binarySearch(ar2, 0, n - 1, x - ar1[i]);

      // check if the element closest to x-ar1[i] is better
      // than the current best
      if (index >= 0 && index < n && Math.abs(ar1[i] + ar2[index] - x) < Math.abs(ar1[i] + ar2[index - 1] - x)) {
        printClosest(ar1, ar2, m, n, x);
        return;
      } else if (index > 0 && Math.abs(ar1[i] + ar2[index - 1] - x) < Math.abs(ar1[i] + ar2[index] - x)) {
        index--;
      }

    }

  }

}
