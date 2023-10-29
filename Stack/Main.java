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
import static java.lang.System.exit;

class GFG {
  public static void main(String[] args) {
    // crate object of Implementing class
    StackUsingLinkedList obj = new StackUsingLinkedList();

    // insert stack value
    obj.push(11);
    obj.push(22);
    obj.push(33);
    obj.push(44);

    obj.display();

    System.out.printf("\nTop element is %d\n",
        obj.peek());

    // Delete top element of Stack
    obj.pop();
    obj.pop();

    // print Stack elements
    obj.display();

    // print Top element of Stack
    System.out.printf("\nTop element is %d\n",
        obj.peek());

  }
}

class StackUsingLinkedList {
  // a linked list node
  private class Node {
    int data;
    Node link;

  }

  // create global top reference variable global
  Node top;

  // constrctor
  StackUsingLinkedList() {
    this.top = null;
  }

  // utility function to add an element x in the stack
  public void push(int x) {
    // create a new node temp and allocate memory
    Node temp = new Node();

    // check if stack(heap) is fulll.
    // Then inserting an
    // element would lead to stack overflow
    // if (temp == null) {
    // System.out.print("\nHeap Overflow");
    // return;
    // }

    // initalize data into temp data field
    temp.data = x;

    // put top reference into temp link
    temp.link = top;

    // update top reference
    top = temp;
  }

  // utility function to check if the stack is empty or not
  public boolean isEmpty() {
    return top == null;
  }

  // utility function to return the top element in a stack
  public int peek() {
    // check for empty stack
    if (!isEmpty()) {
      return top.data;
    } else {
      System.out.println("Stack is empty");
      return -1;
    }
  }

  // utility function to pop top element from the stack
  public void pop() {
    if (top == null) {
      System.out.println("\n Stack Underflow");
      return;
    }

    // update the top pointer to point to the next node
    top = top.link;
  }

  public void display() {
    // check for stack underflow
    if (top == null) {
      System.out.println("\n Stack Underflow");
      exit(1);
    } else {
      Node temp = top;
      while (temp != null) {
        // print node data
        System.out.print(temp.data);

        // assign temp link to temp
        temp = temp.link;
        if (temp != null) {
          System.out.print(" -> ");
        }
      }
    }
  }

}