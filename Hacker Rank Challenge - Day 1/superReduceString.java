class Result {

  /*
   * Complete the 'superReducedString' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  public static String superReducedString(String s) {
  StringBuilder stack = new StringBuilder();
      
  for(char ch : s.toCharArray()){
    if (stack.length() > 0 && stack.charAt(stack.length() - 1) == ch) {
              // Remove the top character (pop)
              stack.deleteCharAt(stack.length() - 1);
          } else {
              // Push the current character onto the stack
              stack.append(ch);
          }
      
      }
      if (stack.length() == 0) {
          return "Empty String";
      }
      
      // Convert the stack back to a string and return it
      return stack.toString();

  }

}