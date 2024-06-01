import java.util.ArrayList;
import java.util.List;

class Result {

  /*
   * Complete the 'quickSort' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static List<Integer> quickSort(List<Integer> arr) {
  List<Integer> left = new ArrayList<>();
  List<Integer> right = new ArrayList<>();
  List<Integer> equal = new ArrayList<>();

  int pivot = arr.get(0);
  equal.add(pivot);
  
  for(int i=1;i<arr.size();i++){
      int value = arr.get(i);
       if(value < pivot)
           left.add(value);
      else
          right.add(value);
  }
      
  List<Integer> result = new ArrayList<>();
      result.addAll(left);
      result.addAll(equal);
      result.addAll(right);
      
      return result;
  }

}