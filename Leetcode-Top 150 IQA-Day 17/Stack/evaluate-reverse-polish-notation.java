/*
 You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.
 

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
 

Constraints:

1 <= tokens.length <= 104
tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].

*/

import java.util.Stack;

class Solution {
  private int Operator(int a, int b, String token) {
      if (token.equals("+")) return a + b;
      if (token.equals("-")) return a - b;
      if (token.equals("*")) return a * b;
      if (token.equals("/")) return a / b;
      return -1; // Handle invalid operator
  }

  public int evalRPN(String[] tokens) {
      Stack<Integer> st = new Stack<>();

      for (String token : tokens) {
          if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
              int b = st.pop();
              int a = st.pop();
              int result = Operator(a, b, token);
              st.push(result);
          } else {
              st.push(Integer.parseInt(token));
          }
      }
      return st.pop();
  }
}
/*

class Solution {
  public int evalRPN(String[] tokens) {
      Map<String, BiFunction<Integer, Integer, Integer>> operators = new HashMap<>();
      operators.put("+", (a, b) -> a + b);
      operators.put("-", (a, b) -> a - b);
      operators.put("*", (a, b) -> a * b);
      operators.put("/", (a, b) -> a / b);

      Stack<Integer> stack = new Stack<>();

      for (String token : tokens) {
          if (operators.containsKey(token)) {
              int b = stack.pop();
              int a = stack.pop();
              stack.push(operators.get(token).apply(a, b));
          } else {
              stack.push(Integer.parseInt(token));
          }
      }

      return stack.pop();
  }
}
*/