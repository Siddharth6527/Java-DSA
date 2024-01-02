// Java program to implement hash tables with Linear Probing

import java.util.*;
import java.io.*;

// importing Scanner class as in the do-while
// input are entered at run-time when
// menu is popped to user to perform desired action
import java.util.Scanner;

public class LinearProbing {
  // member variable of this class
  private int currentSize, maxSize;
  private String[] keys;
  private String[] vals;

  // constructor of this class
  public LinearProbing(int capacity) {
    currentSize = 0;
    maxSize = capacity;
    keys = new String[maxSize];
    vals = new String[maxSize];
  }

  // method 1
  // function to clear hash Table
  public void makeEmpty() {
    currentSize = 0;
    keys = new String[maxSize];
    vals = new String[maxSize];
  }

  // method 2
  // function to get size of hash Table
  public int getSize() {
    return currentSize;
  }

  // method 3
  // function to check if hash table is full
  public boolean isFull() {
    return currentSize == maxSize;
  }

  // method 4
  // function to check if hash table is emtpy
  public boolean isEmpty() {
    return getSize() == 0;
  }

  // method 5
  // function to check if hash table contains a key
  public boolean contains(String key) {
    return get(key) != null;
  }

  // method 6
  // function to get the hash code of a given key
  private int hash(String key) {
    return key.hashCode() % maxSize;
  }

  // method 7
  // function to insert key-value pair
  public void insert(String key, String val) {
    int tmp = hash(key);
    int i = tmp;

    // do-while loop
    // do part for performing actions
    do {
      if (keys[i] == null) {
        keys[i] = key;
        vals[i] = val;
        currentSize++;
        return;
      }

      if (keys[i].equals(key)) {
        vals[i] = val;
        return;
      }
      i = (i + 1) % maxSize;
    }
    // while part for condition check
    while (i != tmp);
  }

  // method 8
  // function to get the value for a given key
  public String get(String key) {
    int i = hash(key);
    while (keys[i] != null) {
      if (keys[i].equals(key)) {
        return vals[i];
      }
      i = (i + 1) % maxSize;
    }
    return null;
  }

  // method 9
  // function to remove key and its value
  public void remove(String key) {
    if (!contains(key)) {
      return;
    }

    // find the position key and delete
    int i = hash(key);
    while (!key.equals(keys[i])) {
      i = (i + 1) % maxSize;
    }
    keys[i] = vals[i] = null;

    // rehash all keys
    for (i = (i + 1) % maxSize; keys[i] != null; i = (i + 1) % maxSize) {
      String tmp1 = keys[i], tmp2 = vals[i];
      keys[i] = vals[i] = null;
      currentSize--;
      insert(tmp1, tmp2);
    }
    currentSize--;
  }

  // method 10
  // function to print hash Table
  public void printHashTable() {
    System.out.println("\nHash Table: ");
    for (int i = 0; i < maxSize; i++) {
      if (keys[i] != null) {
        System.out.println(keys[i] + " " + vals[i]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // creating a scanner object
    // to take input for user
    Scanner scan = new Scanner(System.in);

    System.out.println("Hash Table\n\n");
    System.out.println("Enter size");

    LinearProbing lpht = new LinearProbing(scan.nextInt());

    char ch;

    do {
      // menu is displayed
      // Linear probing operations performed as
      // per keys users enters 'y' to continue 'n' if
      // entered by user, the program terminates
      System.out.println("\nHash Table Operations\n");
      System.out.println("1. insert");
      System.out.println("2. remove");
      System.out.println("3. get");
      System.out.println("4. clear");
      System.out.println("5. size");

      // reading integer using nextInt()
      int choice = scan.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter key and value");
          lpht.insert(scan.next(), scan.next());
          break;

        case 2:
          System.out.println("Enter key");
          lpht.remove(scan.next());
          break;

        case 3:
          System.out.println("Enter key");
          System.out.println("Value = " + lpht.get(scan.next()));
          break;

        case 4:
          lpht.makeEmpty();
          System.out.println("Hash Table Cleared\n");
          break;

        case 5:
          System.out.println("Size = " + lpht.getSize());
          break;

        default:
          System.out.println("Wrong Entry \n");
          break;
      }
      lpht.printHashTable();

      System.out.println("\nDo you want to continue (type y or n) \n");

      ch = scan.next().charAt(0);

    } while (ch == 'Y' || ch == 'y');

  }
}