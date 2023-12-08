// Heap
/*
 * A Heap is a special Tree-based data structure in which the tree is a complete
 * binary tree.
 */

/*
 * Operations of Heap Data Structure:
 * Heapify - a process of creating a heap from an array.
 * 
 * Insertion - process to insert an element in existing heap time complexity
 * O(log N).
 * 
 * Deletion - deleting the top element of the heap or the highest priority
 * element, and then organizing the heap and returning the element with the time
 * complexiy O(log N).
 * 
 * Peek: to check or find the first (or can say the top) element of the heap.
 */

/*
 * Types of Heap Data Structure:
 * 1. Max-Heap: In a Max-Heap the key present at the root node must be gretest
 * among the keys present at all of it's children.
 * The same property must be recursively true for all sub-trees in that Binary
 * Tree.
 * 
 * 2. Min-Heap: In a Min-Heap the key present at the root node must be minimum
 * among the keys present at all of it's children.
 * The same property must be recursively true for all sub-trees in that Binary
 * Tree.
 */

/*
 * The total number of comparisons required in the max/min heap is according to
 * the height of tree.
 * The height of the complete binary tree is always log n;
 * Therefore, the time complexity would be O(log n).
 */

// Properties of Heap:
/*
 * 1. Complete Binary Tree: A heap tree is a complete binary tree, meaning all
 * levels of the tree are full filled except possibly the last level, which is
 * filled from left to right.
 * This property ensures that the tree is efficiently reprsented using an array.
 * 
 * 2. Heap Property: This property ensures that the minimum (or maximum) element
 * is always at the root of the tree according to the heap type.
 * 
 * 3. Parent-Child Relationship: The relationship between a parent node at index
 * 'i' and its children is given by the formula: left child at index 2i+1 and
 * right child at index 2i+2 for 0-based indexing of node numbers.
 * 
 * 4. Efficent Insertion and Removal: Insertion and removal operations in heap
 * trees are efficient.
 * 
 * New elements are inserted at the next avaialable position in the
 * bottom-rightmost level, and the heap property is restored by comparing the
 * element with its parent and swapping if necessary.
 * 
 * Removal of the root element involves replacing it with the last element and
 * heapifying down.
 * 
 * 5. Efficient Access to External Elements: The minimum or maximum element is
 * always at the root of the heap, allowing constant-time access.
 * 
 */

/////////////////////////////////
// Heapify:
/*
 * It is the process to rearrange the elements to maintain the property of heap
 * data structure.
 * 
 * It is done when a certain node creates an imbalance in the heap due to some
 * operations on that node.
 * It takes O(log N) to balance the tree.
 * 
 * - For max-heap, it balances in such a way that the maximum element is the
 * root of that binary tree and
 * 
 * - For min-heap, it balances in such a way that the minimum element is the
 * root of that binary tree.
 */

////////////////////////////////////
// Insertion:
/*
 * If we insert a new element into the heap since we are adding a new element
 * into the heap so it will distort the properties of the heap so we need to
 * perform the heapify operation so that it maintians the property of the heap.
 * 
 * This operation also takes O(log N) time.
 */

// Deletion:
/*
 * - If we delete the element from the heap it always deletes the root element
 * of
 * the tree and replaces it with the last element of the tree.
 * 
 * - Since we delete the root element from the heap it will distort the
 * properties of the heap so we need to perform heapify operations so that it
 * maintains the property of the heap.
 * 
 * It takes O(log N) time.
 */

//////////////////////////
// getMax (for max-heap) or getMin (for min-heap):
/*
 * It finds the maximum element or minimum element for max-heap and min-heap
 * respectively and as we know minimum and maximum elements will always be the
 * root itself for min-heap and max-heap respectively.
 * 
 * It takes O(1) time.
 */

// removeMin or removeMax:
/*
 * This operation returns and deletes the maximum element and minimum element
 * from the max-heap and min-heap respectively.
 * 
 * In short, it deletes the root element of the heap binary tree.
 */

///////////////////////////////////////////////////////////
// Implementation of Heap Data Structure:
/*
 * maxHeapify is the function possible for restoring the property fo the Max
 * Heap.
 * It arranges the node i, and its subtrees accordingly so that the heap
 * property is maintained.
 * 
 * 1. Suppose we are given an array, arr[] representing the complete binary
 * tree.
 * The left and right child of ith node are in indices 2*i+1 and 2*i+2.
 * 
 * 2. We set the index of the current element, i, as the MAXIMUM.
 * 
 * 3. If arr[2*i+1]>arr[i], i.e., the left child is larger than the current
 * value, it is set as 'MAXIMUM'.
 * 
 * 4. Similarly if arr[2*i+2]>arr[i], i.e., the right child is larger than the
 * current value, it is set as "MAXIMUM".
 * 
 * 5. Swap the 'MAXIMUM' with the current element.
 * 
 * 6. Repeat steps 2 to 5 till the property of the heap is restored.
 */