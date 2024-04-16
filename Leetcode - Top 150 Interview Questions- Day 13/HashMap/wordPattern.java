/*
 Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 
 */

import java.util.HashMap;

class Solution {
  public boolean wordPattern(String pattern, String s) {
      String[] words = s.split(" ");

      // If lengths are different, not a bijection
      if (pattern.length() != words.length) {
          return false;
      }

      HashMap<Character, String> charToWord = new HashMap<>();
      HashMap<String, Character> wordToChar = new HashMap<>();

      for (int i = 0; i < pattern.length(); i++) {
          char ch = pattern.charAt(i);
          String word = words[i];

          // Check character to word mapping
          if (charToWord.containsKey(ch)) {
              String mappedWord = charToWord.get(ch);
              if (!mappedWord.equals(word)) {
                  return false;
              }
          } else {
              charToWord.put(ch, word);
          }

          // Check word to character mapping
          if (wordToChar.containsKey(word)) {
              char mappedChar = wordToChar.get(word);
              if (mappedChar != ch) {
                  return false;
              }
          } else {
              wordToChar.put(word, ch);
          }
      }

      return true;
  }
}
