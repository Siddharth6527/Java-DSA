// AVL Tree Data Structure
/*
 * An AVL tree defined as a self-balancing Binary Search Tree (BST) where the
 * difference between heights of left and right subtrees for any node cannot be
 * more than one.
 * 
 * The difference between the height of the left subtree and the right subtree
 * for any node is known as the balance factor of the node.
 */

////////////////////////////////
// Rotating the subtrees in an AVL Tree:
// 1. Left Rotation:
/*
 * When a node is added into the right subtree of the right subtree, if the tree
 * gets out of balance, we do a single left rotation.
 * 
 */

// 2. Right Rotation:
/*
 * If a node is added to the left subtree of the left subtree, the AVL tree may
 * get out of balance, we do single right rotation.
 */

// 3. Left-Right Rotation:
/*
 * A left-right rotation is a combination in which first left rotation takes
 * place after that right rotation executes.
 */

// 4. Right-Left Rotation:
/*
 * A right-left rotation is a combination in which firs right rotation takes
 * place after that left rotation executes.
 */

////////////////////////////////////
// Applications of AVL Tree:
/*
 * 1. It is used to index huge records in a database and also to efficiently
 * search in that.
 * 
 * 2. For all types of in-memory collections, including sets and dictionaries,
 * AVL Trees are used.
 * 
 * 3. Database applications, where insertions and deletions are less common but
 * frequent data lookups are necessary.
 * 
 * 4. Software that needs optimized search.
 * 
 * 5. It is applied in corporate areas and storyline games.
 */

//////////////////////////////////////
// Advantages of AVL Trees:
/*
 * 1. AVL Trees can self-balance themselves.
 * 2. It is surely not-skewed.
 * 3. It provides faster lookups than Red-Black Trees.
 * 4. Better searching time compleixty compared to other trees like binary tree.
 * 5. Height cannot exceed log(N), where, N is the total number of nodes in the
 * tree.
 */

//////////////////////////////////
// Disadvantages of AVL Trees:
/*
 * 1. It is difficult to implement.
 * 2. It has high constant factors for some of the opertions.
 * 3. Less used compared to Red-Black Trees.
 * 4. Due to its rather strict balance, AVL trees provide complicated insertion
 * and removal operations as more rotations are performed.
 * 5. Take more processing for balancing.
 */

////////////////////////////////
// Why AVL Trees?
/*
 * Most of the BST operations (eg., search, max, min, insert, delete, etc) take
 * O(h) time where h is the height of the BST.
 * The cost of these operations may become O(n) for a skewed Binary Tree.
 * If we make sure that the height of the tree reamins O(log(n)) after every
 * insertion and deletion, then we can guarantee an upper bound of O(log(n)) for
 * all these operations.
 * The height of an AVL tree is always O(log(n)) where n is the number of nodes
 * in the tree.
 */

//////////////////////////////////////////////////////////////
// Insertion in ABL Tree
/*
 * To make sure that the given tree remains AVL after every insertion, we must
 * augment the standard BST insert operation to perform some re-balancing.
 * 
 * Follwing are two basic operations that can be performed to balance a BST
 * without violating the BST property (keys(left)<key(root)<keys(right)).
 * Left Rotation.
 * Right Rotation.
 */

/*
 * y x
 * / \ Right Rotation / \
 * x T3 - - - - - - - > T1 y
 * / \ < - - - - - - - / \
 * T1 T2 Left Rotation T2 T3
 * 
 * Keys in both of the above trees follow the following order
 * keys(T1) < key(x) < keys(T2) < key(y) < keys(T3)
 * So BST property is not violated anywhere.
 */

// Steps to follow for insertions
/*
 * Let the newly inserted node be w.
 * Starting from w, tavel up and find the first unbalanced node.
 * Let z be the first unbalanced node, y be the child of z that comes on the
 * path from w to z and x be the grandchild of z that comes on the path from w
 * to z.
 * 
 * Re-balance the tree by performing appropriate rotations on the subtree rooted
 * with z.
 * There can be 4 possible cases that neeed be handled as x, y and z can be
 * arranged in 4 ways.
 * 
 * Followng are the possible 4 arrangements:
 * y is the left child of z and x is the left child of y (Left Left Case).
 * y is the left child of z and x is the right child of y (Left Right Case).
 * y is the right child of z and x is the right child of y (Right Right Case).
 * y is the right child of z and x is the left child of y (Right Left Case).
 */

// Approach:
/*
 * The idea is to use recursive BST insert, after insertion, we get pointers to
 * all ancestors one by one in a bottom-up manner.
 * So we don't need a parent pointer to travel up.
 * The recursive code itself travels up and visits all the ancestors of the
 * newly inserted node.
 */

// Follow the steps to implement:
/*
 * Perform the noremal BST insertion.
 * 
 * The current node must be one of the ancestores of the newly inserted node.
 * Update the height of the current node.
 * 
 * Get the balance factor (left subtree height - right subtree height) of the
 * current node.
 * 
 * If the balance factor is greater than 1, then the current node is unbalanced
 * and we are either in the Left Left case or Left Right case.
 * 
 * To check whether is is left left case or not, compare the newly inserted key
 * with the key in the left subtree root.
 * 
 * If the balance factor is less than -1. then the current node is unbalanced
 * and we are either in the Right Right case or Right-Left case.
 * To check whether it is the Right Right case or not, compare the newly
 * inserted key with the key in the right subtree root.
 */