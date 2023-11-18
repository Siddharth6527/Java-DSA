// Find the closest pair from two sorted arrays using Binary Search:
/*
 * Since the two input arrays arr1 and arr2 are sorted, the comparison of the
 * sum of currnet pair with x essentially performs a binary search on the input
 * array.
 * 
 * By moving the left or rigth index based on the comparison result, the
 * function implicitly divides the input array into two halves at each
 * iteration, and therefore performs a binary search on the input array to find
 * the closest pair.
 */
