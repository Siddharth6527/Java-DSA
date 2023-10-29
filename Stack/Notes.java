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