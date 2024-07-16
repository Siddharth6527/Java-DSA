class Node {
  int data;
  Node left, right;

  Node(int item) {
    data = item;
    left = right = null;
  }
}

class BoundaryTraversal {
  Node root;

  // a simple function to print leaf nodes of a binary tree
  void printLeaves(Node node) {
    if (node == null) {
      return;
    }

    printLeaves(node.left);
    // print it if it is a leaf node
    if (node.left == null && node.right == null) {
      System.out.println(node.data + " ");
    }
    printLeaves(node.right);
  }

  // a function to print all leaf boundary nodes,
  // except a leaf node
  // print the nodes in TOP DOWN manner.
  void printBoundaryLeft(Node node) {
    if (node == null) {
      return;
    }

    if (node.left != null) {
      // to ensure top down order, print the node
      // before calling itself for left subtree
      System.out.print(node.data + " ");
      printBoundaryLeft(node.left);
    } else if (node.right != null) {
      System.out.println(node.data + " ");
      printBoundaryLeft(node.right);
    }

    // do nothing if it is a leaf node, this way we
    // avoid duplicates in output
  }

  // a function print all right boundary nodes,
  // except a leaf node
  // print the nodes in BOTTOM UP manner
  void printBoundaryRight(Node node) {
    if (node == null) {
      return;
    }

    if (node.right != null) {
      // to ensure bottom up order, first call
      // for right
      printBoundaryRight(node.right);
      System.out.println(node.data + " ");
    } else if (node.left != null) {
      printBoundaryRight(node.left);
      System.out.println(node.data + " ");
    }

    // do nothing if it is a leaf node, this way we avoid
    // duplicates in output

  }

  // a function to do boundary traversal of a given binary tree
  void printBoundary(Node node) {
    if (node == null) {
      return;
    }

    System.out.println(node.data + " ");

    // print the left boundary in top-down manner.
    printBoundaryLeft(node.left);

    // print all leaf nodes
    printLeaves(node.left);
    printLeaves(node.right);

    // print the right boundary bottom-up manner
    printBoundaryRight(node.right);
  }

  public static void main(String[] args) {
    BoundaryTraversal tree = new BoundaryTraversal();
    tree.root = new Node(20);
    tree.root.left = new Node(8);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(12);
    tree.root.left.right.left = new Node(10);
    tree.root.left.right.right = new Node(14);
    tree.root.right = new Node(22);
    tree.root.right.right = new Node(25);
    tree.printBoundary(tree.root);
  }

}