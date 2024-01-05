/*
 Given a pattern containing only I's and D's. 
 I for increasing and D for decreasing. 
 Devise an algorithm to print the minimum number following that pattern.
  Digits from 1-9 and digits can't repeat.

Ex 1:
  Input:
   D 
 Output:
  21
  Explanation:
D is meant for decreasing, so we choose the minimum number among all possible numbers like 21,31,54,87,etc.
 */

import java.util.Stack;

class Solution {
    static String printMinNumberForPattern(String S) {
        int n = S.length() + 1;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int current = 0;

        for (int i = 0; i <= S.length(); i++) {
            stack.push(i + 1);

            if (i == S.length() || S.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result[current++] = stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]);
        }

        return sb.toString();
    }
}

