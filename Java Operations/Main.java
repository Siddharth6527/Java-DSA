
// Soring 2D Array accoding a column values
import java.util.*;
import java.util.*;

class Main {

  public static void sortByColumn(int arr[][], int col) {
    // using built-in sort function Arrays.sort with lambda expression
    Arrays.sort(arr, (a, b) -> Integer.compare(a[col], b[col]));
  }

  public static void main(String[] args) {
    int matrix[][] = { { 39, 27, 11, 42 },
        { 10, 93, 91, 90 },
        { 54, 78, 56, 89 },
        { 24, 64, 20, 65 } };

    int col = 3;
    sortByColumn(matrix, col - 1);
    for (int i = 0; i < matrix.length; i++) {

      for (int j = 0; j < matrix[i].length; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();

    }

  }
}
