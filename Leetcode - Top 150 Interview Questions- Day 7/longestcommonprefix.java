/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

 class Solution {
  public String longestCommonPrefix(String[] strs) {
      StringBuilder result = new StringBuilder();
      Arrays.sort(strs);//sort the array 

      //Get first and last stirngs
      char first[] =  strs[0].toCharArray();
      char last[] = strs[strs.length-1].toCharArray();

      //Start comparing
      for(int i=0;i<first.length;i++){
          if(first[i] != last[i])
          break;

          result.append(first[i]);
      }
      return result.toString();
  }
}