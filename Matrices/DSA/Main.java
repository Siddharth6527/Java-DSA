// How to print the elements of a Matrix or Grid:
// import java.io.*;

// class Main {
// public static void main(String[] args) {
// int[][] arr = { { 1, 2, 3, 4 },
// { 5, 6, 7, 8 },
// { 9, 10, 11, 12 } };

// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 4; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

//////////////////////////////////////////////////////
// Searching an element in matrix
// Brute Forace and Easy way to do it.
// import java.util.HashMap;
// import java.util.Map;

// class Main {
// public static void main(String[] args) {
// int n = 4; // no of rows
// int m = 5; // no of columns

// int[][] a = { { 0, 6, 8, 9, 11 },
// { 20, 22, 28, 29, 31 },
// { 36, 38, 50, 61, 63 },
// { 64, 66, 100, 122, 128 } };

// int k = 31;

// // Building the map
// Map<Integer, int[]> mp = new HashMap<>();
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// if (a[i][j] == k) {
// System.out.println("Found at (" + i + "," + j + ")");
// }
// mp.put(a[i][j], new int[] { i, j });
// }
// }

// // checking if coordinate is found
// if (mp.containsKey(k)) {
// System.out.println("This is how we can found using mapping: ");
// int[] indexes = mp.get(k);
// System.out.println("(" + indexes[0] + "," + indexes[1] + ")");
// } else {
// System.out.println("Not Found");
// }

// }
// }

/////////////////////////////////////////////
// Another efficient algorithm of Searching an element in a sorted matrix.
// import java.io.*;

// class Main {
// static int MAX = 100;

// // this function does binary search for x in ith row.
// // it does the search from mat[i][j_low] to mat[i][j_high]
// static void binarySearch(int mat[][], int i, int j_low, int j_high, int x) {
// while (j_low <= j_high) {
// int j_mid = (j_low + j_high) / 2;

// // element found
// if (mat[i][j_mid] == x) {
// System.out.println("Found at (" + i + ", " + j_mid);
// return;
// }

// else if (mat[i][j_mid] > x) {
// j_high = j_mid - 1;
// } else {
// j_low = j_mid + 1;
// }
// }

// // element not found
// System.out.println("Element not found");
// }

// // function to perform binary search on the
// // mid values of row to get the desired pair of rows
// // where the element can be found
// static void sortedMatrixSearch(int mat[][], int n, int m, int x) {
// // single row matrix
// if (n == 1) {
// binarySearch(mat, 0, 0, m - 1, x);
// }

// // do binary search in middle column.
// // conditon to terminate the loop when
// // the 2 desired rows are found.
// int i_low = 0;
// int i_high = n - 1;
// int j_mid = m / 2;

// while ((i_low + 1) < i_high) {
// int i_mid = (i_low + i_high) / 2;

// // element found
// if (mat[i_mid][j_mid] == x) {
// System.out.println("Found at (" + i_mid + ", " + j_mid + ")");
// return;
// } else if (mat[i_mid][j_mid] > x) {
// i_high = i_mid;
// } else {
// i_low = i_mid;
// }

// // if element is present on
// // mid of the two rows
// if (mat[i_low][j_mid] == x)
// System.out.println("Found at (" + i_low + ","
// + j_mid + ")");
// else if (mat[i_low + 1][j_mid] == x)
// System.out.println("Found at (" + (i_low + 1)
// + ", " + j_mid + ")");

// // search element on 1st half of 1st row
// else if (x <= mat[i_low][j_mid - 1])
// binarySearch(mat, i_low, 0, j_mid - 1, x);

// // Search element on 2nd half of 1st row
// else if (x >= mat[i_low][j_mid + 1] &&
// x <= mat[i_low][m - 1])
// binarySearch(mat, i_low, j_mid + 1, m - 1, x);

// // Search element on 1st half of 2nd row
// else if (x <= mat[i_low + 1][j_mid - 1])
// binarySearch(mat, i_low + 1, 0, j_mid - 1, x);

// // search element on 2nd half of 2nd row
// else
// binarySearch(mat, i_low + 1, j_mid + 1, m - 1, x);
// }

// }

// public static void main(String[] args) {
// int n = 4, m = 5, x = 8;
// int mat[][] = { { 0, 6, 8, 9, 11 },
// { 20, 22, 28, 29, 31 },
// { 36, 38, 50, 61, 63 },
// { 64, 66, 100, 122, 128 } };

// sortedMatrixSearch(mat, n, m, x);
// }
// }

///////////////////////////////////////////////////
// Check square matrix
// import java.io.*;

// class Main {
// static int N = 4;

// // function to check matrix
// // is diagonal matrix
// // or not
// static boolean isDiagonalMatrix(int mat[][]) {
// for (int i = 0; i < N; i++) {
// for (int j = 0; j < N; j++) {
// // condition to check
// // other elements
// // except main diagonal
// // are zero or not
// if ((i != j) && (mat[i][j]) != 0) {
// return false;
// }
// }
// }
// return true;
// }

// public static void main(String[] args) {
// int mat[][] = { { 4, 0, 0, 0 },
// { 0, 7, 0, 0 },
// { 0, 0, 5, 0 },
// { 0, 0, 9, 1 } };

// if (isDiagonalMatrix(mat)) {
// System.out.println("Yes");
// } else {
// System.out.println("No");
// }
// }
// }

/////////////////////////////////////////////////////
// Check for scalar matrix
// import java.io.*;

// class Main {
// static int N = 4;

// static boolean isScalarMatrix(int mat[][]) {
// // check all the elements
// // except main diagonal are
// // zero or not.
// for (int i = 0; i < N; i++) {
// for (int j = 0; j < N; j++) {
// if ((i != j) && (mat[i][j] != 0)) {
// return false;
// }
// }
// }

// // check all diagonal elements
// // are same or not
// for (int i = 0; i < N - 1; i++) {
// if (mat[i][i] != mat[i + 1][i + 1]) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// int mat[][] = { { 2, 0, 0, 0 },
// { 0, 2, 0, 0 },
// { 0, 0, 2, 0 },
// { 0, 0, 0, 2 } };

// if (isScalarMatrix(mat))
// System.out.println("Yes");
// else
// System.out.println("No");
// }
// }

///////////////////////////////////////////////////
// Java Program to Compute the Sum of Diagonal of a Matrix
// import java.io.*;

// public class Main {
// static void Sum_of_diagonal(int[][] matrix, int N) {

// }
// }

///////////////////////////////////////////////////////////
// Lower Triangular Matrix
// import java.io.*;

// class Main {
// int N = 4;

// boolean isLowerTriangularMatrix(int mat[][]) {
// for (int i = 0; i < N; i++) {
// for (int j = i + 1; j < N; j++) {
// if (mat[i][j] != 0) {
// return false;
// }
// }
// }
// return true;
// }

// public static void main(String[] args) {
// Main ob = new Main();
// int mat[][] = { { 1, 0, 0, 0 },
// { 1, 4, 0, 0 },
// { 4, 6, 2, 0 },
// { 0, 4, 7, 6 } };

// // function call
// if (ob.isLowerTriangularMatrix(mat)) {
// System.out.println("Yes");
// } else {
// System.out.println("No");
// }
// }
// }

//////////////////////////////////////////////////////
// Converting lower triangular matrix to 1D Array
// import java.util.*;

// class Main {
// static class LTMatrix {
// // size of matrix
// static int n;

// // pointer
// static int A[];

// // stores the count to non-zero elements
// static int tot;

// // constructor
// LTMatrix(int N) {
// n = N;
// tot = N * (N + 1) / 2;
// A = new int[N * (N + 1) / 2];
// }

// void Display(boolean row) {
// for (int i = 0; i < tot; i++) {
// System.out.print(A[i] + " ");
// }
// System.out.println();
// }

// // function to generate array from given matrix by storing elements in row
// major
// // order
// void setRowMajor(int i, int j, int x) {
// if (i >= j) {
// int index = (i * (i - 1)) / 2 + j - 1;
// A[index] = x;
// }
// }

// // function to generate array
// // given matrix by storing elements
// // in column major order
// void setColMajor(int i, int j, int x) {
// if (i >= j) {
// int index = (n * (j - 1) - (((j - 2) * (j - 1)) / 2)) + (i - j);
// A[index] = x;
// }
// }

// // function to find the size of array
// static int getN() {
// return n;
// }
// }

// // function to generate and display
// // array in Row-Major order
// static void displayRowMajor(int N) {
// LTMatrix rm = new LTMatrix(N);

// // generate the array in the
// // row-major form
// rm.setRowMajor(1, 1, 1);
// rm.setRowMajor(2, 1, 2);
// rm.setRowMajor(2, 2, 3);
// rm.setRowMajor(3, 1, 4);
// rm.setRowMajor(3, 2, 5);
// rm.setRowMajor(3, 3, 6);
// rm.setRowMajor(4, 1, 7);
// rm.setRowMajor(4, 2, 8);
// rm.setRowMajor(4, 3, 9);
// rm.setRowMajor(4, 4, 10);

// // display array elements
// // in row-major order
// System.out.println("Row-Wise: ");
// rm.Display(false);
// }

// // Function to generate and display
// // array in Column-Major Order
// static void displayColMajor(int N) {
// LTMatrix cm = new LTMatrix(N);

// // Generate array in
// // column-major form
// cm.setColMajor(1, 1, 1);
// cm.setColMajor(2, 1, 2);
// cm.setColMajor(2, 2, 3);
// cm.setColMajor(3, 1, 4);
// cm.setColMajor(3, 2, 5);
// cm.setColMajor(3, 3, 6);
// cm.setColMajor(4, 1, 7);
// cm.setColMajor(4, 2, 8);
// cm.setColMajor(4, 3, 9);
// cm.setColMajor(4, 4, 10);

// // Display array elements
// // in column-major form
// System.out.println("Column-Wise:");
// cm.Display(false);
// }

// public static void main(String[] args) {

// // Size of row or column
// // of square matrix
// int N = 4;

// // Function Call for row major
// // mapping
// displayRowMajor(N);

// // Function Call for column
// // major mapping
// displayColMajor(N);
// }
// }

///////////////////////////////////////////////////
// Difference in Btw Row-Major vs Col-Major Traversal
// import java.time.Duration;
// import java.time.Instant;
// import java.util.*;

// class Main {
// // taking MAX 10000 so that time difference can be shown
// static int MAX = 10000;

// static int[][] arr = new int[MAX][MAX];

// static void rowMajor() {
// int i, j;

// // accessing element row wise
// for (i = 0; i < MAX; i++) {
// for (j = 0; j < MAX; j++) {
// arr[i][j]++;
// }
// }
// }

// static void colMajor() {
// int i, j;

// // accessing element column wise
// for (i = 0; i < MAX; i++) {
// for (j = 0; j < MAX; j++) {
// arr[j][i]++;
// }
// }
// }

// public static void main(String[] args) {
// // time taken by row majaor order
// Instant start = Instant.now();
// rowMajor();
// Instant end = Instant.now();
// System.out.println("Row major access time: " + Duration.between(start, end));

// // Time taken by column major order
// start = Instant.now();
// colMajor();
// end = Instant.now();
// System.out.println("Column major access time : " + Duration.between(start,
// end));
// }
// }

//////////////////////////////////////////////////////////
// Traverse a Matrix using Recursion

// public class Main {
// // define the dimensions of the matrix
// private static final int N = 3;
// private static final int M = 3;

// // recursive funcion to traverse the matrix
// private static void traverse(int[][] arr, int i, int j) {
// // if the current position is the bottom-right corner of the matrix
// if (i == N - 1 && j == M - 1) {
// // print the value at that position
// System.out.println(arr[i][j]);
// // end the recursion
// return;
// }

// // print the value at the current position
// System.out.println(arr[i][j] + ", ");

// // if the end of the current row has not been reached
// if (j < M - 1) {
// // move right
// traverse(arr, i, j + 1);
// }

// // if the end of the current column has been reached
// else if (i < N - 1) {
// // move down to the next row
// traverse(arr, i + 1, 0);
// }
// }

// public static void main(String[] args) {
// int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

// // start the traversal from the top-left corner of the matrix
// traverse(arr, 0, 0);
// }
// }

//////////////////////////////////////////////////////////////
// Sorting a given matrix in Strict order
// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// // initialize the 2D vector with some values
// List<List<Integer>> v = new ArrayList<>(Arrays.asList(
// new ArrayList<>(Arrays.asList(5, 4, 7)),
// new ArrayList<>(Arrays.asList(1, 3, 8)),
// new ArrayList<>(Arrays.asList(2, 9, 6))));

// int n = v.size();

// List<Integer> x = new ArrayList<>();
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// x.add(v.get(i).get(j));
// }
// }

// // sorting the collection
// Collections.sort(x);

// int k = 0;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// v.get(i).set(j, x.get(k++)); // super imp
// }
// }

// System.out.println("Sorted Matrix will be: ");
// for (List<Integer> row : v) {
// for (int num : row) {
// System.out.print(num + " ");
// }
// System.out.println();
// }

// }
// }

///////////////////////////////////////////////////////////
// Approach 2: Using temp[]
// import java.io.*;
// import java.util.*;

// class Main {
// static int SIZE = 10;

// // function to sort the given matrix
// static void sortMat(int mat[][], int n) {
// // temporary matrix of size n^2
// int temp[]= new int[n*n];
// int k=0;

// // copy the elements of matrix
// // one by one into temp[]
// for(int i=0;i<n;i++){
// for(int j=0j<n;j++){
// temp[k++] = mat[i][j];
// }
// }

// // sort temp[]
// Arrays.sort(temp);

// // copy the elements of temp[]
// // one by one in mat[][]
// k=0;
// for(int i=0;i<n;i++){
// for(int j=0;j<n;j++){
// mat[i][j]=temp[k++];
// }
// }
// }

// static void printMat(int mat[][], int n) {
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++)
// System.out.print(mat[i][j] + " ");
// System.out.println();
// }
// }

// // Driver program to test above
// public static void main(String args[]) {
// int mat[][] = { { 5, 4, 7 },
// { 1, 3, 8 },
// { 2, 9, 6 } };
// int n = 3;

// System.out.println("Original Matrix:");
// printMat(mat, n);

// sortMat(mat, n);

// System.out.println("Matrix After Sorting:");
// printMat(mat, n);

// }

// }

/////////////////////////////////////////////
// Matrix in Spiral Form using the simulation approach
// import java.util.*;

// class Main {
// public static List<Integer> spiralOrder(int[][] matrix) {
// List<Integer> ans = new ArrayList<Integer>();

// if (matrix.length == 0) {
// return ans;
// }

// int m = matrix.length, n = matrix[0].length;
// boolean[][] seen = new boolean[m][n];
// int[] dr = { 0, 1, 0, -1 };
// int[] dc = { 1, 0, -1, 0 };
// int x = 0, y = 0, di = 0;

// // iterate from 0 to R * C -1
// for (int i = 0; i < m * n; i++) {
// ans.add(matrix[x][y]);
// seen[x][y] = true;
// int cr = x + dr[di];
// int cc = y + dc[di];

// if (0 <= cr && cr < m && 0 <= cc & cc < n && !seen[cr][cc]) {
// x = cr;
// y = cc;
// } else {
// di = (di + 1) % 4;
// x += dr[di];
// y += dc[di];

// }
// }
// return ans;
// }

// public static void main(String[] args) {
// int a[][] = { { 1, 2, 3, 4 },
// { 5, 6, 7, 8 },
// { 9, 10, 11, 12 },
// { 13, 14, 15, 16 } };

// // Function call
// System.out.println(spiralOrder(a));
// }
// }

///////////////////////////////////////////////////////////
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

///////////////////////////////////////////////////////////
// Sorting 2D array by making use of Arrays.sort in Java
// import java.util.*;

// class Main {
// public static void sortbyColumn(int arr[][], int col) {
// // Using built-in sort function Arrays.sort
// Arrays.sort(arr, new Comparator<int[]>() {
// @Override
// // compare values accoding to columns
// public int compare(final int[] entry1, final int[] entry2) {
// // to sort in descending order revert
// // the '>' Operator
// if (entry1[col] > entry2[col]) {
// return 1;
// } else {
// return -1;
// }
// }
// }); // End of function call sort()
// }

// public static void main(String[] args) {
// int matrix[][] = { { 39, 27, 11, 42 },
// { 10, 93, 91, 90 },
// { 54, 78, 56, 89 },
// { 24, 64, 20, 65 } };
// int col = 3;
// sortbyColumn(matrix, col - 1);

// // Printing the sorted matrix
// for (int i = 0; i < matrix.length; i++) {
// for (int j = 0; j < matrix[i].length; j++)
// System.out.print(matrix[i][j] + " ");
// System.out.println();
// }
// }
// }
