import java.util.List;

class Result {

  /*
   * Complete the 'simpleArraySum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY ar as parameter.
   */

  public static int simpleArraySum(List<Integer> ar) {
   int sum = 0;
      for(int num : ar){
          sum +=num;
      }
      return sum;

  }

}

/*
class Result{
 public static int simpleArraySum(List<Integer> ar) {
   int count = 0;
   for(int i =0;i<ar.length;i++){
    count += ar[i];
   }
   return count;
  }
}
 */
