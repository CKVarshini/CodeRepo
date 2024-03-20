/*
 You are given a string s and an array of strings words. All the strings of words are of the same length.

A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.

For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated substring because it is not the concatenation of any permutation of words.
Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.

 

Example 1:

Input: s = "barfoothefoobarman", words = ["foo","bar"]
Output: [0,9]
Explanation: Since words.length == 2 and words[i].length == 3, the concatenated substring has to be of length 6.
The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
The output order does not matter. Returning [9,0] is fine too.
Example 2:

Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
Output: []
Explanation: Since words.length == 4 and words[i].length == 4, the concatenated substring has to be of length 16.
There is no substring of length 16 in s that is equal to the concatenation of any permutation of words.
We return an empty array.
Example 3:

Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
Output: [6,9,12]
Explanation: Since words.length == 3 and words[i].length == 3, the concatenated substring has to be of length 9.
The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"] which is a permutation of words.
The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"] which is a permutation of words.
The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"] which is a permutation of words.
 

Constraints:

1 <= s.length <= 104
1 <= words.length <= 5000
1 <= words[i].length <= 30
s and words[i] consist of lowercase English letters.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
      List<Integer> result = new ArrayList<>();
      if (s == null || s.length() == 0 || words == null || words.length == 0) {
          return result;
      }
      
      int wordLength = words[0].length(); // Length of each word
      int totalWords = words.length; // Total number of words
      int totalLength = wordLength * totalWords; // Total length of all words combined
      
      // Populate wordCount map
      Map<String, Integer> wordCount = new HashMap<>();
      for (String word : words) {
          wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
      }
      
      // Iterate through each starting index in s
      for (int i = 0; i <= s.length() - totalLength; i++) {
          // Create a copy of wordCount for each iteration
          Map<String, Integer> currentCount = new HashMap<>(wordCount);
          int j = i; // Pointer to iterate through substrings
          
          // Check each substring of length totalLength starting at index i
          while (j < i + totalLength) {
              String currentWord = s.substring(j, j + wordLength);
              
              // Check if currentWord exists in wordCount map
              if (currentCount.containsKey(currentWord)) {
                  int count = currentCount.get(currentWord);
                  
                  // If count is 0, then the currentWord has been used up
                  if (count == 0) {
                      break;
                  }
                  
                  // Decrement count and move to the next word
                  currentCount.put(currentWord, count - 1);
                  j += wordLength;
              } else {
                  // If currentWord is not in wordCount map, break the loop
                  break;
              }
          }
          
          // Check if all words have been used up in currentCount map
          if (j == i + totalLength) {
              result.add(i);
          }
      }
      
      return result;
  }
}

