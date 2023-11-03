// Stack
/*
 * A stack is a linear data structure in which the insertion of a new element
 * and removal of an existing element takes place at the same end represented as
 * the top of the stack.
 */

/*
 * Types of Stack:
 * Fixed Size Stack: A fixed size stack has a fixed size and cannot grow or
 * shrink dynamically.
 * If the stack is full and an attempt is made to add an element to it, an
 * overflow error occurs.
 * If stack is empty, and an attempt is made to remove an element from it, an
 * underflow occurs.
 * 
 * Dynamic Size Stack:
 * A dynamic size stack can grow or shink dynamically.
 * When the stack is full, it automatically increases its size to accommodate
 * the new element, and when the stack is empty, it decreases its size.
 * This type of stack is implemented usin a linked list, as it allows easy
 * resizing of the stack.
 */

/*
 * Applications of the Stack:
 * Infix to Postfix/ Prefix conversion.
 * 
 * Redo-undoo features at many places like editors, photoshop.
 * 
 * Forward and backward features in web browsers.
 * 
 * Used in many alogrithms like Tower of Hanoi, tree traversals, stock span
 * problems, and histogram problems.
 * 
 * Backtracking is one of the algorithm designing techniques.
 * Some examples of backtracking are Knight-Tour problem, N-Queen proble, find
 * your way through a maze, and game like chess or checkers.
 * 
 * In graph algorithms like Topological Sorting and Strongly Connected
 * Componenets.
 * 
 * In Memory mangaement, any modern computer uses a stack as teh primary
 * management for a running purpose.
 * Each program that is running in a computer system has its own memory
 * allocations.
 * 
 * Stirng reversal is also another application of stack.
 * Here one by one each character gets inserted into the stack.
 * So, the first character of the string is on the bottm of the stack and the
 * last element of a string is on the top of the stack.
 * 
 * Stack also helps in implementing function call in computers.
 * The last called function is always completed first.
 * 
 * Stacks are also used to implement the undo/redo operation in text editor.
 */

////////////////////////////////////////////////////////////
// Stack using Singly Linked List
/*
 * Push Operation:
 * Initialise a node.
 * Update the value of that node by data i.e. node->data = data
 * Now link this node to the top of the linked list.
 * And update top pointer to the current node.
 */

/*
 * Pop Operation:
 * First Check whether there is any node present in the linked list or not, if
 * not then return.
 * Otherwise make pointer let say temp to the top node and move forward the top
 * node by 1 step.
 * Now free this node.
 */

/*
 * Peek Operation:
 * Check if there is any node present or not, if not then return.
 * Otherwise return the value of top node of the linked list.
 */

/*
 * Display Operation:
 * Take a temp node and initialize it with top pointer.
 * Now start traversing temp till it encournters NULL.
 * Simultanously print the value of the temp node.
 */

///////////////////////////////////////////
// Check for balanced parenthesis in an expression
/*
 * The idea is to put all the opening brackets in the stack.
 * Whenever you hit a closing bracket, search if the top of the stack is the
 * opening bracket of the same nature.
 * If this holds then pop the stack and continue the itertaion.
 * In the end if the stack if empty, it means all brackets are balanced or
 * well-formed.
 * Otherwise, they are not balanced.
 */

///////////////////////////////////////////////////////
// Stack Class in Java
/*
 * Java Collections framework provides a Stack class that models and implements
 * a Stack data structure.
 * 
 * The class is based on the basic principle of last-in-first-out.
 * 
 * In addition to basic push and pop operations, the class provides three more
 * functions of empty, search, and peek.
 * 
 * The class can also be said to extend Vector and treats the class as a stack
 * with five mentioned functions.
 * 
 * The class can also be referred to as the subclass of Vector.
 */

/*
 * The class suports one default constrctor Stack() which is used to create an
 * empty stack.
 */

/*
 * In order to create a stack, we must import java.util.stack package and use
 * the Stack() constructor of this class.
 * 
 */

/*
 * Functions:
 * empty(): It returns true if nothing is on the top of the stack.
 * Else, returns false.
 * 
 * peek(): Returns the element on the top of the stack, but does not remove it.
 * 
 * pop(): Removes and returns the top element of the stack.
 * An 'EmptyStackException' is thrown if we call pop() when the invoking stack
 * is empty.
 * 
 * push(Object element): Pushes an element on the top of the stack.
 * 
 * search(Object element): It determines wether an object exists in the stack.
 * If the element is found.
 * 
 * It returns the position of the element fromt the top of the stack.
 * Else, it returns -1.
 */

// Note: Methods inherited from class java.util.Vector are also available on
// stack.

/*
 * Prioritize use of Deque over Stack:
 * The Stack class in java is a legacy class and inherits from Vector in java.
 * It is a thread-safe class and hence involves overhead when we do not need
 * thread safety.
 * It is recommened to use ArraysDeque for stack implementation as it is more
 * efficient in a single-threaded environment.
 */
