// Introduction to Greedy Algorithm
/*
 * Greeady Algorithm is defined as a method for solving optimization problems by
 * taking decisions that result in the most evident and immediate benefit
 * irrespective irrespective of the final outcome.
 * 
 * It works for cases where minimization or maximization leads to the required
 * solution.
 */

////////////////////////////////////
// Characteristics of Greedy Algorithm
/*
 * For a problem to be solved using the Greedy approach, it must follow a few
 * major characteristics:
 * 
 * There is an ordered list of resources (profit, cost, value, etc.)
 * 
 * Maximum of all the resources (max Profit, max value, etc.) are taken.
 * 
 * For example, in the fractional knapsack problem, the maximum value/weight is
 * taken first according to available capacity.
 */

/*
 * The greedy algorithms is a method used in optimization problems where the
 * goal
 * is to make the locally optimal choice at each stage with the hope of finding
 * a global optimum.
 * 
 * It is called "greedy" because it tries to find the best solution by making
 * the best choice at each step, without considering future steps or the
 * consequences of the current decision.
 */

///////////////////////////////////////
// Some common use cases for the greedy algorithm include:
/*
 * Scheduling and Resouce Allocation: The greedy algorithm can be used to
 * schedule jobs or allocate resouces in an efficient manner.
 * 
 * Minimum Spanning Trees: The greedy algoritm can be used to find the minimum
 * spanning tree of a graph, which is the subgraph that connects all vertices
 * with the minimum total edge weight.
 * 
 * Coin Change Problem: The greedy algorithm can be used to make change for a
 * given amount with the minimum number of coins, by always choosing the coin
 * with the highest value that is less than the remaining amount to be changed.
 * 
 * Huffman Coding: The greedy alorithm can be used to generate a prefix-free
 * code for data compression, by constructing a binary tree in a way that the
 * frequency of each character is taken into consideraion.
 */

////////////////////////////////////
// All greedy algoritms follow a basic structure
/*
 * Declare an empty result=0
 * We make a greedy choice to select, if the choice is feasible add it to the
 * final result.
 * return the result.
 */

/////////////////////////////////
// Why choose Greedy Approach?
/*
 * The greedyu approach has a few tradeoffs, which may make it suitable for
 * optimization.
 * 
 * One prominent reason is to achieve the most feasible solution immediately.
 * 
 * Another reasion is to divide a problem recursively based on a condition, with
 * no need to combine all the solutions.
 * 
 * In this activity selection problem, the "recursive division" step is achieved
 * by scanning a list of items only once and considering certain activites.dd
 */
