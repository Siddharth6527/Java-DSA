////////////////////////////////////////
// Searching an Element in a B-Tree:
// class Node {
// int n;
// int[] key = new int[MAX_KEYS];
// Node[] child = new Node[MAX_CHildren];
// boolean leaf;
// }

// class Btree {
// Node BtreeSearch(Node x, int k) {
// // to traverse the keys of a Node
// // make use of i as counter
// int i = 0;

// // traverse through the keys of a node
// // make sure that values of the node doesn't exceed
// // the given value k
// // simultaneously, increase i by 1.
// while (i < x.n && x.key[i] <= k) {
// i++;
// }

// // if the current node is equal to the given value
// // then return
// if (i < x.n && k == x.key[i]) {
// return x;
// }

// // if it has reached here, then we did'nt found
// // the key and reached the leaf nodes
// // so terminate
// if (x.leaf) {
// return null;
// }

// // recur the function with the correct child of the node
// return BtreeSearch(x.child[i], k);
// }
// }

///////////////////////////////////
// Java Program to illustrate the sum of two numbers
// class BTreeNode {
// int[] keys; // an array of keys
// int t; // minimun degeree (defines the range for number of keys)

// BTreeNode[] C; // an array of child pointers
// int n; // current number of keys
// boolean leaf; // is true when node is leaf, otherwise false

// // number of keys = 2*t-1
// // child nodes = 2*t
// // constructor
// BTreeNode(int t, boolean leaf) {
// this.t = t;
// this.leaf = leaf;
// this.keys = new int[2 * t - 1];
// this.C = new BTreeNode[2 * t];
// this.n = 0;
// }

// // a function to traverse all nodes in a subtree
// // rooted with this node.
// public void traverse() {

// // there are n keys and n+1 children, traverse
// // through n keys and first n children
// int i = 0;
// for (i = 0; i < this.n; i++) {

// // If this is not leaf, then before priting
// // key[i], traverse the subtree rooted with
// // child C[i]
// if (this.leaf == false) {
// C[i].traverse();
// }
// System.out.println(keys[i] + " ");
// }

// // print the subtree rooted with last child
// if (leaf == false) {
// C[i].traverse();
// }
// }

// // a function to search a key in the subtree rooted with
// // this node.
// BTreeNode search(int k) {
// // returns null if k is not present

// // find the first key greater than or equal to k
// int i = 0;
// while (i < n && k > keys[i]) {
// i++;
// }

// // if the found key is equal to k, return this node
// if (keys[i] == k) {
// return this;
// }

// // if the key is not found here and this is a leaf
// // node
// if (leaf == true) {
// return null;
// }

// // Go to the appropriate child
// return C[i].search(k);
// }

// }

// class Btree {
// public BTreeNode root; // pointer to root node
// public int t; // Minimym degree

// // constructor (Initializes tree as empty)
// Btree(int t) {
// this.root = null;
// this.t = t;
// }

// // function to traverse the tree
// public void traverse() {
// if (this.root != null) {
// this.root.traverse();
// }
// System.out.println();
// }

// // function to search a key in this tree
// public BTreeNode search(int k) {
// if (this.root == null) {
// return null;
// } else {
// return this.root.search(k);
// }
// }
// }