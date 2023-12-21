package code;

// import java.io.*;

// 1. printStacTrace()

// class Main {
// public static void main(String[] args) {
// int a = 5;
// int b = 0;
// try {
// System.out.println(a / b);
// } catch (ArithmeticException e) {
// e.printStackTrace();
// }
// }
// }

//////////////////////////////////////////////////////////////////
// 2. toString()
// class Main {
// public static void main(String[] args) {
// int a = 5;
// int b = 0;
// try {
// System.out.println(a / b);
// } catch (ArithmeticException e) {
// System.out.println(e.toString());
// }
// }
// }

///////////////////////////////////////////////////////////////
// 3. getMessage()
// class Main {
// public static void main(String[] args) {
// int a = 5;
// int b = 0;

// try {
// System.out.println(a / b);
// } catch (ArithmeticException e) {
// System.out.println(e.getMessage());
// }
// }
// }

/////////////////////////////////////////////////////////////
// Exception Thrown
// class Main {
// public static void main(String[] args) {
// String str = null;

// System.out.println(str.length());
// }
// }

///////////////////////////////////////////////////////////
// Exceptions (Call stack)
// class Main {
// // method 1
// // it throws the excpeiton (Arithmetic Exception)
// // Appropriate exception handle is not found
// // within this method
// static int divideByZero(int a, int b) {
// // this statement will cause arithmetic exception
// // (/by zero)
// int i = a / b;
// return i;
// }

// // the runtime system searches the appropriate
// // Excpetion handler in method also but coun't have
// // found. SO looking forward on the call stack.
// static int computeDivision(int a, int b) {
// int res = 0;

// // try block to check for exceptions
// try {
// res = divideByZero(a, b);
// }

// // catch block to handle NumberFormateException
// // exception Doesn't matches with
// // ArithmeticException
// catch (NumberFormatException ex) {
// // display message when exception occurs
// System.out.println("NumberFormatException is occurred");
// }
// return res;
// }

// // method 2
// // found appropriate Excpetion handler
// // i.e. mathcing catch block
// public static void main(String args[]) {
// int a = 1;
// int b = 0;

// try {
// int i = computeDivision(a, b);
// }
// // catch block to handler Arithmetic Exceptions
// catch (ArithmeticException ex) {
// System.out.println(ex.getMessage());
// }
// }

// }

///////////////////////////////////////////////////////////////
// IndexOutOfBoundException:
// class Main {
// public static void main(String[] args) {
// int[] arr = new int[4];

// int i = arr[4];

// System.out.println("Hi, I want to execute");
// }
// }
