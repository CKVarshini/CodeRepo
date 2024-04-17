/*
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        else{
            int count[]=new int[26];

            for(int i =0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            }

            for(int i =0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
            }

            for(int i =0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }
            }
            return true;
        }
        
    }
}

/*Using Hashmap
 
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in string s
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement counts for characters in string t
        for (char c : t.toCharArray()) {
            int count = charCount.getOrDefault(c, 0);
            if (count == 0) {
                return false; // If character not found or count becomes negative, not an anagram
            }
            charCount.put(c, count - 1);
        }

        // Check if all character counts are zero
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

  */
