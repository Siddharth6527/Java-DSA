package code;

import java.util.*;

public class ForEachLoopMethod {
  public static void main(String[] args) {
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();

    hmap.put("GeeksforGeeks", 54);
    hmap.put("A computer portal", 80);
    hmap.put("For geeks", 82);

    // Printing all elements of above Map
    System.out.println("Created hashmap is" + hmap);

    // Display message only
    System.out.println(
        "HashMap after adding bonus marks:");

    // looping through the Hashmap
    // using for-each loop
    for (Map.Entry<String, Integer> mapElement : hmap.entrySet()) {
      String key = mapElement.getKey();

      // adding some bonus marks to all the students
      int value = (mapElement.getValue() + 10);

      System.out.println(key + " : " + value);
    }

  }

}
