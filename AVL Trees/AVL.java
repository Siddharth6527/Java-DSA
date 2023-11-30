// Insertion in AVL Tree

// class Node {
// int key, height;
// Node left, right;

// Node(int d) {
// key = d;
// height = 1;
// }
// }

// class AVL {
// Node root;

// // a utility function to get the height of the tree
// int height(Node N) {
// if (N == null) {
// return 0;
// }

// return N.height;
// }

// // a utility function to get maximum of two integers
// int max(int a, int b) {
// return (a > b) ? a : b;
// }

// // a utility function to right rotate subtree rooted with y
// Node rightRotate(Node y) {
// Node x = y.left;
// Node T2 = x.right;

// // perform rotation
// x.right = y;
// y.left = T2;

// // update heights
// y.height = max(height(y.left), height(y.right)) + 1;
// x.height = max(height(x.left), height(x.right)) + 1;

// // return new root
// return x;
// }

// // a utility function to left rotate subtree rooted with x
// Node leftRotate(Node x) {
// Node y = x.right;
// Node T2 = y.left;

// // perform rotation
// y.left = x;
// x.right = T2;

// // update height
// x.height = max(height(x.left), height(x.right)) + 1;
// y.height = max(height(y.left), height(y.right)) + 1;

// // return new root
// return y;
// }

// // get Balance factor of node N
// int getBalance(Node N) {
// if (N == null) {
// return 0;
// }

// return height(N.left) - height(N.right);
// }

// Node insert(Node node, int key) {
// // 1. perform the normal BST insertion
// if (node == null) {
// return (new Node(key));
// }

// if (key < node.key) {
// node.left = insert(node.left, key);
// } else if (key > node.key) {
// node.right = insert(node.right, key);
// } else {
// // duplicate keys not allowed
// return node;
// }

// // 2. update height of this ancestor node
// node.height = 1 + max(height(node.left), height(node.right));

// // 3. Get the balance factor of this ancestor
// // node to check whether this node become unbalanced.
// int balance = getBalance(node);

// // if this node becomes unblalanced, then there
// // are 4 cases Left Left case
// if (balance > 1 && key < node.left.key) {
// return rightRotate(node);
// }

// // Right Right Case
// if (balance < -1 && key > node.right.key) {
// return leftRotate(node);
// }

// // Left Right Case
// if (balance > 1 && key > node.left.key) {
// node.left = leftRotate(node.left);
// return rightRotate(node);
// }

// // Right Left Case
// if (balance < -1 && key < node.right.key) {
// node.right = rightRotate(node.right);
// return leftRotate(node);
// }

// // return the (unchanges) node pointer
// return node;
// }

// // a utility function to print preorder traversal
// // of the tree.
// // The function also pritns height of every node.
// void preOrder(Node node) {
// if (node != null) {
// System.out.print(node.key + " ");
// preOrder(node.left);
// preOrder(node.right);
// }
// }

// public static void main(String[] args) {
// AVL tree = new AVL();

// /* Constructing tree given in the above figure */
// tree.root = tree.insert(tree.root, 10);
// tree.root = tree.insert(tree.root, 20);
// tree.root = tree.insert(tree.root, 30);
// tree.root = tree.insert(tree.root, 40);
// tree.root = tree.insert(tree.root, 50);
// tree.root = tree.insert(tree.root, 25);

// /*
// * The constructed AVL Tree would be
// * 30
// * / \
// * 20 40
// * / \ \
// * 10 25 50
// */
// System.out.println("Preorder traversal" +
// " of constructed tree is : ");
// tree.preOrder(tree.root);
// }
// }

// Complexity Analysis:
// Time Complexity: O(log (n)), for insertion
// Auxiliary Space: O(1)