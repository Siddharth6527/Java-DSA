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

//////////////////////////////////////////////////////////////
// Deletion in Binary Search Tree (BST)
/*
 * Given a BST, the task is to delete a node in this BST, which can be broken
 * down into 3 scenarios:
 * 
 * Case 1: Delete a Leaf Node in BST.
 * 
 * Case 2: Delete a Node with Single Child in BST.
 * Copy the child to the node and delete the node.
 * 
 * Case 3: Delete a Node with Both Children in BST.
 * Deleting as node with both children is not so simple.
 * Here, we have to delete the node in such a way, that the resulting tree
 * follows the properties of a BST.
 * 
 * The trick is to find the inorder successor of the node.
 * Copy contents of inorder successor to the node, and delete the inorder
 * successor.
 * 
 * Note: Inorder predecessor can also be used.
 * Note: Inorder successor is needed only when the right child is not empty.
 * In this particular case, the inorder successor can be obtained by finding the
 * minimum value in the right child of the node.
 */

///////////////////////////////////////////////////////////////
// Inorder Predecessor and successor for a given key in BST
/*
 * Find the inorder successor and predessor of a given key.
 * In case the given key is not found in BST, then return the two values with
 * this key will lie.
 */

// Algorithm:
// Input: root node, key
// Output: predesoor node, successor node
/*
 * 1. if root is NULL
 * then return
 * 
 * 2. if key is found then
 * a. If its left subtree is not null
 * Then predessor will be the right most child of left subtree or left child
 * iteself.
 * b. If its right subtree is not null
 * The successor will be the left most child of right subtree or right subtree
 * or right child itself.
 * 
 * 3. If key is smaller than root node
 * set the successor as root
 * search recursively into left subtree
 * else
 * set the predecessor as root
 * search recusively into right subtree
 */

//////////////////////////////////////////////////////////////
// Program to check if a binary tree is BST or not
/*
 * A Binary Search Tree (BST) is a node-based tree data structure that has the
 * follwing properties:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's
 * key.
 * 
 * The right subtree of a node contins only nodes with keys greater than the
 * node's key.
 * 
 * Both the left and right subtrees must be binary search trees.
 * 
 * Each node (item in the tree) has a distinct key.
 */

// Naive Approach:
/*
 * The idea is to for each node, check if max value in left subtree is smaller
 * than the node and min value in right subtree greater than the node.
 */

// Algorithm:
/*
 * If the current node is null then return true.
 * If the value of the left child of the node is greater than or equal to the
 * current node then return false.
 * 
 * If the value of the right child of the node is less than or equal to the
 * current node then return false.
 * 
 * If the left subtree or the right subtree is not a BST then return false.
 * 
 * Else return true.
 */

/////////////////////////////////////////
// Method 2: Check BST using specified range of minimum and maximym values of
///////////////////////////////////////// node:
/*
 * The isBSTUtil() function is a recursive helper function that checks whether a
 * subtree (root at a given node) is a BST within the specified range of minimum
 * (min) and maximum (max) values.
 * 
 * If any node violates this range, the functio returns false; otherwise, it
 * continues chekcing the left and right subtrees.
 */
