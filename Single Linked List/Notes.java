//////////////////////////////////////////////////////////////////
// LINKED LIST

// Implementing a Linked List in Java using Class
/*
 * Like arrays, Linked List is a linear data structure.
 * Unlike, arrays linked list elements are not stored at contigoud location, the
 * elements are linked using pointers as shown below.
 * 
 * In Java, LinkedList can be represented as a class and a Node as a separate
 * class.
 * 
 * The LinkedList class contains a reference of Node class type.
 */

// Creation and Insertion
/*
 * In this article, insertion in the list is done at the end, that is the new
 * node is added after the last node of the given Liked List.
 * eg. 5->10->15->20->25->30
 * 
 * Since a Linked List is typically represented by the head pointer of it, it is
 * required to traverse the list till the last node and then change the next to
 * last node to the next node.
 */

//////////////////////////////////////////////////////
// Insertion in Linked List
/*
 * At the front of the linked list
 * After a given node
 * At the end of the linked list
 */

/*
 * How to insert a Node at the Front of Linked List
 * Make the first node of linked list to the new node
 * Remove the head from the original first node of linked list.
 * Make the new node as the Head of the Linked list.
 */

/////////////////////////////////////////////////////////
// Insertion in a Sorted Single linked list
/*
 * If Linked list is empty then make the node as head and return it.
 * 
 * If the value of the node to be inserted is smaller than the value of the head
 * node, then insert the node at the start and make it head.
 * 
 * In a loop, find the appropriate node after which the input node in to be
 * inserted.
 * 
 * TO find the appropriate node start from the head, keep moving until you reach
 * a node GN, who's value is greater than input node.
 * The node just before GB in the appropriate node.
 * 
 * Insert the node after the appropriate node found.
 */

/////////////////////////////////////////////////////////
// Reverse a Linked List
// Method 1: Using itration.
/*
 * The idea is to use three pointers curr, prev, and next to keep tack of nodes
 * to update reverse links.
 */

/*
 * Steps:
 * Initialize three pointers prev as NULL, curr as head, and next as NULL.
 * 
 * Iterate through the linked list. In a loop, do the following:
 * Before changing the next of curr, store the next node:
 * next = curr -> next
 * 
 * Now update the next pointer of curr to the prev:
 * curr -> next = prev
 * 
 * Update prev as curr and curr as next:
 * prev = curr
 * curr = next
 */

///////////////////////////////////
// Method 2: Using Recursion
/*
 * Steps:
 * Divide the list in two parts - first node and rest of the linked list
 * Call reverse for the rest of the linked list
 * Link the rest linked list to first
 * Fix head pointer to NULL
 */

//////////////////////////////////////////////////
// Detect loop in a linked list uisng Floyd's Cycle-Finding Algorithm:
/*
 * This algorithm is used to find a loop in a linked list.
 * It uses two pointers one moving twice as fast as the other one.
 * The faster one is called the faster pointere and the other one is called the
 * slow pointer.
 */

/*
 * Steps:
 * Traverse linked list using two pointers.
 * Move one pointer(slow_p) by one and another pointer(fast_p) by two.
 * If these pointers meet at the same node then there is a loop.
 * If pointers do not meet then the linked list doesn't have a loop.
 */

////////////////////////////////////////////
// Detec loop or cycle in a linked list
// 1) Detect loop in a linked list using Hashing:
/*
 * The idea is to insert the nodes in the hashmap and whenever a node is
 * encountered that is already present in the hashmap then return true.
 */
/*
 * Steps:
 * Traverse the list individually and keep putting the node addresses in a Hash
 * Table.
 * At any point, if NULL is reached then return false.
 * If the next of the current nodes points to any of the previously stored nodes
 * in Hash then return true.
 */

// 2) Detect loop in a linked list by Modification in Node Structure:
/*
 * The idea is to modify the node by adding flaf in it and mark the flag whenver
 * visit the node.
 */

/*
 * Steps:
 * Have a visited flag with each node.
 * Traverse the linked list and keep marking visited nodes.
 * If you see a visited node again then there is a loop.
 */

// 3) Detect loop in a linked list by making visited nodes without modifying
// Node structure:
/*
 * The idea is to point the current node of the linked lsit to a node which is
 * created.
 * Whenever a node's next is pointing to that node it means loop is there.
 */

/*
 * A temporary node is created.
 * The next pointer of each node that is traversed is made to point to this
 * temporary node.
 * This way we are using the next pointer of a node as a flag to indicate
 * whetehre the node head been traversed or not.
 * Every node is checked to see if the next if pointing to a temporary node or
 * not.
 * In the case of the first node of the loop, the second time we traverse it
 * this condition will be true, hence we find that loop exitsts.
 * If we come accross a node that points to null and then the loop doesn't
 * exist.
 */

//////////////////////////////////////////////////////////
// LinkedList class in Java
/*
 * Linked list is a part of the Collection framework present in
 * java.util.package.
 * 
 * This class is an implementation of the LinkedList data structure which is
 * linear data structure where the elements are not stored in contiguous
 * locations and every element is a separate object with a data part and address
 * part.
 * 
 * The elements are linked using pointers and addresses.
 * Each element is known as node.
 * 
 */

/*
 * Due to the dynamicity and ease of insertions and deletions, they are
 * preferred over the arrays.
 * It also has few disadvantages like the node cannot be accessed dirctly
 * instead we need to start from the head and follow through the link to reach a
 * node we wish to access.
 */

/*
 * The LinkedList is implemented using the doubly linked list data structure.
 */

/*
 * Constructors in the LinkedList:
 * 1. LinkedList(): This constructor is used to create an empty linked list.
 * If we to create an empty LinkedList with the name ll, then, it can be created
 * as:
 * LinkedList ll = new LinkedList();
 * 
 * 2. LinkedList(Collection C): This constructor is used to create an ordered
 * list that contains all the elements of a specified collection, as retruned by
 * the collection's iterator.
 * 
 * LinkedList ll = new LinkedList();
 */
