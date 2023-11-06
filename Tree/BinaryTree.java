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