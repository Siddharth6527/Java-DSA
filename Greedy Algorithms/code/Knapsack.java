package code;
/*
 * A naive recursive implementation of 0-1 knapsack problem
 */

public class Knapsack {

  static int max(int a, int b) {
    return (a > b) ? a : b;
  }

  // returnrs the maximum value that
  // can be put in a knapsack of
  // capacity W
  static int knapsack(int W, int wt[], int val[], int n) {
    // base case
    if (n == 0 || W == 0) {
      return 0;
    }

    /*
     * If the weight of the nth item,
     * is more than Knapsack capacity W,
     * then this item cannot be included
     * in the optimal solution.
     */
    if (wt[n - 1] > W) {
      return knapsack(W, wt, val, n - 1);
    }

    // return the maimum of two cases:
    // 1. nth item included
    // 2. not included
    else
      return max(val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1), knapsack(W, wt, val, n - 1));
  }

  // Driver code
  public static void main(String args[]) {
    int profit[] = new int[] { 60, 100, 120 };
    int weight[] = new int[] { 10, 20, 30 };
    int W = 50;
    int n = profit.length;
    System.out.println(knapsack(W, weight, profit, n));
  }

}

/*
 * Time Complexity: O(2^N)
 * Auxiliary Space: O(N), Stack space required for recursion.
 */
