
// Soring 2D Array accoding a column values
// import java.util.*;
// import java.util.*;

// class Main {

// public static void sortByColumn(int arr[][], int col) {
// // using built-in sort function Arrays.sort with lambda expression
// Arrays.sort(arr, (a, b) -> Integer.compare(a[col], b[col]));
// }

// public static void main(String[] args) {
// int matrix[][] = { { 39, 27, 11, 42 },
// { 10, 93, 91, 90 },
// { 54, 78, 56, 89 },
// { 24, 64, 20, 65 } };

// int col = 3;
// sortByColumn(matrix, col - 1);
// for (int i = 0; i < matrix.length; i++) {

// for (int j = 0; j < matrix[i].length; j++)
// System.out.print(matrix[i][j] + " ");
// System.out.println();

// }

// }
// }

////////////////////////////////////////////////////////////
// Bits manipulation (Important tactics)
// find the missing number
// class Main {
// // function to find missing number
// static int getMissingNo(int a[], int n) {
// int x1 = a[0];
// int x2 = 1;

// // for xor of all the elements in array
// for (int i = 1; i < n; i++) {
// x1 = x1 ^ a[i];
// }

// // for xor of all the elements from 1 to n+1
// for (int i = 2; i <= n + 1; i++) {
// x2 = x2 ^ i;
// }

// return (x1 ^ x2);
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 5 };
// int N = arr.length;

// // function call
// int miss = getMissingNo(arr, N);
// System.out.println(miss);
// }
// }

////////////////////////////////////////////////////////
// Swap to numbers without using temporary vairable
// Using Bitwise XOR
// import java.io.*;

// class Main {
// public static void main(String a[]) {
// int x = 10;
// int y = 5;

// // code to swap x (1010) and y (0101)
// x = x ^ y;
// y = x ^ y;
// x = x ^ y;

// System.out.println("After swap: x = " + x + " , y = " + y);
// }
// }

//////////////////////////////////////////////////////
// Iterative Binary Search
// import java.io.*;

// class Main {
// // Returns index of x if it is present in arr[]
// int binarySearch(int arr[], int x) {
// int l = 0, r = arr.length - 1;
// while (l <= r) {
// int m = l + (r - l) / 2;

// // check if x is present at mid
// if (arr[m] == x) {
// return m;
// }

// // if x greater, igonre left half
// if (arr[m] < x) {
// l = m + 1;
// }

// // if x is smaller, ignore right half
// else {
// r = m - 1;
// }
// }

// // if we reach here, then elemetn was not present
// return -1;
// }

// // driver code
// public static void main(String[] args) {
// Main ob = new Main();
// int arr[] = { 2, 3, 4, 8, 10, 40 };
// int n = arr.length;
// int x = 10;
// int result = ob.binarySearch(arr, x);
// if (result == -1) {
// System.out.println("Element is not present in array");
// } else {
// System.out.println("Element is presnt at index " + result);
// }

// }
// }

// Time Complexity: O(log N)
// Auxiliary Space: O(1)

/////////////////////////////////////////////////////////////
// 2. Recursive Binary Search Algorithm:

// class Main {
// // returns index of x if it is present in arrr[l...r],
// // else return -1
// int binarySearch(int arr[], int l, int r, int x) {
// if (r >= l) {
// int mid = l + (r - l) / 2;

// // If the element is present at the
// // middle itself
// if (arr[mid] == x)
// return mid;

// // If element is smaller than mid, then
// // it can only be present in left subarray
// if (arr[mid] > x)
// return binarySearch(arr, l, mid - 1, x);

// // Else the element can only be present
// // in right subarray
// return binarySearch(arr, mid + 1, r, x);
// }

// // We reach here when element is not present
// // in array
// return -1;
// }

// // driver code
// public static void main(String[] args) {
// Main ob = new Main();
// int arr[] = { 2, 3, 4, 10, 40 };
// int n = arr.length;
// int x = 2;
// int result = ob.binarySearch(arr, x, n - 1, x);

// if (result == -1) {
// System.out.println("Element is not present in array");
// } else {
// System.out.println("Element is present at index " + result);
// }
// }
// }

// Compexity Analysis of Binary Search:
/*
 * Time Complexity:
 * -Best Case: O(1)
 * -Average Case: O(log N)
 * -Worst Case: O(log N)
 * 
 * Auxiliary Space: O(1), if the recursive call stack is considered then the
 * auxiliary space will be O(log N).
 * 
 */

///////////////////////////////////////////////////////////////
// Decimal to binary conversion
// class Main {
//   static void decToBinary(int n) {
//     int[] binaryNum = new int[32];

//     // counter for binary array
//     int i = 0;
//     while (n > 0) {
//       // storing remainder in binary array
//       binaryNum[i] = n % 2;
//       n = n / 2;
//       i++;
//     }

//     // printing binar array in reverse order
//     for (int j = i - 1; j >= 0; j--) {
//       System.out.print(binaryNum[j]);
//     }
//   }

//   public static void main(String[] args) {
//     int n = 27;
//     decToBinary(n);
//   }
// }

// Time complexity: O(log n) & Auxiliary Space: O(1)
// We can use bitwise operatos to do the above job.
// Note: that bitwise operators work faster that arithmetic operators used
// above.

