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