/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */

import java.util.HashMap;

class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
      
      // Create a HashMap to store character counts
      HashMap<Character, Integer> map = new HashMap<>();

      // Iterate through the characters in the magazine
      for (int i = 0; i < magazine.length(); i++) {
          char c = magazine.charAt(i);
          
          // If the character is not present in the HashMap, add it with count 1
          if (!map.containsKey(c)) {
              map.put(c, 1);
          } else {
              // If the character is already present, increment its count by 1
              map.put(c, map.get(c) + 1);
          }
      }
      
      // Iterate through the characters in the ransom note
      for (int i = 0; i < ransomNote.length(); i++) {
          char c = ransomNote.charAt(i);
          
          // If the character is present in the HashMap and its count is greater than 0,
          // decrement its count by 1
          if (map.containsKey(c) && map.get(c) > 0) {
              map.put(c, map.get(c) - 1);
          } else {
              // If the character is not present or its count is 0, return false
              return false;
          }
      }
      
      // so the ransom note can be formed from the magazine
      return true;
  }
}