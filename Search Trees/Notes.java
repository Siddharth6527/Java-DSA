// Introduction of B-Tree
/*
 * The limitations of traditional binary search trees can be frustating.
 * Meet the B-Tree, the multi-talented data structure that can handle massive
 * amounts of data, traditional binary search trees can become impractical due
 * to their poor performance and hight memory usage.
 * 
 * B-Trees, also known as B-Tree or Balanced Tree, are a type of self-balancing
 * tree that was specially desgined to overcome these limitations.
 */

/*
 * Unlike traditional binary search tree, B-Trees are charactereizedd by the
 * large number of keys that they can store in a single node, which is why they
 * are also known as "large key" trees.
 * 
 * Each node in a B-Tree can contain multiple keys, which allows the tree to
 * have a larger branching factor and thus a shallower height.
 * 
 * This shallow height leads to less disk I/O, which results in faster search
 * and insertion operations.
 * 
 * B-Trees are particularly well suited for storage systems that have slow,
 * bulky data access such as hard drives, flash memory, and CD-ROMs.
 */

/*
 * B-Trees maintain balance by ensuring that each node has a minimum number of
 * keys, so the tree is always balanced.
 * 
 * This balance guarantees that the time complextity for operations such as
 * insertion, deletion, and searching is always O(log n), regarless of the
 * initial shape of the tree.s
 */

/*
 * Time Complexity of B-Tree:
 * Search - O(log n)
 * Insert - O(log n)
 * Delete - O(log n)
 */

// Note: "n" is the total number of elements in the B-tree.

////////////////////////////////////
// Properites of B-Tree:
/*
 * All leaves are at the same level.
 * B-Trees is defined by the term minimum degree 't'. The value fo 't' depends
 * upon disk block size.
 * 
 * Every node except the root must contain at most t-1 keys.
 * The root may conatins a minimum of 1 key.
 * 
 * All nodes (including root) may contains at most (2*t - 1) keys.
 * 
 * Number of children of a node is equal to the number of keys+1.
 * 
 * All keys of a node are sorted in increasing order. The child between two keys
 * k1 and k2 contains all keys in the range from k1 and k2.
 * 
 * B-Tree grows and shrinks from the root which is unlike Binary Search Tree.
 * Binary Search Tree grow downward and also shrink from downward.
 * 
 * Like other balanced Binary Search Trees, the time complexity to search,
 * insert and delete is O(log n).
 * 
 * Insertion of Node in B-Tree happens only at Leaf Node.
 * 
 * Note: All the leaf nodes are at the same level and all non-leafs have no
 * empty sub-treee and have keys one less than the number of their children.
 */

////////////////////////////////////////
// Facts About B-Trees:
/*
 * The minimum height of the B-Tree that can exits with n number of nodes and m
 * is the maximum number of children of a node can have is:
 * h~min = [log(base)m (n+1)] -1
 * 
 * The maximum height of the B-Tree that can exist with n number of nodes and t
 * is the minimum number of children that a non-root node can have is:
 * h~max = [log(base)t (n+1)/2]
 * and
 * t = [m/2]
 */

///////////////////////////////////////
// Traversal in B-Tree:
/*
 * Traversal is also similar to Inorder traversal of Binary Tree.
 * We start from the leftmost child, recusively print the leftmost child, then
 * repeat the same process for the remaining children and keys.
 * In the end, recursively print the rightmost child.
 */

////////////////////////////////////
// Search Operation in B-Tree:
/*
 * Search is similar to the search in Binary Search Tree.
 * Let the key to be searched is k.
 * 
 * Start from the root and recusively travserse down.
 * if the node has the key, we simply return the node.
 * Otherwise, we recur down to the appropriate child (The child which is just
 * before the first greater key) of the node.
 * 
 * If we reach a lead node and don't find k in the leaf node, then return NULL.
 * 
 */

class Node {
  int n;
  int[] key = new int[MAX_KEYS];
  Node[] child = new Node[MAX_CHILDREN];
  boolean leaf;
}

//////////////////////////////////////////
// Applications of B-Trees:
/*
 * It is used in large databases to access data stored on the disk.
 * 
 * Searching for data in a data set can be achieved in significantly less time
 * using the B-Tree.
 * 
 * With the indexing feature, multilevel indexing can be achieved.
 * 
 * Most of the servers also use the B-Tree approach.
 * 
 * B-Trees are used in CAD systems to organize and search geometric data.
 * 
 * B-Trees are also used in other areas such as natural language processing,
 * computer networks, and cryptography.
 */

///////////////////////////////////////
// Advantages of B-Tres:
/*
 * B-Trees have a gauranteed time compleixty of O(log n) for basic operations
 * like insertion, deletion, and searching, which makes them suitable for large
 * data sets and real-time applications.
 * B-Trees are self-balancing.
 * High-concurrency and high-thoroughput.
 * Efficent storage utilization.
 */

///////////////////////////////////////
// Disadvantages of B-Trees:
/*
 * B-Trees are based on disk-based data structures and can have a high disk
 * usage.
 * Not the best for all cases.
 * Slow in comparision to other data structures.
 */

/////////////////////////////////////////
// Searching:
/*
 * Searching a B-Tree is similar to searching a binary tree.
 * The algorithm is similar and goes with recursion.
 * 
 * At each level, searchy is optimized as if the key value is not present in the
 * range of the parent then the key is present in another branch.
 * 
 * As these values limit the search they are also known as limitng values or
 * separation valules.
 * 
 * If we reach a leaf node and don't find the desired key the it will display
 * NULL.
 */

/////////////////////////////////////////////////////////////////
// Insertion Operation in B-Tree
/*
 * A new key is always inserted at the leaf node.
 * Let the key to be inserted be k.
 * Like BST, we start from the root and traverse down till we reach a leaf node.
 * 
 * Once we reach a leaf node, we insert the key in that leaf node.
 * 
 * Unlike BSTs, we have a predefined range on the number of keys that a node can
 * contain.
 * 
 * So before inserting a key to the node, we make sure that the node has extra
 * space.
 * 
 */

/*
 * How to make sure that a node has space available for a key before the key is
 * inserted?
 * We use an operation called splitChild() that is used to split a child of a
 * node.
 * 
 * In the following diagram, child y of x is being split into two nodes y and z.
 * 
 * Note: The splitChild() operation moves a key up and this is the reason
 * B-Trees grow up, unlike BSTs which grow down.
 */

/*
 * To insert a new key, we go down from root to leaf.
 * Before traversing down to a node, we first check if the node is full.
 * 
 * If the node is full, we split it to create space.
 */

// Insertion Algorithm:
/*
 * 1) Initialize x as root.
 * 2) When x is not leaf, do follwing
 * ..a) Find the child of x that is going to be traversed next. Let the child be
 * y.
 * ..b) if y is not full, change x to point to y.
 * ..c) if y is full, split it and change x to point to one of the two parts of
 * y.
 * If k is smaller than mid key in y, we move a key from y to its parent x.
 * 
 * 3) The loop in step 2 stops when x is leaf. x must have space for 1 extra key
 * as we have been splitting all nodes in advance.
 * So simply insert k to x.
 */

/*
 * Note that the algorithm follows the Cormen book.
 * It is acutally a proactive insertion algorithm where before going down to a
 * node, we split it if it is full.
 * 
 * The advantage of splitting before is, we never traverse a node twice.
 * 
 * If we don't split a node before going down to it and split it only if a new
 * key is inserted (reactive), we may end up traversing all nodes again from
 * leaf to root.
 * 
 * This happens in cases when all nodes on the path from the root to leaf are
 * full.
 * 
 * So, when we come to the leaf node, we split it and move a key up.
 * 
 * Moving a key up will cause a split in parent node (because the parent was
 * already full).
 * 
 * This cascadin effect never happens in this proactive insertion algorithm.
 * 
 * There is a disadvantage of this proactive insertion though, we may do
 * unnecessary splits.
 */