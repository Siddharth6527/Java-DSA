// Program to Determine if given Two Trees are identical or not
/*
 * Two trees are indentical when they have the same data and the arrgangement of
 * data is also the same.
 */

/*
 * Approach:
 * To identify if two trees are identical, we need to traverse both trees
 * simultanously, and while traversing we need to compare data and children of
 * trees.
 */

//////////////////////////////////////
// Write a function to determine if two trees are identical or not by comparing
////////////////////////////////////// their traversals:
/*
 * If two trees are identical, their preorder, inorder and post order traversals
 * will also be the same.
 */

// Note:
/*
 * For this, we can find one traversal, say inorder, and it it is the same for
 * both the trees, we can't say the given trees are identical.
 * Because we can have two trees with the same inorder traversal, still they can
 * be non-identical.
 * 
 * To tackle such edge cases, we should find all the traversal for both the
 * trees and see if they are equal.
 * If yes, the given trees are identical else not.
 */

/////////////////////////////////////////
// Method 3: Using Pre-Order traversal only.
/*
 * We are storing preordre traversal of tree where we store zero (0) ( we can
 * store any another number so that we donot miss any node such as INT_MAX or
 * -10000 ) for the null node and then we compare both vector if they are same
 * then return true both the trees are identical.
 */

//////////////////////////////////////////////////////////////////
// Given a binary tree, print all root-to-leaf paths
// Algorithm:
/*
 * Use a path array path[] to store current root to leaf path.
 * Traverse from root to all leaves in top-down fashion.
 * While traversing, store data of all nodes in current path in array path[].
 * When we reach a leaf node, print the path array.
 */

///////////////////////////////////////////////////////////////
// Print Left View of a Binary Tree
/*
 * Given a Binary Tree, the task is to pritn the left vie of the binary tree.
 * The left view of a binary tree is a set of leftmost nodes for every level.
 */

// Method 1: Using Recursion
/*
 * Keep track of the level of a node by passing the level as a parameter to all
 * recursive calls and also keep track of the maximum level.
 * 
 * Whenever, we see a node whose level is more than maximum level so far, we
 * print the node because this is the first node in its level.
 * 
 * Note: We traverse the left subtree before right subtree.
 */

//////////////////////////////
// Method 2: Using Level Order Traversal:
/*
 * The left view contains all nodes that are the first nodes in their levels.
 * A simple solution is to do level order traversal and print the first node in
 * every level.
 */

/*
 * Algorithm:
 * Do level order traversal of the tree
 * for Each level keep a track of the current level and print the first
 * encountered node of this level.
 * Move to the next level.
 */

////////////////////////////
// Method 3: Using queue and a null pointer
/*
 * Use queue and a null pointer to mark the first element of each level.
 * Insert a null pointer in the first and as the null pointer is reached mark
 * bool as true and take the next element as left view element.
 */
