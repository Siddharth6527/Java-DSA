import java.util.*;

class Node {
  int x;
  Node left;
  Node right;
}

public class TreeTraversal {
  // print inorder traversal
  void printInorder(Node node) {
    if (node == null) {
      return;
    }

    printInorder(node.left);
    System.out.print(node.x + " ");
    printInorder(node.right);
  }

  void printPreorder(Node node) {
    if (node == null) {
      return;
    }

    System.out.print(node.x + " ");
    printPreorder(node.left);
    printPreorder(node.right);
  }

  void printPostorder(Node node) {
    if (node == null) {
      return;
    }

    printPostorder(node.left);
    printPostorder(node.right);
    System.out.print(node.x + " ");
  }

  void printLevelOrder(Node root) {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);

    while (!queue.isEmpty()) {
      Node tempNode = queue.poll();
      System.out.print(tempNode.x + " ");

      if (tempNode.left != null) {
        queue.add(tempNode.left);
      }

      if (tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }

  }

}