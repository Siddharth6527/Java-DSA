// import java.util.*;
// import java.util.stream.Collectors;

// public class Main {
// public static void main(String[] args) {
// // List number = Arrays.asList(2, 3, 4, 5);
// // List square = number.stream().map(x -> x * x).collect(Collector.asList());

// /////////////////////////////////////////////////////////
// // List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
// // List<String> result = names.stream().filter(s ->
// // s.startsWith("S")).collect(Collectors.toList());

// ///////////////////////////////////////////////////
// // List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
// // List<String> result =
// names.stream().sorted().collect(Collectors.toList());

// ///////////////////////////////////////////////////////

// // List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);
// // Set<Integer> square = number.stream().map(x -> x *
// // x).collect(Collectors.toSet());

// ///////////////////////////////////////////////////////////
// // List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);
// // number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

// //////////////////////////////////////////////////////////
// // List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);
// // int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) ->
// ans
// ////////////////////////////////////////////////////////// + i);
// // Here ans variable is assigned 0 as the initial value and i is added to it.

// }
// }

///////////////////////////
// Java program to demonstrate the use of steam in java
// import java.util.*;
// import java.util.stream.*;

// class Main {
// public static void main(String[] args) {
// // create a list of integers
// List<Integer> number = Arrays.asList(2, 3, 4, 5, 6);

// // demonstration of map method
// List<Integer> square = number.stream().map(x -> x *
// x).collect(Collectors.toList());

// }
// }

///////////////////////////////////////////////////////////
// Difference between Stream.of() and Arrays.stream() method in Java
// // Arrays.stream()
// import java.util.*;
