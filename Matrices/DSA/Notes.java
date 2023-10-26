// Matrix
/*
 * A matrix is a two-dimensional array that consists of rows and columns.
 * It is an arrangement of elements in horizontal or vertical lines of entries.
 */

// Declaration of Matrix or Grid
/*
 * The syntax of declaring a Matrix or two-dimensional array is very much
 * smimilar to that of one-dimensional array,
 */
// int arr[numberOfRows][numberOfColumns];

/*
 * The value in the first square represents the row number and the value inside
 * antther square represents column number.
 */

// Initializing Matric or Grids:
/*
 * There are two mehtods to initialize two -dimensional arrays.
 * int arr[4][3]={1, 2, 3, 4, 5, 6, 20, 80, 90, 100, 110, 120};
 * and
 * int arr[4][3]={{1,2,3},{4,5,6},{20,80,90},{100,110,120}};
 */

///////////////////////////////////////////////////
// Search element in a sorted matrix
/*
 * Given a sorted matrix mat[n][m] and an element 'x'.
 * Find the position of x in the matrix if it is present, else print -1.
 * Matrix is sorted in a way such that all elements in a row are sorted in
 * increasing order and for row 'i', where 1<=i<=n-1, the first element of row
 * 'i', is greater than or equal to the last element of row 'i-1'.
 * The approach should have O(log n + log m) time complexity.
 */

// Time complexity: O(n+m), for traversing.
// Auxiliary Space: O(n+m), for mapping.
/*
 * Please note that this problem is different from Search in a row-wise and
 * column-wise sorted matrix.
 * Here, the matrix is more strictly sorted as the first element of a row is
 * greater than the last element of the previous row.
 */

/*
 * A Simple Solution is to one by one compare x with every element of the
 * matrix. If matches, then return the position. If we reach the end, return -1.
 * The time complexity of this solution is O(n x m).
 */

/*
 * An efficient Solution is to typecast a given 2D array to a 1D array, then
 * apply binary search on the typecasted array but will require extra space to
 * store this array.
 */

// Another efficent appraoch:
/*
 * 1) Perform binary search on the middle column till only two elements are left
 * or till the middle element of some row in the search is the required element
 * 'x'.
 * This search is done to skip the rows that are not required.
 * 
 * 2) The two left elements must be adjacent.
 * Consider the rows of two elements and do following:
 * 
 * a) check check whether the element 'x' equals to the middle element of any
 * one of the 2 rows.
 * 
 * b) otherwise according to the value fo the element 'x' check wether it is
 * present in the 1st half of row, 2nd half of 1st row, 1st half of 2nd row or
 * 2nd half of 2nd row.
 */

/*
 * Note:
 * This approach works for the matrix n x m, where 2<=n.
 * The algorithm can be modified for matrix 1 x m, we just need to check whether
 * 2nd row exists or not.
 */

/////////////////////////////////////////////////
// Program to check diagonal matrix and scalar matrix
// Diagonal matrix
/*
 * A square matrix is said to be diagonal matrix if the elements of the matrix
 * except the main diagonal are zero.
 * 
 * A square null matrix is also a diagonal matrix whose main diagonal elements
 * are zero.
 */

/////////////////////////////////////////
// Scalar matrix
/*
 * A sqauare matrix is said to be a scalar matrix if all the main diagonal
 * elements are equal and other elements excpet main diagonal are zero.
 * 
 * The scalar matrix can also be written in form of n*;, where n is any real
 * number, and I is he identity matrix.
 */

//////////////////////////////////////////////////////
// Sum of diagonals elements
/*
 * Intution:
 * The principal diagonal is constituted by the elements a00, a11, a22, a33, and
 * the row-column conditio for principal diagonal is: row = column
 * 
 * However, the seconday diagonal is consituted by the elements a03, a12, a21,
 * a30, and the row-column condition for the Secondary diagonal is: row + column
 * = N-1.
 */
