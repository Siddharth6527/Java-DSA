// Queue Interface in Java
/*
 * The queue interface is present in java.util package and extends the
 * Collections interface is used to hold the elements about to be processed in
 * FIFO (First In First Out) order.
 * 
 * It is an ordered list of objects with its use limited to inserting elements
 * at the end of the list and deleting elements from the start of the list,
 * (i.e.), it follows the FIFO or the First-In-First-Out priciple.
 */

/*
 * Being an interface the queue needs a concrete class for declaration and the
 * most common classes are the PriorityQueue and LinkedList in Java.
 * 
 * Note that neither of these implementations is thread-safe.
 * PriorityBlockingQueue is one alternative implementation if the thread-safe
 * implementation is needed.
 */

/*
 * Creating Queue Objects:
 * Since Queue is an interface, objects cannot be created of the type queue.
 * 
 * We always need a class which extends this list in order to create an object.
 * 
 * And also, after the introduction of Generics in Java 1.5, it is possible to
 * restrict the type of object that can be stored in the Queue.
 */

// import java.util.Queue;
// import java.util.PriorityQueue;

// class Notes {
// public static void main(String[] args) {
// Queue<Integer> queue = new PriorityQueue<>();

// }
// }

/*
 * In Java, the Queue interface is a subtype of the Collection interface and
 * represents a collection of elements in a specific order.
 * 
 * It follows the first-in, first-out (FIFO) priciple, which mean that the
 * elements are retrieved in the order in which they are added to the queue.
 */

/*
 * The Queue interface provides several methods for adding, removing, and
 * inspecting elements in the queue.
 * 
 * add(element): Adds an element to the rear of the queue.
 * If the queue is full, it throws an exception.
 * 
 * offer(element): Adds an element to the rear of the queue.
 * If the queue is full, it returns false.
 * 
 * remove(): Removes and returns the element at the front of the queue. If the
 * queue is empty, it throws an exception.
 * 
 * poll(): Removes and returns the element at the front of the queue. If the
 * queue is empty, it returns null.
 * 
 * element(): Returns the element at the front of the queue wihtout removing it.
 * If the queue is empty, it throws an exception.
 * 
 * peek(): Returns the element at the front of the queue without removing it.
 * If the queue is empty, it returns null.
 * 
 */

/*
 * The Queue interface is implemented by several classes in Java, including
 * LinkedList, ArrayDeque, and PriorityQueue.
 * 
 * Each of these classes provides different implementations of the queue
 * interface, with different performance characteristics and features.
 */
