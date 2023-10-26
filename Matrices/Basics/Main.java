// import java.io.*;

// class Main {
// public static void main(String[] args) {
// int[][] integer2DArray;
// String[][] string2DArrays;
// double[][] double2DArray;
// boolean[][] boolean2DArray;
// float[][] float2DArray;
// }
// }

//////////////////////////////////
// Different approahces for Initialization of 2-D array in Java:

// import java.io.*;

// class Main {
// public static void main(String[] args) {
// // declaration along with initialization
// // 2D integer array
// // integer array elements are initialized with 0
// int[][] integer2DArray = new int[5][3];
// System.out.println("Default valule of int array element: " +
// integer2DArray[0][0]);

// // 2D String array with 4 rows and 4 columns
// // String array elements are initialized with null
// String[][] string2DArray = new String[4][4];
// System.out.println("Default value of String array element: " +
// string2DArray[0][0]);

// // 2D boolean array
// // boolean array elements are initialized with false
// boolean[][] boolean2DArray = new boolean[4][4];
// System.out.println("Default value of boolean array element: " +
// boolean2DArray[0][0]);

// // 2D char array
// // char array elements are initialized with '\u0000' (null character)
// char[][] char2DArray = new char[10][10];
// System.out.println("Default value of char array element: " +
// char2DArray[0][0]);

// // first declaration and then initialization
// int[][] arr;

// arr = new int[5][3];
// System.out.println("arr[0][0]: " + arr[0][0]);

// }
// }

//////////////////////////////////////
// import java.io.*;

// class Main {
// public static void main(String[] args) {
// int[][] arr = new int[][3];

// int[][] arr2 = new int[3][];
// }
// }

//////////////////////////////////////
// Approach 2:
// import java.io.*;

// class Main {
// public static void main(String[] args) {
// String[][] subjects = {
// { "Data Structures and Algorithms",
// "Programming & Logic",
// "Software Engineering",
// "Theory of Computation"
// },
// { "Thermodynamics", "Metallurgy",
// "Machine Drawing",
// "Fluid Mechanics" }, // row2

// { "Signals and Systems", "Digital Electronics",
// "Power Electronics" }
// };

// System.out.println("Fundamental subject in Computer Engineering: " +
// subjects[0][0]);

// System.out.println("Fundamental Subject in Mechanical Engineering: " +
// subjects[1][3]);

// System.out.println(
// "Fundamental Subject in Electronics Engineering: "
// + subjects[2][1]);

// }
// }

////////////////////////////////
// Approach 3: We can initalize each element of the array separately.
// import java.io.*;
// import java.util.*;

// class Main {
// public static void main(String[] args) {
// int[][] scores = new int[2][2];

// scores[0][0] = 15;
// scores[0][1] = 23;
// scores[1][0] = 30;
// scores[1][1] = 21;

// System.out.println("Printing 2D array using Arrays.deepToString() method: ");
// System.out.println(Arrays.deepToString(scores));
// }
// }

////////////////////////////////////
// Approach 4: The efficent way is to use for loop for initializing the array
//////////////////////////////////// elements in the case of a large 2D array:

// import java.io.*;

// class Main {
// public static void main(String[] args) {
// int rows = 80, columns = 5;
// int[][] marks = new int[rows][columns];

// // initializing the array elements using for loop
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < columns; j++) {
// marks[i][j] = i + j;
// }
// }

// // printing the first three rows of marks array
// System.out.println("First three rows are: ");
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < columns; j++) {
// System.out.print(marks[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

//////////////////////////////////////
// Approach 5: Jagged arrays
// import java.io.*;

// class Main {
// public static void main(String[] args) {
// int jagged[][] = new int[2][];

// // not specifying the 2nd dimension,
// // and making it as jagged array
// // first row has 2 columns
// jagged[0] = new int[2];

// jagged[1] = new int[4];

// int count = 0;
// for (int i = 0; i < jagged.length; i++) {
// // remember to use jagged[i].length instead of
// // jagged[0].length, since row has different number of columns
// for (int j = 0; j < jagged[i].length; j++) {
// jagged[i][j] = count++;
// }
// }

// // printing the values of 2D jagged array
// System.out.println("The values of 2D jagged array");
// for (int i = 0; i < jagged.length; i++) {
// for (int j = 0; j < jagged[i].length; j++) {
// System.out.print(jagged[i][j] + " ");
// }
// System.out.println();
// }

// }
// }

////////////////////////////////////
// Jagged Arrays in Java
// class Main {
// public static void main(String[] args) {
// int arr[][] = new int[2][];

// arr[0] = new int[3];
// arr[1] = new int[2];

// // initializing array
// int count = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// arr[i][j] = count++;
// }
// }

// // displaying the values of 2D Jagged array
// System.out.println("Contents of 2D Jagged Array: ");
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }
// }
