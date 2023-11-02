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

//////////////////////////////////////////////////////////
// Java program to check if matrix is lower triangluar
/*
 * A square matrix is called lower triangular if iall the entries above the main
 * diagonal are zero.
 */

///////////////////////////////////////////
// Convert given lower Trianugalr Matrix to 1D array
/*
 * Given a lower triangular matrix, the task is to convet it into
 * one-dimensional array by storing only non-zero elements.
 */

/*
 * Row-Major Order:
 * In this method, adjacent elements of a row are places next to each other in
 * the array.
 * 
 * The following formula is used to find out the respective positions of the
 * non-zero elements of the lower triangular matrix in the 1-dimensional array.
 * 
 * Index of matrix element at position (i,j) = ((i*(i-1))/2 +j-1)
 */

/*
 * Column-Major Order:
 * In this method, consective elements of a columns are placed adjacently in the
 * array.
 * 
 * The follwing formula is used to find out the respective positions of the
 * non-zero elements of the lower triangular matrix in the 1-dimensional array.
 * 
 * Index of matrix element at position (i,j) = (N* (j-1)- ((j-2)*(j-1))/2
 * +(i-j)).
 */

/*
 * Steps:
 * Initialze an array, say A[], to store the non-zero elements of the matrix.
 * 
 * Traverse the matrix M[][] and find the index of non-zero elements of the
 * matrix in the array A[] using the forumula for row-major mapping and insert
 * each non-zero element in the array A[].
 * 
 * Again, traverse the matrix M[][] and find the index of non-zero elements of
 * the matrix in the array A[] using the formula for column-major mapping and
 * insert each non-zero element in the array A[].
 * 
 * After completing the above steps, print the array A[] for columns-major
 * mapping.
 */

/////////////////////////////////////////
// Row-wise vs columns-wise traversal of matrix
/*
 * Two common ways of traversing a matrix are row-major order and columns-major
 * order.
 */

/*
 * Difference:
 * If we see acoording to time complexity, both lead to O(n^2), but when it
 * comes to cache level one of the orders access will be faster as compare to
 * other one.
 * It depends on the language we are using.
 * Like in C, store matrix in row major form so while accessing i+1th element
 * after ith, most probably it will lead to a hit, which will further reduce the
 * time of program.
 */

///////////////////////////////////////////////////////
// Find sub-matrix with the given sum
/*
 * Given an NxN matrix and two integers S and K, the task is to find whether
 * there exists a K x K sub-matrix with sum equal to S.
 */

/*
 * Approach:
 * Dynamic Programming can be used to solve this problem:
 * Create an array dp[N+1][N+1], where dp[i][j] stores the sum of all the
 * elements with row between 1 to i and column between 1 to j.
 * 
 * Once the 2-D matrix is generated, now suppose we wish to find sum of square
 * starting with (i,j) to (i+x, j+x).
 * 
 * The required sum will be dp[i+x][j+x] -dp[i][j+x] -dp[i+x][j] +dp[i][j],
 * where
 * 
 * First term denotes the sum of all the elements present in rows between 1 to
 * i+x and columns between 1 to j+x.
 * This are has our required square.
 * 
 * Second two term is to remove the are which is outside our required region but
 * inside the region calculated in the first step.
 * 
 * Sum of elements of rows between 1 to i and columns betwwen 1 to j is
 * subtracted twice in the second step, so it is added once.
 */

//////////////////////////////////////////////////////////////
// Sum of all Submatrices of a Given Matrix
/*
 * Simple Solution: A naive solution is to generate all the possible submatrices
 * and sum up all of them.
 * 
 * The time complexity of this approach will be O(n^6).
 */

/*
 * Efficient Solution:
 * For each element of the matrix, let us try find the number of sub-matrices,
 * the element will lie in.
 * 
 * This can be done in O(1).
 * 
 * Let us suppose the index of an element be (X,Y) in 0 based indexing, then
 * number of submatrices (Sx,y) for this element will be given by the formula
 * Sx,y =(X+1)*(Y+1)*(N-X)*(N-Y)
 * 
 * This formula works, becuase we just have to choose two different positions on
 * the matrix that will create a submatrix that envelopes the element.
 * 
 * Thus, for each element, 'sum' can be updated as sum+= (Sx,y) * Arr x,y.
 */

////////////////////////////////////////////////////////////
// Traverse a given Matric Using Recursion
/*
 * Approach:
 * Check if the current position is in the bottom-right corner of the matrix
 * --Print the value at that posision
 * --End the recursion
 * 
 * Print the value at the current position.
 * 
 * Check if the end of the current row has not been reached
 * --Move right
 * 
 * Check if the end of the current column has been reached
 * --Move down to the next row
 */

///////////////////////////////////////////////////////////////
// Sort the given matrix
/*
 * Given a n x n matrix.
 * The problem is to sort the given matrix in strict order.
 * Here the strict order means that the matrix is sorted in a way that all
 * elements in a row are sorted in increasing order and for row 'i', where
 * 1<=i<=n-1, the first element of row 'i' is greater than or equal to the last
 * element of row 'i-1'.
 */

/*
 * Approach 1: Store all the elements in a vector then sort it, we need to fill
 * that matrix again.
 */

/*
 * Approach 2: Create a temp[] arrays of size n^2.
 * Starting with the first row one by one copy the elements of the given
 * elements of the given matrix into temp[].
 * Sort temp[].
 * Now one by one copy the elements of temp[] back to the given matrix.
 */

///////////////////////////////////////////////////////////
// Print a given matrix in spiral form
// eg. Input: { {1, 2, 3, 4, 5, 6},
// {7, 8, 9, 10, 11, 12},
// {13, 14, 15, 16, 17, 18}}
// Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11

//////////////////////
// Print a given matrix in spiral form using the simulation approach:
/*
 * Draw the path that spiral makes.
 * We know that the path should turn clockwise whenever it would go out of
 * bounds or into a cell that was previously visited.
 */

/*
 * Steps:
 * Let the array have R rows and C columns.
 * seen[r] denotes that the cell on the r-th row and c-th column was previously
 * visited.
 * Our current position is (r,c), facing direction di, and we want to visit R x
 * C total cells.
 * As we move through the matrix, our candidate's next position is (cr, cc).
 * If candidate is in the bounds of the matrix and unseen, then it, becomes our
 * next position; otherwise, our next position is one after performing a
 * clockwise turn.
 */

/////////////////////////////////////////////////////
// Find if given matrix is Toeplitz or not
/*
 * Given a square matrix, find it's a Toeplitz matrix or not.
 * A Toeplitz (or diagonal-constant) matrix is a matrix in which each descening
 * diagoonal from left to right is constant,i.e. all elements in diagonal are
 * same.
 * 
 * In general, any nxn matrix mat[][] is a Toeplitz matrix if every cell
 * mat[i][j] is same as mat[i-1][j-1], mat[i+1][j+1], mat[i+2][j+2],.. for every
 * cell mat[i][j] and all the valid cells mat[i+k][j+k] or mat[i-k][j-k].
 */
