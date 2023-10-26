// import java.util.*;
// import java.util.concurrent.LinkedBlockingQueue;

// public class Main {
// public static void main(String[] argv) throws Exception {
// // create a StringBuilder object
// // using StringBuilder() constructor
// StringBuilder str = new StringBuilder();
// str.append("GFG");
// System.out.println("String = " + str.toString());

// // create a StringBuilder Object
// // using StringBuilder(CharSequence) constructor
// StringBuilder str1 = new StringBuilder("AAABBBBCCCC");
// System.out.println("String1 = " + str1.toString());

// // create a StringBuilder object
// // using StringBuilder(capacity) constructor
// StringBuilder str3 = new StringBuilder(str1.toString());
// System.out.println("String3 = " + str3.toString());

// }
// }

//////////////////////////////////////////////////////////////

// import java.util.*;
// import java.util.concurrent.LinkedBlockingQueue;

// public class Main {
// public static void main(String[] argv) throws Exception {
// // create a StringBuilder object
// StringBuilder str = new StringBuilder("AAAABBBBBCCCCCC");
// System.out.println("String = " + str.toString());

// // reverse the string
// StringBuilder reverseStr = str.reverse();
// System.out.println("Reverse String = " + reverseStr.toString());

// // Append ', ' (44) to the String
// str.appendCodePoint(44);
// System.out.println("Modified StringBuilder = " + str);

// // get capacity
// int capacity = str.capacity();
// System.out.println("StringBuilder = " + str);
// System.out.println("Capacity of StringBuilder = " + capacity);

// }
// }

///////////////////////////////////////////////////////////

// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder();
// sb.append("Hello");
// sb.append(" ");
// sb.append("word !");
// System.out.println(sb.toString());

// sb.insert(6, "beautiful");
// System.out.println(sb.toString());

// sb.reverse();
// System.out.println(sb.toString());
// }
// }

//////////////////////////////////////////////////////////
// StringBuffer

// public class Main {
// public static void main(String[] args) {
// StringBuffer sb = new StringBuffer();
// sb.append("Hello");
// sb.append(" ");
// sb.append("world");
// String message = sb.toString();
// System.out.println(message);
// }
// }