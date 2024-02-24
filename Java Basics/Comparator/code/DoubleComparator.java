package Comparator.code;

import java.util.*;

class Student {
  String Name;
  int Age;

  public Student(String Name, Integer Age) {
    this.Name = Name;
    this.Age = Age;
  }

  // Getter setter methods
  public String getName() {
    return Name;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  public Integer getAge() {
    return Age;
  }

  public void setAge(Integer Age) {
    this.Age = Age;
  }

  // Method
  // overriding toString() method
  @Override
  public String toString() {
    return "Customer{" + "Name=" + Name
        + ", Age=" + Age + '}';
  }
}

// Class 2
// Helper class implementing Comparator interface
class CustomerSortingComparator implements Comparator<Student> {
  // method 1
  // to compare customers
  @Override
  public int compare(Student customer1, Student customer2) {
    // comparing customer
    int NameCompare = customer1.getName().compareTo(customer2.getName());

    int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

    // 2nd level comparison
    return (NameCompare == 0) ? AgeCompare : NameCompare;
  }
}

public class DoubleComparator {
  public static void main(String[] args) {
    List<Student> al = new ArrayList<>();

    Student obj1 = new Student("Ajay", 27);
    Student obj2 = new Student("Sneha", 23);
    Student obj3 = new Student("Simran", 37);
    Student obj4 = new Student("Ajay", 22);
    Student obj5 = new Student("Ajay", 29);
    Student obj6 = new Student("Sneha", 22);

    al.add(obj1);
    al.add(obj2);
    al.add(obj3);
    al.add(obj4);
    al.add(obj5);
    al.add(obj6);

    // Iterating usign Iterator
    // before Soring Arraylist
    Iterator<Student> custIterator = al.iterator();

    System.out.println("Before Sorting:\n");

    // Holds true till there is single element
    // remaining in List
    while (custIterator.hasNext()) {
      System.out.println(custIterator.next());
    }

    // Sorting usign sort method of collections class
    System.out.println("\n\nAfter Sorting:\n");

    for (Student customer : al) {
      System.out.println(customer);
    }

  }

}
