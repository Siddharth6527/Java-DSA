
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

///////////////////
// Positon of rightmost set bit
// using 2's complement
