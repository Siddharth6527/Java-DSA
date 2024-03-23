package Strings.Miscellaneous.Subsequence.code;

import java.util.*;

public class UsingHashSet {
  // set to store all teh subsequences
  static HashSet<String> st = new HashSet<>();

  // function computes all the subsequences of an string
  static void subsequence(String str) {
    // Iterate over the entire string
    for (int i = 0; i < str.length(); i++) {
      // iterate from the end of the string
      // to generate substrings
      for (int j = str.length(); j > i; j--) {
        String sub_str = str.substring(i, j);

        if (!st.contains(sub_str)) {
          st.add(sub_str);
        }

        // drop the kth character in the substring
        // and if its not in the set then recur'
        for (int k = 1; k < sub_str.length() - 1; k++) {
          StringBuilder sb = new StringBuilder(sub_str);

          // drop character from the string
          sb.deleteCharAt(k);
          if (!st.contains(sb.toString())) {
            subsequence(sb.toString());
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    String s = "aabc";
    subsequence(s);
    System.out.println(st);
  }
}
