// class Node {
// int n;
// int[] key = new int[MAX_KEYS];
// Node[] child = new Node[MAX_CHILDREN];
// boolean leaf;
// }

// class Btree {
// Node BtreeSearch(Node x, int k) {
// int i = 0;
// while (i < x.n && k >= x.key[i]) {
// i++;
// }

// if (i < x.n && k == x.key[i]) {
// return x;
// }

// if (x.leaf) {
// return null;
// }

// return BtreeSearch(x.child[i], k);
// }
// }

/////////////////////////////////////////////////////////////////
// class Btree {
// public BTreeNode root; // pointer to the root node
// public int t; // Minimum degree

// // contructors (Initializes tree as empty)
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

// // A BTree Node
// class BTreeNode {
// int[] keys; // An array of keys
// int t; // Minimum degree (defines the range for number of keys)

// BTreeNode[] C; // An array of child pointers
// int n; // Current number of keys
// boolean leaf; // is true when node is leaf. Otherwise

// // Constructor
// BTreeNode(int t, boolean leaf) {
// this.t = t;
// this.leaf = leaf;
// this.key = new int[2 * t - 1];
// this.C = new BTreeNode[2 * t];
// this.n = 0;
// }

// // a function to traverse all nodes in a subtree rooted with this node
// public void traverse() {
// // there are n keys and n+1 children, traverse
// // through n keys and first n children
// int i = 0;
// for (i = 0; i < this.n; i++) {

// // if this is not leaf, then before printing
// // key[i], traverse the subtree rooted with
// // child C[i]
// if (this.leaf == false) {
// c[i].traverse();
// }
// System.out.print(keys[i] + " ");
// }

// // Print the subtree rooted with last child
// if (leaf == false) {
// c[i].traverse();
// }
// }

// // a function to search a key in the subtree rooted with
// // this node.
// BTreeNode search(int k) {
// // returns null if k is not present.

// // find the first key greater than or equal to k
// int i = 0;
// while (i < n && k > keys[i]) {
// i++;
// }

// // if the found key is equal to k, return this node
// if (keys[i] == k) {
// return this;
// }

// // if the key is not found here and this is a leaf node
// if (leaf == true) {
// return null;
// }

// // go to the appropriate child
// return c[i].search(k);
// }
// }
