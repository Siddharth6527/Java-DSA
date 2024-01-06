package code;

import java.util.*;

// Main class
class ForEachMethod {

  // Main driver method
  public static void main(String[] args) {

    // Creating an empty HashMap of string-integer
    // pairs
    HashMap<String, Integer> hm = new HashMap<String, Integer>();

    // Adding mappings to HashMap
    // using put() method
    hm.put("GeeksforGeeks", 54);
    hm.put("A computer portal", 80);
    hm.put("For geeks", 82);

    // Printing all elements of above HashMap
    System.out.println("Created hashmap is" + hm);

    // Display message only
    System.out.println(
        "HashMap after adding bonus marks:");

    // Looping through HashMap and adding bonus marks
    // using HashMap.forEach()
    hm.forEach((k, v) -> System.out.println(k + " : " + (v + 10)));

  }
}