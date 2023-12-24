package Concepts.code;

// a naive recurisve implementation of LCS problem in java.
// import java.io.*;
// import java.util.*;

public class LCSRecursion {
  // returns teh length of LCS ofr [0...m-1], Y[0...n-1]
  int lcs(String X, String Y, int m, int n) {
    if (m == 0 || n == 0) {
      return 0;
    }

    if (X.charAt(m - 1) == Y.charAt(n - 1)) {
      return 1 + lcs(X, Y, m - 1, n - 1);
    } else {
      return max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
    }
  }

  // utility function to get max of 2 integers
  int max(int a, int b) {
    return (a > b) ? a : b;
  }

  public static void main(String[] args) {
    LCSRecursion lcs = new LCSRecursion();
    String s1 = "AGGTAB";
    String s2 = "GXTXAYB";
    int m = s1.length();
    int n = s2.length();

    System.out.println("Length of LCLS is : " + lcs.lcs(s1, s2, m, n));
  }
}
