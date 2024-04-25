/*
 Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

 

Example 1:

Input: s = "1 + 1"
Output: 2
Example 2:

Input: s = " 2-1 + 2 "
Output: 3
Example 3:

Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23
 

Constraints:

1 <= s.length <= 3 * 105
s consists of digits, '+', '-', '(', ')', and ' '.
s represents a valid expression.
'+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
'-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
There will be no two consecutive operators in the input.
Every number and running calculation will fit in a signed 32-bit integer.
 */



 class Solution {
  public int calculate(String s) {
      Stack<Integer> stack = new Stack<>();
      int result = 0;
      int sign = 1; // Positive sign by default

      for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);

          if (Character.isDigit(c)) {
              // Parse the number
              int num = 0;
              while (i < s.length() && Character.isDigit(s.charAt(i))) {
                  num = num * 10 + (s.charAt(i) - '0');
                  i++;
              }
              i--; // Adjust the index after parsing the number

              // Apply the sign and add to the result
              result += sign * num;
          } else if (c == '+') {
              sign = 1; // Positive sign
          } else if (c == '-') {
              sign = -1; // Negative sign
          } else if (c == '(') {
              // Push the current result and sign onto the stack
              stack.push(result);
              stack.push(sign);
              // Reset result and sign for the subexpression
              result = 0;
              sign = 1;
          } else if (c == ')') {
              // Evaluate the subexpression
              result *= stack.pop(); // Apply the previous sign
              result += stack.pop(); // Add the previous result
          }
      }

      return result;
  }
}
