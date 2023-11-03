// Implementation of Stack using Array
// class Stack {
// static final int MAX = 1000;
// int top;
// int a[] = new int[MAX]; // maximum size of stack

// boolean isEmpty() {
// return (top < 0);
// }

// Stack() {
// top = -1;
// }

// boolean push(int x) {
// if (top >= (MAX - 1)) {
// System.out.println("Stack Overflow");
// return false;
// } else {
// a[++top] = x;
// System.out.println(x + " pushed into stack");
// return true;
// }
// }

// int pop() {
// if (top < 0) {
// System.out.println("Stack Underflow");
// return 0;
// } else {
// int x = a[top--];
// return x;
// }
// }

// int peek() {
// if (top < 0) {
// System.out.println("Stack Underflow");
// return 0;
// } else {
// int x = a[top];
// return x;
// }
// }

// void print() {
// for (int i = top; i > -1; i--) {
// System.out.println(" " + a[i]);

// }
// }
// }

// class Main {
// public static void main(String[] args) {
// Stack s = new Stack();
// s.push(10);
// s.push(20);
// s.push(30);
// System.out.println(s.pop() + " Popped from stack");
// System.out.println("Top Element is :" + s.peek());
// System.out.println("Elements present in stack :");
// s.print();

// }
// }

////////////////////////////////////////////////////
// Stack using Singly Linked List
// import static java.lang.System.exit;

// class GFG {
// public static void main(String[] args) {
// // crate object of Implementing class
// StackUsingLinkedList obj = new StackUsingLinkedList();

// // insert stack value
// obj.push(11);
// obj.push(22);
// obj.push(33);
// obj.push(44);

// obj.display();

// System.out.printf("\nTop element is %d\n",
// obj.peek());

// // Delete top element of Stack
// obj.pop();
// obj.pop();

// // print Stack elements
// obj.display();

// // print Top element of Stack
// System.out.printf("\nTop element is %d\n",
// obj.peek());

// }
// }

// class StackUsingLinkedList {
// // a linked list node
// private class Node {
// int data;
// Node link;

// }

// // create global top reference variable global
// Node top;

// // constrctor
// StackUsingLinkedList() {
// this.top = null;
// }

// // utility function to add an element x in the stack
// public void push(int x) {
// // create a new node temp and allocate memory
// Node temp = new Node();

// // check if stack(heap) is fulll.
// // Then inserting an
// // element would lead to stack overflow
// // if (temp == null) {
// // System.out.print("\nHeap Overflow");
// // return;
// // }

// // initalize data into temp data field
// temp.data = x;

// // put top reference into temp link
// temp.link = top;

// // update top reference
// top = temp;
// }

// // utility function to check if the stack is empty or not
// public boolean isEmpty() {
// return top == null;
// }

// // utility function to return the top element in a stack
// public int peek() {
// // check for empty stack
// if (!isEmpty()) {
// return top.data;
// } else {
// System.out.println("Stack is empty");
// return -1;
// }
// }

// // utility function to pop top element from the stack
// public void pop() {
// if (top == null) {
// System.out.println("\n Stack Underflow");
// return;
// }

// // update the top pointer to point to the next node
// top = top.link;
// }

// public void display() {
// // check for stack underflow
// if (top == null) {
// System.out.println("\n Stack Underflow");
// exit(1);
// } else {
// Node temp = top;
// while (temp != null) {
// // print node data
// System.out.print(temp.data);

// // assign temp link to temp
// temp = temp.link;
// if (temp != null) {
// System.out.print(" -> ");
// }
// }
// }
// }

// }

////////////////////////////////////////////////////////
// Check for balanced parenthesis in an expression
// import java.util.*;

// public class Main {
// // function to check if the brackets are balanced
// static boolean areBracketsBalanced(String expr) {
// // using ArrayDeque is faster tahtn using stack class
// Deque<Character> stack = new ArrayDeque<Character>();

// // traversing the expression
// for (int i = 0; i < expr.length(); i++) {
// char x = expr.charAt(i);

// if (x == '(' || x == '[' || x == '{') {
// // push the element in the stack
// stack.push(x);
// continue;
// }

// // if the current character is not opening
// // bracker, then it must be closing. So stack
// // cannot be empty at this point.
// if (stack.isEmpty()) {
// return false;
// }

// char check;
// switch (x) {
// case ')':
// check = stack.pop();
// if (check == '{' || check == '[') {
// return false;
// }
// break;

// case '}':
// check = stack.pop();
// if (check == '(' || check == '[') {
// return false;
// }
// break;

// case ']':
// check = stack.pop();
// if (check == '(' || check == '{') {
// return false;
// }
// break;
// }
// }
// return (stack.isEmpty());
// }

// public static void main(String[] args) {
// String expr = "([{}])";

// // function call
// if (areBracketsBalanced(expr)) {
// System.out.println("Balanced");
// } else {
// System.out.println("Not Balanced");
// }
// }
// }

//////////////////////////////////////////////////////////
// Stack class in Java
// import java.io.*;
// import java.util.Stack;

// class Test {
// // pushing element on the top of the stack
// static void stack_push(Stack<Integer> stack) {
// for (int i = 0; i < 5; i++) {
// stack.push(i);
// }
// }

// // popping element from the top of the stack
// static void stack_pop(Stack<Integer> stack) {
// System.out.println("Pop Operation: ");

// for (int i = 0; i < 5; i++) {
// Integer y = (Integer) stack.pop();
// System.out.println(y);
// }
// }

// // displaying element on the top of the stack
// static void stack_peek(Stack<Integer> stack) {
// Integer element = (Integer) stack.peek();
// System.out.println("Element on stack top: " + element);
// }

// // searching element in the stack
// static void stack_search(Stack<Integer> stack, int element) {
// Integer pos = (Integer) stack.search(element);

// if (pos == -1) {
// System.out.println("Element not found");
// } else {
// System.out.println("Element is found at position: " + pos);
// }
// }

// public static void main(String[] args) {
// Stack<Integer> stack = new Stack<Integer>();

// stack_push(stack);
// stack_pop(stack);
// stack_push(stack);
// stack_peek(stack);
// stack_search(stack, 2);
// stack_search(stack, 6);

// }

// }

/////////////////////////////////////////////////////////////
// ArrayDeque
// import java.util.*;

// class GFG {
// public static void main(String[] args) {
// Deque<Character> stack = new ArrayDeque<Character>();

// stack.push('A');
// stack.push('B');
// System.out.println(stack.peek());
// System.out.println(stack.pop());
// }
// }

/////////////////////////////////////////////////
// Convert Infix to postfix expression
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class Main {
  // a utility function to return
  // precedence of a given operator
  // Higher returned value means
  // higher precedence
  static int Prec(char ch) {
    switch (ch) {
      case '+':
      case '-':
        return 1;

      case '*':
      case '/':
        return 2;

      case '^':
        return 3;

    }
    return -1;
  }

  // the main method that converts
  // given infix expression
  // to postfix expression
  static String infixToPostfix(String exp) {
    // initializing empty String for result
    String result = new String("");

    // Initializing empty stack
    Deque<Character> stack = new ArrayDeque<>();

    for (int i = 0; i < exp.length(); ++i) {
      char c = exp.charAt(i);

      // if the scanned character is an
      // operand, add it to output
      if (Character.isLetterOrDigit(c))
        result += c;

      // if the scanned character is an '(',
      // push it to the stack
      else if (c == '(') {
        stack.push(c);
      }

      // if the scanned charcter is an ')',
      // pop and output from the stack
      // until an '(' is encountered.
      else if (c == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
          result += stack.peek();
          stack.pop();
        }
      }

      // an operator is encountered
      else {
        while (!stack.isEmpty() && (Prec(c) <= Prec(stack.peek()))) {
          result += stack.peek();
          stack.pop();
        }
        stack.push(c);
      }
    }

    // pop all the operators from the stack
    while (!stack.isEmpty()) {
      if (stack.peek() == '(') {
        return "Invalid Expresssion";
      }
      result += stack.peek();
      stack.pop();
    }
    return result;
  }

  public static void main(String[] args) {
    String exp = "a+b*/c";

    // function call
    System.out.println(infixToPostfix(exp));
  }

}