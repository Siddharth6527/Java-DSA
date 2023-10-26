// From w3 school
/*
 * Java Recursion
 * Recursion is the technique of making a function call itself.
 */

// Types of Recursion
/*
 * The process in which a function call itself directly or indirectly is called
 * recursion and the corresponding function is called a recursive function.
 * Using recursive algorithm, certain problems can be solved quite easily.
 * Examples of such problems are Towers of Hanoi, Inorder/Preorder/Postorder
 * Tree Traversels, DFS of Graph, etc.
 */

/*
 * Recusion are mainly of two types depending on whehter a function call itself
 * from within itself or more than one function call one another mutually.
 * 
 * The first one is called direct recursion and another one is called indirect
 * recursion.
 */

/*
 * Direct Recursion: These can further categorized into four types:
 * Tail Recursion:
 * If a recursive function calling itself and that recursive call is the last
 * statement in the function then it's known as Tail Recursion.
 * 
 * Head Recursion:
 * If a recursive function calling itself and that recursive call is the first
 * statement in the function then it's known as Head Recursion.
 * 
 * Tree Recursion:
 * A recursive function calling itself for more than one time then it's known as
 * Tree Recursion.
 * 
 * Nested Recursion:
 * In this recursion, a recursive function will pass the the parameter as
 * recursive call.
 * That means "recursion inside recursion".
 * 
 * 2) Indirect Recursion:
 * In this recursion, there may be more than one function and they are calling
 * one another in a circular manner.
 * 
 */

// Program to Calculate e^x by Recursion (using Taylor series)
/*
 * As the number of terms increases the more precise value of e^x is obatined.
 * To find e^x using the recursive function, we need to use the static
 * variables.
 * A function return only one value, and when we need to include multiple values
 * in a recursion function, we use static variables.
 * The Taylor Series is a combination of multiple values like sum, power, and
 * fractional term, hence we will use static variables.
 * 
 * For the powers of x, we will use p, and for factorials, we will use f as
 * static variables.
 */

/*
 * The function shown below is used to increase the power of x.
 * p=p*x
 * The function below is used to find factorials
 * f=f*n
 * The function below is used to calculate the summation of the series.
 * r+p/f
 * Where r is the recursive call to the function.
 */

// Fibonacci Series using Recursion

// Tower of Hanoi
