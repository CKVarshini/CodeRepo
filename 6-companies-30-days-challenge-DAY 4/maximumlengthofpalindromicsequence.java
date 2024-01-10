/*
 Given a string s, find two disjoint palindromic subsequences of s such that the product of their lengths is maximized. The two subsequences are disjoint if they do not both pick a character at the same index.

Return the maximum possible product of the lengths of the two palindromic subsequences.

A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters. A string is palindromic if it reads the same forward and backward.

 

Example 1:

example-1
Input: s = "leetcodecom"
Output: 9
Explanation: An optimal solution is to choose "ete" for the 1st subsequence and "cdc" for the 2nd subsequence.
The product of their lengths is: 3 * 3 = 9.
Example 2:

Input: s = "bb"
Output: 1
Explanation: An optimal solution is to choose "b" (the first character) for the 1st subsequence and "b" (the second character) for the 2nd subsequence.
The product of their lengths is: 1 * 1 = 1.
Example 3:

Input: s = "accbcaxxcxx"
Output: 25
Explanation: An optimal solution is to choose "accca" for the 1st subsequence and "xxcxx" for the 2nd subsequence.
The product of their lengths is: 5 * 5 = 25.
 
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxProduct(String s) {
        char[] strArr = s.toCharArray();
        int n = strArr.length;
        Map<Integer, Integer> pali = new HashMap<>();
        // save all elligible combination into hashmap
        for (int mask = 0; mask < 1<<n; mask++){
            String subseq = "";
            for (int i = 0; i < 12; i++){
                if ((mask & 1<<i) > 0)
                    subseq += strArr[i];
            }
            if (isPalindromic(subseq))
                pali.put(mask, subseq.length());
        }
        // use & opertion between any two combination
        int res = 0;
        for (int mask1 : pali.keySet()){
            for (int mask2 : pali.keySet()){
                if ((mask1 & mask2) == 0)
                    res = Math.max(res, pali.get(mask1)*pali.get(mask2));
            }
        }

        return res;
    }

    public boolean isPalindromic(String str){
        int j = str.length() - 1;
        char[] strArr = str.toCharArray();
        for (int i = 0; i < j; i ++){
            if (strArr[i] != strArr[j])
                return false;
            j--;
        }
        return true;
    }
}
