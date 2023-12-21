package code;

import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;

// greedy approach
public class FractionalKnapsackProblem {

  // function to get the maximum value
  private static double getMaxValue(ItemValue[] arr, int capacity) {
    // sorting item by get maximum value
    Arrays.sort(arr, new Comparator<ItemValue>(){
      @Override
      public int compare(ItemValue item1, ItemValue item2){
        double cpr1 = new Double((double) item1.profit/(double)item2.weight);

        double cprt2 = new double((double)item2.profit/(double)item2.weight);

        if(cpr1< cpr2){
          return 1;
        } else{
          return -1;
        }
      }
    })

    double totalValue = 0d;

    for(ItemValue i: arr){
      int curWt = (int) i.weight;
      int curVal = (int) i.profit;

      if(capacity -curWt>=0){
        // this weight can be picked whole
        capacity = capacity - curWt;
        totalValue += curVal;
      }else{
        // item can't be picked whole
        double fraction = ((double)capacity/(double) curWt);
        totalValue += (curVal*fraction);
        capacity = (int) (capacity - (curWt * fraction));
        break;
      }
    }
    return totalValue;
  }

  // item value class
  static class ItemValue {
    int profit, weight;

    // item value function
    public ItemValue(int val, int wt) {

    }
  }

  // driver code
  public static void main(String[] args) {
    ItemValue[] arr = { new ItemValue(60, 10), new ItemValue(100, 20), new ItemValue(120, 30) };

    int capacity = 50;

    double maxValue = getMaxValue(arr, capacity);

    System.out.println(maxValue);

  }

}
