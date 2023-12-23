package code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Demo implements java.io.Serializable {
  public int a;
  public String b;

  // constructor
  public Demo(int a, String b) {
    this.a = a;
    this.b = b;
  }
}

class Test {
  public static void main(String[] args) {
    Demo object = new Demo(1, "geeksforgeeks");
    String filename = "file.ser";

    // Serialization
    try {
      // Saving of object in a file
      FileOutputStream file = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);

      // method for serialization of object
      out.writeObject(object);

      out.close();
      file.close();

      System.out.println("Object has been serialized");
    } catch (IOException ex) {
      System.out.println();
    }

    Demo object1 = null;

    // Deserialization
    try {
      // reading the object from a file
      FileInputStream file = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(file);

      // method for deserialization of object
      object1 = (Demo) in.readObject();

      in.close();
      file.close();

      System.out.println("Object has been deserialized ");
      System.out.println("a = " + object1.a);
      System.out.println("b = " + object1.b);

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException is caught");
    }
  }
}