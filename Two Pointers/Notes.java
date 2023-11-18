// Two Pointers
/*
 * Two pointers is really an easy and effective technique that is typically used
 * for searching paris in a sorted pairss.
 * 
 * Given a sorted array A (sorted in ascending order), having N integers, find
 * if there exists any paint of elements (A[i],A[j]) such that their sum is
 * equal to X.
 */

/*
 * The algorithm basically used the fact that the input array is sorted.
 * We start the sum of extreme values (smallest and largest) and conditionally
 * move both pointers.
 * We move left pointer 'i', when the sum of A[i] and A[j] is less than X.
 * We do not miss any pair because the sum is already smaller than X.
 * Same logic applies for right pointer j.
 */

//////////////////////////////////
// Method 2: Two Pointers Technique
/*
 * We take two pointers, one representing the first element and other
 * representing the last element of the array, and then we add the values kept
 * at both the pointers.
 * 
 * If if the sum is smaller than X then we shift the left pointer to right or if
 * the sum is greater than X, then we shift the right pointer to left, in order
 * to get closer to the sum.
 */

/////////////////////////////////////////////////////////
// Find the closest pair from two sorted arrays
/*
 * Given Two array arr1[0...m-1] and arr2[0...n-1], and a number x, the task is
 * to find the pair arr1[i]+arr2[j] such that absolute value of (arr1[i]+arr2[j]
 * - x) is minimum.
 */

/*
 * 1. Using Nested Loop:
 * A Simple Solution is to run two loops.
 * The outer loop considers every element of first array and inner loop checks
 * for the pair in second array.
 * We keep track of minimum difference between arr1[i] + arr2[j] and x.
 */

/*
 * 2. Using Two Pointer Technique:
 * Below is the idea to solve the is problem in O(n) time using following steps:
 * 1.) Merge given two array into an auxiliary array of size m+n using merge
 * process of merge sort.
 * 
 * While merging keep another boolean array of size m+n to indicate whether the
 * current element in merged array is from arr1[] or arr2[].
 * 
 * 2.) Consider the merged array and use the linear time algorithm to find the
 * pair with sum closest to x.
 * 
 * One extra thing we need to consider only those pairs which have one element
 * from arr1[] and other from arr2[], we use the boolean array for this purpose.
 */

///////////////////////////////////////////////////////////////
// Can we do it in a single pass and O(1) extra space?
/*
 * The idea is to start from left side of array and right side of another array,
 * and use the algorithm smae as step 2 of above approach.
 */

// Step-by-step approach:
/*
 * Initialize a variable diff as infinite (Diff is used to store the difference
 * between pair and x). We need to find the minimum diff.
 * 
 * Initialize two index variavles l and r in the given sorted array.
 * a) Initialize first to the leftmost index in arr1: l=0
 * b) Initialize second the rightmost index in arr2: r=n-1
 * 
 * Loop while l< length.arr1 and r>=0
 * a) If abs(arr1[l] + arr2[r] - sum ) < diff then update diff and result
 * b) If (arr1[l] + arr2[r] < sum ) then l++
 * c) else r--
 * 
 * Print the result.
 */

// Another Approach using Binary Search in its folder