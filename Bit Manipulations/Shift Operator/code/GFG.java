import java.util.*;

class GFG {
  public static void main(String[] args) {
    byte a = 64, b;
    int i;

    i = a << 2;
    b = (byte) (a << 2);

    System.out.println("Origianl value of a: " + a);
    System.out.println("i and b: " + i + " " + b);
  }
}