// Insertion in a Doubly Linked List
/*
 * Inserting a new node in a doubly linked list is very similar to inserting new
 * node in linked list.
 * There is a little extra work required to maintian the link of the previous
 * node.
 */

/*
 * A node can be inserted in a Doubly Linked List in four ways:
 * At the front of the DLL.
 * 
 * In between two nodes:
 * After a given node
 * Before a given node.
 * 
 * At the end of the DLL.
 */

// Add a node at the front in a Doubly Linked List:
/*
 * First, allocate a new node (say new_node).
 * Now put the required data in the new node.
 * Make the next of new_node point to the current head of the doubly linked
 * list.
 * Make the previous of the current head point to new_node.
 * Lastly, point head to new_node.
 */

// Add a node in between two nodes:
/*
 * Adding a node after a given node in a Doubly Linked List:
 * Firstly create a new node (say new_node).
 * Now insert the data in the new node.
 * Point the next of new_node to the next of prev_node.
 * Point the next of prev_node to new_node.
 * Change the pointer of the new node's previous pointer to new_node.
 */

/*
 * Adding a node before a given node in DLL:
 * Allocate memory for the new node, let it be called new_node.
 * Put the data in new_node
 * Set the previous pointer of this new_node as the preivous node of the
 * next_node.
 * Set the prevous poointer of this new_node as the previous node of hte
 * next_node.
 * Set the next pointer of this next_node as the new_node.
 * Now set the previous pointer of new_node:
 * If the previous node of the new_node is not NULL, then set the next pointer
 * of this previous node as new_node.
 * Else, if the prev of the new_node is NULL, it will be the new head node.
 * 
 */

///////////////////////////////////////////////////
// Add a node at the end in A Doubly Linked List:
/*
 * Steps:
 * Create a new node.
 * Put the value in the new node.
 * Make the next pointer of new_node as null.
 * If the list is empty, make new_node as the head.
 * Otherwise, travel to the end of the linked list.
 * Now make the next pointer of last node point to new_node.
 * Change the previous pointer of new_node to the lastnode of the list.
 */

///////////////////////////////////////////////////
// Delete a node in a Doubly Linked List
/*
 * Deletion of a node in a doubly-linked list can be divided into three main
 * categories:
 * After the deletion of the head node
 * After the deletion of the middle node
 * After the deletion of the last node
 */

/*
 * All three mentioned cases can be handled in two steps if hte pointer of the
 * node to be deleted and the ehad pointer is known:
 * If the node to be deleted is head node then make the next node as head.
 * If a node is deleted, connect the next and previous of the deleted node.
 */

/*
 * Algorithm:
 * let the node to be deleted be del.
 * If node to be deleted is head node, then change the head pointer to next
 * current head.
 * Set prev of next to del, if next to del exists.
 * Set next of previouso to del, if previous to del exists.
 */
