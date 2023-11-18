// Implementation of Binary Tree

// class containig left and right child
// of current node and key value
// class Node {
// int key;
// Node left, right;

// public Node(int item) {
// key = item;
// left = right = null;
// }
// }

// // A java program to introduce binary tree
// class BinaryTree {
// // root of binay tree
// Node root;

// // constructors
// BinaryTree(int key) {
// root = new Node(key);
// }

// BinaryTree() {
// root = null;
// }

// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();

// // create root
// tree.root = new Node(1);
// tree.root.left = new Node(2);
// tree.root.right = new Node(3);

// tree.root.left.left = new Node(4);

// }

// }
/*
 * 1
 * / \
 * 2 3
 * / \ / \
 * 4 null null null
 */

//////////////////////////////////////////////////////////
// In-order Tree Traversal:
// class Node {
// int key;
// Node left, right;

// public Node(int item) {
// key = item;
// left = right = null;
// }
// }

// class BinaryTree {
// // root of binary tree
// Node root;

// BinaryTree() {
// root = null;
// }

// // given a binary tree, print its nodes in inorder
// void printInorder(Node node) {
// if (node == null) {
// return;
// }

// // first recur on left child
// printInorder(node.left);

// // then print the data of node
// System.out.print(node.key + " ");

// // now recur on right child
// printInorder(node.right);
// }

// // driver code
// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();
// tree.root = new Node(1);
// tree.root.left = new Node(2);
// tree.root.right = new Node(3);
// tree.root.left.left = new Node(4);
// tree.root.left.right = new Node(5);

// // function call
// System.out.println("Inorder traversal of binary tree is :");
// tree.printInorder(tree.root);
// }
// }

// // Time complexity: O(N)
// // Auxiliary Space: If we don't consider the size of the stack for function
// // calll then O(1) otherwise O(h) where h is the height of the tree.

//////////////////////////////////////////////////////////
// Pre-order Tree Traversal:
// class Node {
// int key;
// Node left, right;

// public Node(int item) {
// key = item;
// left = right = null;
// }
// }

// class BinaryTree {
// // root of binary tree
// Node root;

// BinaryTree() {
// root = null;
// }

// // give a binary tree, print its nodes in preorder
// void printPreorder(Node node) {
// if (node == null) {
// return;
// }

// // first print data of node
// System.out.print(node.key + " ");

// // then recur on left subtree
// printPreorder(node.left);

// // now recur on right subtree
// printPreorder(node.right);
// }

// // driver code
// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();
// tree.root = new Node(1);
// tree.root.left = new Node(2);
// tree.root.right = new Node(3);
// tree.root.left.left = new Node(4);
// tree.root.left.right = new Node(5);

// // function call
// System.out.println("Preorder traversal of binary tree is ");
// tree.printPreorder(tree.root);
// }
// }

// Time Complexity: O(N)
// Auxiliary Space: If we don't consider the size of the stack for function
// calls then O(1) other wise O(h) where h is the hegith of the tree.

///////////////////////////////////////////////////////////
// Post-Order Tree Traversal:
// class Node {
// int key;
// Node left, right;

// public Node(int item) {
// key = item;
// left = right = null;
// }
// }

// class BinaryTree {
// // root of binary tree
// Node root;

// BinaryTree() {
// root = null;
// }

// // given a bianry tree, print its nodes according to the
// // "bottom-up" postorder traversal.
// void printPostorder(Node node) {
// if (node == null) {
// return;
// }

// // first recur on left subtree
// printPostorder(node.left);

// // then recur on right subtree
// printPostorder(node.right);

// // now deal with the node
// System.out.print(node.key + " ");
// }

// // driver code
// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();
// tree.root = new Node(1);
// tree.root.left = new Node(2);
// tree.root.right = new Node(3);
// tree.root.left.left = new Node(4);
// tree.root.left.right = new Node(5);

// // function call
// System.out.println("Postorder traversasl of binary tree is ");
// tree.printPostorder(tree.root);
// }
// }

//////////////////////////////////////////////////
// Level Order Traversal
// class Node {
// int data;
// Node left, right;

// public Node(int item) {
// data = item;
// left = right = null;
// }
// }

// class BinaryTree {
// // root of the binary tree
// Node root;

// public BinaryTree() {
// root = null;
// }

// // function to print level order traversal of tree
// void printLevelOrder() {
// int h = height(root);
// int i;
// for (i = 1; i <= h; i++) {
// printCurrentLevel(root, i);
// }
// }

// // compute the "height" of a tree -- the number of
// // nodes along the longest path from the root node
// // down to the farthest leaf node.
// int height(Node root) {
// if (root == null) {
// return 0;
// } else {
// // compute height of each subtree
// int lheight = height(root.left);
// int rheight = height(root.right);

// // use the larger one
// if (lheight > rheight) {
// return (lheight + 1);
// } else {
// return (rheight + 1);
// }
// }
// }

// // print nodes at current level
// void printCurrentLevel(Node root, int level) {
// if (root == null) {
// return;
// }
// if (level == 1) {
// System.out.println(root.data + " ");
// } else if (level > 1) {
// printCurrentLevel(root.left, level - 1);
// printCurrentLevel(root.right, level - 1);
// }
// }

// // driver program to test above functions
// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();
// tree.root = new Node(1);
// tree.root.left = new Node(2);
// tree.root.right = new Node(3);
// tree.root.left.left = new Node(4);
// tree.root.left.right = new Node(5);

// System.out.println("Level order traversal of binary tree is : ");
// tree.printLevelOrder();
// }
// }

// Time Complexity: O(N^2), where N is the number of nodes in the skewed tree.
// Auxiliary Space: O(1) if the recursion stack is considered the space used is
// O(N).

////////////////////////////////////////////////////////////
// Level Order Traversal Using Queue
// import java.util.LinkedList;
// import java.util.Queue;

// // class to represent tree node
// class Node {
// int data;
// Node left, right;

// public Node(int item) {
// data = item;
// left = null;
// right = null;
// }
// }

// // class to print level order traversal
// class BinaryTree {
// Node root;

// // given a binary tree. Print
// // its nodes in level order
// // using array for implementing queue
// void printLevelOrder() {
// Queue<Node> queue = new LinkedList<Node>();
// queue.add(root);

// while (!queue.isEmpty()) {
// // poll() removes the present head.
// Node tempNode = queue.poll();
// System.out.println(tempNode.data + " ");

// // enqueue left child
// if (tempNode.left != null) {
// queue.add(tempNode.left);
// }

// // Enqueue right child
// if (tempNode.right != null) {
// queue.add(tempNode.right);
// }
// }
// }

// public static void main(String[] args) {
// BinaryTree tree_level = new BinaryTree();
// tree_level.root = new Node(1);
// tree_level.root.left = new Node(2);
// tree_level.root.right = new Node(3);
// tree_level.root.left.left = new Node(4);
// tree_level.root.left.right = new Node(5);

// System.out.println("Level order traversal of binary tree is - ");
// tree_level.printLevelOrder();

// }
// }

///////////////////////////////////////////////////////
// Find the maximum depth or height of a tree
// class Node {
// int data;
// Node left, right;

// Node(int item) {
// data = item;
// left = right = null;
// }
// }

// class BinaryTree {
// Node root;

// // compute the 'maxDepth' of a tree --
// // the number of nodes along the longest path from
// // the root node down to the fartest leaf node.
// int maxDepth(Node node) {
// if (node == null) {
// return 0;
// } else {
// // compute the depth of each sbutree
// int lDepth = maxDepth(node.left);
// int rDepth = maxDepth(node.right);

// // use the larger one
// if (lDepth > rDepth) {
// return (lDepth + 1);
// } else {
// return (rDepth + 1);
// }
// }
// }

// // driver code
// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();

// tree.root = new Node(1);
// tree.root.left = new Node(2);
// tree.root.right = new Node(3);
// tree.root.left.left = new Node(4);
// tree.root.left.right = new Node(5);

// System.out.println("Height of tree is " + tree.maxDepth(tree.root));
// }
// }

// Time Complexity: O(N)
// Auxiliary Space: O(N) due to recursive stack.

/////////////////////////////////////////////////////////
// Level Order Traversal (InterviewBit)
// class Node {
// int data;
// Node left, right;

// public Node(int item) {
// data = item;
// left = right = null;
// }
// }

// class BinaryTree {
// Node root;

// public BinaryTree() {
// root = null;
// }

// void LevelOrder() {
// int h = height(root);
// int i;
// for (i = 1; i <= h; i++) {
// CurrentLevel(root, i);
// }
// }

// int height(Node root) {
// if (root == null) {
// return 0;
// } else {
// int lheight = height(root.left);
// int rheight = height(root.right);
// if (lheight > rheight) {
// return (lheight + 1);
// } else
// return (rheight + 1);
// }
// }

// void CurrentLevel(Node root, int level) {
// if (root == null) {
// return;
// }
// if (level == 1) {
// System.out.print(root.data + " ");
// } else if (level > 1) {
// CurrentLevel(root.left, level - 1);
// CurrentLevel(root.right, level - 1);
// }
// }

// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();
// tree.root = new Node(1);
// tree.root.left = new Node(2);
// tree.root.right = new Node(3);
// tree.root.left.left = new Node(4);
// tree.root.left.right = new Node(5);

// tree.LevelOrder();
// }
// }

/////////////////////////////////////////////////////////////
// Inorder tree traversals without recursion
// import java.util.Stack;

// class Node {
// int data;
// Node left, right;

// public Node(int item) {
// data = item;
// left = right = null;
// }
// }

// // class to print the inorder traversal
// class BinaryTree {
// Node root;

// void inorder() {
// if (root == null) {
// return;
// }

// Stack<Node> s = new Stack<Node>();
// Node curr = root;

// // traverse the tree'
// while (curr != null || s.size() > 0) {
// // reach the left most node of
// // curr node
// while (curr != null) {
// // place pointer to a tree node on
// // the stack before traversing
// // the node's left subtree
// s.push(curr);
// curr = curr.left;
// }

// // currnet must be NULL at this point
// curr = s.pop();

// System.out.println(curr.data + " ");

// // we have visited the node and its
// // left subtree. Now, it's right
// // subtree's turn
// curr = curr.right;
// }
// }

// }

////////////////////////////////////////////////////////////////
// Linked Complete Binary tree and its creation
// import java.util.LinkedList;
// import java.util.Queue;

// class Node {
// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// left = right = null;
// }
// }

// class BinaryTree { // complete binary tree
// Node root;

// public BinaryTree() {
// root = null;
// }

// // a utility function to create a new tree node
// Node newNode(int data) {
// Node temp = new Node(data);
// return temp;
// }

// // function to insert a new node in complete binary tree
// void insert(int data) {
// // create a new node for given data
// Node temp = newNode(data);

// // if the tree is empty, initialize the root with a new node.
// if (root == null) {
// root = temp;
// return;
// }

// // create a queue to do level order traversal
// Queue<Node> q = new LinkedList<>();
// q.add(root);

// // do level order travesal
// while (!q.isEmpty()) {
// Node front = q.peek();

// // if the left child of this front node doesn't exist,
// // set the left child as the new node
// if (front.left == null) {
// front.left = temp;
// break;
// }

// // if the right child of this front node doesn't exist, set
// // the right child as the new node.
// else if (front.right == null) {
// front.right = temp;
// break;
// }

// // if the front node has both the left child, and right child, remove ti from
// // the queue.
// else {
// q.remove();
// }

// // Enqueue the left and right children of the current node
// if (front.left != null) {
// q.add(front.left);
// }

// if (front.right != null) {
// q.add(front.right);

// }
// }
// }

// // standard level order traversal to test above function
// void levelOrder() {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();
// q.add(root);

// while (!q.isEmpty()) {
// Node temp = q.poll();
// System.out.println(temp.data + " ");

// if (temp.left != null) {
// q.add(temp.left);
// }

// if (temp.right != null) {
// q.add(temp.right);
// }
// }
// }

// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();
// for (int i = 1; i <= 12; i++) {
// tree.insert(i);
// }

// tree.levelOrder();
// }
// }

///////////////////////////////////////////////////////////////
// Iterative preorder Traversal:
// import java.util.Stack;

// class Node {
// int data;
// Node left, right;

// Node(int item) {
// data = item;
// left = right = null;
// }
// }

// class BinaryTree {
// Node root;

// void iterativePreorder() {
// iterativePreorder(root);
// }

// // an iterative prcoess to print preorder traversal of binary tree
// void iterativePreorder(Node node) {
// // base case
// if (node == null) {
// return;
// }

// // create an empty stack and push root to it.
// Stack<Node> nodeStack = new Stack<>();
// nodeStack.push(root);

// /*
// * Pop all items one by one. Do following for every popped item
// * a) print it
// * b) push its right child
// * c) push its left child
// * Note that right child is pushed first so that left is processed first
// */
// while (nodeStack.empty() == false) {

// // pop the top item form stack and print it.
// Node myNode = nodeStack.peek();
// System.out.print(myNode.data + " ");
// nodeStack.pop();

// // push right and left children of the popped node to stack
// if (myNode.right != null) {
// nodeStack.push(myNode.right);
// }
// if (myNode.left != null) {
// nodeStack.push(myNode.left);
// }
// }
// }

// // driver code
// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();

// tree.root = new Node(10);
// tree.root.left = new Node(8);
// tree.root.right = new Node(2);
// tree.root.left.left = new Node(3);
// tree.root.left.right = new Node(5);
// tree.root.right.left = new Node(2);
// tree.iterativePreorder();

// }
// }

// Time Complexity: O(N)
// Auxiliary Space: O(H), where H is the height of the tree.

////////////////////////////////////
// Another Solution:
// import java.util.Stack;

// class Node {
// int data;
// Node left, right;

// Node(int item) {
// data = item;
// left = right = null;
// }
// }

// class BinaryTree {
// Node root;

// void preorderTraversal() {
// preorderTraversal(root);
// }

// // iterative function to do preorder
// // traversal of the tree
// void preorderTraversal(Node node) {
// if (node == null) {
// return;
// }

// Stack<Node> st = new Stack<Node>();

// // start from root node
// // (set curr node to root node)
// Node curr = node;

// // run till stack is not empty or
// // current is not NULL
// while (curr != null || !st.isEmpty()) {

// // print left children while exist
// // and keep pushing right into the
// // stack.
// while (curr != null) {
// System.out.print(curr.data + " ");

// if (curr.right != null) {
// st.push(curr.right);
// }

// curr = curr.left;

// }

// // we reach when curr is null, so we
// // take out a right child from stack.
// if (!st.isEmpty()) {
// curr = st.pop();
// }
// }
// }

// // drive code
// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();

// tree.root = new Node(10);
// tree.root.left = new Node(20);
// tree.root.right = new Node(30);
// tree.root.left.left = new Node(40);
// tree.root.left.left.left = new Node(70);
// tree.root.left.right = new Node(50);
// tree.root.right.left = new Node(60);
// tree.root.left.left.right = new Node(80);

// tree.preorderTraversal();
// }
// }

// Time Complexity: O(N)
// Auxiliary Space: O(H), where H is the height of the tree.