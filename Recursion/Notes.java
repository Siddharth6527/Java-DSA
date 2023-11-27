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

/////////////////////////////////////////////////////////////
// Recursion Part 2:
/*
 * Recurison is defined as a process which calls itself directlu or indirectly
 * and the corresponding function is called a recursive function.
 */

// Properties of Recursion:
/*
 * Recursion has some important properties:
 * 
 * The Primary property of recursion is the ability to solve a problem by
 * breaking it down into smaller sub-problem, each of which can be solved it the
 * same way.
 * 
 * A recursive function must have a base case or stopping criteria to avoid
 * recursion.
 * 
 * Recursion involves calling the same function within itself, which leads to a
 * call stack.
 * 
 * Recursive functions may be less efficient than iterative solutions in terms
 * of memeory and performance.
 */

///////////////////////////////////
// Types of Recursion
/*
 * 1. Direct recursion: When a function is called within itself directly it is
 * called direct recursion.
 * 
 * This can be further categorised into 4 types:
 * Tail Recursion
 * Head Recursion
 * Tree Recursion
 * Nested Recursion
 * 
 * 2. Indirect recursion: Indirect recursion occurs when a function calls
 * another function that eventualy calls the original function and it forms a
 * cycyle.
 */

// 1. Direct Recursion:
// Tail Recursion:
/*
 * If a recursive function calling itself, and that recursive call is the last
 * statement in the function then it's known as Tail Recursion.
 * 
 * After that call the recursive function performs nothing.
 * The function has to process or perform any operation at the time of calling
 * and it does nothing at returning time.
 */

/*
 * So, it was seent that in case of loop the Space Complexity is O(1) so it was
 * better to write code in loop instead of tail recursion in terms of Space
 * Complexity which is more efficient than tail recursion.
 */

// Why space complexity is less in case of loop?
/*
 * When the program executes, the main memory divided into three parts.
 * One part for code section, the second one is heap memoey and another one is
 * stack memeory.
 * 
 * The program can directly access only the stack memeory, it can't directly
 * access the heap memory so we need the help of pointer to acces the heap
 * memory.
 */

/*
 * In case of loop when function "void fun(int y)" executes there only one
 * activation record created in stack memory (activation record created for only
 * 'y' variable) so it takes only 'one' unit of memory inside stack so it's
 * space complexity is O(1) but in case of recursive fucntion every time it
 * calls itself for each call a separate activation record is created in Stack.
 * 
 * So, it there is 'n' no of call then it takes 'n' unit of memory inside stack
 * so its space complexity is O(N),
 */

////////////////////////////////////////
// 2. Head Recursion:
/*
 * If a recursive function calling itself and that recursive call is the first
 * statement in the function then it's known as Head Recursion.
 * 
 * There's no statment, no operation before call.
 * The function doesn't have to process or perform any operation at the time of
 * calling and all operations are done at returning time.
 */

// Note:
/*
 * Head recursion can't be easilyl convert into loop as Tail Recursion but it
 * can.
 */

////////////////////////////////////////
// 3. Tree Recursion:
/*
 * If a recursive function callin itself for one time then it's known as linear
 * Recursion.
 * Otherwise if a recursive function calling itself for more than one time then
 * it's known as Tree Recurison.
 */

// Pesudo Code for Linar Recursion:
/*
 * fun(n){
 * if(n>0){
 * fun(n-1); // calling itself only once
 * }
 * }
 */

///////////////////////////////////////
// 4. Nested Recursion:
/*
 * In this recursion, a recursive function will pass the parameter as a
 * recursive call.
 * 
 * That means "recursion insdie recusion".
 */

///////////////////////////////////////
// 2. Indirect Recurison:
/*
 * In this recursion, there may be more than one functions and they are calling
 * one another in a circular manner.
 */

/////////////////////////////////////////////////////////////
// Recursive Functions:
/*
 * A recursive function is a function that solves a problem by solving smaller
 * instances of the same problem.
 * 
 * This technique is commonly used in programming to solve problems that can be
 * broken down into simpler, sub problems.
 */

// Need of Recursive Functions:
/*
 * 1. Solving complex tasks:
 * Recursive functions break complex problems into smaller instances of the same
 * problem, resulting in compact and readable code.
 * 
 * 2. Divide and Conquer:
 * Reucrsive functions are suitable for divide-and-conquer algorithms such as
 * merge sort and quick sort, breaking problems into smaller subproblems,
 * solving them recursively, and merging the solutions with the original
 * problem.
 * 
 * 3. Backtracking:
 * Recursive backtracking is ideal for exploring and solving problems like
 * N-Queens and Sudko.
 * 
 * 4. Dynamic Programming:
 * Recursive functions efficiently solve dynamicn programming problems by
 * solving subproblems and combining their solutions into a complete solution.
 * 
 * 5. Tree and graph strucutres:
 * Recursive functions are great for working with tree and graph structures,
 * simplyfying traversal and pattern recognition tasks.
 */

////////////////////////////////////
// How to write a Recusive Function
// Components of a Recursive Function
/*
 * Base Case: Every recursive function must have a base case.
 * The base case is the simplest scenarion that does not require further
 * recursion.
 * This is a termination condition that prevents the function from calling
 * itesef, infinitely.
 * 
 * Without a proper base case, a recursive function can lead to infinite
 * recursion.
 * 
 * Recursive Case: In the recursion case, the function calls itself with the
 * modified arguments.
 * 
 * This is the essence of recursion - solving a larger problem by breaking it
 * down into smaller instances of the same problem.
 * 
 * 
 * The recursive case should move closer to the base case with each iteration.
 */
