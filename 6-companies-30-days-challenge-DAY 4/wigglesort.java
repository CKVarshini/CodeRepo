/*
 Given an integer array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....

You may assume the input array always has a valid answer.

 

Example 1:

Input: nums = [1,5,1,1,6,4]
Output: [1,6,1,5,1,4]
Explanation: [1,4,1,5,1,6] is also accepted.
Example 2:

Input: nums = [1,3,2,2,3,1]
Output: [2,3,1,3,1,2]
 
 */

import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        
        // Clone the array to avoid modifying the original array
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        int mid = (n - 1) / 2;  // Midpoint index
        
        // Reorder the elements by placing larger elements at odd indices and smaller elements at even indices
        for (int i = 0, j = mid; i < n; i += 2, j--) {
            nums[i] = sortedNums[j];
        }
        
        for (int i = 1, j = n - 1; i < n; i += 2, j--) {
            nums[i] = sortedNums[j];
        }
    }
}
