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

/*
 * Applications of Heap Data Structure:
 * 1. Priority Queues: Priority queues can be efficiently implemented using
 * Binary Heap because it supports insert(), delete() and extractmax(),
 * decreaseKey() operaions in O(log N) time.
 * 
 * 2. Binomial Heap and Fibonacci Heap are variations of Binary Heap. These
 * variations perform union also in O(log N) time which is an O(N) operation in
 * Binary Heap.
 * 
 * 3. Order statistics: The Heap data structure can be used to efficiently find
 * the kth smallest (or largest) element in an array.
 */

//////////////////////////
// Advantages of Heaps:
/*
 * 1. Fast access to maximum/minimum element O(1).
 * 2. Efficient Insertion and Deletion operations (O(log N)).
 * 3. Flexible Size.
 * 4. Can be efficiently implemented as an array.
 * 5. Suitable for real-time applications.
 * 
 */

////////////////////////
// Disadvantages of Heaps:
/*
 * 1. Not suitable for seraching for an element other than maximum/ minimum
 * (O(n) in worst case).
 * 
 * 2. Extra memeory overhead to maintain heap structure.
 * 
 * 3. Slower than other data structures like arrays and liked lists for
 * non-priority queue operations.
 */

/////////////////////////////////////////////////////////////////
// Deletion in Heap:
/*
 * Given a Binary Heap and an element present in the given Heap.
 * The task is to delete an element from this Heap.
 */

/*
 * The standard deletion operations on Heap is to delete the element present at
 * the root node of the Heap.
 * 
 * That is if it is a Max Heap, the standard deletion operation will delete the
 * maximum element and if it is a Min heap, it will delete the minimum element.
 */

// Process Of Deletion:
/*
 * Since deleting an element at any intermediary position in the heap can be
 * costly, so we can simply replace the element to be deleted by the last
 * element and delete the last element of the Heap.
 * 
 * 1. Replace the root or element to be deleted by the last element.
 * 2. Delete the last element from the Heap.
 * 3. Since, the last element is now places at the position of the root node.
 * So, it may not follow the heap property.
 * Therefore, heapify the last node placed at the position of root.
 * 
 */

////////////////////////////////////////
// Insertion in Heaps:
/*
 * Given a Binary Heap and a new element to be added to his Heap.
 * The task is to insert the new element to the Heap maintaining the properties
 * of Heap.
 */

// Process of Insertion:
/*
 * 1. First increase the heap size by 1, so that it can store the new element.
 * 
 * 2. Insert the new element at the end of the Heap.
 * 
 * 3. This newly inserted element may distort the properties of Heap for its
 * parents.
 * So, in order to keep the properties of Heap, heapify this newly inserted
 * element following a bottom-up approach.
 */

//////////////////////////////////////////////////////////////////
// Heap Sort:
/*
 * Heap sort is a comparison-based sorting technique based on Binary Heap data
 * structure.
 * 
 * It is similar to the selection sort where we first find the minimum element
 * and place the minimum element at the beginning.
 * 
 * Repeat the same process for remaining elements.
 */

/*
 * Algorithm:
 * First convert the array into heap data structure using heapify, then one by
 * one delete the root node of the Max-heap and replace it with the last node in
 * the heap and then heapify the root of the heap.
 * 
 * Repeat this process until size of heap is greater than 1.
 * 
 * 1. Build a heap from the given heap input array.
 * 
 * 2. Repeat the following steps until the heap contains only one element:
 * a) Swap the root element of the heap (which is the largest element) with the
 * last element of the heap.
 * b) Remove the last element of the heap (which is now in the correct
 * position).
 * c) Heapify the remaining elements of the heap.
 * 
 * 3. The sorted array is obtained by reversing the order of the elements in the
 * input array.
 */

/////////////////////////////////////
// Important points about Heap Sort:
/*
 * Heap sort is an in-place algorithm.
 * Its typical implementation is not stable but can be made stable.
 * Typically 2-3 times slower than well-implemented QuickSort.
 * The reason for slowness is a lack of locality of reference.
 */

/////////////////////////////////
// Advantages of Heap Sort:
/*
 * 1. Efficient Time Compleixty: Heap Sort has a time complexity of O(n log n)
 * in all cases.
 * This makes it efficient for sorting large datasets.
 * The (log n) factor comes from the height of the binary heap, and it ensures
 * that the algorithm maintains good performance even with a large number of
 * elements.
 * 
 * 2. Memory Usage: Memeory usage can be minimal because apart from what is
 * necessary to hold the initial list of items to be sorted, it needs no
 * additional memory space to work.
 * 
 * 3. Simplicity: It is simpler to understand than other eqaully efficient
 * sorting algorithms because it does not use advanced computer science concepts
 * such as recusion.
 * 
 */

///////////////////////////////
/*
 * Disadvantages of Heap Sort:
 * 1. Costly: Heap sort is costly.
 * 2. Unstable: Heap sort is unstable. It might rearrange the relative order.
 * 3. Efficent: Heap Sort is not very efficient when working wiht highly complex
 * data.
 */