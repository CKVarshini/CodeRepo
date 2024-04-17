/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true */

import java.util.HashMap;

class Solution {
  public boolean isIsomorphic(String s, String t) {
      if (s.length() != t.length())
          return false;

      HashMap<Character, Character> map = new HashMap<>();
      HashMap<Character, Boolean> visited = new HashMap<>();

      for (int i = 0; i < s.length(); i++) {
          char charS = s.charAt(i);
          char charT = t.charAt(i);

          if (map.containsKey(charS)) {
              if (map.get(charS) != charT)
                  return false;
          } else {
              if (visited.containsKey(charT))
                  return false;
              map.put(charS, charT);
              visited.put(charT, true);
          }
      }

      return true;
  }
}