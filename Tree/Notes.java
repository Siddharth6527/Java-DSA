// Introduction to Tree - Data Structure and Algorithm Tutorails
/*
 * A tree data strucutre is a hierarchial structure that is used to represent
 * and organize data in a way that is easy to navigate and search.
 * 
 * It is a collection of nodes that are connected by edges and has hierarchial
 * relationship between the nodes.
 */

/*
 * The topmost node of the tree is called the root, and the nodes below is are
 * called the child nodes.
 * 
 * Each node can have multiple child nodes, and these child nodes can slo have
 * multiple child nodes, and these child nodes can also have their own child
 * nodes, forming a recursive structure.
 *
 */

// Basic Terminologeis In Tree Data Structure:
/*
 * Parent Node: The node which is a predecessor of a node is called the parent
 * node of that node.
 * 
 * Child Node: The node which is the immediate successor of a node is called the
 * child node of that node.
 * 
 * Root Node: The topmost node of a tree or the node which does not have any
 * parent node is called the root node.
 * 
 * Lead Node or External Node: The node which do not have any child nodes are
 * called leaf nodes.
 * 
 * Ancestor of a Node: Ant predecessor nodes on the path of the root to that
 * node are called Ancestors of that node.
 * 
 * Descendant: Any successor node on the path from the leaf node to that node.
 * 
 * Sibling: Children of the same parent node are called siblings.
 * 
 * Level of a node: The count of edges on the path from the root node to that
 * node.
 * The root node has level 0.
 * 
 * Internal node: A node with at least one child is called Internal Node.
 * 
 * Neigthbour of a Node: Parent or child nodes of that nodes are called
 * neighbours of that node.
 * 
 * Subtree: Any node of the tree along with its descendant.
 */

//////////////////////
// Representation of Tree Data Structure
/*
 * A tree conists of a root, and zero or more subtrees T1, T2, ..., Tk such that
 * there is an edge from the root of the tree to the root of each subtree.
 */
// class Node {
// int data;
// Node firstChild;
// Node secondChild;
// // ...
// // ...
// }

////////////////////
// Types of Tree data structures: (on the basis of number of children)
/*
 * 1. Binary tree: In a binary tree, each node can have a maximum of two
 * children linked ot it.
 * Some common types of binary trees include full binary trees, complete binary
 * trees, balanced binary trees, and degenerate or pathological binary trees.
 * 
 * 
 * 2. Ternary Tree: A Ternary Tree is a tree data strucutre in which each node
 * has at most three child nodes, usually distinguished as 'left', 'mid' and
 * 'right'.
 * 
 * 3. N-ary Tree or Generic Tree: Generic trees are a collection of nodes where
 * each node is a data structure that consists of records and a list of
 * references to its child (duplicate references are not allowed).
 * Unlike the linked list, each node stores the address of multiple nodes.
 *
 */

////////////////////////////////
// Basic Operation of Tree Data Structure
/*
 * Create: Create a tree in the data structure.
 * Insert: Inserts data in a tree.
 * Search: Searches specific data in a tree to check whethere it is present or
 * not.
 * Traversal:
 * * Preorder Traversal - perform travelling a tree in a pre-order manner in the
 * data structure.
 * 
 * * In order Traversal - perform travelling a tree in an in-order manner.
 * 
 * * Post-order Traversal - perform travelling a tree in a post-order manner.
 */

///////////////////////////////////
// Properties of Tree Data Structure:
/*
 * Number of edges: An edge can be defined as the connection between two nodes.
 * If a tree has N nodes then it will have (N-1) edges.
 * There is only one path from each node to any other node of the tree.
 * 
 * Depth of a node: The depth of a node is defined as the length of the path
 * from the root to that node.
 * Each edge adds 1 unit of length in the path from the root of the tree to the
 * node.
 * 
 * Height of a node: The height of a node can be defined as the length of the
 * longest path from the node to a leaf node of the tree.
 * 
 * Height of the Tree: The height of a tree is the length of the longest path
 * from the root of the tree to leaf node of the tree.
 * 
 * Degree of a Node: The total count of subtrees attached to that node is called
 * the degree of the node.
 * The degree of a lead node must be 0.
 * The degree of a tree is the maximum degree of a node among all the nodes in
 * the trees.
 */

///////////////////////////
// Need for Tree Data Structure:
/*
 * 1. One reason to use trees might be because you want to store information
 * that naturally forms a hierarchy.
 * For example, the file system on a computer.
 * 
 * 2. Trees( with some ordering eg. BST ) provide moderate access/search
 * (quicker than Linked List and slower than arrays).
 * 
 * 3. Trees provide moderate insertion/deletion (quicker than Arrays and slower
 * than Unordered Linked List).
 * 
 * 4. Like Linked Lists and unlike Ararys, Trees don't have an upper limit on
 * the number of nodes as nodes are linked using pointers.
 */

////////////////////////////////////
// Applications of Tree Data Structure:
/*
 * File System: This allows for efficient navigation and organization of files.
 * 
 * Data Compression: Huffman coding is a popular techique for data compression
 * that involves constructing a binary tree where the leaves represent
 * characters and their frequency of occurrence.
 * The resulting tree is used to encode the data in a way that minimizes the
 * amount storage required.
 * 
 * Compiler Design: In compiler design, a syntax tree is used to represent the
 * structure of a program.
 * 
 * Database Indexing: B-trees and other trees structures are used in database
 * indexing to efficiently search for and retrieve data.
 */

/////////////////////////////////
// Advantages of Tree Data Structure:
/*
 * Tree offer Efficient Searching Depending on the type of tree, with average
 * search times of O(log n) for balanced trees like AVL.
 * 
 * Trees provide a hierarchical representation of data, making it easy to
 * organize and navigate large amounts of information.
 * 
 * The recursive nature of trees makes them easy to traverse and manipulate
 * using recursive algorithms.
 */

//////////////////////////////////
// Disadvantages of Tree Data Structure:
/*
 * Unbalanced Trees, meaning that the height of the tree is skewed towards one
 * side, which can lead to inefficient search times.
 * 
 * Trees demand more memeory space requirements than some other data structures
 * like arrays and linked lists, especially if the tree is very large.
 * 
 * The implementation and manipulation of trees can be complex and require a
 * good understanding of the algorithm.
 */

//////////////////////////////////////////////////////////////
