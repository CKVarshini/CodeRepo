/*
Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:

answer[i] % answer[j] == 0, or
answer[j] % answer[i] == 0
If there are multiple solutions, return any of them.

 

Example 1:
Input: nums = [1,2,3]
Output: [1,2]
Explanation: [1,3] is also accepted.

Example 2:
Input: nums = [1,2,4,8]
Output: [1,2,4,8]
 
*/ 

class Solution {
  public List<Integer> largestDivisibleSubset(int[] nums) {
      Arrays.sort(nums);
      int[] dp = new int[nums.length];
      Arrays.fill(dp, 1);
      for (int i = 0; i < nums.length; i++) {
          for (int j = 0; j < i; j++) {
              if (nums[i] % nums[j] == 0) {
                  dp[i] = Math.max(dp[i], dp[j] + 1);
              }
          }
      }
      
      int maxLength = Arrays.stream(dp).max().orElse(0);
      int index = -1;

      for (int i = 0; i < dp.length; i++) {
          if (dp[i] == maxLength) {
              index = i;
              break;
          }
      }

      List<Integer> subset = new ArrayList<>();
      for (int i = index; i >= 0; i--) {
          if (nums[index] % nums[i] == 0 && dp[i] == maxLength) {
              subset.add(nums[i]);
              maxLength--;
          }
      }

      return subset; 
  }
}
