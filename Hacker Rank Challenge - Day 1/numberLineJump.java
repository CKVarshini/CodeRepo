class Result {

  /*
   * Complete the 'kangaroo' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. INTEGER x1
   *  2. INTEGER v1
   *  3. INTEGER x2
   *  4. INTEGER v2
   */

  public static String kangaroo(int x1, int v1, int x2, int v2) {
   if(v1 == v2){
     if(x1 == x2){
          return "YES";
     }else{
         return "NO";
     }
       }
      else{
          if((x2-x1) % (v1-v2) == 0){
            return "YES";
          }
          else{
             return "NO";
          }
      }

  }

}

/*
 class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

     /*
     public static String kangaroo(int x1, int v1, int x2, int v2){
      // Write your code here
  if (v1 <= v2 && x1 < x2) {
              return "NO";
          }
          
          // If kangaroo 2 jumps slower and starts behind kangaroo 1, it will never catch up
          if (v2 <= v1 && x2 < x1) {
              return "NO";
          }
          
          // Check if they ever land on the same position after the same number of jumps
          if ((x2 - x1) % (v1 - v2) == 0) {
              return "YES";
          } else {
              return "NO";
          }
     }
  
  
 */