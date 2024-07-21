package Tree.code;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamples {
  public static void main(String[] args) {
    TreeMap<String, Integer> treeMap = new TreeMap<>();

    treeMap.put("A", 1); // O(log n)
    treeMap.put("C", 3); // O(log n)
    treeMap.put("B", 2); // O(log n)

    // getting values from the tree map
    int valueA = treeMap.get("A"); // O(log n)
    System.out.println("Value of A: " + valueA);

    // removing elements from the tree map
    treeMap.remove("B"); // O(log n)

    // iterating over the elements of the tree map
    for (String key : treeMap.keySet()) {
      System.out.println("KEY: " + key + ", Value: " + treeMap.get(key));
    }
  }
}
