// class Node {
// int data;
// Node left, right;

// Node(int item) {
// data = item;
// left = right = null;
// }
// }

// class BinaryTree {
// Node root1, root2;

// /*
// * Given two trees, return true if they are
// * structurally identical
// */
// boolean identicalTrees(Node a, Node b) {
// /* 1. both empty */
// if (a == null && b == null)
// return true;

// /* 2. both non-empty -> compare them */
// if (a != null && b != null)
// return (a.data == b.data
// && identicalTrees(a.left, b.left)
// && identicalTrees(a.right, b.right));

// /* 3. one empty, one not -> false */
// return false;
// }

// /* Driver code */
// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();

// tree.root1 = new Node(1);
// tree.root1.left = new Node(2);
// tree.root1.right = new Node(3);
// tree.root1.left.left = new Node(4);
// tree.root1.left.right = new Node(5);

// tree.root2 = new Node(1);
// tree.root2.left = new Node(2);
// tree.root2.right = new Node(3);
// tree.root2.left.left = new Node(4);
// tree.root2.left.right = new Node(5);

// // Function call
// if (tree.identicalTrees(tree.root1, tree.root2))
// System.out.println("Both trees are identical");
// else
// System.out.println("Trees are not identical");
// }
// }

// Time Complexity: O(min(N, M)), where N and M are the sizes of the trees.
// Auxiliary Space: O(log min(N,M)), due to auxiliary stack space used by
// recursion calls

////////////////////////////////////////
// Method 2: Comparing their traversals
// import java.util.*;

// public class BinaryTree {
// static class Node {
// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// }
// }

// public static void main(String[] args) {
// Node root1 = new Node(1);
// root1.left = new Node(2);
// root1.right = new Node(3);
// root1.left.left = new Node(4);
// root1.left.right = new Node(5);

// Node root2 = new Node(1);
// root2.left = new Node(2);
// root2.right = new Node(3);
// root2.left.left = new Node(4);
// root2.left.right = new Node(5);

// // Function call
// if (isIdentical(root1, root2)) {
// System.out.println(
// "Both the trees are identical.");
// } else {
// System.out.println(
// "Given trees are not identical.");
// }

// }

// // function to check if two trees are identical
// static boolean isIdentical(Node root1, Node root2) {
// // create two arraylist to store traversals
// ArrayList<Integer> res1 = new ArrayList<Integer>();
// ArrayList<Integer> res2 = new ArrayList<Integer>();

// // check inOrder
// inOrder(root1, res1);
// inOrder(root2, res2);
// if (!res1.equals(res2)) {
// return false;
// }

// // clear previous result to resuse arraylist
// res1.clear();
// res2.clear();

// // check PreOrder
// preOrder(root1, res1);
// preOrder(root1, res2);
// if (!res1.equals(res2)) {
// return false;
// }

// // clear previous result to reuse arraylist
// res1.clear();
// res2.clear();

// // check PostOrder
// postOrder(root1, res1);
// postOrder(root2, res2);
// if (!res1.equals(res2)) {
// return false;
// }

// return true;
// }

// // function to check inorder traversal
// static void inOrder(Node root, ArrayList<Integer> sol) {
// if (root == null) {
// return;
// }

// inOrder(root.left, sol);
// sol.add(root.data);
// inOrder(root.right, sol);
// }

// // function to check preOrder traversal
// static void preOrder(Node root, ArrayList<Integer> sol) {
// if (root == null) {
// return;
// }

// sol.add(root.data);
// preOrder(root.left, sol);
// preOrder(root.right, sol);
// }

// // function to check postorder traversal
// static void postOrder(Node root, ArrayList<Integer> sol) {
// if (root == null) {
// return;
// }

// postOrder(root.left, sol);
// postOrder(root.right, sol);
// sol.add(root.data);
// }
// }

// Time Complexity: O(N)
// Auxiliary Space: O(N), since using Auxiliary ArrayList and call stack.

/////////////////////////////////////////
// Method 3: Using PreOrder traversal only
// import java.util.Vector;

// class Node {
// int data;
// Node left;
// Node right;

// Node(int d) {
// this.data = d;
// this.left = null;
// this.right = null;
// }
// }

// public class BinaryTree {
// // funciton to traverse the tree in per-order
// public void preorder(Node root, Vector<Integer> v) {
// if (root == null) {
// return;
// }

// v.add(root.data);
// if (root.left != null) {
// preorder(root.left, v);
// } else {
// v.add(0);
// }

// if (root.right != null) {
// preorder(root.right, v);
// } else {
// v.add(0);
// }
// }

// // function to check if two trees are identical
// public boolean isIdentical(Node root1, Node root2) {
// Vector<Integer> v = new Vector<Integer>();
// Vector<Integer> x = new Vector<Integer>();

// preorder(root1, v);
// preorder(root2, x);

// return v.equals(x);
// }

// public static void main(String[] args) {
// Node root1 = new Node(1);
// root1.left = new Node(2);
// root1.right = new Node(3);
// root1.left.left = new Node(4);
// root1.left.right = new Node(5);

// Node root2 = new Node(1);
// root2.left = new Node(2);
// root2.right = new Node(3);
// root2.left.left = new Node(4);
// root2.left.right = new Node(5);

// BinaryTree main = new BinaryTree();
// // Function call
// if (main.isIdentical(root1, root2)) {
// System.out.println("Both the trees are identical.");
// } else {
// System.out.println("Given trees are not identical.");
// }

// }
// }

// Time Complexity: O(N)+O(M)
// Auxiliary Space: O(N)+O(M) for vector

///////////////////////////////////////////////////////
// Print all the root-to-leaf nodes paths
// import java.util.*;

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

// // given a binary tree, print out all of its root-to-leaf
// // paths, one per line. Uses a recursive helper to do
// // the work.
// void printPaths(Node node) {
// int path[] = new int[5];
// printPathsRecur(node, path, 0);
// }

// // Recursive helper function -- given a node, and an array
// // containing the path from the root node up to but not
// // including this node, print out all the root-leaf paths
// void printPathsRecur(Node node, int path[], int pathLen) {
// if (node == null) {
// return;
// }

// // append this node to the path array
// path[pathLen] = node.data;
// pathLen++;

// // it's a leaf, so print the path that lead to here
// if (node.left == null && node.right == null) {
// printArray(path, pathLen);
// System.out.println(Arrays.toString(path));
// } else {
// // other wise try both subtrees
// printPathsRecur(node.left, path, pathLen);
// printPathsRecur(node.right, path, pathLen);
// }
// }

// // function that prints out an array on a line
// void printArray(int ints[], int len) {
// int i;
// for (i = 0; i < len; i++) {
// System.out.print(ints[i] + " ");
// }
// System.out.println("");
// }

// // driver code
// public static void main(String args[]) {
// BinaryTree tree = new BinaryTree();
// tree.root = new Node(10);
// tree.root.left = new Node(8);
// tree.root.right = new Node(2);
// tree.root.left.left = new Node(3);
// tree.root.left.right = new Node(3);
// tree.root.right.left = new Node(2);

// tree.printPaths(tree.root);
// }

// }

// Time Complexity: O(N), where n is number of nodes.
// Space Complexity: O(h), where h is height of a Binary Tree.

///////////////////////////////////
// Alternative Method:
// import java.util.ArrayList;
// import java.util.List;

// class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// left = right = null;
// }
// }

// class BinaryTree {
// // Recursive helper function which will recusively update our ans list.
// // it takes root of our trees, arr list and ans list as an argument
// public static void helper(Node root, List<Integer> arr, List<List<Integer>>
// ans) {
// if (root == null) {
// return;
// }

// arr.add(root.data);
// if (root.left == null && root.right == null) {
// /*
// * This will be onlly true when the node is leaf node and hence we will update
// * our ans list by inserting list arr which have one unique path from root to
// * leaf.
// */
// ans.add(new ArrayList<Integer>(arr));
// // after that we will return since we don't want to check after lead node
// return;
// }
// /*
// * recursively going left and right until we find the lead and updating the
// arr
// * and ans list simultaneously.
// */
// helper(root.left, new ArrayList<Integer>(arr), ans);
// helper(root.right, new ArrayList<Integer>(arr), ans);
// }

// public static List<List<Integer>> Paths(Node root) {
// /*
// * creating 2-d list in which each element is a 1-d list having one unique
// path
// * from root to leaf
// */
// List<List<Integer>> ans = new ArrayList<List<Integer>>();
// /*
// * if root is null then there is no furhter action require so return
// */
// if (root == null) {
// return ans;
// }
// List<Integer> arr = new ArrayList<Integer>();
// /*
// * arr is a list which will have one unique path from root to leaf at a time.
// * arr
// * will be updated recursively
// */
// helper(root, arr, ans);
// /*
// * after helper function call our ans list updated with paths so we will
// return
// * ans
// * list
// */
// return ans;

// }

// public static void main(String[] args) {
// /* defining root and our tree */
// Node root = new Node(10);
// root.left = new Node(8);
// root.right = new Node(2);
// root.left.left = new Node(3);
// root.left.right = new Node(5);
// root.right.left = new Node(2);
// /* The answer returned will be stored in final 2-d list */
// List<List<Integer>> fina = Paths(root);
// /* printing paths from root to leaf */
// for (List<Integer> path : fina) {
// for (int i : path) {
// System.out.print(i + " ");
// }
// System.out.println();
// }
// }
// }

// Time Complexity: O(n)
// Auxiliary Space: O(h) where h is the height of the binary tree

////////////////////////////////////////////////////////////////
// Print left view of Binary Tree
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
// static int max_level = 0;

// // recursive function to pritn left view
// void leftViewUtil(Node node, int level) {
// // base case
// if (node == null) {
// return;
// }

// // if this is the first node of its level
// if (max_level < level) {
// System.out.print(node.data + " ");
// max_level = level;
// }

// // recur for left and right subtrees
// leftViewUtil(node.left, level + 1);
// leftViewUtil(node.right, level + 1);
// }

// // a wrapper over leftViewUtil()
// void leftView() {
// max_level = 0;
// leftViewUtil(root, 1);
// }

// public static void main(String[] args) {
// BinaryTree tree = new BinaryTree();
// tree.root = new Node(10);
// tree.root.left = new Node(2);
// tree.root.right = new Node(3);
// tree.root.left.left = new Node(7);
// tree.root.left.right = new Node(8);
// tree.root.right.right = new Node(15);
// tree.root.right.left = new Node(12);
// tree.root.right.right.left = new Node(14);

// tree.leftView();

// }
// }

// Time Complexity: O(N), The function does a simple traversal of the tree. So
// the complexity is O(n).
// Auxiliary Space: O(h), due to stack spacing during recusvie call. 'h' is the
// height of the binary tree.

// Method 2: Using Level Order Traversal:
// import java.util.*;

// import java.util.*;

// class BST {
// private static class Node {
// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// this.left = left;
// this.right = right;
// }
// }

// // function to print the left view of binary tree
// private static void printLeftView(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> queue = new LinkedList<>();
// queue.add(root);

// while (!queue.isEmpty()) {
// // number of nodes at current level
// int n = queue.size();

// // traverse all nodes of current
// for (int i = 1; i <= n; i++) {
// Node temp = queue.poll();

// // pritn the left most element at
// // the level
// if (i == 1) {
// System.out.print(temp.data + " ");
// }

// // add the left to queeue
// if (temp.left != null) {
// queue.add(temp.left);
// }

// // add the right node to queue
// if (temp.right != null) {
// queue.add(temp.right);
// }
// }

// }
// }

// public static void main(String[] args) {
// Node root = new Node(10);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(7);
// root.left.right = new Node(8);
// root.right.right = new Node(15);
// root.right.left = new Node(12);
// root.right.right.left = new Node(14);

// printLeftView(root);

// }
// }

// Time Complexity: O(N), where n is the number of nodes in the binary tree.
// Auxiliary Space: O(N), since using space for auxiliary queue.

////////////////////////////
// Method 3: Using queue and a null pointer
// import java.util.*;

// class BinaryTree {
// static class Node {
// int data;
// Node left, right;

// public Node(int item) {
// data = item;
// left = right = null;
// }
// }

// // function to print the left view of binary tree
// public static ArrayList<Integer> leftView(Node root) {
// ArrayList<Integer> ans = new ArrayList<>();

// if (root == null) {
// return ans;
// }

// Queue<Node> q = new LinkedList<>();

// q.add(root);
// q.add(null);
// boolean ok = true;

// while (!q.isEmpty()) {
// Node it = q.poll();

// if (it == null) {
// if (ok == false) {
// ok = true;
// }

// if (q.size() == 0) {
// break;
// } else {
// q.add(null);
// }
// } else {
// if (ok) {
// ans.add(it.data);
// ok = false;
// }

// if (it.left != null) {
// q.add(it.left);
// }

// if (it.right != null) {
// q.add(it.right);
// }
// }

// }
// return ans;
// }

// public static void main(String[] args) {
// Node root = new Node(10);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(7);
// root.left.right = new Node(8);
// root.right.right = new Node(15);
// root.right.left = new Node(12);
// root.right.right.left = new Node(14);

// ArrayList<Integer> vec = leftView(root);
// for (int x : vec) {
// System.out.print(x + " ");
// }
// System.out.println();
// }
// }

// Time Complexity: O(N), where N is the total number of nodes.
// Auxiliary Space: O(N) due to space occupied by queue.