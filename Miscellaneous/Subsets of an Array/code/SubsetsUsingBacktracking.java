import java.util.*;

public class SubsetsUsingBacktracking {
  public static void calcSubset(List<Integer> A, List<List<Integer>> res, List<Integer> subset, int index) {
    // add the current subset to the result list
    res.add(new ArrayList<>(subset));

    // generate subsets by recursively including
    // excluding elements
    for (int i = index; i < A.size(); i++) {
      // Include the current element in the subset
      // subset.add()
    }

  }

}