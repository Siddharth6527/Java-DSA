// Introduciton to Binary Search Tree
/*
 * A binary search tree (BST) is a special type of binary tree in which the left
 * child of a noode has a value less than the node's value and the right child
 * has a value greater than the node's value.
 * 
 * This property is called the BST property and it makes it possible to
 * efficiently serach, insert, and delete elements in the tree.
 */

/*
 * The root of a BST is the node that has the smallest value in the left subtree
 * and the largest value in the right subtree.
 * 
 * Each left subtree is a subtree with nodes that have smaller values than the
 * root and each right subtree is a BST with nodes that have larger values than
 * the root.
 * 
 * There must be no duplicate nodes (BST may have duplicate values with
 * different handling approaches.)
 */

// Handling Duplicates values in BST:
/*
 * You can not allow the duplicated values at all.
 * 
 * You must follow a consistent process throughout i.e. either store duplicate
 * value a the left or store the duplicate value at the right of the root, but
 * be consistent with your approach.
 * 
 * We can keep the counter with the node and if we found the duplicate value,
 * then we can increment the counter.
 */
//////////////////////////////////
// Applications of Binary Search Tree
/*
 * A BST supports operations like search, insert, delete, floor, ceil, greater,
 * smaller, etc in O(h) time where h is the height of the BST.
 * 
 * To keep the height less, self balancing BSTs (like AVL and Red Black Trees)
 * are used in practice.
 * 
 * These Self-Balancing BSTs maintain the height as O(log n).
 * 
 * Together with these, BST also allows sorted order traversal of data in O(n)
 * time.
 */

/*
 * 1. A Self-Balancing Binary Search Trees is used to maintain sorted stream of
 * data.
 * For example, suppose we are getting online orders placed and we want to
 * maintain the live data (in RAM) in sorted order of prices.
 * For example, we wish to know number of items purchased at cost below a given
 * cost at any moment.
 * Or we wish to know number of items puchased at higher cost than given cost.
 * 
 */

/*
 * 2. A Self-Balancing Binary Search Tree is used to implement doubly ended
 * priority queue.
 * With a Binary Heap, we can either implement a priority queue with support of
 * extractMin() or with extractMax().
 * If we wish to support both operations, we use a Self-Balancing Binary Search
 * Tree to do Both in O(Log n).
 */

/*
 * 3. There are many more algorithms problems where a Self-Balancing BST is the
 * best suited data structure, like count smaller elements on right, Smallest
 * Greater Element on Right Side, etc.
 */

/*
 * 4. One of the most common use cases of BSTs is searching for a particular
 * element in the tree.
 */

/*
 * 5. A BST can be used to sort a large dataset. By inserting the elements of
 * the dataset into a BST and then performing an in-order traversal, the
 * elements will be returned in sorted order.
 */

/*
 * 6. Used in Database indexing.
 */

/*
 * 7. TreeMap and TreeSet are two data structures that are internally
 * implemented using self-balancing BSTs, more formally a Red-Black Tree.
 */

/*
 * 8. BSTs can be implemented symbol tables, which are used to store data such
 * as variable and function names in programming language.
 */

////////////////////////////////////////////////////////////////
// Searching in Binary Seach Tree (BST)
/*
 * We compare the value to be searched with teh value of the root.
 * 
 * If it's equal we are done with the search if it's smaller we know that we
 * need to go the left subtree because in a binary search tree all the elements
 * in the left subtree are smaller and all the elements are in the right subtree
 * are larger.
 * 
 * Repeat the aboe step till no more traversal is possible.
 * 
 * If at any iteration, key is found, return True. Else False.
 */