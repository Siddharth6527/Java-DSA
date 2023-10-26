// Arrays in Java
/*
 * Array in java is a group of like-typed variables referred to by a common
 * name.
 * Arrays work differently than they do in C/C++.
 */

// Following are some important points about java arrays:-
/*
 * In Java, all arrays are dynamically allocated.
 * Arrays are stored in contiguous memory locations.
 * Since arrays are objects in Java, we can find their length using the object
 * property length. This is different from C/C++, where we find their length
 * using sizeof.
 * A Java array variable can also be declared like other variables with [] after
 * the data type.
 * The variables in the array are ordered, and each has an index beginning with
 * 0.
 * Java array can also be used as static field, a local variable field, or a
 * method parameter.
 * The size of an array must be specified by int or short value and not with
 * long.
 * The direct superclass of an array type is Object.
 * Every array type implements the interfaces Cloneable and
 * java.io.Serializable.
 * This storage of arrays helps us randomly access the elements of an array.
 * The size of the array cannot be altered (once initialized). However, an array
 * reference can be made to point to another array.
 * 
 */

/*
 * An array can contain primitives (int, char, etc.) and object (or
 * non-primitive) references of a class depending on the definition of the
 * array.
 * In case of primitive data types, the actual values are stored in contiguous
 * memory locations.
 * In the case of class objects, the actual objects are stored in heap segment.
 */

// How are Java objects stored in memory?
/*
 * In Java, all objects are dynamically allocated on Heap.
 * This is different from C++ where objects acan be allocated memeory either on
 * Stack or on Heap.
 * In Java, when we allocate the object using new(), the object is allocated on
 * Heap, otherwise on Stack if not global or static.
 * 
 * In Java, when we only declare a variable of a class type, only a reference is
 * created (memory is not allocated for object).
 * To allocate memory to an object, we must use new().
 * So, the object is always allocated memory on the heap.=
 * 
 */

/*
 * There are two ways to create an object of string in java:
 * 1) By string literal
 * 2) By new keyword
 */

/*
 * 1) By String literal:
 * This is done using double-quotes.
 * For eg.
 * // String str1 = "GFG";
 * // String str2 = "GFG";
 * 
 * Every time when a string literal is created, JVM will check whether that
 * string already exists in the string constant pool or not.
 * If the string already exists in the string literal pool then a reference to
 * the pooled instance is returned.
 * If the string does not exist, then a new string instance is created in the
 * pool.
 * Hence, only one object will get created.
 * Here, the JVM is not bonded to create a new memory.
 * 
 */

/*
 * 2) By new keyword:
 * This is done using a new keyword.
 * for Eg:
 * String str1= new String("GFG");
 * String str2= new String("GFG");
 * 
 * Both str1 and str2 are objects of String.
 * 
 * Every time when a string is created, JVM will create it in a heap.
 * In this case, the JVM will not check whether the string already exists or
 * not.
 * If a string already exist, then also for every string object the memory will
 * get created separately.
 * 
 * for eg.
 */

// class Test {
// void show() {
// System.out.println("Test::show() called");
// }

// public class Main {
// public static void main(String[] args) {
// Test t = new Test();
// t.show();
// }
// }
// }

// Creating, initializing, and accessing an Array
// One-Dimensional Arrays:
// Syntax:
// type var-name[];
// or
// type[] var-name;
/*
 * An array declaration has two components: the type and the name.
 * type declares the element type of the array.
 * The element type determines the data type of each element that comprises the
 * array.
 * Like an array of integers, we can also create an array of other primitive
 * data types like char, float, double, etc., or user-defined data types
 * (objects of a class).
 * Thus, the element type for the array determines what type of data the array
 * will hold.
 */
// int intArray[];
// int[] intArray;

// String[] args;
// String argv[];

// byte byteArray[];
// short shortsArray[];
// boolean booleanArray[];
// long longArray[];
// float floatArray[];
// char charArray[];

// an array of references to objects of the class MyClass ( a class created by
// user)
// MyClass myClassArray[];

// Object[] ao; // array of Object
// Collection[] ca; // array of collection of unkown type

// Instantiating an Array in Java
/*
 * When an array is declared, only a reference of an array is created.
 * To create or give memeory to the array, you create an array like this:
 * var-name = new type[size];
 * 
 * To use new to allocate an array, you must specify the type of elements to
 * allocate.
 * For eg:
 * int intArray[]; //declaring array
 * intArray = new int[20]; //allocating memory to array
 * or
 * int[] intArray = new int[20];
 * 
 */

/*
 * Note:
 * The elements in the array allocated by new will automatically be initialized
 * to zero (for numeric types), false (for boolean), null (for reference types).
 * 
 * Obtaining an array is a two-step process.
 * First, you must declare a variable of the desired array type.
 * Second, you must allocate the memory to hold the array, using new, and assign
 * it to the array variable.
 * Thus, in Java, all arrays are dynamically allocated.
 */

// Array Literal
/*
 * In a situation where the size of the array and variables of the array are
 * already known, array literals can be used.
 * 
 * for eg.
 * int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10}; // declaring array literal
 * The length of this array determines the length of the created array.
 */

// Accessing Java Array Elements using for Loop
/*
 * Each element in the array is accessed via its index.
 * The index begins with 0 and ends at (total array size) -1.
 * All the elements of array can be accessed using Java for Loop.
 * 
 */
// for(int i=0;i< arr.length;i++){
// System.out.println("Element at index "+i+" : "+ arr[i]);
// }

// Array of Objects
/*
 * An array of objects is created like an array of primitive-type data items in
 * the following way.
 * 
 * Syntax:
 * data type[] arrName;
 * datatype arrName[]
 * datatype[] arrName.
 * 
 */
// Student[] arr = new Student[5]; // student is user-defined class
// public class Notes {
// public static void main(String[] args) {
// int[] arr = new int[4];
// }
// }

// What happens if we try to access elements outside the array size?
/*
 * JVM throws ArrayIndexOutOfBoundsExcpetion to indicate that the array of has
 * been accessed with an illegal index.
 * The index is either negative or greater than or equal to the size of an
 * array.
 * 
 */

//////////////////////////////////////////////////////

// Multidimensional Arrays
/*
 * Mutlidimensional arrays are arrays of arrays with each element of the array
 * holding the refernce of other arrays.
 * These are also known as Jagged Arrays.
 * A multidimensional array is created by appending one set of square brackets
 * ([]) per dimension.
 * 
 * datatype [][] arrayRefvariable;
 * or
 * datatype arrayrefvaraible[][];
 */

// class Notes {
// public static void main(String[] args) {
// int[][] arr = new int[3][3];
// }
// }

// int[][] intArray = new int[10][20]; // a 2D array or matrix
// int[][][] intArray = new int[10][20][10]; // a 3D array

////////////////////////////////////
// Passing Arrays to Methods
/*
 * Like variables, we can also pass array methods.
 * For example, the below program passes the array to method sum to calculate
 * the sum of the array's values.
 */

// Class Objects for Arrays
/*
 * Every array has an associated Class object, shared with all the other arrays
 * with the same component type.
 */

// Array Memebers
/*
 * As you know that arrays are objects of a class, and a direct superclass of
 * arrays is a class object.
 * The members of an array type are all of the following:
 * 1) The public final field length contains the number of components of the
 * array. Length may be positive or zero.
 * 
 * 2) All the members are inherited from class Object. The only method of Object
 * that is not inherited is its clone method.
 * 
 * 3) The public method clone() overrides the clone method in class Object and
 * throws no checked exceptions.
 * 
 */

// Arrays Types and Their Allowed Element Types
/*
 * Primitive Type Arrays:
 * Any type which can be implicitly promoted to declared type.
 * 
 * Object Type Arrays:
 * Either declared type objects or it's child class objects.
 * 
 * Abstract Class Type Arrays:
 * Its child-class objects are allowed.
 * 
 * Interface Type Arrays:
 * Its implementation class objects are allowed.
 */

// Cloning of Arrays:
/*
 * When you clone a single-dimensional array, such as Object[], a "deep copy" is
 * performed with the new array containing copies of the original array's
 * element as opposed to references.
 * 
 * A clone of a mutli-dimensional array (like Object[][]) is a "shallow copy",
 * however, which is to say that it creates only a single new array with each
 * element array a reference to an original element array, but subarrays are
 * shared.
 */

// ARTICLE ENDED
//////////////////////////////////////////////////////////

// Arrays class in Java
/*
 * The Arrays class in java.util package is a part of the Java Collection
 * Framework.
 * This class provides static methods to dynamically create and access Java
 * arrays.
 * It consists of only static methods and the methods of Object class.
 * The methods of this class can be used by the class name itself.
 * 
 * Class hierarchy:
 * java.lang.Object
 * ->java.util.Arrys
 */

// Arrays class provides several static methods that can be used to perform
// these tasks directly without the use of loops, hence forth making our code
// super short and optimized.

/*
 * Syntax:
 * class declaration:
 * public class Arrys extends Object
 * 
 * In order to use Arrays:
 * Arrays.<function name>;
 */

// Methods in Java Array Class:
/*
 * asList() - Returns a fixed-size list backed by the specified Arrays. This
 * method acts as a bridge between array-based and collection-based APIs, in
 * combination with Collection.toArray().
 * The returned list is serializable and implements Random Access.
 * 
 * Syntax:
 * public static List asList(T...a)
 * 
 * Parameter: This method takes the array a which is required to be converted
 * into a List.
 * Here... is known as varargs which is an array of parameters and works similar
 * to an object array parameter.
 */

/*
 * Special Note:
 * The type of array must be a Wrapper Class(Integer, Float, etc) in case of
 * primitive data types (int, float, etc), i.e. you can't pass int a[] but you
 * can pass Integer a[].
 * If you pass int a[], this function will return a List<int a[]> and not
 * List<Integer>, as "autoboxing" doesn't happen in this case and int a[] is
 * itself identified as an object and a List of int array is returned, instead
 * of list of integers which will give error in various Collection function.
 * 
 * Return Value: This method returns a list view of the specified array.
 */

////////////////////////////////////////////////////////
/*
 * binarySearch() - Searches for the specified element in the array with the
 * help of the Binary Search Algorithm.
 * The array must be sorted as by the Arrays.sort() method prior to making this
 * call.
 * If it is not sorted, the results are undefined.
 * If the array contains multiple elements with the specified value, there is no
 * gaurantee which one will be found.
 * 
 * It is the simplest and the most efficient method to find an element in a
 * stored array in Java.
 * 
 * Syntax:
 * public static int binarySearch(data_type arr, data_type key)
 * 
 * Remember:
 * Here datatype can be of the primitive data types such as byte, char, double,
 * int, float, short, long and even object as well.
 * 
 * Parameter:
 * The array to be searched
 * The value to ve searched for
 * 
 * Return Type:
 * Index of the search key, if it is contained in the array.
 * Otherwise, (-(insertion point) -1).
 * The insertion point is defined as the point at which the key would be
 * inserted into the array: the index of the first element greater than the key,
 * or a.length if all elements in the array are less than the specified key.
 * 
 * Note: This gaurantees that the return value will be >=0 if and only if key is
 * found.
 * 
 * These are certain important points to be kept in mind as follows:
 * If the input list is not sorted, the results are undefined.
 * If there are duplicates, there is no guarantee which one will be found.
 */

/*
 * Important:
 * We can operate this aloritm either Arrays.binarysearch() vs
 * Collections.binarysearch().
 * Arrays.binarysearch() works for arrays which can be of primitive data type
 * also.
 * Collections.binarysearch() works for objects Collections like ArrayList and
 * LinkedList.
 */

// Complexity Analysis:
/*
 * Time Complexity:
 * The time complexity of the Arrays.binarySearch() method is 0(log n) where n
 * is the length of the array.
 * This is because the method uses binary search algorithm to find the target
 * element in the sorted array.
 * 
 * Auxiliary Space:
 * The auxiliary space used by the Arrays.binarySearch() method is 0(1) as it
 * does not require any extra space othe than the input array to perform the
 * search operation.
 */

//////////////////////////////////////////////////////
/*
 * binarySearch(array, fromIndex, toIndex, key, Comparator) - Searches a range
 * of the specified array for the specified object using the Binary Search
 * Algorithm.
 */

/*
 * compare( array 1, array 2) - Compares two arrays passes as parameters
 * lexicographically.
 * Arrays compare() method in Java comes under the Arrays class and java.util
 * package.
 * There are two different versions of different overloads for Boolean, byte,
 * char, double, float, int, long, short, and Object arrays.
 * 
 * This method returns values as per the below-mentioned cases:
 * It returns 0 is the array is equal to the other array.
 * It retunrs a value less than 0 is returned if the array is lexicographically
 * less than the other array.
 * It returns a value greater than 0 if the array is lexicographically greater
 * than the other array (more characters).
 * 
 * A null array is lexicographically less than a non-null array, and the two
 * arrays are considered equal if both are null so that it will print 0 in this
 * case.
 * 
 * Syntax:
 * Arrays.comapare(array1, array2)
 * 
 * Parameters and Return Type:
 * The method compare() accepts an array as parameters with different dat types
 * example: string, integer, float, double, long, etc.
 * The return type of this method is an integer.
 * It returns a positive value if hte array is lexicographically greater,
 * negative if it is lesser, and 0 if equal.
 * 
 * Exceptions:
 * It usually thros NullPointerException and ClassCastException, and both of
 * these exceptions have differnt means too:-
 * 1) NullPointerException: The NullPointerException is a runtime exception that
 * refers to null and occurs when a variable is accessed that does not point to
 * any object.
 * 
 * 2) ClassCastException: This exception occurs when we're trying to convert one
 * class object into another class-type object.
 */

// Arrays copyOf() in Java with examples
/*
 * java.util.Arrays.copyOf() method is in Java.util.Arrays class.
 * It copoes the specified array, truncating or padding with false (if
 * necessary) so that copy has the specified length.
 * 
 * Syntax:
 * copyOf(int[] original, int newLength)
 * 
 * original - original array
 * newLength - copy of an original array
 * 
 * What happens if the Length of a copied array is greater than the original
 * array?
 * The two arrays will have same values for all the indices that are valid in
 * original array and new array.
 * However, the indices missing in original will have zero in copy in case the
 * copied array length is more than the original array.
 */

/*
 * copyOfRange(originalArray, fromIndex, endIndex)- Copies the specified range
 * of the specified array into a new Arrays.
 */
///////////////////////////////////////////////////////////////

// Java.util.Arrays.deepEquals() in Java
/*
 * Arrays.deepEquals() is used to check whether two arrays of single dimensional
 * or mutli-dimensioal arrays are equal or not.
 * It can compare two nested arrays (i.e. multidimensional array), irrespective
 * of its dimension.
 * 
 * Two arrays references are considered deepy equal if both are null, or if they
 * refer to arrays that contain the same number of elements and all
 * corresponding pairs of elements in the two arrays are deeply equal.
 * 
 * Two possibly null elements e1 and e2 are deeply equal if any of the following
 * conditions hold:
 * 1) e1 and e2 are both arrays of object references types, and
 * Arrays.deepEquals(e1,e2) would return true.
 * 
 * 2) e1 and e2 are arrays of the same primitive type, and the appropriate
 * overloading of Arrays.equals(e1, e2) would return true.
 * 
 * 3) e1==e2
 * 
 * 4) e1.equals(e2) would return true.
 * 
 * Note that this definiton permites null elements at any depth.
 * 
 * We can even use deepEquals() to test the equality of array of Object of the
 * user define class.
 * We should override the equals method to define the equality of the different
 * parameters in a user defined class.
 */

/*
 * Equals() vs deepEquals()
 * Though Arrays.equals() works correctly on an single dimensional array but it
 * cannot check the equality of a mulidimensional arrays.
 * 
 * WHile Arrays.deepEquals() work on all arrays irrespective of the dimension.
 */

////////////////////////////////////////////////////
/*
 * deepHashCode(Object[] a) - Returns a hash code based on the "deep contents"
 * of the specified Arrays.
 * 
 * deepTOString(Object[] a) - Returns a string representation of the
 * "deep contents" of the specified Arrays.
 * 
 * equals(array1, array2) - Check if both the arrays are equal or not.
 * 
 * fill(original Array, fillValue) - Assigns this fill value to each index of
 * this arrays.
 * 
 * hashCode(original Array) - Returns an integer hashCode of this array
 * instance.
 * 
 */

/*
 * mismatch(array2, array2) - Finds and returns the index of the first
 * unmatched
 * element betwwen two specified arrays.
 * 
 * This method returns the index at which two arrays passed as parameter to the
 * mismatch() function have the first unequal element.
 * 
 * It is quite useful to check whether two arryas contain the same corresponding
 * elements or not.
 * 
 * If both arrays have corresponding elements same then this function returns
 * -1.
 * 
 * We can achive the above task without iterating over the arrays with the help
 * of mismatch() method.
 * 
 * Synatx:
 * Arrays.mismatch(first_array, second_array);
 * 
 * Parameters:
 * first_array: An array of a particular data type.
 * second_array: Another array.
 * 
 * int index1= Arrays.mismatch(array1, array2).
 *
 */

/*
 * paralellPrefix(original Array, fromIndex, endIndex, functionalOperattor) -
 * Performs parallelPreifx for the given range of the array with the specified
 * functional operator.
 * 
 * parallelPrefix(originalArray, operator) - Performs parallelPrefix for
 * complete array with the specified functional operator.
 * 
 * The parallelPrefix method performs a given mathematical function on the
 * elements of the array cumulatively, and then modifies the array concurrently.
 * 
 * Synatax:
 * parallelPrefix(int[] array, IntBinaryOperator op)
 * 
 * Parameters:
 * array: integer array on which operation is to be performed.
 * op: It is of type IntBinaryOperation (It represents an operation upon two int
 * operands and returns a result of type int)
 * 
 * Exception:
 * NullPointerException: Throws if the array or function passed as parameter is
 * null.
 */

/*
 * setAll(originalArray, functionalGenerator) - Sets all the elements of the
 * specified array using the generator function provided.
 * 
 * sort(original Array) - Sorts the completer array in ascending order.
 * 
 * toString(originalArray) - It returns a string representation of the contents
 * of this array.
 * This string representation consists of a list of the array's elements,
 * enclosed in square brackets("[]").
 * Adjacant elements are separated by the characters a comma followed by a
 * space.
 * Elements are converted to string as by String.valueOf() function.
 */

/////////////////////////////////////
// Multidimensional Collections in Java

// ArrayList<ArrayList<Object>>a=new ArrayList<ArrayList<Object>>();
/*
 * add() method for multidimensional ArrayList
 * boolean add( ArrayList<Object> e): It is used to insert elements in the
 * specified collection.
 * 
 * void add(int index, ArrayList<Object> e): It is used to insert the elements
 * at the specified position in a Collection.
 */
