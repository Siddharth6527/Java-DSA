package Tree.code;

import java.util.*;

public class DiagonalTraversalBTree {
  static class Node {
    int data;
    Node left;
    Node right;

    // constructor
    Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }

  // root - root of the binary tree
  // d - distace of current line from rightmost-topmost slope
  // diagonalPrint: HashMap to store digaonal elements (passed by reference)
  static void diagonalPrintUtil(Node root, int d, TreeMap<Integer, Vector<Integer>> diagonalPrint) {

  }

}
