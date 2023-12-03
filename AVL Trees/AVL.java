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

///////////////////////////////////////////////////////////////////////
// Insertion in AVL Tree (UDEMY CODE)
class Node {
  int data, height;
  Node left, right;

  Node(int d) {
    data = d;
    height = 1;
    // starting height from 1 onwards
    left = right = null;
  }
}

class Main {
  static Node root;

  // function to find the height of the node
  // the height of p node is maximum of two child's height
  public static int NodeHeight(Node root) {
    int hl, hr;
    hl = (root != null && root.left != null) ? root.left.height : 0;
    hr = (root != null && root.right != null) ? root.right.height : 0;

    return hl > hr ? hl + 1 : hr + 1;
  }

  public static int BalanceFactor(Node root) {
    int hl = 0, hr;
    hl = (root != null && root.left != null) ? root.left.height : 0;
    hr = (root != null && root.right != null) ? root.right.height : 0;

    return hl - hr;
  }

  public static Node LLRotation(Node p) {
    // height of plr will remain same
    // and the height of pl and p will change

    // take two extra pointers
    // left child of node P - pl
    // right of the (left node of P) -plr

    Node pl = p.left;
    Node plr = pl.right;

    // make the right child of pl that is plr
    // the left child of p
    p.left = plr;
    // and make p as the right child of pl
    pl.right = p;

    // first make changes in the height of p (lower)
    p.height = NodeHeight(p);
    pl.height = NodeHeight(pl);

    // if the parameter passed p, is root
    if (root == p) {
      root = pl;
    }

    // new root
    return pl;

  }

  public static Node LRRotation(Node p) {
    // take the left child of the given node p, pl
    // and also take the right child of (left child of p), plr
    // make plr as center
    // and move p towards right
    // and distribute plr child on the right child of pl
    // on left child of p
    // height of plr and p changes
    // but height of pl remains the same

    Node pl = p.left;
    Node plr = pl.right;

    // arranging left child of plr, first
    pl.right = plr.left;
    // arranging right child of plr, second
    p.left = plr.right;

    // making plr as the center node
    plr.left = pl;
    plr.right = p;

    // for calculating the height of the plr
    // first calculate the height of pl and p
    // as these are at lower level than plr
    // and then go for plr
    pl.height = NodeHeight(pl);
    p.height = NodeHeight(p);
    plr.height = NodeHeight(plr);

    if (root == p) {
      root = plr;
    }

    // return new root
    return plr;

  }

  public static Node RRRotation(Node p) {
    // taking the right child of the given node, pr
    // taking the left child of (right child of p), prl
    Node pr = p.right;
    Node prl = pr.left;

    // making prl the right child of p
    p.right = prl;

    // making left child of pr as p
    pr.left = p;

    // height of the prl reamins the same
    // height of the p and pr changes
    // first calculate prl, then p and then pr
    p.height = NodeHeight(p);
    pr.height = NodeHeight(pr);

    // check if the given node is root
    if (root == p) {
      root = pr;
    }

    // return new root
    return pr;
  }

  public static Node RLRotation(Node p) {
    // taking the right child of the given node, pr
    // taking the left child of (right child of given node), prl
    Node pr = p.right;
    Node prl = pr.left;

    // arrange the childrens of prl
    p.right = prl.left;
    pr.left = prl.right;

    // making the prl as the center
    prl.left = p;
    prl.right = pr;

    // height of all the nodes changes
    // changing the height of p and pr
    p.height = NodeHeight(p);
    pr.height = NodeHeight(pr);
    prl.height = NodeHeight(prl);

    // check for the root case
    if (root == p) {
      root = prl;
    }

    // return new root
    return prl;

  }

  public static Node RInsert(Node root, int key) {
    // 1. Inserting the new node
    if (root == null) {
      root = new Node(key);
      return root;
    }

    if (key < root.data) {
      root.left = RInsert(root.left, key);
    } else if (key > root.data) {
      root.right = RInsert(root.right, key);
    }

    // 2. Updating the height of each node
    // at returning time we are updating the height of each node
    root.height = NodeHeight(root);

    // 3. Performing suitable rotations (at returning time)
    if (BalanceFactor(root) == 2 && BalanceFactor(root.left) == 1) {
      return LLRotation(root);
    } else if (BalanceFactor(root) == 2 && BalanceFactor(root.left) == -1) {
      return LRRotation(root);
    } else if (BalanceFactor(root) == -2 && BalanceFactor(root.right) == -1) {
      return RRRotation(root);
    } else if (BalanceFactor(root) == -2 && BalanceFactor(root.right) == 1) {
      return RLRotation(root);
    }

    return root;
  }

  public static void main(String[] args) {
    root = RInsert(root, 50);
    RInsert(root, 10);
    RInsert(root, 20);

    System.out.println("HELLO");

  }

}
