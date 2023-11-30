// Print 1 to n without using loops
/*
 * You are given an integer N.
 * Print numbers from 1 to N without the help of loops.
 */

// class Practice {
// static void printNos(int n) {
// if (n > 0) {
// System.out.print(n + " ");
// printNos(n - 1);
// }
// return;
// }

// public static void main(String[] args) {
// printNos(3);
// }
// }

// Time Complexity: O(N)
// Auxiliary Space: O(N)

/////////////////////////////////////////////////////////////////
// Mean of Array using recursion
/*
 * To find the mean of the elements of the array.
 * 
 * Mean = (Sum of elements of the Array) / (Totoal no of elemnts in Array)
 *
 */

/*
 * To find the mean using recusion assume that the problem is already solved for
 * N-1,i.e. you have to find for n.
 * 
 * Sum of first N-1 elements = (Mean of N-1 elements)*(N-1)
 * 
 * Mean of N elements = (Sum of first N-1 elements + N-th element) / (N)
 * 
 * Note: Since array indexing starts from 0, we access N-th element using
 * A[N-1].
 */

// class Practice {
// // function to find Mean
// static float findMean(int A[], int N) {
// if (N == 1) {
// return (float) A[N - 1];
// } else {
// return ((float) (findMean(A, N - 1) * (N - 1) + A[N - 1]) / N);
// }
// }

// // main function
// public static void main(String[] args) {
// float Mean = 0;
// int A[] = { 1, 2, 3, 4, 5 };
// int N = A.length;
// System.out.println(findMean(A, N));
// }
// }

// Time Conplexity: O(N)
// Auxiliary Space: O(N)

//////////////////////////////////////////////////////////////
// Sum of natural numbers using recursion
/*
 * Given a number n, find sum of first n natural numbers.
 * 
 */
// class Practice {
// public static int recurSum(int n) {
// if (n <= 1) {
// return n;
// }
// return n + recurSum(n - 1);
// }

// public static void main(String args[]) {
// int n = 5;
// System.out.println(recurSum(n));
// }
// }

// Time Complexity: O(N)
// Auxiliary Space: O(N)

// iterative approach is the best approach because it takes constant or O(1)
// auxiliary space and the time complexity will be same O(N).

////////////////////////////////////////////////////////////////
// Decimal to binary number using recursion
/*
 * Given a decimal number as input, we need to write a program to convert the
 * given decimal number into an equivalent binary number.
 */

// class Practice {
// static int find(int decimal_number) {
// if (decimal_number == 0) {
// return 0;
// } else {
// return (decimal_number % 2 + 10 * find(decimal_number / 2));
// }
// }

// public static void main(String[] args) {
// int decimal_number = 10;
// System.out.println(find(decimal_number));
// }
// }

/////////////////////////////////////////////////////////////
// Sum of array elements using recursion
// class Practice {
// static int arr[] = { 1, 2, 3, 4, 5 };

// public static int findSum(int[] A, int N) {
// if (N <= 0) {
// return 0;
// }

// return (findSum(A, N - 1) + A[N - 1]);
// }

// public static void main(String[] args) {
// System.out.println(findSum(arr, arr.length));

// }
// }
// O(N)
// O(N)

///////////////////////////////////////////////////////////
// Print reverse of a String
// class Practice {
// static void reverse(String str) {
// if (str == "") {
// return;
// } else {
// System.out.print(str.charAt(str.length() - 1));
// reverse(str.substring(0, str.length() - 1));
// }
// }

// public static void main(String[] args) {
// String str = "Geeks for Geeks";
// reverse(str);
// }
// }
