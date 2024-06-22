package Basics.code;

import java.util.*;

// node class to define the strucutre of the node
class Node {
  int data;
  Node left, right;

  // parameter constructor
  Node(int val) {
    data = val;
    left = right = null;
  }
}

/**
 * BinaryTree
 */
public class BinaryTree {
  // function to insert nodes
  public static Node insert(Node root, int data) {
    // if tree is empty, new node becomes the root
    if (root == null) {
      root = new Node(data);
      return root;
    }

    // Queue to traverse the trre and find the
    // position to insert the node
    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
      Node temp = q.poll();

      // insert node as the left child of
      // the parent
      if (temp.left == null) {
        temp.left = new Node(data);
        break;
      }

      // if the left child is not null
      // push it to the queue
      else
        q.offer(temp.left);

      // Insert node as the right child of
      // parent node
      if (temp.right == null) {
        temp.right = new Node(data);
        break;
      }

      // if the right child is not null
      // push it to the queue
      else
        q.offer(temp.right);
    }

    return root;
  }

  // function to delete the given
  // deepest node (d_node) in binary tree
  public static void deleteDeepest(Node root, Node d_node) {
    Queue<Node> q = new LinkedList<>();
    q.offer(root);

    // do level order traversal until last node
    Node temp;
    while (!q.isEmpty()) {
      temp = q.poll();

      // checking current
      if (temp == d_node) {
        temp = null;
        d_node = null;
        return;
      }

      // checking right
      if (temp.right != null) {
        if (temp.right == d_node) {
          temp.right = null;
          d_node = null;
          return;
        } else {
          q.offer(temp.right);
        }
      }

      // checking left
      if (temp.left != null) {
        if (temp.left == d_node) {
          temp.left = null;
          d_node = null;
        } else {
          q.offer(temp.left);
        }
      }
    }
  }

  // function to delete element in binary tree
  public static Node deletion(Node root, int key) {
    // base case
    if (root == null) {
      return null;
    }

    // for single node
    if (root.left == null && root.right == null) {
      if (root.data == key) {
        return null;
      } else {
        return root;
      }
    }

    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    Node temp = new Node(0);
    Node key_node = null;

    // do level order traversal to find deepest
    // node (temp) and node to be deleted (key_node)
    while (!q.isEmpty()) {
      temp = q.poll();
      if (temp.data == key) {
        key_node = temp;
      }
      if (temp.left != null)
        q.offer(temp.left);
      if (temp.right != null) {
        q.offer(temp.right);
      }
    }

    if (key_node != null) {
      int x = temp.data;
      key_node.data = x;
      deleteDeepest(root, temp);
    }
    return root;
  }

  // Inorder tree traversal (left-root-right)
  public static void inorderTraversal(Node root) {
    if (root == null) {
      return;
    }

    inorderTraversal(root.left);
    System.out.println(root.data + " ");
    inorderTraversal(root.right);
  }

  // preorder tree traversal (root-left-right)
  public static void preorderTraversal(Node root) {
    if (root == null)
      return;

    System.out.println(root.data);
    preorderTraversal(root.left);
    preorderTraversal(root.right);
  }

  // Postorder tree traversal (left-right-root)
  public static void postorderTraversal(Node root) {
    if (root == null) {
      return;
    }

    postorderTraversal(root.left);
    postorderTraversal(root.right);
    System.out.println(root.data + " ");
  }

  // function for level order tree traversal
  public static void levelorderTraversal(Node root) {
    if (root == null) {
      return;
    }

    // queue for level order traversal
    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
      Node temp = q.poll();
      System.out.println(temp.data + " ");
      // push left child in the queue
      if (temp.left != null) {
        q.offer(temp.left);
      }
      // push right child in the queue
      if (temp.right != null) {
        q.offer(temp.right);
      }
    }
  }

  // driver function to check the above algoritihms
  public static void main(String[] args) {
    Node root = null;
    // Insertion of nodes
    root = insert(root, 10);
    root = insert(root, 20);
    root = insert(root, 30);
    root = insert(root, 40);

    System.out.print("Preorder traversal: ");
    preorderTraversal(root);

    System.out.print("\nInorder traversal: ");
    inorderTraversal(root);

    System.out.print("\nPostorder traversal: ");
    postorderTraversal(root);

    System.out.print("\nLevel order traversal: ");
    levelorderTraversal(root);

    // delete the node with data = 20
    root = deletion(root, 20);

    System.out.println("\nInorder traversal after deletion: ");
    inorderTraversal(root);
  }
}