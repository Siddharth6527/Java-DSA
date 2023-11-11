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
//   int data;
//   Node left, right;

//   Node(int item) {
//     data = item;
//     left = right = null;
//   }
// }

// class BinaryTree {
//   Node root;

//   // compute the 'maxDepth' of a tree --
//   // the number of nodes along the longest path from
//   // the root node down to the fartest leaf node.
//   int maxDepth(Node node) {
//     if (node == null) {
//       return 0;
//     } else {
//       // compute the depth of each sbutree
//       int lDepth = maxDepth(node.left);
//       int rDepth = maxDepth(node.right);

//       // use the larger one
//       if (lDepth > rDepth) {
//         return (lDepth + 1);
//       } else {
//         return (rDepth + 1);
//       }
//     }
//   }

//   // driver code
//   public static void main(String[] args) {
//     BinaryTree tree = new BinaryTree();

//     tree.root = new Node(1);
//     tree.root.left = new Node(2);
//     tree.root.right = new Node(3);
//     tree.root.left.left = new Node(4);
//     tree.root.left.right = new Node(5);

//     System.out.println("Height of tree is " + tree.maxDepth(tree.root));
//   }
// }

// Time Complexity: O(N)
// Auxiliary Space: O(N) due to recursive stack.

/////////////////////////////////////////////////////////
// Level Order Traversal (InterviewBit)
class Node {
  int data;
  Node left, right;

  public Node(int item) {
    data = item;
    left = right = null;
  }
}

class BinaryTree {
  Node root;

  public BinaryTree() {
    root = null;
  }

  void LevelOrder() {
    int h = height(root);
    int i;
    for (i = 1; i <= h; i++) {
      CurrentLevel(root, i);
    }
  }

  int height(Node root) {
    if (root == null) {
      return 0;
    } else {
      int lheight = height(root.left);
      int rheight = height(root.right);
      if (lheight > rheight) {
        return (lheight + 1);
      } else
        return (rheight + 1);
    }
  }

  void CurrentLevel(Node root, int level) {
    if (root == null) {
      return;
    }
    if (level == 1) {
      System.out.print(root.data + " ");
    } else if (level > 1) {
      CurrentLevel(root.left, level - 1);
      CurrentLevel(root.right, level - 1);
    }
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    tree.LevelOrder();
  }
}