// java program to implement a queue using an array

// class Queue {
// static private int front, rear, capacity;
// static private int queue[];

// Queue(int c) {
// front = rear = 0;
// capacity = c;
// queue = new int[capacity];
// }

// // function to insert an element
// // at the rear of the queue
// void queueEnqueue(int data) {
// // check queue is full or not
// if (capacity == rear) {
// System.out.println("Queue is full");
// return;
// }

// // insert element at the rear
// else {
// queue[rear] = data;
// rear++;
// }
// return;
// }

// // function to delete an element
// // from the front of the queue
// void queueDequeue() {
// // if queue is emtpy
// if (front == rear) {
// System.out.println("Queue is Empty");
// return;
// }

// // shift all the elemetns from index 2 till rear
// // to the right by one.
// else {
// for (int i = 0; i < rear - 1; i++) {
// queue[i] = queue[i + 1];
// }

// // store 0 at rear indicating there is not element
// if (rear < capacity) {
// queue[rear] = 0;
// }

// // decrement rear
// rear--;
// }
// return;
// }

// // print queue elements
// void queueDisplay() {
// int i;
// if (front == rear) {
// System.out.println("Queue is Empty");
// return;
// }

// // traverse front to rear and print elements
// for (i = front; i < rear; i++) {
// System.out.print(queue[i] + " <--");
// }
// return;
// }

// // print front of queue
// void queueFront() {
// if (front == rear) {
// System.out.println("Queue is Empty");
// return;
// }

// System.out.println("Front Element is :" + queue[front]);
// }
// }

// class Main {
// // driver code
// public static void main(String[] args) {
// // create a queue of capacity 4
// Queue q = new Queue(4);

// // print queue elements
// q.queueDisplay();

// // inserting elements in the queue
// q.queueEnqueue(20);
// q.queueEnqueue(30);
// q.queueEnqueue(40);
// q.queueEnqueue(50);

// // print queue elements
// q.queueDisplay();
// q.queueEnqueue(60);

// // print Queue elements
// q.queueDisplay();

// q.queueDequeue();
// q.queueDequeue();
// System.out.printf(
// "\n\nafter two node deletion\n\n");

// // print Queue elements
// q.queueDisplay();

// // print front of the queue
// q.queueFront();

// }

// }

/////////////////////////////////////////////////////////
// Circular Queue using Array
// import java.util.ArrayList;

// class CircularQueue {
// // declaring the class variable
// private int size, front, rear;

// // Declaring array list of integer type
// private ArrayList<Integer> queue = new ArrayList<Integer>();

// // constructor
// CircularQueue(int size) {
// this.size = size;
// this.front = this.rear = -1;
// }

// // method to insert a new element in the queue
// public void enQueue(int data) {
// // condition if queue is full.
// if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
// System.out.println("Queue is Full");
// }

// // condition for empty queue.
// else if (front == -1) {
// front = 0;
// rear = 0;
// queue.add(rear, data);
// }

// else if (rear == size - 1 && front != 0) {
// rear = 0;
// queue.set(rear, data);
// }

// else {
// rear = (rear + 1);

// // adding a new element if
// if (front <= rear) {
// queue.add(rear, data);
// }

// // else updating old value
// else {
// queue.set(rear, data);
// }
// }
// }

// // function to dequeue an element
// // form th queue
// public int deQueue() {
// int temp;

// // condition for empty queue.
// if (front == -1) {
// System.out.println("Queue is Empty");

// // return -1 in case of empty queue
// return -1;
// }

// temp = queue.get(front);

// // condition for only one element
// if (front == rear) {
// front = -1;
// rear = -1;
// }

// else if (front == size - 1) {
// front = 0;
// }

// else {
// front = front + 1;
// }

// // returns the dequeued element
// return temp;
// }

// // method to display the elements of queue
// public void displayQueue() {
// // condition for empty queue.
// if (front == -1) {
// System.out.println("Queue is Empty");
// return;
// }

// // if rear has not crossed the max size
// // or queue rear is still greater then front.
// System.out.println("Elements in the circular queue are: ");

// if (rear >= front) {
// // loop to print elements from
// // front to rear.
// for (int i = front; i <= rear; i++) {
// System.out.println(queue.get(i));
// System.out.println(" ");
// }
// System.out.println();

// }

// // if rear crossed the max index and
// // indexing has started in loop
// else {
// // loop for printing elemets from
// // front to max size or last index
// for (int i = front; i < size; i++) {
// System.out.println(queue.get(i));
// System.out.println();
// }

// // loop for printing elements from
// // 0th index till rear position
// for (int i = 0; i <= rear; i++) {
// System.out.println(queue.get(i));
// System.out.println();
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// CircularQueue q = new CircularQueue(5);

// q.enQueue(14);
// q.enQueue(22);
// q.enQueue(13);
// q.enQueue(-6);

// q.displayQueue();

// int x = q.deQueue();

// // checking for empy queue.
// if (x != -1) {
// System.out.println("Delted value = ");
// System.out.println(x);
// }

// x = q.deQueue();

// // checking for empty queue
// if (x != -1) {
// System.out.println("Deleted value = ");
// System.out.println(x);
// }

// q.displayQueue();

// q.enQueue(9);
// q.enQueue(20);
// q.enQueue(5);

// q.displayQueue();

// q.enQueue(20);
// }

// }

/////////////////////////////////////////////////////////////
// Queue implementation using Linked List
// a linked list (ll) node to store a queue entry
// class QNode {
// int key;
// QNode next;

// // constructor to create a new linked list node
// public QNode(int key) {
// this.key = key;
// this.next = null;
// }
// }

// // a class to represent a queue
// // The queue, front stores the front node of ll and
// // rear stores the last node of ll
// class Queue {
// QNode front, rear;

// public Queue() {
// this.front = this.rear = null;
// }

// // method to add an key to the queue
// void enqueue(int key) {
// // create a new ll node
// QNode temp = new QNode(key);

// // if queue is empty, then new node is front and
// // rear both
// if (this.rear == null) {
// this.front = this.rear = temp;
// return;
// }

// // add the new node at the end of queue
// // and change rear
// this.rear.next = temp;
// this.rear = temp;
// }

// // method to remove an key from queue
// void dequeue() {
// // if queue is empty, return NULL
// if (this.front == null) {
// return;
// }

// // store previous front and move front one node
// // ahead
// // QNode temp = this.front;
// this.front = this.front.next;

// // if front becomes null, then change rear also as NULL
// if (this.front == null)
// this.rear = null;
// }
// }

// // driver code
// public class Main {
// public static void main(String[] args) {
// Queue q = new Queue();
// q.enqueue(10);
// q.enqueue(20);
// q.dequeue();
// q.dequeue();
// q.enqueue(30);
// q.enqueue(40);
// q.enqueue(50);
// q.dequeue();

// System.out.println("Queue Front : " + ((q.front != null) ? (q.front).key :
// -1));
// System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).key : -1));

// }
// }

////////////////////////////////////////////////////////////
// Queue Interface in Java

// import java.util.LinkedList;
// import java.util.Queue;

// public class Main {
// public static void main(String[] args) {
// Queue<String> queue = new LinkedList<>();

// queue.add("Apple");
// queue.add("banana");
// queue.add("cherry");

// System.out.println("Queue: " + queue);

// // remove the element at the front of the queue
// String front = queue.remove();
// System.out.println("Removed element: " + front);

// System.out.println("Queue after removal: " + queue);

// // add another element to the queue
// queue.add("date");

// // peek at the element at the front of the queue
// String peeked = queue.peek();
// System.out.println("Peeked element: " + peeked);

// // print the updated queue
// System.out.println("Queue after peek: " + queue);
// }
// }