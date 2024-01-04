package code;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
  public static void main(String[] args) {
    Hashtable<String, Integer> hashtable = new Hashtable<>();

    // adding elements to the hash table
    hashtable.put("A", 1);
    hashtable.put("B", 2);
    hashtable.put("C", 3);

    // getting values from the hashtable
    int valueA = hashtable.get("A");
    System.out.println("Value of A: " + valueA);

    // removing the elements from the hashtable
    hashtable.remove("B");

    // Enumertating the elements of the hashtable
    Enumeration<String> keys = hashtable.keys();

    while (keys.hasMoreElements()) {
      String key = keys.nextElement();
      System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
    }

  }

}
