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