// Searching in Binary Seach Tree (BST)
// class Node {
// int key;
// Node left, right;

// public Node(int item) {
// key = item;
// left = right = null;
// }
// }

// class BinarySearchTree {
// Node root;

// // Constructor
// BinarySearchTree() {
// root = null;
// }

// // A utility function to insert
// // a new node with given key in BST
// Node insert(Node node, int key) {
// // If the tree is empty, return a new node
// if (node == null) {
// node = new Node(key);
// return node;
// }

// // Otherwise, recur down the tree
// if (key < node.key)
// node.left = insert(node.left, key);
// else if (key > node.key)
// node.right = insert(node.right, key);

// // Return the (unchanged) node pointer
// return node;
// }

// // Utility function to search a key in a BST
// Node search(Node root, int key) {
// // Base Cases: root is null or key is present at root
// if (root == null || root.key == key)
// return root;

// // Key is greater than root's key
// if (root.key < key)
// return search(root.right, key);

// // Key is smaller than root's key
// return search(root.left, key);
// }

// // Driver Code
// public static void main(String[] args) {
// BinarySearchTree tree = new BinarySearchTree();

// // Inserting nodes
// tree.root = tree.insert(tree.root, 50);
// tree.insert(tree.root, 30);
// tree.insert(tree.root, 20);
// tree.insert(tree.root, 40);
// tree.insert(tree.root, 70);
// tree.insert(tree.root, 60);
// tree.insert(tree.root, 80);

// // Key to be found
// int key = 6;

// // Searching in a BST
// if (tree.search(tree.root, key) == null)
// System.out.println(key + " not found");
// else
// System.out.println(key + " found");

// key = 60;

// // Searching in a BST
// if (tree.search(tree.root, key) == null)
// System.out.println(key + " not found");
// else
// System.out.println(key + " found");
// }
// }

//////////////////////////////////////////////////////////////////// Deletion in
//////////////////////////////////////////////////////////////////// BST
// import java.util.*;

// class Node {
// int key;
// Node left, right;

// Node(int item) {
// key = item;
// left = right = null;
// }
// }

// class BST {
// Node root;

// // function to do inorder traversal
// void inorder(Node node) {
// if (root != null) {
// inorder(node.left);
// System.out.print(node.key + " ");
// inorder(node.right);
// }
// }

// Node insert(Node node, int key) {
// // if the tree is empty, return a new node
// if (node == null) {
// return new Node(key);
// }

// // otherwise, recur down the tree
// if (key < node.key) {
// node.left = insert(node.left, key);
// } else if (key > node.key) {
// node.right = insert(node.right, key);
// }

// // return the (unchange) node pointer
// return node;
// }

// // this function deletes the key and returns the new root
// Node deleteNode(Node root, int key) {
// // base case
// if (root == null) {
// return null;
// }

// // recursive call for ancestors
// // of node to be deleted
// if (root.key > key) {
// root.left = deleteNode(root.left, key);
// return root;
// } else if (root.key < key) {
// root.right = deleteNode(root.right, key);
// return root;
// }

// // we reach here when root is the node
// // to be deleted

// // if one of the chldren is empty
// if (root.left == null) {
// Node temp = root.right;
// return temp;
// } else if (root.right == null) {
// Node temp = root.left;
// return temp;
// }

// // if both children exist
// else {
// Node succParent = root;

// // find successor
// Node succ = root.right;
// while (succ.left != null) {
// succParent = succ;
// succ = succ.left;
// }

// // delete successor. Since successor
// // is always left child of its parent
// // we can safely make successor's right
// // right child as left of its parent.
// // If there is no succ, then assign
// // succ.right to succParent.right
// if (succParent != root) {
// succParent.left = succ.right;
// } else {
// succParent.right = succ.right;
// }

// // copy successor data to root
// root.key = succ.key;

// // delete successor and return root
// return root;
// }
// }

// // Driver Code
// public static void main(String[] args) {
// BST tree = new BST();

// /*
// * Let us create following BST
// * 50
// * / \
// * 30 70
// * / \ / \
// * 20 40 60 80
// */
// tree.root = tree.insert(tree.root, 50);
// tree.insert(tree.root, 30);
// tree.insert(tree.root, 20);
// tree.insert(tree.root, 40);
// tree.insert(tree.root, 70);
// tree.insert(tree.root, 60);

// System.out.print("Original BST: ");
// tree.inorder(tree.root);

// System.out.println("\n\nDelete a Leaf Node: 20");
// tree.root = tree.deleteNode(tree.root, 20);
// System.out.print("Modified BST tree after deleting Leaf Node:\n");
// tree.inorder(tree.root);

// System.out.println("\n\nDelete Node with single child: 70");
// tree.root = tree.deleteNode(tree.root, 70);
// System.out.print("Modified BST tree after deleting single child Node:\n");
// tree.inorder(tree.root);

// System.out.println("\n\nDelete Node with both child: 50");
// tree.root = tree.deleteNode(tree.root, 50);
// System.out.print("Modified BST tree after deleting both child Node:\n");
// tree.inorder(tree.root);
// }
// }

////////////////////////////////////////////////////////////
// Inorder Predessor and Successor in BST
// class BST {
// static class Node {
// int key;
// Node left, right;

// public Node() {
// }

// public Node(int key) {
// this.key = key;
// this.left = this.right = null;
// }
// };

// static Node pre = new Node(), suc = new Node();

// // this function finds predecessor and
// // successor of key in BST. It sets pre
// // and suc as predecessor and successor
// // repectively.
// static void findPreSuc(Node root, int key) {
// // base case
// if (root == null) {
// return;
// }

// // if key is present at root
// if (root.key == key) {

// // the maximym value in left
// // subtree is predecessor
// if (root.left != null) {
// Node tmp = root.left;
// while (tmp.right != null) {
// tmp = tmp.right;
// }
// pre = tmp;
// }

// // the minimum value in
// // right subtree is successor
// if (root.right != null) {
// Node tmp = root.right;

// while (tmp.left != null) {
// tmp = tmp.left;
// }
// suc = tmp;
// }
// return;
// }

// // if key is smaller than
// // root's key, go to left subtee
// if (root.key > key) {
// suc = root;
// findPreSuc(root.left, key);
// }

// // go to right subtree
// else {
// pre = root;
// findPreSuc(root.right, key);
// }
// }

// // function to insert a new node in BST
// static Node insert(Node node, int key) {
// if (node == null) {
// return new Node(key);
// }
// if (key < node.key) {
// node.left = insert(node.left, key);
// } else {
// node.right = insert(node.right, key);
// }

// return node;
// }

// // Driver code
// public static void main(String[] args) {

// // Key to be searched in BST
// int key = 65;

// /*
// * Let us create following BST
// * 50
// * / \
// * 30 70
// * / \ / \
// * 20 40 60 80
// */

// Node root = new Node();
// root = insert(root, 50);
// insert(root, 30);
// insert(root, 20);
// insert(root, 40);
// insert(root, 70);
// insert(root, 60);
// insert(root, 80);

// findPreSuc(root, key);
// if (pre != null)
// System.out.println("Predecessor is " + pre.key);
// else
// System.out.println("No Predecessor");

// if (suc != null)
// System.out.println("Successor is " + suc.key);
// else
// System.out.println("No Successor");
// }

// }

////////////////////////////////////////////////////////////
// Check if a binary tree is bst or not
// class BST {
// static class node {
// int data;
// node left, right;
// }

// static node newNode(int data) {
// node Node = new node();
// Node.data = data;
// Node.left = Node.right = null;

// return Node;
// }

// static int maxValue(node Node) {
// if (Node == null) {
// return Integer.MIN_VALUE;
// }

// int value = Node.data;

// int leftMax = maxValue(Node.left);
// int rightMax = maxValue(Node.right);

// return Math.max(value, Math.max(leftMax, rightMax));
// }

// static int minValue(node Node) {
// if (Node == null) {
// return Integer.MAX_VALUE;
// }

// int value = Node.data;
// int leftMax = minValue(Node.left);
// int rightMax = minValue(Node.right);

// return Math.min(value, Math.min(leftMax, rightMax));
// }

// // returns true if a bianry tree is a binary search tree
// static int isBST(node Node) {
// if (Node == null) {
// return 1;
// }

// // false if the max of the left is > than us
// if (Node.left != null && maxValue(Node.left) > Node.data) {
// return 0;
// }

// // false if the min of the right is < than us
// if (Node.right != null && minValue(Node.right) < Node.data) {
// return 0;
// }

// // false if, recursivley, the left or right is not a BST
// if (isBST(Node.left) != 1 || isBST(Node.right) != 1) {
// return 0;
// }

// // passsing all that, it's a BST
// return 1;
// }

// public static void main(String[] args) {
// node root = newNode(4);
// root.left = newNode(2);
// root.right = newNode(5);

// // root->right->left = newNode(7);
// root.left.left = newNode(1);
// root.left.right = newNode(3);

// // Function call
// if (isBST(root) == 1) {
// System.out.print("Is BST");
// } else {
// System.out.print("Not a BST");
// }
// }
// }

// Time Complexity: O(N^2), as we visit every ndoe just once and our helper
// method also takes O(N) time, so overall time complexity becomes O(N)*O(N) =
// O(N^2).

// Auxiliary Space: O(H), where H is the Height of the binary tree, and the
// extra space is used dueq to the function call stack.

/////////////////////////////////////////////////////////////
// Method 2: Using Recursion
// class Node {
// int data;
// Node left, right;

// public Node(int item) {
// data = item;
// left = right = null;
// }
// }

// public class BST {
// Node root;

// boolean isBST() {
// return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
// }

// // returns true if the given tree is a BST and its value
// // are >=min and <= max.
// boolean isBSTUtil(Node node, int min, int max) {
// // an empty tree is BST
// if (node == null) {
// return true;
// }

// // false if this node violates the min/max constraints
// if (node.data < min || node.data > max) {
// return false;
// }

// // otherwise check the subtrees recusively
// // tightening the min/max constaraints
// // allow only distinct
// return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right,
// node.data + 1, max));
// }

// public static void main(String args[]) {
// BST tree = new BST();
// tree.root = new Node(4);
// tree.root.left = new Node(2);
// tree.root.right = new Node(5);
// tree.root.left.left = new Node(1);
// tree.root.left.right = new Node(3);

// // Function call
// if (tree.isBST())
// System.out.println("Is BST");
// else
// System.out.println("Not a BST");
// }
// }

// Time Complexity: O(N), where N is the number of nodes in the tree.
// Auxiliary Space: O(1), if Function Call Stack is nt considered, otherwise
// O(H) where H is the height of the tree.

//////////////////////////////
