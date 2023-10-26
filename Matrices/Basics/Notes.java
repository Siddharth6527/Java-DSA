// Different Ways to Declare and Initialize 2-D Array in Java
/*
 * An arrys with more than one dimension is known as a multi-dimensional array.
 * 
 */

/*
 * Note:
 * When you initialize a 2D array, you must always specify the first dimension
 * (no of rows), but providing the second dimension (no of columns) may be
 * omitted.
 */

/*
 * Note:
 * We can use arr.length function to find the size of the rows (1st dimension),
 * and arr[0].length function to find the size of the columns (2nd dimension).
 */

//////////////////////////////////////
// Jagged Array in Java
/*
 * A jagged array is an array of arrays such that member arrays can be of
 * differnt sizes, i.e., we can create a 2-D array but with a variable number of
 * columns in each row.
 * These types of arrays are also known as Jagged arrays.
 */

/////////////////////////////////////
// Advantages of Jagged Arrays:
/*
 * Dynamic allocation: Jagged arrays allow you to allocate memeory dynamically,
 * meaning that you can specify the size of each sub-array at runtime, rather
 * than at compile-time.
 * 
 * Space utilization: Jagged arrays can save memory when the size of each
 * sub-array is not equal.
 * In a rectangular array, all sub-arrays must have the same size, even if some
 * of them have unused elements.
 * With a jagged array, you can allocate just the amount of memory that you need
 * for each sub-array.
 * 
 * Flexibility;
 * 
 * Improved Performance;
 */

///////////////////////////////////////////////
//