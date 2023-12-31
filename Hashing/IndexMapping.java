// java programt to implement direct index
// mapping with negative values allowed.
public class IndexMapping {
  final static int MAX = 1000;

  // since array is global, it
  // is initialized as 0.
  static boolean[][] has = new boolean[MAX + 1][2];

  // searching if x is Present in
  // the given array or not.
  static boolean search(int x) {
    if (x >= 0) {
      if (has[x][0] == true) {
        return true;
      } else {
        return false;
      }
    }

    // if x is negative take the absolute
    // absolute value of x.
    x = Math.abs(x);
    if (has[x][1] == true) {
      return true;
    }
    return false;
  }

  static void insert(int a[], int n) {
    for (int i = 0; i < n; i++) {
      if (a[i] >= 0) {
        has[a[i]][0] = true;
      } else {
        int abs_i = Math.abs(a[i]);
        has[abs_i][1] = true;
      }
    }
  }

  // driver code
  public static void main(String[] args) {
    int a[] = { -1, 9, -5, -8, -5, -2 };
    int n = a.length;
    insert(a, n);
    int x = -5;
    if (search(x) == true) {
      System.out.println("Present");
    } else {
      System.out.println("Not Present");
    }
  }
}