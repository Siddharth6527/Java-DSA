package code;

import java.util.*;

class BruteForceMethod {
  // function to check whether position is valid or not
  static boolean isValidPos(int i, int j, int n, int m) {
    if (i < 0 || j < 0 || i > n - 1 || j > m - 1) {
      return false;
    }
    return true;
  }

  // Function that returns all adjacent elements
  static List<Integer> getAdjacent(List<List<Integer>> arr, int i, int j) {
    // size of given 2d array
    int n = arr.size();
    int m = arr.get(0).size();

    // Initialising a array list where adjacent
    // element will be stored
    List<Integer> v = new ArrayList<>();

    // checking for all the possible adjacent positions
    if (isValidPos(i - 1, j - 1, n, m)) {
      v.add(arr.get(i - 1).get(j - 1));
    }
    if (isValidPos(i - 1, j, n, m)) {
      v.add(arr.get(i - 1).get(j));
    }
    if (isValidPos(i - 1, j + 1, n, m)) {
      v.add(arr.get(i - 1).get(j + 1));
    }
    if (isValidPos(i, j - 1, n, m)) {
      v.add(arr.get(i).get(j - 1));
    }
    if (isValidPos(i, j + 1, n, m)) {
      v.add(arr.get(i).get(j + 1));
    }
    if (isValidPos(i + 1, j - 1, n, m)) {
      v.add(arr.get(i + 1).get(j - 1));
    }
    if (isValidPos(i + 1, j, n, m)) {
      v.add(arr.get(i + 1).get(j));
    }
    if (isValidPos(i + 1, j + 1, n, m)) {
      v.add(arr.get(i + 1).get(j + 1));
    }

    // returning the arraylist
    return v;
  }

  public static void main(String[] args) {
    List<List<Integer>> arr = new ArrayList<>();

    arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
    arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
    arr.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

    int x = 0, y = 1;

    // function call
    List<Integer> ans = getAdjacent(arr, x, y);

    // print all the adjacent elements
    for (int i = 0; i < ans.size(); i++) {
      System.out.println(ans.get(i) + " ");
    }
  }

}