package Strings.Miscellaneous.Subsequence.code;

import java.util.*;

class PickAndUnpick {
  // declare a global list
  static List<String> al = new ArrayList<>();

  public static void main(String[] args) {
    String s = "abcd";
    findsubsequence(s, "");
    System.out.println(al);
  }

  private static void findsubsequence(String s, String ans) {
    if (s.length() == 0) {
      al.add(ans);
      return;
    }

    // we add adding 1st character in string
    findsubsequence(s.substring(1), ans + s.charAt(0));

    // Not adding first character of the string
    // becuase the concept of subsequcne either
    // character will present or not
    findsubsequence(s.substring(1), ans);
  }
}