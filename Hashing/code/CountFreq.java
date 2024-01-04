package code;

import java.util.*;

// ################ using HashMap

// public class CountFreq {
// // this function prints frequencices of all elements
// static void printFreq(int arr[]) {
// // creates an empty HashMap
// HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

// // traverse through the given array
// for (int i = 0; i < arr.length; i++) {
// Integer c = hmap.get(arr[i]);

// // if this is first occuruence of element
// if (hmap.get(arr[i]) == null) {
// hmap.put(arr[i], 1);
// } else {
// // if the elements already exists
// hmap.put(arr[i], ++c);
// }
// }

// // print result
// for (Map.Entry m : hmap.entrySet()) {
// System.out.println("Frequencey of : " + m.getKey() + " is " + m.getValue());
// }

// }

// public static void main(String[] args) {
// int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
// printFreq(arr);
// }
// }

///////////////////////////////////////////////////////////////
// ######## Using TreeMap :(O(nlogn))
public class CountFreq {
  // this function prints frequencies of all elements
  static void printFreq(int arr[]) {
    // creates an empty treemap
    TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();

    // traverse through the given array
    for (int i = 0; i < arr.length; i++) {
      Integer c = tmap.get(arr[i]);

      // if this is first occurrence of element
      if (tmap.get(arr[i]) == null) {
        tmap.put(arr[i], 1);
      } else {
        tmap.put(arr[i], ++c);
      }
    }

    // print result
    for (Map.Entry m : tmap.entrySet()) {
      System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 34, 5, 10, 3, 5, 10, 3 };
    printFreq(arr);
  }
}
