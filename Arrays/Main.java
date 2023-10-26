// public class Main {
// public static void main(String[] args) {
// int[] arr;
// arr = new int[5];

// arr[0] = 10;
// arr[1] = 20;
// arr[2] = 30;
// arr[3] = 40;
// arr[4] = 50;

// for (int i = 0; i < arr.length; i++) {
// System.out.println("Element at index " + i + " : " + arr[i]);
// }
// }
// }

///////////////////////////////////////////////////////////

// class Student {
// public int roll_no;
// public String name;

// Student(int roll_no, String name) {
// this.roll_no = roll_no;
// this.name = name;
// }
// }

// public class Main {
// public static void main(String[] args) {
// // declares an Array of integers
// Student[] arr;

// arr = new Student[5];

// arr[0] = new Student(1, "aman");
// arr[1] = new Student(2, "vaibhav");
// arr[2] = new Student(3, "shikar");
// arr[3] = new Student(4, "dharmesh");
// arr[4] = new Student(5, "mohit");

// for (int i = 0; i < arr.length; i++) {
// System.out.println("Element at" + i + " : " + arr[i].roll_no + " " +
// arr[i].name);
// }

// }
// }

//////////////////////////////////////////////////////

// class Student {
// public String name;

// Student(String name) {
// this.name = name;
// }

// @Override
// public String toString() {
// return name;
// }
// }

// public class Main {
// public static void main(String[] args) {
// Student[] myStudents = new Student[] { new Student("Dhamma"), new
// Student("sanvi"), new Student("rupa"),
// new Student("Ajay") };

// for (Student m : myStudents) {
// System.out.println(m);
// }
// }
// }

////////////////////////////////////////////////////////

// public class Main {
// public static void main(String[] args) {
// int[] arr = new int[4];
// arr[0] = 10;
// arr[1] = 20;
// arr[2] = 30;
// arr[3] = 40;

// System.out.println("Trying to access element outside the size of array");
// System.out.println(arr[5]);
// }
// }

///////////////////////////////////////////////////////////

// // multidimensiona arrays
// public class Main {
// public static void main(String args[]) {
// int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// System.out.print(arr[i][j]);
// }
// System.out.println();
// }

// }
// }

///////////////////////////////////////////////////
// Passing Arrays to Methods

// public class Main {
// public static void main(String args[]) {
// int arr[] = { 3, 1, 2, 5, 4 };

// sum(arr);
// }

// public static void sum(int[] arr) {
// int sum = 0;

// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];
// }
// System.out.println("Sum of array values: " + sum);

// }
// }

/////////////////////////////////////////////////
// Passing Arrays to Methods

// public class Main {
// public static void main(String args[]) {
// int arr[] = m1();
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i] + " ");
// }

// }

// public static int[] m1() {
// return new int[] { 1, 2, 3 };
// }

// }

/////////////////////////////////////////////////////
// Class Objects for Arrays

// class main {
// public static void main(String args[]) {
// int intArray[] = new int[3];
// byte byteArray[] = new byte[3];
// short shortsArray[] = new short[3];

// String[] strArray = new String[3];

// System.out.println(intArray.getClass());
// System.out.println(intArray.getClass().getSuperclass());
// System.out.println(byteArray.getClass());
// System.out.println(shortsArray.getClass());
// System.out.println(strArray.getClass());

// }
// }

// class [I
// class java.lang.Object
// class [B
// class [S
// class [Ljava.lang.String;

/*
 * The string "[I" is the run-time type signature for the class object
 * "array with compnent type int".
 * The only direct superclass of an array type is java.lang.Object.
 * The string "[B" is the run-time type signature for the class object
 * "array with component type byte".
 * The string "[S" is the run-time type singnature for the class object
 * "array with component type short".
 * The string "[L" is the run-time type signature for the class object
 * "array with component type of a Class". The Class name is then followed.
 */

// class Main {
// public static void main(String args[]) {
// int intArray[] = { 1, 2, 3 };

// int cloneArray[] = intArray.clone();

// // will print false as deep copy is created for one-dimensional array
// System.out.println(intArray == cloneArray);

// for (int i = 0; i < cloneArray.length; i++) {
// System.out.println(cloneArray[i] + " ");
// }
// }
// }

// Deep Copy is created for one-dimensional array by clone() method.

/////////////////////////////////////////////////////////
// multi-dimensional arrays

// class Main {
// public static void main(String args[]) {
// int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };

// int cloneArray[][] = intArray.clone();

// // will print false
// System.out.println(intArray == cloneArray);

// // will print true as shallow copy is created
// // i.e. sub-arrys are shared
// System.out.println(intArray[0] == cloneArray[0]);
// System.out.println(intArray[1] == cloneArray[1]);

// }
// }

/////////////////////////////////////////////////////////////
// asList() method
// import java.util.*;
// import java.util.Arrays;
// import java.util.List;

// public class Main {
// public static void main(String args[]) throws Exception {
// try {
// String a[] = new String[] { "A", "B", "C", "D" };

// // Getting the list view of Array
// List<String> list = Arrays.asList(a);

// // Printing all the elements in list object
// System.out.println("The list is: " + list);
// } catch (NullPointerException e) {
// System.out.println("Excpetion thown : " + e);
// }
// }
// }

////////////////////////////////////////////////////

// import java.util.Arrays;
// import java.util.List;

// public class Main {
// public static void main(String[] argv) throws Exception {
// try {
// Integer a[] = new Integer[] { 10, 20, 30, 40 };

// // Getting the list view of Array
// List<Integer> list = Arrays.asList(a);

// // Printing all the elements inside list object
// System.out.println("The list is: " + list);
// } catch (NullPointerException e) {
// System.out.println("Exception thown : " + e);
// }
// }
// }

////////////////////////////////////////////////////
// asList() method returns fixed size list and throws
//////////////////////////////////////////////////// UnsupportedOperationException
//////////////////////////////////////////////////// if any element is added
//////////////////////////////////////////////////// using add() method.

// import java.util.*;

// public class Main {
// public static void main(String[] argv) throws Exception {
// try {
// Integer a[] = new Integer[] { 10, 20, 30, 40 };

// List<Integer> list = Arrays.asList(a);

// list.add(50);

// System.out.println("The list is: " + list);
// } catch (UnsupportedOperationException e) {
// System.out.println("Exception thrown : " + e);
// }

// }
// }

//////////////////////////////////////////////////////
// binarsearch() method

// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// byte byteArr[] = { 10, 20, 15, 22, 35 };
// char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
// int intArr[] = { 10, 20, 15, 22, 35 };
// double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
// float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
// short shortArr[] = { 10, 20, 15, 22, 35 };

// // using sort() method of Arays class and passing arrays to be sorted as in
// // arguments
// Arrays.sort(byteArr);
// Arrays.sort(charArr);
// Arrays.sort(intArr);
// Arrays.sort(doubleArr);
// Arrays.sort(floatArr);
// Arrays.sort(shortArr);

// // Primtive datatypes
// byte byteKey = 35;
// char charKey = 'g';
// int intKey = 22;
// double doubleKey = 1.5;
// float floatKey = 35;
// short shortKey = 5;

// System.out.println(byteKey + " found at index = " +
// Arrays.binarySearch(byteArr, byteKey));

// System.out.println(
// charKey + " found at index = "
// + Arrays.binarySearch(charArr, charKey));

// System.out.println(
// intKey + " found at index = "
// + Arrays.binarySearch(intArr, intKey));

// System.out.println(
// doubleKey + " found at index = "
// + Arrays.binarySearch(doubleArr, doubleKey));
// System.out.println(
// floatKey + " found at index = "
// + Arrays.binarySearch(floatArr, floatKey));
// System.out.println(
// shortKey + " found at index = "
// + Arrays.binarySearch(shortArr, shortKey));
// }
// }

//////////////////////////////////////////////////
// progam to illustrate binarySearch() method of collections class

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class Main {
// public static void main(String[] args) {
// List<Integer> al = new ArrayList<Integer>();

// // addding elements to the list
// al.add(12);
// al.add(53);
// al.add(23);
// al.add(46);
// al.add(54);

// int index = Collections.binarySearch(al, 23);

// System.out.println(index);

// }
// }

////////////////////////////////////////////////////////
// compare() method

// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// float[] floatArray1 = { 5.12f, 8.3f, 9.17f, 2.5f, 8.8f, 5.17f, 4.2f, 7.37f };
// float[] floatArray2 = { 7.12f, 9.3f, 6.17f, 7.5f, 5.8f, 7.17f, 3.2f, 6.37f };

// System.out.println("Result is " + Arrays.compare(floatArray1, floatArray2));
// }
// }

//////////////////////////////////////////////////////////////
// copyOf() method

// import java.util.Arrays;

// public class Main {
// public static void main(String args[]) {
// int[] org = new int[] { 1, 2, 3 };

// System.out.println("Original Array");
// for (int i = 0; i < org.length; i++) {
// System.out.println(org[i] + " ");
// }

// // copying arrray org to copy
// int[] copy = Arrays.copyOf(org, 5);

// copy[3] = 11;
// copy[4] = 55;

// System.out.println("\n New array copy after modifications: ");
// for (int i = 0; i < copy.length; i++) {
// System.out.println(copy[i] + " ");
// }
// }
// }

////////////////////////////////////////////////
// deepEqausls() method
// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// int a1[][] = { { 10, 20 },
// { 40, 50 },
// { 60, 70 } };

// int a2[][] = { { 30, 20 },
// { 10, 0 },
// { 60, 80 } };

// int a3[][] = { { 10, 20 },
// { 40, 50 },
// { 60, 70 } };

// System.out.println("Check if a1 is equal to a2: " + Arrays.deepEquals(a1,
// a2));
// System.out.println("Check if a1 is equal to a2: " + Arrays.deepEquals(a2,
// a3));
// System.out.println("Check if a1 is equal to a2: " + Arrays.deepEquals(a1,
// a3));

// }

// }

/////////////////////////////////////
// eg. 2

// import java.util.Arrays;

// public class Main {
// public static class Employee {
// int Eid;
// String Ename;

// public Employee(int Eid, String Ename) {
// this.Eid = Eid;
// this.Ename = Ename;
// }

// // overrriding the equals()
// public boolean equals(Object obj) {
// Employee s = (Employee) obj;
// return (this.Eid == s.Eid && this.Ename.equals(s.Ename));
// }

// public static void main(String args[]) {
// Employee e1[][] = { { new Employee(10, "Geek1"),
// new Employee(11, "Geek2") },
// { new Employee(12, "Geek3"),
// new Employee(13, "Geek4") } };
// Employee e2[][] = { { new Employee(10, "Geek1"),
// new Employee(11, "Geek2") },
// { new Employee(12, "Geek3"),
// new Employee(13, "Geek4") } };

// Employee e3[][] = { { new Employee(12, "Geek2"),
// new Employee(25, "Geek4") },
// { new Employee(15, "Geek3"),
// new Employee(30, "Geek1") } };

// System.out.println("Check if e1 is equal to e2 : " + Arrays.deepEquals(e1,
// e2));

// System.out.println("Check if e2 is equal to e3 : " + Arrays.deepEquals(e2,
// e3));

// System.out.println("Check if a1 is equal to a4 : " + Arrays.deepEquals(e1,
// e3));

// }

// }

// }

/////////////////////////////////////////////////
// paralleprefix() method

// import java.util.Arrays;
// import java.util.function.IntBinaryOperator;

// public class Main {
// static int compute(int x, int y) {
// return x + y;
// }

// public static void main(String[] args) {
// int[] arr = { 2, 1, 7, 8, 4, 5, 6, 9, 8, 7, 1, 2, 3, 6, 5, 4, 7, 5 };

// // IntBinaryOperator op = (x, y) -> x + y;
// // Arrays.parallelPrefix(arr, op);

// // Arrays.parallelPrefix(arr, (x, y) -> x + y);

// Arrays.parallelPrefix(arr, (x, y) -> compute(x, y));

// System.out.println(arr[2]);

// Arrays.stream(arr).forEach(e -> System.out.println(e + " "));

// }

// }

////////////////////////////////////////////////////////
// toString() method

// import java.io.*;
// import java.util.*;

// class Main {
// public static void main(String[] args) {
// char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' };

// System.out.println("Character Array: " + Arrays.toString(charArr));

// }
// }

//////////////////////////////////////////////////
// Multi Dimensioal Array
// import java.util.*;

// ArrayList<ArrayList<Object>>a=new ArrayList<ArrayList<Object>>();

//////////////////////////////////
// import java.util.*;

// class Main {
// // to create and return 2D ArrayList
// static List create2DArrayList() {
// // creating a 2D arraylist of Integer type
// ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();

// // one space allocated for R0
// x.add(new ArrayList<Integer>());

// // adding 3 to R0 created above x(R0, C0)
// x.get(0).add(0, 3);

// // creating R1 and adding values
// // another way for adding values in 2D collections
// x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));

// // adding 366 to x(R1, C0)
// x.get(1).add(0, 366);

// // adding 576 to x(R1, C4)
// x.get(1).add(4, 576);

// // Now, adding values to R2
// x.add(2, new ArrayList<>(Arrays.asList(3, 84)));

// // adding values to R3
// x.add(new ArrayList<Integer>(Arrays.asList(83, 6684, 776)));

// // adding values to R4
// x.add(new ArrayList<>(Arrays.asList(9, 10, 11)));

// // Appending values to R1, but start appending from C3
// x.get(1).addAll(3, Arrays.asList(22, 1000));

// // this method will return 2D array
// return x;
// }

// public static void main(String[] args) {
// System.out.println("2D ArrayList :");

// // Printing 2D ArrayList by calling Method 1
// System.out.println(create2DArrayList());

// }
// }

///////////////////////////////////////////////////
// Using HashSet: LinkedHashSet class contains unique elements & maintains
/////////////////////////////////////////////////// insertion order.
// Therefore, in Multidimensional LinkedHashSet uniqueness will be maintained
/////////////////////////////////////////////////// insdie rows also.
