// #1) Java Program to Print an Array

// 1) Print an Array using for loop
// 2) Print an Array using standared library Arrays by making use of
// Arrays.toString(arrays)
// 3) Print a Multi-dimensional Array

///////////////////////////////////////////////////////////

// #2) Adding an element to an Array in Java
/*
 * Given an array of size n, the task is to add an element x in this array in
 * Java.
 * The size fo the array cannot be changed dynamically in Java, as it is done in
 * C/C++.
 * Hence in order to add an element in the array, one of the follwing methods
 * can be done:
 * 
 * 1) By creating a new array:
 * Create a new array of size n+1, where n is the size of the original array.
 * Add the n elements of the original array in this array.
 * Add the new element in the n+1th position.
 * Print the new array.
 * 
 * // 2) By using ArrayList as intermediate storage:
 * /*
 * Create an ArrayList with original array, using asList() method.
 * Simply add the required element in the list using add() method.
 * Convert the list to an array using toArray() method.
 * 
 * We made use of toArray() function to change from list to array back.
 */

////////////////////////////////////////////////////////
// How to Insert an element at a specific poistion in an Array in Java
/*
 * Approach 1:
 * First get the elements to be inserted, say x.
 * Then get the position at which this element is to be inserted, say pos.
 * Create a new array with the size one greater than the previous size.
 * Copy all the elements from previous array into the new array till the
 * position pos.
 * Insert the element x at position pos.
 * Insert the rest of the elements from from the previous array into the new
 * array after the pos.
 */

/*
 * Approach 2:
 * First get the element to be inserted, say element.
 * Then get the positon at which this element is to be inserted, say position.
 * Convert array to ArrayList.
 * Add element at position using list.add(postion, element)
 * Convert ArrayList back to arrray and print.
 */

///////////////////////////////////////////////////////////
// Remove an Element at Specific Index from an Array
/*
 * There are numeroud approaches to check whether a specific element is present
 * in this Array or or not in Java.
 * 1) Using another Array
 * 2) Using Java 8 Streams
 * 3) Using ArrayList
 * 4) Using System.out.arraycopy() method
 */

/*
 * 1) Using Another Array( Naive or Basic approach):
 * The basic approach includes finding the elemetn at specified index and then
 * removing the element.
 * The rest of the elements are copied into a new array.
 * This would lead to an array of size one less than the original array.
 */

/*
 * 2) Using Java 8 Streams:
 * Get the array and the index.
 * Convert the array into IntStream using IntStream.range() method.
 * Remove the specified index element using the filter() method.
 * Map and form a new array of filtered elements using map() and toArray()
 * methods.
 * Return the formed array.
 */

/*
 * 3) Using ArrayList:
 * Get the array and the index.
 * Form an ArrayList with the array elements.
 * Remove the specified index element using remove() method.
 * Return the formed array.
 */

/*
 * Using System.arraycopy() method:
 * Get the array and the index.
 * Create a new array of size one less than the size of the original array.
 * Copy the elements from starting till index from original array to the other
 * array using System.arraycopy().
 * Copy the elements form index i+! till the end from the original array to the
 * other array using System.arraycopy().
 * Return the formed array.
 */

///////////////////////////////////////////////////////////////
// Linear Search
/*
 * Time Complexity:
 * Best Case Complexity:
 * In linear search, the best case occurs when the search element is present at
 * the first location of the array.
 * So, the best caset time complexity of the linear search is O(1).
 * The best case time complexity of the linear search is O(1).
 * 
 * Average Case Complexity:
 * In linear search average case occures when the search element is present at
 * the random location of the arrray.
 * So, the averafe case time complexity of the linear search is O(1).
 * The average cast time complexity of the linear search is O(1).
 * 
 * Worst Case Complexity:
 * In linear Search, the worst case occurs when the search element is present at
 * the last location of the array.
 * In the worst case in if the search element is not present in the given array
 * then we need to traverse the entire array to search element.
 * The worst case time complexity of the linear search is O(n).
 */

/*
 * Space Complexity: The space complexity of the linear search is o(1).
 */

/////////////////////////////////////////////////////////////
// Binary Search
/*
 * 1) Using interative loops:
 * Time Compleixty : O(log N)
 * Auxiliary Space: O(1)
 */

///////////////////////////////////////////////////////////
// Reverse an array in Java
/*
 * Methods:
 * Using Temp array.
 * Using Swapping.
 * Using Collections.reverse() method
 * Using StringBuilder.append() method
 * 
 */

////////////////////////////////////////////////////////////
// Left or Right rotate an Array in Java
/*
 * Ways:
 * 1) Using temporary array.
 * 2) Recursively rotating array one by one.
 * 3) Using Juggling Algorithm
 */

/*
 * 1) Using a temporary array:
 * In this method simply create a temporaray array and copy the elements of the
 * array arr[] from 0 to the (D-1)th index.
 * After that move, the rest elements of the array arr[] from index D to N.
 * Then, move the temporary array elements to the original array.
 */

/*
 * 2) Rotate one by one
 * Rotate the array recusively one by one element.
 * Swap arr[0] to arr[1]
 * Swap arr[1] to arr[2]
 * Swap arr[N-1] to arr[N]
 * Repeat 1,2,3 to D times
 * 
 * In order to rotate by one, store arr[0] in a temporary vaiable temp, move
 * arr[1] to arr[0], arr[2] to arr[1] ...and finally temp to arr[n-1].
 */

/*
 * 3) Using Juggling Algorithm:
 * This is an extension of method 2.
 * Instead of moving one by one, divide the array into differnt sets where the
 * number of sets is equal to GCG of n and d and move the elements within sets.
 */

///////////////////////////////////////////////////////
// Right Rotation of Array
/*
 * 1) Using temp array
 * Store the first d elements in a temp array.
 * Shift rest of the arr[].
 * Store back the D elements
 */

/*
 * 2) Rotate one by one
 * Rotate the array recusively one by one element.
 */

/////////////////////////////////////////////////////////
// Java Program to Merge Two Arrays
/*
 * Naive Approach:
 * It is the brute force method to do the same.
 * Take all the elements of arr1, and arr2, in arr3.
 * Then simply sort the arr3
 */

////////////////////////////////////////////////////
// Method 2:
/*
 * Create an array arr3 of size n1+n2.
 * Copy all n1 elements of arr1[] to arr3[]
 * Traverse arr2[] and one by one insert elements (like insertion sort) of
 * arr3[] to arr1[].
 */

////////////////////////////////////////////////////
// Method 3: Using Merge function of Merge sort.
/*
 * Create an arr3[] of size n1+n2.
 * Simultaneously traverse arr1[] and arr2[].
 * Pick smaller of current elements in arr1[] and arr2[], copy this smaller
 * element to next position in arr3[] and move ahead in arr3[] and the arry
 * whose element is picked.
 */

//////////////////////////////////////////////////////////
// Java Program to Remove Duplicate Elements from the Array
/*
 * 1) Using extra space
 * 2) Constant extra space
 * 3) Using Set
 * 4) Using Frequency array
 * 5) Using HashMap
 */

/*
 * Method 1: (Using extra space)
 * Create a temporary array temp[] to store unique elements.
 * Traverse input array and copy all the uniue elements of a[] to temp[].
 * Also, keep count of unique elements. Let this counrt be j.
 * Copy j elements from temp[] to a[].
 * 
 */

/*
 * Method 2: (Constant extra space)
 * Just maintain a separate index for the same aray as maintained for different
 * array in Method 1.
 */

/*
 * Method 3: Using Set
 * This method can be used if the array is not sorted.
 * 
 * Steps:
 * Take a Set
 * Insert all array elements in the Set.
 * Set does not allow duplicates and sets like LinkedHashSet maintains the order
 * of insertin so it will remove duplicates and elements will be printed in the
 * same order in which it is inserted.
 * Print elements of Set.
 */

/*
 * Method 4: Using Frequency array
 * We can use the frequency array if the range of the number in the array is
 * limited, or we can also use a set or map interface to remove duplicates if
 * the range of numbers in the array is too large.
 * 
 * Steps:
 * Find the Maximum element (m) in the array.
 * Create a new array of size m+1.
 * Now traverse the input array and count the frequency of every element in the
 * input array.
 * Now traverse the frequency array and check for the frequency of every number
 * if the frequency of the particular element is greater than 0 then print the
 * number.
 */

/*
 * Method 5: Using HashMap
 * The above frequency method will noe be useful if the number is greater than
 * 10^6 or if the array is of strings.
 * In this case, we have to use HashMap
 * 
 * Steps:
 * Create a HashMap to store the unique elements.
 * Traverse the array.
 * Check if the element is present in the HashMap.
 * If yes, continue traversing the array.
 * Else Print the element and store the element in HashMap.
 * 
 */
