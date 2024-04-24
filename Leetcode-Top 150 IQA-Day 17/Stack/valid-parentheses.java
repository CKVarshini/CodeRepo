/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*/

import java.util.Stack;

class Solution {
  public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

      for (char x : s.toCharArray()
           ) {

          if(x=='(')
          stack.push(')');
          else if (x=='{') 
          stack.push('}');
          else if (x=='[') 
          stack.push(']');
          
          else if (stack.isEmpty() || stack.pop()!=x) 
          return false;
           }
          
          return stack.isEmpty();
  }
}