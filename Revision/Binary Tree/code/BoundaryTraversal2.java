import java.util.*;

public class BoundaryTraversal2 {
  Node root;

  static class Node {
    int data;
    Node left, right;

    Node(int d) {
      data = d;
      left = null;
      right = null;
    }
  }

  private boolean isLeaf(Node node) {
    if (node.left == null && node.right == null) {
      return true;
    }

    return false;
  }

  private void addLeftBound(Node root, ArrayList<Integer> ans) {
    root = root.left;
    while (root != null) {
      if (!isLeaf(root)) {
        ans.add(root.data);
      }

      if (root.left != null) {
        root = root.left;
      } else {
        root = root.right;
      }

    }
  }

  private void addRightBound(Node root, ArrayList<Integer> ans) {
    root = root.right;

    // we need the reverse for this for Anticlockwise
    Stack<Integer> stk = new Stack<>();
    while (root != null) {
      if (!isLeaf(root)) {
        stk.push(root.data);
      }

      if (root.right != null) {
        root = root.right;
      } else {
        root = root.left;
      }
    }

    while (!stk.isEmpty()) {
      ans.add(stk.peek());
      stk.pop();
    }
  }

  // its kind of preorder
  private void addLeaves(Node root, ArrayList<Integer> ans) {
    if (root == null) {
      return;
    }

    if (isLeaf(root)) {
      ans.add(root.data);
      return;
    }

    addLeaves(root.left, ans);
    addLeaves(root.right, ans);
  }

  ArrayList<Integer> boundary(Node root) {
    ArrayList<Integer> ans = new ArrayList<>();
    if (root == null) {
      return ans;
    }

    if (!isLeaf(root)) {
      ans.add(root.data);
    }

    addLeftBound(root, ans);
    addLeaves(root, ans);
    addRightBound(root, ans);

    return ans;
  }

  public static void main(String[] args) {
    // Let us construct the tree given in the above
    // diagram
    BoundaryTraversal2 tree = new BoundaryTraversal2();
    tree.root = new Node(20);
    tree.root.left = new Node(8);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(12);
    tree.root.left.right.left = new Node(10);
    tree.root.left.right.right = new Node(14);
    tree.root.right = new Node(22);
    tree.root.right.right = new Node(25);

    ArrayList<Integer> ans = tree.boundary(tree.root);

    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
    System.out.println();
  }
}
