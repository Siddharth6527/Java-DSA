// class Node {
// int value;
// Node next;

// public Node(int value) {
// this.value = value;
// }
// }

// Node one = new Node(3);
// Node two = new Node(5);
// Node three = new Node(9);

// one.next = two;
// two.next = three;
// three.next = one;

/////////////////////////////////////////////////////////
// Traversal of Circular Linked List

// import java.util.*;
// import java.io.*;

// public class Main {
// static class Node {
// int data;
// Node next;
// }

// // function to insert ja node at the beginning of a circular linked list
// static Node push(Node head_ref, int data) {
// Node ptr1 = new Node();
// Node temp = head_ref;
// ptr1.data = data;
// ptr1.next = head_ref;

// // If linked list is not null, then set the next of last node
// if (head_ref != null) {
// while (temp.next != head_ref) {
// temp = temp.next;
// }
// temp.next = ptr1;
// } else {
// ptr1.next = ptr1;
// }
// head_ref = ptr1;
// return head_ref;
// }

// // function to print nodes in a given circular linked list
// static void printList(Node head) {
// Node temp = head;
// if (head != null) {
// do {
// System.out.print(temp.data + " ");
// temp = temp.next;
// } while (temp != head);
// }
// }

// public static void main(String args[]) {
// Node head = null;

// head = push(head, 12);
// head = push(head, 56);
// head = push(head, 2);
// head = push(head, 11);

// System.out.println("Contents of circular Linked List: ");
// printList(head);
// }

// }
