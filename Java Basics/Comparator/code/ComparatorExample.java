
// Java Program to Demonstrate Working of
// Comparator Interface
import java.io.*;
import java.util.*;

// class 1
// a class to represent a Student
class Student {
  // attributes of a student
  int rollno;
  String name, address;

  // Constructor
  public Student(int rollno, String name, String address) {
    // This keyword refers to current instance iteself
    this.rollno = rollno;
    this.name = name;
    this.address = address;
  }

  // Method of Student calss
  // To print student details in main()
  public String toString() {
    // returning attributes of Student
    return this.rollno + " " + this.name + " " + this.address;
  }
}

// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student> {
  // Method
  // Soring in ascending order of roll number
  public int compare(Student a, Student b) {
    return a.rollno - b.rollno;
  }
}

// class 3
// Helper class implemening Comparator interface
class Sortbyname implements Comparator<Student> {
  public int compare(Student a, Student b) {
    return a.name.compareTo(b.name);
  }
}

public class ComparatorExample {
  public static void main(String[] args) {
    ArrayList<Student> ar = new ArrayList<Student>();

    ar.add(new Student(111, "Mayank", "london"));
    ar.add(new Student(131, "Anshul", "nyc"));
    ar.add(new Student(121, "Solanki", "jaipur"));
    ar.add(new Student(101, "Aggarwal", "Hongkong"));

    System.out.println("Unsorted");
    for (int i = 0; i < ar.size(); i++)
      System.out.println(ar.get(i));

    Collections.sort(ar, new Sortbyroll());

    System.out.println("\nSorted by rollno");

    // Again iterating over entries to print them
    for (int i = 0; i < ar.size(); i++)
      System.out.println(ar.get(i));

    Collections.sort(ar, new Sortbyname());
    System.out.println("\nSorted by name");

    // Again iterating over entries to print them
    for (int i = 0; i < ar.size(); i++) {
      System.out.println(ar.get(i));
    }

  }

}