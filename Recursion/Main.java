// public class Main{
// public static void main(String[] args){
// int result = sum(10);
// System.out.println(result);
// }

// public static int sum(int k){
// if(k>0){
// return k+sum(k-1);
// } else{
// return 0;
// }
// }
// }

// Udemy

// public class Main{

// public static void fun(int n){
// if(n>0){
// fun(n-1);
// System.out.println(n);
// }
// }
// public static void main(String[] args){
// int x=3;
// fun(x);
// }
// }

// Tail Recursion
// public class Main{
// static void fun(int n){
// if(n>0){
// System.out.println(n+" ");
// fun(n-1);
// }
// }

// public static void main(String[] args){
// int x = 3;
// fun(x);
// }
// }

// Head Recursion
// import java.io.*;

// public class Main{
// static void fun(int n){
// if(n>0){
// fun(n-1);
// System.out.println(" "+n);
// }
// }

// public static void main(String[] args){
// int x = 3;
// fun(x);
// }
// }

// Tree Recursion
// public class Main{
// static void fun(int n){
// System.out.println(" "+n);
// // Calling once
// fun(n-1);

// // Calling twice
// fun(n-1);
// }

// public static void main(String[] args){
// fun(3);
// }
// }

// Nested Recursion

// public class Main{
// static int fun(int n){
// if(n>100){
// return n-100;
// }

// return fun(fun(n+11));

// }

// public static void main(String args[]){
// int r;
// r= fun(95);
// System.out.print(" "+r);
// }

// }

// // Indirect Recursion
// public class Main{
// static void funA(int n){
// if(n>0){
// System.out.println(" "+n);

// funB(n-1);
// }
// }

// static void funB(int n){
// if(n>1){
// System.out.println(" "+n);

// funA(n/2);
// }
// }

// public static void main(String[] args){
// funA(20);
// }
// }

// Sum of first n natural numbers
// public class Main {
// static int Sum(int n) {
// if (n == 0) {
// return 0;
// } else {
// return Sum(n - 1) + n;
// }
// }

// public static void main(String args[]) {
// System.out.println(Sum(5));
// }
// }

// Factorial of a Number
// public class Main {
// static int fact(int n) {
// if (n == 0) {
// return (1);
// } else {
// return fact(n - 1) * n;
// }
// }

// public static void main(String args[]) {
// System.out.println(fact(5));
// }
// }

// Power using Recursion
// public class Main {
// static int pow(int m, int n) {
// if (n == 0) {
// return 1;
// }
// if (n % 2 == 0) {
// return pow(m * m, n / 2);
// } else {
// return m * pow(m * m, (n - 1) / 2);
// }
// }

// public static void main(String args[]) {
// System.out.println(pow(2, 5));
// }
// }

// e^x by Recursion (using Taylyor Series)

// import java.text.DecimalFormat;
// import java.util.*;

// public class Main {
// static double p = 1, f = 1;

// static double e(int x, int n) {
// double r;

// // Termination Condition
// if (n == 0) {
// return 1;
// }

// // Recursive call
// r = e(x, n - 1);

// // Update the power of x
// p = p * x;

// // Factorial
// f = f * n;

// return (r + p / f);

// }

// // Driver code
// public static void main(String[] args) {
// int x = 4, n = 15;
// DecimalFormat df = new DecimalFormat("0.######");
// System.out.println(df.format(e(x, n)));
// }

// }

// Taylor Series using Horner Rule
// public class Main {
// static double e(int x, int n) {
// // final int s = 1;
// double s = 1;
// if (n == 0) {
// return s;
// }
// s = 1 + x * s / n;
// return e(x, n - 1);
// }

// public static void main(String args[]) {
// System.out.println(e(2, 10));
// }
// }

// Taylor Series using iteration
// public class Main {
// static double e(int x, int n) {
// double s = 1;
// int i;
// double num = 1;
// double den = 1;

// for (i = 1; i < n; i++) {
// num *= x;
// den *= i;
// s += num / den;
// }
// return s;
// }

// public static void main(String args[]) {
// System.out.println(e(1, 10));
// }
// }

////////////////////////////////////////////////////////////
// Fibonacci Series using Recursion

// public class Main {
// public static int fibRecursion(int count) {
// if (count == 0) {
// return 0;
// }

// if (count == 1 || count == 2) {
// return 1;
// }

// return fibRecursion(count - 1) + fibRecursion(count - 2);
// }

// public static void main(String args[]) {
// int fib_len = 9;

// System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");

// for (int i = 0; i < fib_len; i++) {
// System.out.print(fibRecursion(i) + " ");
// }
// }
// }

//////////////////////////////////////////////////////////
// Program to calculate value of nCr using Recursion

// import java.io.*;

// class Main {
// static int comb(int n, int r) {
// if (n < r) {
// return 0;
// }
// if (r == 0) {
// return 1;
// }
// if (r == 1) {
// return n;
// }
// if (n == 1) {
// return 1;
// }

// return comb(n - 1, r - 1) + comb(n - 1, r);
// }

// public static void main(String[] args) {
// int n = 5, r = 3;
// System.out.println(comb(n, r));
// }
// }
///////////////////////////////////////////////////////

// class Main {
// static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
// if (n == 1) {
// System.out.println("Move disk 1 from " + from_rod + " to rod" + to_rod);
// }
// towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
// System.out.println("Move disk " + n + " from rod " + from_rod + " to rod" +
// to_rod);
// towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
// }

// public static void main(String args[]) {
// int n = 4;
// towerOfHanoi(n, '1', '2', '3');
// }
// }