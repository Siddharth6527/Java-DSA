package code;

// public class fibonacciSeries {
//   public static int fib(int n) {
//     if (n <= 1) {
//       return n;
//     }

//     return fib(n - 1) + fib(n - 2);
//   }

//   public static void main(String[] args) {
//     int n = 10;
//     System.out.println("Fibonacci number at position " + n + " is " + fib(n));
//   }
// }

class fibonacciSeries {
  public static int fib(int n) {
    if (n <= 1) {
      return n;
    }

    int[] fibArray = new int[n + 1];
    fibArray[0] = 0;
    fibArray[1] = 1;

    for (int i = 2; i <= n; i++) {
      fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
    }

    return fibArray[n];
  }

  public static void main(String[] args) {
    int n = 10;
    System.out.println("Fibonacci number at position " + n + " is " + fib(n));
  }
}
