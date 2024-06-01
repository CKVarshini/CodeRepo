import java.util.List;

class Result {

  /*
   * Complete the 'getTotalX' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  public static int getTotalX(List<Integer> a, List<Integer> b) {
  int result = 0 ;
  
  int lcm = a.get(0);
  for(Integer integer :a )
      lcm = getLCM(lcm,integer);
      
  int gcd = b.get(0);
  for(Integer integer : b)
      gcd = getGCD(gcd,integer);
      
  int multiple = 0;
  while(multiple <= gcd){
      multiple +=lcm;
      
      if(gcd % multiple == 0)
          result++;
  }
   return result;   
  }
   public static int getGCD(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
  }

  // Method to calculate LCM
  public static int getLCM(int a, int b) {
      return (a * b) / getGCD(a, b);
  }

  

}