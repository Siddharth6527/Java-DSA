// Java program to Traverse through Hashmap
// using iterator
package code;

import java.util.*;

// import javax.swing.RowFilter.Entry;

class IteratorMethods {
  public static void main(String[] args) {
    // creating an hashmap of String-Integer pairs
    // it contains student name and their marks
    HashMap<String, Integer> hmap = new HashMap<>();

    // adding mappings to above hashmap
    // using put() method
    hmap.put("GeeksforGeeks", 54);
    hmap.put("A computer portal", 80);
    hmap.put("For geeks", 82);

    // printing all elements of hashmap
    System.out.println("Created hashmap is: " + hmap);

    // getting an iterator
    Iterator hmIterator = hmap.entrySet().iterator();

    // display message only
    System.out.println("HashMap after adding bonus marks: ");

    // iterating through HashMap and
    // adding some bonus matks for every student
    while (hmIterator.hasNext()) {
      Map.Entry mapElement = (Map.Entry) hmIterator.next();
      int marks = ((int) mapElement.getValue() + 10);

      // printing mark corresponding to string entries
      System.out.println(mapElement.getKey() + " : " + marks);
    }
  }
}