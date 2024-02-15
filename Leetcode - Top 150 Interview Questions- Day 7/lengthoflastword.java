/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s. 
*/

class Solution {
  public int lengthOfLastWord(String s) {
      int count = 0;
      for (int i=s.length()-1;i>=0;i--){
          char ch = s.charAt(i);
          if (ch != ' '){
          count++;
          }
          else{
              // We encountered a whitespace after finding the last word, so we return its count
              if(count>0)
              return count;

          }
      }
      return count;
  }
}

/*
class Solution {
  public int lengthOfLastWord(String s) {
      int count = 0;
      boolean foundWord = false; // Flag to track if we've encountered the last word

      for (int i = s.length() - 1; i >= 0; i--) {
          char ch = s.charAt(i);
          if (ch != ' ') {
              count++;
              foundWord = true; // Mark that we've found a word
          } else if (foundWord) {
              // We encountered a whitespace after finding the last word, so we return its count
              return count;
          }
      }

      return count;
  }
}
*/