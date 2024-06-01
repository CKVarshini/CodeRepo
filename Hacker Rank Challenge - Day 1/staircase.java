class Result {

  /*
   * Complete the 'staircase' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void staircase(int n) {
  for (int i = 0; i < n; i++) {
          // Inner loop for printing spaces
          for (int j = 0; j < n - i - 1; j++) {
              System.out.print(" ");
          }
          // Inner loop for printing '#' symbols
          for (int k = 0; k <= i; k++) {
              System.out.print("#");
          }
          // Move to the next line after each row
          System.out.println();
      }

  }

}
