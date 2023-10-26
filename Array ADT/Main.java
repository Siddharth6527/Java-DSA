// Java Program to Print an Array
// 1) Print an Array using for loop

// public class Main {
// public static void main(String[] args) {
// int[] array = { 1, 2, 3, 4, 5 };

// for (int element : array) {
// System.out.println(element);
// }
// }
// }

// 2) Print an Array using standared library Arrays

// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// int[] array = { 1, 2, 3, 4, 5 };

// System.out.println(Arrays.toString(array));
// }
// }

// 3) Print a Multi-dimensional Array

// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };

// System.out.println(Arrays.deepToString(array));
// }
// }

/////////////////////////////////////////////////////////
// Adding an element in Array
// 1) By creating a new array:

// import java.io.*;
// import java.lang.*;
// import java.util.*;

// class Main {
// public static int[] addX(int n, int arr[], int x) {
// int i;
// // create a new array of size n+1
// int newarr[] = new int[n + 1];
// // insert the elements from the old array into the new array
// for (i = 0; i < n; i++) {
// newarr[i] = arr[i];
// }
// newarr[n] = x;
// return newarr;
// }

// public static void main(String[] args) {
// int n = 10;
// int i;

// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

// // print the original array
// System.out.println("Initial Array:\n" + Arrays.toString(arr));

// int x = 50;

// // call the method to add x in arr
// arr = addX(n, arr, x);

// // print the updated array
// System.out.println("\n Array with " + x + " added:\n" +
// Arrays.toString(arr));

// }
// }

// Time Complexity: O(N)
// Auxiliary Space: O(N)

// 2) By using ArrayList as intermediate storage:
// import java.io.*;
// import java.lang.*;
// import java.util.*;

// class Main {
// public static Integer[] addX(int n, Integer arr[], int x) {
// List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(arr));

// // add the new element
// arrlist.add(x);

// // convert the ArrayList to array
// arr = arrlist.toArray(arr);
// return arr;
// }

// public static void main(String[] args) {
// int n = 10;
// Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

// // Print the original array
// System.out.println("Initial Array: \n" + Arrays.toString(arr));

// // element to be added
// int x = 50;

// // call the method to add x in arr
// arr = addX(n, arr, x);
// // print the updated array
// System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
// }
// }

// Time : O(N)
// Auxiliary: O(N)
///////////////////////////////////////////////////////////////
// How to Insert an element at a specific poistion in an Array in Java
// import java.io.*;
// import java.lang.*;
// import java.util.*;

// class Main {
// public static int[] insertX(int n, int arr[], int x, int pos) {
// int i;

// // create a new array of size n+1
// int newarr[] = new int[n + 1];

// for (i = 0; i < n; i++) {
// if (i < pos - 1) {
// newarr[i] = arr[i];
// } else if (i == pos - 1) {
// newarr[i] = x;
// } else {
// newarr[i] = arr[i - 1];
// }
// }
// return newarr;
// }

// public static void main(String[] args) {
// int n = 10;
// int i;

// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

// System.out.println("Initial Array:\n" + Arrays.toString(arr));

// int x = 50;

// int pos = 5;

// arr = insertX(n, arr, x, pos);

// System.out.println("\n Array with " + x + " inserted at position " + pos +
// ":\n" + Arrays.toString(arr));
// }
// }

////////////////////////////////////////////////////////////////
// Approach 2:
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Main {
// private static void addElement(Integer[] arr, int element, int position) {
// // converting array to ArrayList
// List<Integer> list = new ArrayList<>(Arrays.asList(arr));

// // Adding the element at position
// list.add(position - 1, element);

// // converting list back to array
// arr = list.toArray(arr);

// // Printing the updated array
// System.out.println("\nArray with " + element
// + " inserted at position "
// + position + ":\n"
// + Arrays.toString(arr));
// }

// public static void main(String[] args) {
// Integer[] arr = { 1, 2, 3, 4, 5,
// 6, 7, 8, 9, 10 };

// int element = 50;

// int position = 5;
// // Printing the original array
// System.out.println("Initial Array:\n"
// + Arrays.toString(arr));

// addElement(arr, element, position);
// }
// }

////////////////////////////////////////////////////////////
// Remove an Specific Element from an Array
// Approach 1: Basic

// import java.util.Arrays;

// class Main {
// public static int[] removeTheElement(int[] arr, int index) {
// // if the array is empty or
// // the index is not in array range
// // return original array
// if (arr == null || index < 0 || index >= arr.length) {
// return arr;
// }

// // create another array of size one less
// int[] anotherArray = new int[arr.length - 1];

// // copy the elements except the index from original array to other array
// for (int i = 0, k = 0; i < arr.length; i++) {
// // if the index is the removal element index
// if (i == index) {
// continue;
// }

// // if the index is not the removal element index
// anotherArray[k++] = arr[i];

// }
// return anotherArray;
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5 };

// System.out.println(Arrays.toString(arr));

// int index = 2;

// arr = removeTheElement(arr, index);

// System.out.println(Arrays.toString(arr));
// }
// }

////////////////////////////////////////////////////
// Approach 2: Using Java 8 Streams

// import java.util.Arrays;
// import java.util.stream.IntStream;

// class Main {
// public static int[] removeTheElement(int[] arr, int index) {
// // If the array is empty
// // or the index is not in array range
// // return the original array
// if (arr == null || index < 0 || index >= arr.length) {
// return arr;
// }

// return IntStream.range(0, arr.length).filter(i -> i != index).map(i ->
// arr[i]).toArray();
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5 };

// System.out.println(Arrays.toString(arr));

// int index = 2;

// arr = removeTheElement(arr, index);

// System.out.println(Arrays.toString(arr));
// }
// }

////////////////////////////////////////////////////
// Approach 3: Using ArrayList

// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;

// class Main {
// public static int[] removeTheElement(int[] arr, int index) {
// if (arr == null || index < 0 || index >= arr.length) {
// return arr;
// }

// List<Integer> arrayList =
// IntStream.of(arr).boxed().collect(Collectors.toList());

// arrayList.remove(index);

// return arrayList.stream().mapToInt(Integer::intValue).toArray();
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5 };

// System.out.println(Arrays.toString(arr));

// int index = 2;

// arr = removeTheElement(arr, index);

// System.out.println(Arrays.toString(arr));
// }
// }

/////////////////////////////////////////////////////////////
// Using System.arraycopy() method
// import java.util.Arrays;

// class Main {
// public static int[] removeTheElement(int[] arr, int index) {
// // If the array is empty or the index is not in array range
// // return the original array
// if (arr == null || index < 0 || index >= arr.length) {
// return arr;
// }

// int[] anotherArray = new int[arr.length - 1];

// // Copy the elements from starting till index
// // from original array to the other array
// System.arraycopy(arr, 0, anotherArray, 0, index);

// // Copy the elements from index+1 till end
// // from original array to the other array
// System.arraycopy(arr, index + 1, anotherArray, index, arr.length - index -
// 1);

// return anotherArray;
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5 };

// System.out.println(Arrays.toString(arr));

// int index = 2;

// arr = removeTheElement(arr, index);

// System.out.println(Arrays.toString(arr));

// }
// }

///////////////////////////////////////////////////////////////
// Linear Search

// class Main {
// static int search(int arr[], int n, int x) {
// for (int i = 0; i < n; i++) {
// // Return the index of the element if the element is found
// if (arr[i] == x) {
// return i;
// }
// }
// return -1;
// }

// public static void main(String[] args) {
// int[] arr = { 2, 3, 1, 7, 5 };
// int n = arr.length;

// int x = 1;

// int index = search(arr, n, x);

// if (index == -1) {
// System.out.println("Element is not present in the array");
// } else {
// System.out.println("Element found at position " + index);
// }

// }

// }

/////////////////////////////////////////////////////////////
// Binary Search
// 1) Iterative Binary Search Algorithm:

// import java.io.*;
// import java.util.function.BinaryOperator;

// class Main {
// int binarySearch(int arr[], int x) {
// int l = 0, r = arr.length - 1;
// while (l <= r) {
// int m = l + (r - l) / 2;

// // check if x is present at mid
// if (arr[m] == x) {
// return m;
// }

// // if x greater, ignore left half
// if (arr[m] < x) {
// l = m + 1;
// }

// // If x is smaller, ignore right hald
// else {
// r = m - 1;
// }
// }

// // of we reach here, then element was not present
// return -1;
// }

// public static void main(String[] args) {
// Main ob = new Main();
// int arr[] = { 2, 3, 4, 10, 40 };
// int n = arr.length;
// int x = 10;
// int result = ob.binarySearch(arr, x);
// if (result == -1) {
// System.out.println("Element is not present in array");
// } else {
// System.out.println("Element is present at " + "index " + result);
// }
// }
// }

///////////////////////////////////////////////////
// 2) Recursive Binary Search Algorithm

// class Main {
// int binarySearch(int arr[], int l, int r, int x) {
// if (r >= l) {
// int mid = l + (r - l) / 2;

// // if the elemetn is presetn at the middle itself
// if (arr[mid] == x) {
// return mid;
// }

// // if the element is smaller than mid,
// // then, it can only be present in left subarray
// if (arr[mid] > x) {
// return binarySearch(arr, l, mid - 1, x);
// }

// // Else the element can only be present
// // in right subarray
// return binarySearch(arr, mid + 1, r, x);
// }

// // we reach here when element is not present
// // in array
// return -1;
// }

// public static void main(String args[]) {
// Main ob = new Main();
// int arr[] = { 2, 3, 4, 10, 40 };
// int n = arr.length;
// int x = 10;
// int result = ob.binarySearch(arr, 0, n - 1, x);
// if (result == -1) {
// System.out.println("Element is not present in array.");
// } else {
// System.out.println("Element is present at index " + result);
// }
// }
// }

///////////////////////////////////////////////////////////
// Reverse an array in Java
// 1) Using Temp array

// public class Main {
// static void reverse(int a[], int n) {
// int[] b = new int[n];
// int j = n;
// for (int i = 0; i < n; i++) {
// b[j - 1] = a[i];
// j = j - 1;
// }

// System.out.println("Reverse array is: \n");
// for (int k = 0; k < n; k++) {
// System.out.println(b[k]);
// }
// }

// public static void main(String[] args) {
// int[] arr = { 10, 20, 30, 40, 50 };
// reverse(arr, arr.length);
// }
// }

///////////////////////////////////////////////////////
// 2) Using Swapping

// public class Main {
// static void reverse(int a[], int n) {
// int i, k, t;
// for (i = 0; i < n / 2; i++) {
// t = a[i];
// a[i] = a[n - i - 1];
// a[n - i - 1] = t;
// }

// System.out.println("Reversed array is: \n");
// for (k = 0; k < n; k++) {
// System.out.println(a[k]);
// }
// }

// public static void main(String[] args) {
// int[] arr = { 10, 20, 30, 40, 50 };
// reverse(arr, arr.length);
// }
// }

/////////////////////////////////////////////////////
// Using Collections.reverse() method

// import java.util.*;

// public class Main {
// static void reverse(Integer a[]) {
// Collections.reverse(Arrays.asList(a));
// System.out.println(Arrays.asList(a));
// }

// public static void main(String[] args) {
// Integer[] arr = { 10, 20, 30, 40, 50 };
// reverse(arr);
// }
// }

/////////////////////////////////////////////////////
// 4) Using StringBuilder.append() method
/*
 * If you are working wiht a String array, we can use a StirngBuilder and append
 * each array element with a for loop decrementing from the array's length,
 * convert the StringBuilder to a string, and split back into an array.
 */

// import java.util.Arrays;

// class Main {
// public static void main(String[] args) {
// String[] arr = { "Hello", "World" };
// StringBuilder reversed = new StringBuilder();

// for (int i = arr.length; i > 0; i--) {
// reversed.append(arr[i - 1]).append(" ");
// }

// String[] reversedArray = reversed.toString().split(" ");

// System.out.println(Arrays.toString(reversedArray));
// }
// }

//////////////////////////////////////////////////////
// Rotations in Array
// 1) Using a temporary array

// class Main {
// void leftRotate(int arr[], int d, int n) {
// // creating temp array of size d
// int temp[] = new int[d];

// // copying first d element in array temp
// for (int i = 0; i < d; i++) {
// temp[i] = arr[i];
// }

// // moving the rest element to index zero
// for (int i = d; i < n; i++) {
// arr[i - d] = arr[i];
// }

// // copying the temp array element in original array
// for (int i = 0; i < d; i++) {
// arr[i + n - d] = temp[i];
// }
// }

// void printArray(int arr[], int n) {
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// Main rotate = new Main();

// int arr[] = { 1, 2, 3, 4, 5 };

// rotate.leftRotate(arr, 2, arr.length);
// rotate.printArray(arr, arr.length);
// }
// }

////////////////////////////////////////////////
// 2) Rotate one by one

// class Main {
// void leftRotate(int arr[], int d, int n) {
// for (int i = 0; i < d; i++) {
// leftRotatebyOne(arr, n);
// }
// }

// void leftRotatebyOne(int arr[], int n) {
// int i, temp;
// temp = arr[0];
// for (i = 0; i < n - 1; i++) {
// arr[i] = arr[i + 1];
// }
// arr[i] = temp;
// }

// void printArray(int arr[], int n) {
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// Main rotate = new Main();

// int arr[] = { 1, 2, 3, 4, 5 };

// rotate.leftRotate(arr, 2, arr.length);
// rotate.printArray(arr, arr.length);
// }
// }

////////////////////////////////////////////////////
// 3) Using Juggling Algorithm

// class Main {
// void leftRotate(int arr[], int d, int n) {
// // to handle if d>=n
// d = d % n;
// int i, j, k, temp;
// int g_c_d = gcd(d, n);

// for (i = 0; i < g_c_d; i++) {
// // move the ith values of blocks
// temp = arr[i];
// j = i;

// // performing sets of opearatios if
// // condition holds true
// while (true) {
// k = j + d;
// if (k >= n) {
// k = k - n;
// }
// if (k == i) {
// break;
// }
// arr[j] = arr[k];
// j = k;
// }
// arr[j] = temp;
// }
// }
// }

/////////////////////////////////////////////////////////
// Right Rotation of Array
// 1) Using temp array:

// class Main {
// void rightRotate(int arr[], int d, int n) {
// // if arr is rotated n times then
// // you get the same array
// while (d > n) {
// d = d - n;
// }

// // creting a temporary array of size d
// int temp[] = new int[n - d];

// // now copying first to N-D element in array temp
// for (int i = 0; i < n - d; i++) {
// temp[i] = arr[i];
// }

// // moving the rest elements to index zero to D
// for (int i = n - d; i < n; i++) {
// arr[i - n + d] = arr[i];
// }

// // copying the temp array element
// // in original array
// for (int i = 0; i < n - d; i++) {
// arr[i + d] = temp[i];
// }
// }

// void printArray(int arr[], int n) {
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// Main rotate = new Main();

// int arr[] = { 1, 2, 3, 4, 5 };

// rotate.rightRotate(arr, 2, arr.length);

// rotate.printArray(arr, arr.length);
// }
// }

/////////////////////////////////////////////////////
// 2) Rotate one by one

// class Main {
// void rightRotate(int arr[], int d, int n) {
// for (int i = n; i > d; i--) {
// rightRotatebyOne(arr, n);
// }
// }

// void rightRotatebyOne(int arr[], int n) {
// int i, temp;
// temp = arr[0];

// for (i = 0; i < n - 1; i++) {
// arr[i] = arr[i + 1];
// }
// arr[i] = temp;
// }

// void printArray(int arr[], int n) {
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// Main rotate = new Main();

// int arr[] = { 1, 2, 3, 4, 5 };

// rotate.rightRotate(arr, 2, arr.length);
// rotate.printArray(arr, arr.length);
// }
// }

/////////////////////////////////////////////////////////
// Inserting an element in a Sorted array

// import java.util.Arrays;

// public class Main {
// void insertX(int[] arr, int n, int x) {
// for (int i = n - 1; i >= 0; i--) {
// if (arr[i] > x) {
// // arr[i+1]=
// }
// }
// }

// public static void main(String[] args) {
// Main obj = new Main();
// int arr[] = { 1, 2, 3, 4, 6, 7 };

// int x = 5;
// int n = 7;

// obj.insertX(arr, n, x);

// System.out.print(Arrays.toString(arr));

// }

// }

/////////////////////////////////////////////////////////
// Java Program to Merge Two Arrays
// Naive Approach

// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// int arr1[] = { 1, 3, 5, 7 };
// int n1 = arr1.length;

// int arr2[] = { 2, 4, 6, 8 };
// int n2 = arr2.length;

// int arr3[] = new int[n1 + n2];
// mergeArrays(arr1, arr2, n1, n2, arr3);
// }

// public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[]
// arr3) {
// int i = 0;
// int j = 0;
// int k = 0;

// // traverse the arr1 and insert its element in arr3
// while (i < n1) {
// arr3[k++] = arr1[i++];
// }

// // now traverse arr2 and insert in arr3
// while (j < n2) {
// arr3[k++] = arr2[j++];
// }

// // sort the whole array arr3
// Arrays.sort(arr3);

// System.out.println(Arrays.toString(arr3));
// }
// }

////////////////////////////////////////////////////
// Method 3: Using Merge function of Merge sort.

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Main {
// public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[]
// arr3) {
// int i = 0, j = 0, k = 0;

// // traverse both array
// while (i < n1 && j < n2) {
// if (arr1[i] < arr2[j]) {
// arr3[k++] = arr1[i++];
// } else {
// arr3[k++] = arr2[j++];
// }
// }

// // store remaining elements of first array
// while (i < n1) {
// arr3[k++] = arr1[i++];
// }

// // store remaining elements of second array
// while (j < n2) {
// arr3[k++] = arr2[j++];
// }
// }

// public static void main(String[] args) {
// int[] arr1 = { 1, 3, 5, 7 };
// int n1 = arr1.length;

// int[] arr2 = { 2, 4, 6, 8 };
// int n2 = arr2.length;

// int[] arr3 = new int[n1 + n1];

// mergeArrays(arr1, arr2, n1, n2, arr3);

// System.out.println("Arrays after merging");
// for (int i = 0; i < n1 + n2; i++) {
// System.out.print(arr3[i] + " ");
// }
// }
// }

////////////////////////////////////////////////////
// Method 4: Using Maps

// import java.io.*;
// import java.util.*;

// class Main {
// static void mergeArrays(int a[], int b[], int n, int m) {
// Map<Integer, Boolean> mp = new TreeMap<Integer, Boolean>();

// // inserting values to a map.
// for (int i = 0; i < n; i++) {
// mp.put(a[i], true);
// }

// for (int i = 0; i < m; i++) {
// mp.put(b[i], true);
// }

// // Printing keys of the map.
// for (Map.Entry<Integer, Boolean> me : mp.entrySet()) {
// System.out.print(me.getKey() + " ");

// }

// }

// public static void main(String[] args) {
// int a[] = { 1, 3, 5, 7 }, b[] = { 2, 4, 6, 8 };
// int size = a.length;
// int size1 = b.length;

// mergeArrays(a, b, size, size1);

// }

// }

/////////////////////////////////////////////////////////////
// Removing duplicate elements from the array
// Method 1: Using Extra space

// public class Main {
// public static int removeduplicates(int a[], int n) {
// if (n == 0 || n == 1) {
// return n;
// }

// // creating another array for only storing the unique elements
// int[] temp = new int[n];
// int j = 0;

// for (int i = 0; i < n - 1; i++) {
// if (a[i] != a[i + 1]) {
// temp[j++] = a[i];
// }
// }
// temp[j++] = a[n - 1];

// // changing the orignal array
// for (int i = 0; i < j; i++) {
// a[i] = temp[i];
// }
// return j;
// }

// public static void main(String[] args) {
// int a[] = { 1, 1, 2, 2, 2 };
// int n = a.length;

// n = removeduplicates(a, n);

// // Printing the array elements
// for (int i = 0; i < n; i++) {
// System.out.print(a[i] + " ");
// }
// }

// }

//////////////////////////////////////////////////////////////
// Method 2:

// public class Main {
// public static int removeDuplicates(int a[], int n) {
// // if the array size if 0 or 1 array is already sorted
// if (n == 0 || n == 1) {
// return n;
// }

// int j = 0;

// // check if the ith element is not equal to the (i+1)th element, then add
// that
// // element at the jth index in the same array which indicated that the
// // particular element will only be added once in the array
// for (int i = 0; i < n - 1; i++) {
// if (a[i] != a[i + 1]) {
// a[j++] = a[i];
// }
// }

// a[j++] = a[n - 1];

// return j;
// }

// public static void main(String[] args) {
// int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };

// int n = a.length;

// int j = 0;

// // the function will modify the array a[] such that the starting j elements
// will
// // be having all unique elements and no element will be appearing more than
// // once.
// j = removeDuplicates(a, n);

// for (int i = 0; i < j; i++) {
// System.out.println(a[i] + " ");
// }

// }
// }

// important: If sorting of the array is done using this method then the Time
// complexity of the program increases from O(n) to O(nlogn).

/////////////////////////////////////////////////
// Method 3: Using Set

// import java.util.*;

// class Main {

// // Function to remove duplicate from array
// public static void removeDuplicates(int[] a) {
// LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

// // adding elements to LinkedHashSet
// for (int i = 0; i < a.length; i++)
// set.add(a[i]);

// // Print the elements of LinkedHashSet
// System.out.print(set);
// }

// // Driver code
// public static void main(String[] args) {
// int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };

// // Function call
// removeDuplicates(a);
// }
// }

///////////////////////////////////////////////////////
// Method 4: Using Frequency array

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
// int n = a.length;

// // m will have the maximum element in the arrray
// int m = 0;
// for (int i = 0; i < n; i++) {
// m = Math.max(m, a[i]);
// }

// // creating the frequency array
// int[] f = new int[m + 1];

// // incrementing the value at a[i]th index
// // in the frequency array
// for (int i = 0; i < n; i++) {
// f[a[i]]++;
// }

// for (int i = 0; i < m + 1; i++) {
// if (f[i] > 0) {
// System.out.print(i + " ");
// }
// }

// }
// }

//////////////////////////////////////////////////////////
// Method 5: Using HashMap

// import java.util.HashMap;

// class Main {
// static void removeDups(int[] a, int n) {
// // Hashmap which store teh element which has not appeared previously.
// HashMap<Integer, Boolean> mp = new HashMap<>();

// for (int i = 0; i < n; ++i) {
// // Print the element if it is not present there in the hashmap and insert the
// // element in the hashmap
// if (mp.get(a[i]) == null) {
// System.out.println(a[i] + " ");
// mp.put(a[i], true);
// }
// }

// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };

// int n = arr.length;
// removeDups(arr, n);
// }
// }