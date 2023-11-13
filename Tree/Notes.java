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
// Introduction to Binary Tree
/*
 * A binary tree is a tree data structure in which each node can have at most
 * two children, which are refered to as the left child and right child.
 * 
 */

// Representation of Binary Tree:
/*
 * Each node in the tree contains the following:
 * Data
 * Pointer to the left child
 * Pointer to the rigth child
 */

// class Node {
// int key;
// Node left, right;

// public Node(int item) {
// key = item;
// left = right = null;
// }
// }

/////////////////////////////
// Basic Operations on Binary Tree:
/*
 * Inserting an element
 * Remoing an element
 * Searching for an element
 * Deletion for an element
 * Traversing an element. There are four (mainly three) types of traversals in a
 * binary tree.
 */

////////////////////////////
// Auxiliary Operations on Binary Tree:
/*
 * Finding the height of the tree
 * Fing the level of the tree
 * Finding the size of the entire tree
 */

/////////////////////////////
// Applications of Binary Tree:
/*
 * In compilers, Expression Trees are used which is an application of binary
 * trees.
 * 
 * Huffman coding trees are used in data compression algorithms.
 * 
 * Priority Queue is another application of binary tree, that is used for
 * searching maximum or minimum in O(1) time complexity.
 * 
 * Represent hierarchical data.
 * 
 * Used in editing software like Microsoft Excel and spreadsheets.
 * 
 * Useful for indexing segmented at the database is useful in storing cache in
 * the system.
 * 
 * Syntax trees are used for most famous compilers for programming like GCC, and
 * AOCL to perform arithemetic operations.
 * 
 * For implementing priority queues.
 * 
 * Binary trees can be used to organize and retrive information from large
 * datasets, such as in inverted index and k-d trees.
 * 
 * Binary trees can be used to represent the decison-making process of
 * computer-controlled characters in games, such as in decision trees.
 * 
 * Binary trees can be used to implement searching algorihtms, such as in binary
 * search trees which can be used to quickly find an element in a sorted list.
 * 
 * Binary trees can be used to implement sorint algorithms, such as in heap sort
 * which uses a binary heap to sort elements efficiently.
 * 
 */

///////////////////////////////
// Binary Tree Traversals:
/*
 * Tree traversal algorithms can be classified broadly into two categories:
 * Depth-First Search (DFS) Algorithms
 * Breath-First Search (BFS) Algorithms
 */

////////////////////////////
// Tree traversal using Depth-First Search (DFS) algorithm can be furthr
//////////////////////////// classified into three categories:
/*
 * Preorder Traversal (current-left-right):
 * Visit the current node before visiting any nodes inside the left or right sub
 * strees.
 * Here, the traversal is root -left child - right child.
 * It means that the root node is traversed first then its left chlid and
 * finally the right child.
 * 
 * Inorder Traversal (left-current-right):
 * Visit the current node after visiting all nodes inside the left subtree but
 * before visiting any node within the right subtree.
 * Here, the traversal is left child - root - right child.
 * It means that the left child is traversed first then its root node and
 * finally the right child.
 * 
 * Postorder Traversal (left-right-current):
 * Visit the current node after visiting all the nodoes of the left and right
 * subtrees.
 * Here, the traversal is leftchild - right child - root.
 * It means thea that the left child is traversed first then the right child and
 * finally its root node.
 */

////////////////////////////////
// Tree traversal using Breath-First Search (BFS) algorithm can be further
//////////////////////////////// classified into one category:
/*
 * Level Order Traversal:
 * Visit nodes level-by-level and left-to-right fashion at the same level.
 * Here, the traversal is level-wise.
 * It means that the most left chld has traversed first and then the other
 * children of the same level from left to right have traversed.
 */

// Example:
/*
 * Pre-order traversal: 1 2 4 5 3 6 7
 * In-order traversal: 4 2 5 1 6 3 7
 * Post-order traversal: 4 5 2 6 7 3 1
 * level-wise traversal: 1 2 3 4 5 6 7
 */

///////////////////////////////////
// Properties Of Binary Tree
/*
 * 1. The maximum number of nodes at level 'l' of binary tree is 2^l:
 * Note: Here level is the number of nodes on the path from the root to the node
 * (including root and note).
 * The level of the root is 0.
 * 
 * 2. The Maximum number of ndes in a binary tree of height 'h' is 2^h-1:
 * Note: Here the height of a tree is the maximum number of nodes on the
 * root-to-leaf.
 * The height of a tree with a single node is considered as 1.
 * 
 * In some books, the height of the root in considered as 0.
 * In this convention, the above formula becomes 2^(h+1) -1.
 * 
 * 3. In a binary tree with N nodes, the minimum posssible height or the miminum
 * number of levels is Log2 (N+1):
 * 
 * 4. A binary tree with L leaves has at least | log2 (L) | +1 levels:
 * 
 * 5. In a binary tree where every node has 0 or 2 children, the number of lead
 * nodes is always one more than nodes with two children:
 * 
 * 6. In a non-empty binary tree, if n is the total number of nodes and e is
 * the total number of edges, then e = n-1.
 * 
 */

// Some extra properties:
/*
 * The height of a binary tree is defined as the number of edges from the root
 * node to the deepest lead node:
 * The height of a binary tree is the length of the longest path from the root
 * node to any of the leaf nodes.
 * The height of a binary tree is also known as its depth.
 * 
 * In a full binary tree, every node except the leaves has exactly two chidren:
 * In a full binary tree, all non-leaf nodes have exactly two children.
 * This means that there are no unary nodes in a full binary tree.
 * 
 * In a complete binary tree, every level of tree is completely filled except
 * for the last level, which can be partially filled:
 * In a complete binary tree, all levels of the tree execept the last level are
 * completely filled.
 * This means that there are not gaps in the tree and all nodes are connected to
 * their parent nodes.
 * 
 * In a balanced binary tree, the height of the left and rigth subtrees of every
 * node differ by at most 1:
 * In a balanced binary tree, the height of the left and right subtrees of every
 * node is similar.
 * This ensures that the tree is balanced and that the height of the tree is
 * minimized.
 * 
 * The in-order, pre-order and post-order traversal of a binary tree are three
 * common ways to traverse the trees.
 */

///////////////////////////////////////////////////////////
// Types of Binary Tree:
// Types of binary tree based on the number of children:
/*
 * Following are the types of binary tree based on the number of children:
 * 1. Full Binary Tree
 * 2. Degenerate Binary Tree
 * 3. Skewed Binary Trees
 */

// 1. Full Binary Tree:
/*
 * A binary tree is a full binary tree if every node has 0 or 2 children.
 * We can also say a full binary tree is a binary tree in which all nodes except
 * leaf nodes have two chilren.
 * 
 * A full binary tree is special type of binary tree in which every parent node/
 * internal nodes has either two or no children,
 * It is also known as a proper binary tree.
 */

// 2. Degenerate (or pathological) tree:
/*
 * A tree where every internal node has one child.
 * Such trees are performance-wise same as linked list.
 * A degenerate or pathological tree is a tree having a single child either left
 * or right.
 */

// 3. Skewed Binary Tree:
/*
 * A skewed binary tree is a pathological/degenerate tree in which the treeis
 * either dominated by the left nodes or the right nodes.
 * Thus, there are two types of skewed binary tree: left-skewed binary tree and
 * right-skewed binary tree.
 */

////////////////////////////////////
// Types of binary Tree on the basis of the completion of levels:
/*
 * 1. Complete Binary Tree
 * 2. Prefect Binary Tree
 * 3. Balanced Binary Tree
 */

// 1. Complete Binary Tree:
/*
 * A Binary Tree is a comple binar tree if all the levels are completelyl filled
 * except possibly the last level and the last level has all keys as left as
 * possible.
 * 
 * A complete binary tree is just like a full binary tree, but with two major
 * differences.
 * -Every level except the last level must be completely filled.
 * -All the leaf elements must lean towards the left.
 * -The last leaf element might not have a right sibling i.e. a complete binary
 * tree doesn't have to be a full binary tree.
 * 
 */

// 2. Perfect Binary Tree
/*
 * A Binary tree is Perfect Binary Tree in which all the internal nodes have two
 * children and all leaf nodes are the same level.
 * 
 * A perfect binary tree is a type of binary tree in which every internal node
 * has exactly two child nodes and all the leaf nodes are at the same level.
 * 
 * In a Perfect Binary Tree, the number of leaf nodes is the number of internal
 * node plus 1.
 * L = I + 1, where L = Number of leaf nodes, I = Number of internal nodes.
 * 
 * A Perfect binary tree of height h has 2^(h+1) - 1 node.
 * 
 * An example of a Perfect Binart Tree is ancestors in the family.
 * Keep a person at root, parents as children, parents of parents as their
 * children.
 */

// 3. Balanced Binary Tree:
/*
 * A binary tree is balanced if the height of the tree is O(Log n) where n is
 * the number of nodes.
 * For example, the AVL tree maintians O(Log n) height by making sure that the
 * difference between the height of the left and right subtrees is at most 1.
 * 
 * Red-Black trees maintin O(Log n) height by making sure that the number of
 * Black nodes on every root to left paths is the same and there are no adjacent
 * red nodes.
 * 
 * Balancd Binary Search trees are performance-wise good as they provide O(log
 * n) time for Search, insert and delete.
 * 
 * It is a type of binary tree in whcih the differnce between the height of the
 * left and the righit subtree for each node is either 0 or 1.
 */

//////////////////////////////////////////////////////////////
// Tree Traversal Techniques
/*
 * A tree data structure can be traversed in follwing ways:
 * 1. Depth First Search or DFS
 * -Inorder Traversal
 * -Preorder Traversal
 * -Postorder Traversal
 * 
 * 2. Level Order Traversal or Breath First Search or BFS
 * 3. Boundary Traversal\
 * 4. Diagonal Traversal
 * 
 */

// Inorder Traversal
/*
 * Algorithm Inorder (tree):
 * Traverse the left subtree, i.e., call Inorder (left->subtree)
 * Visit the root
 * Traverse the right subtree, i.e., call Inorder (right->subtree)
 */

/*
 * Uses of Inorder Traversal:
 * In the case of bianry search trees (BST), Inorder traversal gives nodes in
 * non-decreasing order.
 * 
 * To get the nodes of BST in non-increasing order, a variation of Inorder
 * traversal where Inorder traversal is reversed can be used.
 */

///////////////////////////////
// Pre-order Traversal:
/*
 * Algorithm Preorder(tree):
 * Visit the root.
 * Traverse the left subtree, i.e., call Preorder (left->subtree).
 * Traverse the right subtree, i.e., call Preorder (right->subtree).
 * 
 */

/*
 * Uses of Preorder:
 * Preorder traversal is used to create a copy of the tree.
 * Preorder traversal is also used to get prefix expression on an expression
 * tree.
 */

/////////////////////////////////////////////////////////////
// Postorder Traversal:
/*
 * Algorithm PostOrder(tree):
 * Traverse the left subtree, i.e. call Postorder (left->subtree).
 * Traverse the right subtree, i.e., call Postorder(right->subtree).
 * Visit the root.
 * 
 */

/*
 * Uses of Postorder:
 * Post-order traversal is used to delete the tree.
 * 
 * Post-order traversal is also useful to get the postfix expression of an
 * expression tree.
 */

////////////////////////////////////////////////////////////
// Level Order Traversal
/*
 * For each node, first, the node is visited and then it's child nodes are put
 * in a FIFO queue.
 * Then again the first node is popped out and then it's child nodoes are put in
 * a FIFO queue and repeat until queue beomces empty.
 */

/*
 * Level Order Traversal technique is defined as a method to traverse a Tree
 * such that all nodes present in the same level are traversed completely before
 * traversing the next level.
 */

/*
 * Ways:
 * The naive one (finding the height of the tree and traversing each level and
 * printing the nodes of that level)
 * efficiently using a queue.
 */

////////////////////////////////
// Level Order Traversal (Naive Approach):
/*
 * Find height of tree.
 * Then for each level, run a recursive function by mainting current height.
 * Whenever the level of a node matches, print that node.
 */

/////////////////////////////////////////////////////////////////
// Level Order Traversal Using Queue
/*
 * We need to visit the nodes in a lower level before any node in a higher
 * level, this idea is quite similar to that of queue.
 * Push the nodes of a lower level in the queue.
 * When any node is visited, pop that node from the queue and push the child of
 * that node in the queue.
 * 
 * This ensures that the node of a lower level are visited prior to any node of
 * higher level.
 */

/////////////////////////////////////////////////////////////
// Find the maximum Depth or Heigth of given Binary Tree
/*
 * Given a binary tree, the task is to find the height of the tree.
 * The height of the tree is the number of vertices in the tree from the root
 * the deepest node.
 */

// Note: The height of an empty tree is 0 and the height of a tree with single
// node is 1.

/*
 * Recursively calculte the height of the left and the right subtrees of a node
 * and assign height to the node as max of the heights of two children plus 1.
 * 
 */

/*
 * Example:
 * maxDepth('1') = max(maxDepth('2'),maxDepth('3'))+1 = 2+1,
 * because recursively,
 * maxDepth('2')= max(maxDepth('4'), maxDepth('5'))+1 = 1+1
 * and (as height of both '4' and '5' are 1)
 * maxDepth('3') = 1
 */

/*
 * Algorithm:
 * Recursively do a Depth-first search.
 * If the tree is empty, then return 0.
 * Otherwise, do the following:
 * Get the max depth of the left subtree recusively i.e. call
 * maxDepth(tree->left-subtree).
 * Get the max depth of the rigth subtree recursively i.e. call maxDepth
 * (tree->right-subtree).
 * Get the max of max depths of left and right subtrees and add 1 to it for the
 * current node.
 * maxDepth = max(maxDepth of leftsubtree, maxdepth of right subtree) + 1.
 * Return max_depth
 */

// Insertion in A Binary Tree in Level order
/*
 * Given a binary tree and a key, insert the key into the binary tree at the
 * first position available in level order.
 * 
 */
// TBC
//////////////////////////////////////////////
// Level Order Traversal (interviewbit)
// 1. Recursive Approach:
/*
 * There are basically two function in this approach.
 * One of them is used to print all nodes at a particular level (Current level),
 * and another is used to print the level order traversal of the tree
 * (Levelorder).
 * 
 */

/*
 * Algorithm:
 * In CurrentLevel function, we find the heigth of the tree and call the
 * LevelOrder function for every level between 1 to height.
 * 
 * In the LevelOrder function, we pass two parameters level and root. We follow
 * the below steps:
 * First, check if the root is null then return.
 * Check if the level is equal to 1, then print the current root value.
 * Now, cal recursively call both the children of the current node with
 * decrementing the value of level by 1.
 */

///////////////////////////////////////////////////////
// Difference between depth and height
/*
 * The depth of a nodoe is the number of edges from the node to the tree's root
 * node.
 * A root node will have a depth of 0.
 */

/*
 * The height of a node is the number of edges on the longest path from the node
 * to leaf.
 * A leaf node will have a heigth of 0.
 */

// Properties of a Tree:
/*
 * The height of a tree would be the height of its root node, or equivalently,
 * the depth of its deepest node.
 * 
 * The diameter (or width) of a tree is the number of nodes on the longest path
 * between any two leaf nodes.
 */

/////////////////////////////////////////////////
// Level in a Binary Tree
/*
 * A level in the number of nodes corresponding to given a node of the tree.
 * 
 * It is basically the number of ancestors from that node until the root node.
 * 
 * So, for the root node (topmost node), it's level is 0, since it has no
 * parent.
 * 
 * If it has children, both of them will have a level 1, since it has only one
 * ancestor until the root node, which is the root node itself.
 */

////////////////////////////////////////////////////////////
// Inorder Tree Traversal without Recursion
/*
 * Algorithm for traversing a binary tree using stack:
 * Create an empty stack (say S).
 * 
 * Initialize the current node as root.
 * 
 * Push the current node to S and set the current = current -> left until
 * current is NULL.
 * 
 * If the current is NULL and the stack is not empty then:
 * Pop the top item from the stack.
 * Print the popped item and set current = popped_item -> right
 * Go to step 3
 * 
 * If current is NULL and stack is empty then we are done.
 */