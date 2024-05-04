package code;

import java.util.*;

class UsingDeviationMethod {
  // function that returns all the adjacent elements
  public static ArrayList<Integer> getAdjacent(int[][] arr, int i, int j) {
    // size of given 2 array
    int n = arr.length;
    int m = arr[0].length;

    // Initialising a vector array where
    // adjacent elements will be stored
    ArrayList<Integer> v = new ArrayList<>();

    // deviation of row that gets adjusted
    // according to the provided position
    for (int dx = (i > 0 ? -1 : 0); dx <= (i < n ? 1 : 0); ++dx) {

      // deviation of the column that
      // gets adjusted according to
      // the procided position
      System.out.println("VALUES OF i: " + i + " AND j: " + j);
      for (int dy = (j > 0 ? -1 : 0); dy <= (j < m ? 1 : 0); ++dy) {
        if (dx != 0 || dy != 0) {
          v.add(arr[i + dx][j + dy]);
        }

      }
    }

    // returning the vector array
    return v;
  }

  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int x = 1, y = 1;

    // function call
    ArrayList<Integer> ans = getAdjacent(arr, x, y);

    // print all the adjacent elemetns
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i));
      System.out.print(" ");
    }
  }
}
