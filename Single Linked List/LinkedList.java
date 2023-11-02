// class Main {
// Node head; // head of list

// // Linked list node
// static class Node {
// int data;
// Node next;

// // Constructor to create a new node
// // Next is by defautl initialized as null
// Node(int d) {
// data = d;
// }
// }
// }

/////////////////////////////////
// Insertion in Linked List

// import java.io.*;

// public class LinkedList {
// Node head; // head of list

// // Linked list Node.
// // This inner class is made static,
// // so that main() can access it
// static class Node {
// int data;
// Node next;

// // constructor
// Node(int d) {
// data = d;
// next = null;
// }
// }

// // Method to insett a new node
// public static LinkedList insert(LinkedList list, int data) {
// // create a new node with given data
// Node new_node = new Node(data);

// // If the Linked List is empty,
// // then make the new node as head
// if (list.head == null) {
// list.head = new_node;
// } else {
// // Else traverse till the last node
// // and insert the new_node there
// Node last = list.head;
// while (last.next != null) {
// last = last.next;
// }

// // Insert the new_node at last node
// last.next = new_node;
// }
// // Return the list by head
// return list;
// }

// // Method to print the LinkedList
// public static void printList(LinkedList list) {
// Node currNode = list.head;

// System.out.print("LikedList: ");

// // Traverse through the LinkedList
// while (currNode != null) {
// // print the data at current node
// System.out.print(currNode.data + " ");

// // Go to next node
// currNode = currNode.next;
// }
// }

// // Driver code
// public static void main(String[] args) {
// // start with the empty list.
// LinkedList list = new LinkedList();

// //
// // *************INSERTION**************
// //

// // Insert the values
// list = insert(list, 1);
// list = insert(list, 2);
// list = insert(list, 3);
// list = insert(list, 4);
// list = insert(list, 5);
// list = insert(list, 6);
// list = insert(list, 7);
// list = insert(list, 8);

// printList(list);

// }
// }

////////////////////////////////////////////////////////
// Traversal: For traversal, below is a general-purpose function printList()
//////////////////////////////////////////////////////// that prints any given
//////////////////////////////////////////////////////// list by traversing the
//////////////////////////////////////////////////////// list from head node to
//////////////////////////////////////////////////////// the last.

// import java.io.*;

// public class LinkedList {
// Node head; // head of list

// // Linked list Node.
// // Node is a static nested class
// // so main() can access it
// static class Node {
// int data;
// Node next;

// // constructor
// Node(int d) {
// data = d;
// next = null;
// }
// }

// // Method to insert a new node
// public static LinkedList insert(LinkedList list, int data) {
// // create a new node with given data
// Node new_node = new Node(data);
// new_node.next = null;

// // If the Linked List is empty,
// // then make the new node as head
// if (list.head == null) {
// list.head = new_node;
// } else {
// // Else traverse till the last node
// // and insert the new_node there
// Node last = list.head;
// while (last.next != null) {
// last = last.next;
// }

// // insert the new_node at last node
// last.next = new_node;
// }
// // return the list by head
// return list;
// }

// // Method to print the LinkedList
// public static void printList(LinkedList list) {
// Node currNode = list.head;

// System.out.print("LinkedList: ");

// // traverse through the LinkedList
// while (currNode != null) {
// // print the data at current node
// System.out.print(currNode.data + " ");

// // Go to next node
// currNode = currNode.next;
// }
// }

// // Driver code
// public static void main(String[] args) {
// LinkedList list = new LinkedList();

// list = insert(list, 1);
// list = insert(list, 2);
// list = insert(list, 3);
// list = insert(list, 4);
// list = insert(list, 5);
// list = insert(list, 6);
// list = insert(list, 7);
// list = insert(list, 8);

// // print the LinkedList
// printList(list);

// }
// }

//////////////////////////////////////////////////////////
// Traversing linked list

// class Node {
// int data;
// Node next;
// }

// class LinkedList {
// Node head;

// LinkedList() {
// head = null;
// }

// // add new element at the end of the list
// void push_back(int newElement) {
// Node newNode = new Node();
// newNode.data = newElement;
// newNode.next = null;

// if (head == null) {
// head = newNode;
// } else {
// Node temp = new Node();
// temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = newNode;
// }
// }

// // display the content of the list
// void PrintList() {
// Node temp = new Node();
// temp = this.head;
// if (temp != null) {
// System.out.print("The list contains: ");
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// System.out.println();
// } else {
// System.out.println("The list is empty.");
// }
// }
// }

//////////////////////////////////////////////////////
// Recursive insertion and traversal linked list

// class Node {
// int data;
// Node next;
// }

// function to inset a new node at the end of linked list using recursion
// static Node insertEnd(Node head, int data){
// // if linked list is empty, create a new node
// if( head==null){
// return newNode(data);
// }
// else{
// head.next= insertEnd(head.next, data);
// }
// return head;
// }

// Recursively traversing the list
// static void traverse(Node head){
// if(head == null){
// return;
// }
// // if head is not null, print current node and recur for remaining list
// System.out.print(head.data+" ");
// traverse(head.next);
// }

///////////////////////////////////////////////
// Complete traversal with Recursion
// public class LinkedList {
// static class Node {
// int data;
// Node next;
// }

// // Allocates a new node with a given data
// static Node newNode(int data) {
// Node new_node = new Node();
// new_node.data = data;
// new_node.next = null;
// return new_node;
// }

// // functioni to insert a new node at the end of linked list using recursion
// static Node insertEnd(Node head, int data) {
// // if linked list is empty, create a new node
// if (head == null) {
// return newNode(data);
// } else {
// head.next = insertEnd(head.next, data);
// }
// return head;
// }

// static void traverse(Node head) {
// if (head == null) {
// return;
// }
// System.out.print(head.data + " ");
// traverse(head.next);
// }

// public static void main(String args[]) {
// Node head = null;
// head = insertEnd(head, 6);
// head = insertEnd(head, 8);
// head = insertEnd(head, 10);
// head = insertEnd(head, 12);
// head = insertEnd(head, 14);
// traverse(head);
// }
// }

////////////////////////////////////////////////////////
// Sum of the nodes of a Singly Linked List
// Iterative Approach

// class LinkedList {
// static Node head;

// static class Node {
// int data;
// Node next;
// }

// static Node push(Node head_ref, int new_data) {
// // allocate node
// Node new_node = new Node();

// // put in the data
// new_node.data = new_data;

// // link the old list to the new node
// new_node.next = head_ref;

// // move the head to point to the new node
// head_ref = new_node;

// return head = head_ref;
// }

// // function to find the sum of nodes of the given linked list
// static int sumOfNodes(Node head) {
// Node ptr = head;
// int sum = 0;
// while (ptr != null) {
// sum += ptr.data;
// ptr = ptr.next;
// }
// return sum;
// }

// // driver code
// public static void main(String[] args) {
// push(head, 7);
// push(head, 6);
// push(head, 8);
// push(head, 4);
// push(head, 1);

// System.out.println("Sum of nodes = " + sumOfNodes(head));
// }
// }

///////////////////////
// Sum using Recursive Approach

// class LinkedList {
// static int sum = 0;

// static class Node {
// int data;
// Node next;
// }

// static Node push(Node head_ref, int new_data) {
// Node new_node = new Node();
// new_node.data = new_data;
// new_node.next = head_ref;
// head_ref = new_node;
// return head_ref;
// }

// static void sumOfNodes(Node head) {
// if (head == null) {
// return;
// }
// sumOfNodes(head.next);
// sum = sum + head.data;
// }

// static int sumOfNodesUtil(Node head) {
// sum = 0;
// sumOfNodes(head);
// return sum;
// }

// public static void main(String args[]) {
// Node head = null;

// head = push(head, 7);
// head = push(head, 6);
// head = push(head, 8);
// head = push(head, 4);
// head = push(head, 1);

// System.out.println("Sum of nodes = " + sumOfNodesUtil(head));
// }
// }

////////////////////////////////////////////////////////////////////////
// Finding Maximum Value and Minimum Value in Linked List

// public class LinkedList {
// static class Node {
// int data;
// Node next;
// }

// static Node head = null;

// static int largestElement(Node head) {
// int max = Integer.MIN_VALUE;

// while (head != null) {
// if (max < head.data) {
// max = head.data;
// }
// head = head.next;
// }
// return max;
// }

// static int smallestElement(Node head) {
// int min = Integer.MAX_VALUE;

// while (head != null) {
// if (min > head.data) {
// min = head.data;
// }
// head = head.next;
// }
// return min;
// }

// static void push(int data) {
// Node newNode = new Node();
// newNode.data = data;
// newNode.next = head;
// head = newNode;
// }

// static void printList(Node head) {
// while (head != null) {
// System.out.print(head.data + " -> ");
// head = head.next;
// }
// System.out.println("NULL");
// }

// public static void main(String args[]) {
// push(9);
// push(7);
// push(2);
// push(5);
// System.out.println("Linked list is: ");
// printList(head);
// System.out.print("Maximum element in linked list: ");
// System.out.println(largestElement(head));
// System.out.print("Minimum element in linked list: ");
// System.out.print(smallestElement(head));
// }
// }

///////////////////////////////////////////////////////
// Linear Search in Linked List

// public class LinkedList {
// class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public Node head = null;

// // adding node method
// public void addNode(int data) {
// Node newNode = new Node(data);

// // if node is emtpy
// if (head == null) {
// head = newNode;
// newNode.next = null;
// } else {
// while (head != null) {
// head = head.next;
// }
// head.next = newNode;
// newNode.next = null;
// }
// }
// // searching the node
// }

///////////////////////////////////////////////////////
// Insertion of Node in Linked List

// inserting at the first position

// public void push(int new_data){
// Node new_nodw = new Node(new_data);
// new_node.next= head;
// head= new_node;
// }

////////////////////////////////////////
// after a given node
// time complexity of insertAfter() is O(1).

// public void insertAfter(Node prev_node, int new_data){
// // check is the given node is null
// if( prev_node ==null){
// System.out.println("The previous node cannot be null");
// return;
// }

// // allocate the node and put in the data
// Node new_node = new Node(new_data);

// // make the next of new node as next of prev_node
// new_node.next = prev_node.next;

// prev_node.next = new_node;
// }

///////////////////////////////////////////
// Add a node at the end:

// public void append(int new_data){
// // allocate the Node
// // put in the data
// // set next as null
// Node new_node = new Node(new_data);

// // if the linked list is empty, then make the new node as head
// if( head = null){
// head = new Node(new_data);
// return ;
// }

// // the new node is going to be the last node, so make next of it as null.
// new_node.next =null;

// // Else traverse til the last node
// Node last = head;
// while(last.next!=null){
// last =last.next;
// }

// last.next = new_node;
// return;
// }

// public void printList(){
// Node tnode= head;
// while(tnode!=null){
// System.out.print(tnode.data+" ");
// tnode = tnode.next;
// }
// }

// public static void main(String[] args){
// LinkedList llist= new LinkedList();

// llist.append(6);
// llits.push(7);
// llist.insertAfter(lllist.head, 8);

// }

//////////////////////////////////////////////
// Inserting at the last of a linked list

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// class LinkedList {
// Node head;

// // Inserts a new node at the front of the list
// void push(int new_data) {
// Node new_node = new Node(new_data);
// new_node.next = head;
// head = new_node;
// }

// // appends a new node at the end of the list
// void append(int new_data) {
// Node new_node = new Node(new_data);

// if (head == null) {
// head = new_node;
// return;
// }

// Node last = head;
// while (last.next != null) {
// last = last.next;
// }
// last.next = new_node;
// }

// void printList() {
// Node node = head;
// while (node.next != null) {
// System.out.print(node.data + " ");
// node = node.next;
// }
// }

// public class Main {
// public static void main(String[] args) {
// LinkedList linkedList = new LinkedList();

// linkedList.push(6);
// linkedList.push(5);
// linkedList.push(4);
// linkedList.push(3);
// linkedList.push(2);

// System.out.print("Created Linked list is: ");
// linkedList.printList();

// // insert 1 at the end
// linkedList.append(1);

// System.out.print("\nAfter inserting 1 at the end: ");
// linkedList.printList();
// }

// }

// }

/////////////////////////////////////////////////////
// Insertion in a Sorted Linked List

// class LinkedList {
// Node head;

// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// // function to insert a new_node in a list
// void sortedInsert(Node new_node) {
// Node current;

// // special case for head node
// if (head == null || head.data >= new_node.data) {
// new_node.next = head;
// head = new_node;
// } else {
// // locate the node before point of insertion
// current = head;
// while (current.next != null && current.next.data < new_node.data) {
// current = current.next;
// }
// new_node.next = current.next;
// current.next = new_node;
// }

// }

// // function to create a ndde
// Node newNode(int data) {
// Node x = new Node(data);
// return x;
// }

// // function to print linked list
// void printList() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }

// public static void main(String args[]) {
// LinkedList llist = new LinkedList();
// Node new_node;
// new_node = llist.newNode(5);
// llist.sortedInsert(new_node);

// new_node = llist.newNode(10);
// llist.sortedInsert(new_node);
// new_node = llist.newNode(7);
// llist.sortedInsert(new_node);
// new_node = llist.newNode(3);
// llist.sortedInsert(new_node);
// new_node = llist.newNode(1);
// llist.sortedInsert(new_node);
// new_node = llist.newNode(9);
// llist.sortedInsert(new_node);

// System.out.println("Created Linked List");
// llist.printList();

// }
// }

///////////////////////////////////////////////////
// Shorter Implementation using double pointers:

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// next = null;
// }
// }

// public class LinkedList {
// Node head;

// static class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// // function to insert a new node in a sorted way
// public void sortedInsert(Node new_node) {
// if (head == null) {
// head = new_node;
// return;
// }

// Node current = head;
// Node prev = null;

// while (current != null && current.data < new_node.data) {
// prev = current;
// current = current.next;
// }

// if (prev == null) {
// new_node.next = head;
// head = new_node;
// } else {
// new_node.next = current;
// prev.next = new_node;
// }
// }

// public void printList() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// }

// public static void main(String[] args) {
// LinkedList list = new LinkedList();

// Node new_node = new Node(5);
// list.sortedInsert(new_node);
// new_node = new Node(10);
// list.sortedInsert(new_node);

// new_node = new Node(7);
// list.sortedInsert(new_node);

// new_node = new Node(3);
// list.sortedInsert(new_node);

// new_node = new Node(1);
// list.sortedInsert(new_node);

// new_node = new Node(9);
// list.sortedInsert(new_node);

// System.out.println("Created Linked List: ");
// list.printList();
// }
// }

/////////////////////////////////////////////////////////////
// Java program for deleting a Node in a Linked List

// class LinkedList {
// Node head;

// class Node {
// int data;
// Node next;

// Node(int d) {
// this.data = d;
// next = null;
// }
// }

// // given a key, deletes the first ocurence of key in linked list
// void deleteNode(int key) {
// Node temp = head, prev = null;

// // if head node itself holds the key to be deleted
// if (temp != null && temp.data == key) {
// head = temp.next;
// return;
// }

// // search for the key to be deleted, keep the track of the previous node as
// we
// // need to change temp.next
// while (temp != null && temp.data != key) {
// prev = temp;
// temp = temp.next;
// }

// // if key was not present in linked list
// if (temp == null) {
// return;
// }

// // unlike the node from linked
// prev.next = temp.next;
// }

// public void push(int new_data) {
// Node new_node = new Node(new_data);
// new_node.next = head;
// head = new_node;
// }

// public void printList() {
// Node tnode = head;
// while (tnode != null) {
// System.out.print(tnode.data + " ");
// tnode = tnode.next;
// }
// }

// public static void main(String[] args) {
// LinkedList llist = new LinkedList();

// llist.push(7);
// llist.push(1);
// llist.push(3);
// llist.push(2);

// System.out.println("Created Linked List is : ");
// llist.printList();
// llist.deleteNode(1);
// System.out.println("Linked List after Deletion of 1:");
// llist.printList();
// }
// }

///////////////////////////////////////////////////////////
// Checking is the Single Linked List in Sorted

// class GFG {
// static class Node {
// int data;
// Node next;
// }

// // function to check Linked list is sorted in descednign order or not
// static boolean isSortedDesc(Node head) {
// if (head == null) {
// return true;
// }

// // traverse the list till last node and return false if a node is smaller
// than
// // or equal its next.
// for (Node t = head; t.next != null; t = t.next) {
// if (t.data < t.next.data) {
// return false;
// }
// }
// return true;
// }

// static Node newNode(int data) {
// Node temp = new Node();
// temp.next = null;
// temp.data = data;
// return temp;
// }

// public static void main(String[] args) {
// Node head = newNode(7);
// head.next = newNode(5);
// head.next.next = newNode(4);
// head.next.next.next = newNode(3);

// if (isSortedDesc(head)) {
// System.out.println("Yes");
// } else {
// System.out.println("No");
// }
// }
// }

/////////////////////////////////////////////
// Recursive Approach
// class GFG {
// static class Node {
// int data;
// Node next;
// }

// static boolean isSortedDesc(Node head) {
// // base cases
// if (head == null || head.next == null) {
// return true;
// }

// // check first two nodes and recusively
// // check remaining
// return (head.data > head.next.data) && (isSortedDesc(head.next));

// }

// static Node newNode(int data) {
// Node temp = new Node();
// temp.next = null;
// temp.data = data;
// return temp;
// }

// public static void main(String[] args) {
// Node head = newNode(7);
// head.next = newNode(5);
// head.next.next = newNode(4);
// head.next.next.next = newNode(3);

// if (isSortedDesc(head) == true) {
// System.out.println("Yes");
// } else {
// System.out.println("No");
// }
// }
// }

///////////////////////////////////////////////////////////
// REMOVE DUPLICATES FROM A SORTED LINKED LIST

// import java.util.*;

// class LinkedList {
// Node head;

// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// void removeDuplicates() {
// // another reference to head
// Node curr = head;

// // traverse list till the last node
// while (curr != null) {
// Node temp = curr;

// // compare current node with the next node and keep on deletin them until it
// // matches the current node data
// while (temp != null && temp.data == curr.data) {
// temp = temp.next;
// }
// // set current node next to the next different element denoted by temp
// curr.next = temp;
// curr = curr.next;
// }
// }

// public void push(int new_data) {
// Node new_node = new Node(new_data);

// new_node.next = head;

// head = new_node;
// }

// /* Function to print linked list */
// void printList() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// System.out.println();
// }

// /* Driver program to test above functions */
// public static void main(String args[]) {
// LinkedList llist = new LinkedList();
// llist.push(20);
// llist.push(13);
// llist.push(13);
// llist.push(11);
// llist.push(11);
// llist.push(11);

// System.out.println(
// "List before removal of duplicates");
// llist.printList();

// llist.removeDuplicates();

// System.out.println(
// "List after removal of elements");
// llist.printList();
// }
// }

///////////////////////////////////////////////////////////////
// Reverse a Linked List
// Method 1: By iterative method.

// class LinkedList {
// static Node head;

// static class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// Node reverse(Node node) {
// Node prev = null;
// Node current = node;
// Node next = null;

// while (current != null) {
// next = current.next;
// current.next = prev;
// prev = current;
// current = next;
// }

// node = prev;
// return node;
// }

// void printList(Node node) {
// while (node != null) {
// System.out.print(node.data + " ");
// node = node.next;
// }
// }

// public static void main(String[] args) {
// LinkedList list = new LinkedList();
// list.head = new Node(85);
// list.head.next = new Node(15);
// list.head.next.next = new Node(4);
// list.head.next.next.next = new Node(20);

// System.out.println("Given linked list");
// list.printList(head);
// head = list.reverse(head);
// System.out.println("");
// System.out.println("Reversed linked list ");
// list.printList(head);

// }
// }

/////////////////////////////////////////////
// Using Reursive Approach

// import java.util.*;

// class LinkedList {
// static Node head;

// static class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// static Node reverse(Node head) {
// if (head == null || head.next == null) {
// return head;
// }

// // reverse the rest list and put the first element at the end
// Node rest = reverse(head.next);
// head.next.next = head;

// head.next = null;

// return rest;
// }

// static void print() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// System.out.println();
// }

// static void push(int data) {
// Node temp = new Node(data);
// temp.next = head;
// head = temp;
// }

// public static void main(String args[]) {
// push(20);
// push(4);
// push(15);
// push(85);

// System.out.println("Given linked list");
// print();

// head = reverse(head);

// System.out.println("Reversed linked list");
// print();
// }
// }

/////////////////////////////////////////////////////
// Concatentaion of two Linked Lists in O(1) time
// import java.io.*;

// class Node {
// int data;
// Node next;

// // constructor
// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// class LinkedList {
// public static Node insertAtTail(Node head1, Node tail1, int data) {
// Node temp = new Node(data);
// tail1.next = temp;
// tail1 = temp;
// return tail1;
// }

// public static void print(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }

// public static void concat(Node head1, Node head2, Node tail1) {
// tail1.next = head2;
// }

// public static void main(String[] args) {
// Node node1 = new Node(1);
// Node head1 = node1;
// Node tail1 = node1;

// tail1 = insertAtTail(head1, tail1, 2);
// tail1 = insertAtTail(head1, tail1, 3);
// tail1 = insertAtTail(head1, tail1, 4);
// tail1 = insertAtTail(head1, tail1, 5);

// System.out.println("First Linked List: ");
// print(head1);

// Node node2 = new Node(6);
// Node head2 = node2;
// Node tail2 = node2;

// tail2 = insertAtTail(head2, tail2, 7);
// tail2 = insertAtTail(head2, tail2, 8);
// tail2 = insertAtTail(head2, tail2, 9);
// tail2 = insertAtTail(head2, tail2, 10);

// System.out.println("Second Linked List: ");
// print(head2);

// concat(head1, head2, tail1);

// System.out.println(
// "First Linked List after concatenation: ");
// print(head1);

// }
// }

///////////////////////////////////////////////////////////////
// Merging two Sorted Linked List
// Method 1: Brute Force Method (makeing use of a vector of n+m size)

// import java.util.*;

// class Node {
// int key;
// Node next;

// public Node(int key) {
// this.key = key;
// next = null;
// }
// }

// public class LinkedList {
// public static Node newNode(int key) {
// return new Node(key);
// }

// public static void main(String[] args) {
// Node a = new Node(5);
// a.next = new Node(10);
// a.next.next = new Node(15);
// a.next.next.next = new Node(40);

// Node b = new Node(2);
// b.next = new Node(3);
// b.next.next = new Node(20);

// List<Integer> v = new ArrayList<>();

// while (a != null) {
// v.add(a.key);
// a = a.next;
// }

// while (b != null) {
// v.add(b.key);
// b = b.next;
// }

// Collections.sort(v);
// Node result = new Node(-1);
// Node temp = result;
// for (int i = 0; i < v.size(); i++) {
// result.next = new Node(v.get(i));
// result = result.next;
// }

// temp = temp.next;
// System.out.print("Resultant Merge Linked List is :");
// while (temp != null) {
// System.out.print(temp.key + " ");
// temp = temp.next;
// }

// }
// }

/////////////////////////////////////////////////////////
// Method 2: Using Dummy Node

// import java.util.*;

// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// class LinkedList {
// Node head;

// // method to insert a node at the end of the linked list
// public void addToTheLast(Node node) {
// if (head == null) {
// head = node;
// } else {
// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = node;
// }
// }

// // method to print teh linked list
// void printList() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// System.out.println();
// }

// public static void main(String[] args) {
// LinkedList llist1 = new LinkedList();
// LinkedList llist2 = new LinkedList();

// llist1.addToTheLast(new Node(5));
// llist1.addToTheLast(new Node(10));
// llist1.addToTheLast(new Node(15));

// // Node head2 = new Node(2);
// llist2.addToTheLast(new Node(2));
// llist2.addToTheLast(new Node(3));
// llist2.addToTheLast(new Node(20));

// llist1.head = new Gfg().sortedMerge(llist1.head, llist2.head);

// System.out.println("Merged Linked List is:");
// llist1.printList();
// }
// }

// class Gfg {
// Node sortedMerge(Node headA, Node headB) {
// // a dummy first node to hang the result on
// Node dummyNode = new Node(0);

// // tail points to teh last result node
// Node tail = dummyNode;
// while (true) {
// // if either list runs out use the other list
// if (headA == null) {
// tail.next = headB;
// break;
// }

// if (headB == null) {
// tail.next = headA;
// break;
// }

// // compare the data of the two lists whichever lists' data is smaller, append
// it
// // into tail and advance the head to the next Node
// if (headA.data <= headB.data) {
// tail.next = headA;
// headA = headA.next;
// } else {
// tail.next = headB;
// headB = headB.next;
// }

// // advance the tail
// tail = tail.next;
// }
// return dummyNode.next;
// }
// }

/////////////////////////////////////////////////////
// Floyd's Cycle Finding Algorithm:

// import java.io.*;

// class LinkedList {
// Node head;

// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// public void push(int new_data) {
// Node new_node = new Node(new_data);
// new_node.next = head;
// head = new_node;
// }

// void detectLoop() {
// Node slow_p = head, fast_p = head;
// int flag = 0;
// while (slow_p != null && fast_p != null && fast_p.next != null) {
// slow_p = slow_p.next;
// fast_p = fast_p.next.next;
// if (slow_p == fast_p) {
// flag = 1;
// break;
// }
// }
// if (flag == 1) {
// System.out.println("Loop Found");
// } else {
// System.out.println("No Loop");
// }
// }

// public static void main(String args[]) {
// LinkedList llist = new LinkedList();

// llist.push(20);
// llist.push(4);
// llist.push(15);
// llist.push(10);

// // create loop for testing
// llist.head.next.next.next.next = llist.head;

// llist.detectLoop();

// }
// }

////////////////////////////////////////////////////////
// Detect the loop in linked list using Hashing
// import java.util.*;

// public class LinkedList {
// Node head;

// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// // inserts a new Node at front of the list
// public void push(int new_data) {
// Node new_node = new Node(new_data);
// new_node.next = head;
// head = new_node;
// }

// static boolean detectLoop(Node h) {
// HashSet<Node> s = new HashSet<>();
// while (h != null) {
// // if we have already has this node in hashmap it means there is a cycle
// if (s.contains(h)) {
// return true;
// }

// // if we are seeing the node for the first time,
// // insert it in hash
// s.add(h);

// h = h.next;
// }

// return false;
// }

// public static void main(String[] args) {
// LinkedList llist = new LinkedList();

// llist.push(20);
// llist.push(4);
// llist.push(15);
// llist.push(10);

// // create loop for testing
// llist.head.next.next.next.next = llist.head;

// if (detectLoop(llist.head)) {
// System.out.println("Loop Found");
// } else {
// System.out.println("No Loop");
// }
// }
// }

/////////////////////////////////////////////////////////
// Using Modification in Node Structure
// import java.util.*;

// class LinkedList {
// static class Node {
// int data;
// Node next;
// int flag;
// }

// static Node push(Node head_ref, int new_data) {
// Node new_node = new Node();

// new_node.data = new_data;
// new_node.flag = 0;
// new_node.next = head_ref;
// head_ref = new_node;

// return head_ref;
// }

// static boolean detectLoop(Node h) {
// while (h != null) {
// // if this node is already traverse it means there is a cycle.
// if (h.flag == 1) {
// return true;
// }

// // if we are seeing the node for the first time, mark its flag as 1
// h.flag = 1;

// h = h.next;
// }
// return false;
// }

// public static void main(String[] args) {
// Node head = null;

// head = push(head, 20);
// head = push(head, 4);
// head = push(head, 15);
// head = push(head, 10);

// // create a loop
// head.next.next.next.next = head;

// if (detectLoop(head)) {
// System.out.print("Loop Found");
// } else {
// System.out.print("No Loop");
// }
// }
// }

///////////////////////////////////////////////////////
// By marking vistied nodes without modfifying Node structure.

// public class LinkedList {
// static class Node {
// int key;
// Node next;
// }

// static Node newNode(int key) {
// Node temp = new Node();
// temp.key = key;
// temp.next = null;
// return temp;
// }

// static void printList(Node head) {
// while (head != null) {
// System.out.print(head.key + " ");
// head = head.next;
// }
// System.out.println();
// }

// static boolean detectLoop(Node head) {
// Node temp = new Node();
// while (head != null) {
// if (head.next == null) {
// return false;
// }

// if (head.next == temp) {
// return true;
// }

// // store the pointer to the next node
// // in order to get to it in the next step
// Node next = head.next;

// // make next pointer to temp
// head.next = temp;

// // get to the next node in the list
// head = next;
// }
// return false;
// }

// public static void main(String args[]) {
// Node head = newNode(1);
// head.next = newNode(2);
// head.next.next = newNode(3);
// head.next.next.next = newNode(4);
// head.next.next.next.next = newNode(5);

// head.next.next.next.next.next = head.next.next;

// boolean found = detectLoop(head);

// if (found) {
// System.out.println("Loop Found");
// } else {
// System.out.println("No Loop");
// }
// }

// }

////////////////////////////////////////////////////////////
// LinkedList class in Java
// import java.util.*;
// // import java.util.LinkedList<String>();
// // import java.util.LinkedList;

// class Main {
//   public static void main(String[] args) {
//     // creating object of the
//     // class linked list
//     // java.util.LinkedList<String> ll = new java.util.LinkedList<String>();

//     LinkedList<String> ll = new LinkedList<String>();
//   }
// }