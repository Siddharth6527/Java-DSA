
// Two Pointers
// Navie Approach using Loops
// import java.io.*;

// class Main {
// public static void main(String[] args) {
// int arr[] = { 2, 3, 5, 8, 9, 10, 11 };

// int val = 17;

// System.out.println(isPairSum(arr, arr.length, val));
// }

// private static int isPairSum(int A[], int N, int X) {
// // nested for loopos for iteratons
// for (int i = 0; i < N; i++) {
// for (int j = i + 1; j < N; j++) {
// if (i == j) {
// continue;
// }

// if (A[i] + A[j] == X) {
// return 1;
// }

// if (A[i] + A[j] > X) {
// break;
// }

// }
// }

// return 0;

// }
// }

//////////////////////////////////////////////////////////
// Using Two Pointers
// import java.util.Arrays;
// import java.util.List;

// public class Main {
// // Two pointer technique based solution to find
// // if there is a pair in A[0..N-1] with a given sum.
// public static int isPairSum(List<Integer> A, int N,
// int X) {
// // represents first pointer
// int i = 0;

// // represents second pointer
// int j = N - 1;

// while (i < j) {
// // If we find a pair
// if (A.get(i) + A.get(j) == X)
// return 1;

// // If sum of elements at current
// // pointers is less, we move towards
// // higher values by doing i++
// else if (A.get(i) + A.get(j) < X)
// i++;

// // If sum of elements at current
// // pointers is more, we move towards
// // lower values by doing j--
// else
// j--;
// }
// return 0;
// }

// // Driver code
// public static void main(String[] args) {
// // array declaration
// List<Integer> arr = Arrays.asList(2, 3, 5, 8, 9, 10, 11);

// // value to search
// int val = 17;

// // size of the array
// int arrSize = arr.size();

// // array should be sorted before using the
// // two-pointer technique
// arr.sort(null);

// // Function call
// System.out.println(isPairSum(arr, arrSize, val) != 0);
// }
// }

// Time Complexity: O(n log n) (As sort function is used).
// Auxiliary Space: O(1), since no extra space has been taken.
//////////////////////////////////////////////////////////////////

// class Main {
// // ar1[0...m-1] and ar2[0...n-1] are two given sorted
// // arrays/ and x is given number. This function prints
// // the pair from both arrays such that the sum of the
// // pair is closest to x.
// void printClosest(int ar1[], int ar2[], int m, int n, int x) {
// // Initialze the diff between pair sum and x.
// int diff = Integer.MAX_VALUE;

// // res_l and res_r are result indexes from ar1[] and ar2[]
// // repectively
// int res_l = 0, res_r = 0;

// // Start from left side of ar1[] and right side of ar2[]
// int l = 0, r = n - 1;
// while (l < m && r >= 0) {
// // if this pair is closer to x then the previously
// // found closest, the update res_l, res_r and diff.
// if (Math.abs(ar1[l] + ar2[r] - x) < diff) {
// res_l = l;
// res_r = r;
// diff = Math.abs(ar1[l] + ar2[r] - x);
// }

// // if sum of this pair is more than x, move to
// // smaller side
// if (ar1[l] + ar2[r] > x) {
// r--;
// } else { // move to the greater side
// l++;
// }
// }

// // print the result
// System.out.println("The closest pair is [" + ar1[res_l] + " , " + ar2[res_r]
// + " ] ");
// }

// public static void main(String[] args) {
// Main ob = new Main();
// int ar1[] = { 1, 4, 5, 7 };
// int ar2[] = { 10, 20, 30, 40 };
// int m = ar1.length;
// int n = ar2.length;
// int x = 38;
// ob.printClosest(ar1, ar2, m, n, x);
// }
// }

// Time Complexity: O(n)
// Space Complexity: O(1)

// Another Approach using Binary Search in its folder