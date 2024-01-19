/*
 You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.

Return any such subsequence as an integer array of length k.

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

 

Example 1:

Input: nums = [2,1,3,3], k = 2
Output: [3,3]
Explanation:
The subsequence has the largest sum of 3 + 3 = 6.
Example 2:

Input: nums = [-1,-2,3,4], k = 3
Output: [-1,3,4]
Explanation: 
The subsequence has the largest sum of -1 + 3 + 4 = 6.
Example 3:

Input: nums = [3,4,3,3], k = 2
Output: [3,4]
Explanation:
The subsequence has the largest sum of 3 + 4 = 7. 
Another possible subsequence is [4, 3].
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
class Solution {
  public int[] maxSubsequence(int[] nums, int k) {
      Map<Integer, Queue<Integer>> map = new HashMap<>();
      for (int i = 0; i < nums.length; ++i) {
          map.computeIfAbsent(nums[i], key -> new LinkedList<>()).offer(i);
      } 
      Arrays.sort(nums);
      int[] result = new int[k];
      for (int i = nums.length - 1, j = 0; i > nums.length - k - 1; --i, ++j) {
          result[j] = nums[i];
      }
      Integer[] temp = new Integer[nums.length];
      for (int i = 0; i < k; ++i) {
          temp[map.get(result[i]).poll()] = result[i];
      }
      for (int i = 0, j = 0; i < nums.length; ++i) {
          if (temp[i] != null) {
              result[j] = temp[i];
              ++j;
          }
      }
      return result;
  }
}