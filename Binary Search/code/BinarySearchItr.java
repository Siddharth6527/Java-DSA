// import java.util.*;

public class BinarySearchItr {
  int binarySearch(int arr[], int l, int r, int x) {
    while (l <= r) {
      int mid = (l + r) / 2;

      // if the element is present at the
      // middle itself
      if (arr[mid] == x) {
        return mid;
      }

      // if element is smaller than mid, then
      // it can only be present in left subarray
      // so we decrease our r pointer to mid-1
      else if (arr[mid] > x) {
        r = mid - 1;
      }

      // Else the element can only be present
      // in right subarray
      // so we increase our 1 pointer to mid+1
      else {
        l = mid + 1;
      }

    }

    // We reach here when element is not present
    // in array
    return -1;
  }

  public static void main(String[] args) {
    BinarySearchItr ob = new BinarySearchItr();

    int arr[] = { 2, 3, 4, 10, 40 };
    int n = arr.length;

    int x = 10;

    int result = ob.binarySearch(arr, 0, n - 1, x);

    if (result == -1) {
      System.out.println("Element not present");
    } else {
      System.out.println("Element found at index " + result);
    }
  }
}
