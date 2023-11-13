// Stream In Java
/*
 * Introduced in Java 8, Stream API is used to process collections of objects.
 * A stream in Java is a sequence of objects that supports various methods which
 * can be pipelined the desired result.
 */

/*
 * There uses of Stream in Java are mentioned below:
 * 1. Steam API is a way to express and process collections of objects.
 * 2. Enable us to perform operations like filtering, mapping, reducing, and
 * sorting.
 */

// How to Create Java Stream
/*
 * Java Stream Creation is one of the most basic steps before considering the
 * functionalities of the Java Stream.
 * Below is the syntax given on how to declare Java Stream:
 */
// syntax:
// Stream<T> stream;
/*
 * Here T is either a class, object, or data type depenging upon the declaraton.
 */

///////////////////////////////////////////////
// Java Stream Features:
/*
 * The features of Java Stream are mentioned below:
 * A stream is not a data structure instead it takes input from the Collections,
 * Arrays, or I/O channels.
 * 
 * Streams dont't change the original data structure, they only provide the
 * result as per the pipilined methods.
 * 
 * Each intermediate operation is lazily executed and retunrs a stream as a
 * result, hence various intermediate operations can be pipelined.
 * Terminal Operations mark the end of the stream and return the result.
 */

/////////////////////////////////////
// Different Operations on Streams
/*
 * There are two types of Operations in Streams:
 * 1. Intermediate Operations
 * 2. Terminate Operations
 */

///////////////////////////////////////////////
// 1. Intermediate Operations:
/*
 * Intermediate Operations are the type of operations in which multiple methods
 * are chained in a row.
 */

/*
 * Characteristics of Intermediate Operations:
 * 1. Methods are chained together.
 * 2. Intermediate operations transform a stream into another stream.
 * 3. It enables the concept of filtering where one method filters data and
 * passes it to another method after processing.
 */

////////////////////////////////////////
// Important Intermediate Operations
/*
 * There are a few Intermediate Operations mentioned below:
 * 1. map(): The map method is used to return a stream consisting of the results
 * of applying the given function to the elements of this stream.
 */

// List number = Arrays.asList(2,3,4,5);
// List square = number.stream().map(x-> x*x).collect(collectors.asList());

////////////////////////////////
// 2. filter():
/*
 * The filter method is used to select elements as per the Predicate passed as
 * an agrument.
 */

//////////////////////////////////
// 3. sorted():
/*
 * The sorted method is used to sort the stream.
 */

//////////////////////////////////////////////////////
// Terminal Operations:
/*
 * Terminal Operations are the type of Operations that return the result.
 * These Operations are not processed further just return a final result value.
 */

/*
 * 1. collect(): The collect method is used to return the result of the
 * intermediate operations performed on the stream.
 * 
 * 2. forEach(): The forEach method is used to iterate through every element of
 * the stream.
 * 
 * 3. reduce(): The reduce method is used to reduce the elements of a stream to
 * a single value.
 * The reduce method takes a BinaryOperator as a parameter.
 * 
 */

/*
 * Note:
 * Intermediate Operatons are running based on the concept of Lazy Evaluation,
 * which ensures that every method returns a fixed value( Terminal Operation)
 * before moving to the next method.
 */

////////////////////////////
// Important Points/ Observations of Java Stream
/*
 * 1. A stream consits of a source followed by zero or more intermediate methods
 * combined together (pipelined) and a terminal method to process the objects
 * obtained from the source as per the methods described.
 * 
 * 2. Stream is used to compute elements as per the pipelined methods wihtout
 * altering the original value of the object.
 */

///////////////////////////////////////////////////////////
// Difference between Stream.of() and Arrays.stream() method in Java
// Arrays.stream()
/*
 * The stream(T[] array) method of Arrays class in Java, is used to get a
 * Sequential Stream from the array passed as the parameter with its elements.
 * 
 * It returns a sequential Stream with the elements of the array, passed as
 * parameter, as its source.
 */