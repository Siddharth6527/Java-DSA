// Sparse Matrix and its representation
/*
 * A matrix is a two-dimensional data object made of m rows and n columns,
 * therefore having total m x n values.
 * If most of the elements of the matrix have 0 value, then it is called a
 * sparse matrix.
 */

/*
 * Need for sparse matrix:
 * Storage: There are lesser non-zero elements than zeros and thus lesser
 * memeory can be used to store only those elements.
 * 
 * Computing time: Computing time can be saved by logically designing a data
 * structure traversing only non-zero elements.
 */

/*
 * Method 1: Using Arrays.
 * Row: Index of row, where non-zero element is located.
 * Column: Index of column, where non-zero element is located.
 * Value: Value of the non-zero element located at index.
 * 
 */

/////////////////////////////////////////////////////////
// Operations on Sparse Matrices
/*
 * The sparse matrix used anywhere in the program is sorted according to its row
 * values.
 * Two elements with the same row values are further sorted accoding to their
 * columns values.
 */

/*
 * Now to Add the matrices, we simply traverse through both matrices element by
 * element and insert the smaller element (one with smaller row and col value)
 * into the resultant matrix.
 * 
 * If we come accross an element with the same row and columns value, we simply
 * add their values and insert the added data into the resultant matrix.
 * 
 */

/*
 * To transpose a matrix, we can simply change every column value to the row
 * value, and vice-versa, however, in this case, the resultant matrix won't be
 * sorted as we require.
 * Hence, we initially determine the number of elements less than the current
 * element's column being inserted in order to get the exact index of the
 * resultant matrix where the current element should be placed.
 * 
 * This is done by maintaining an array index[] whose ith value indicates the
 * number of elements in the matrix less than the column i.
 */
