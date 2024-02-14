/*
 Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 
 */
class Solution {
  public int[] productExceptSelf(int[] nums) {
      //Array to store all left multiplication 
      int[] left = new int[nums.length];

      //Array to store all right multiplication 
       int[] right = new int[nums.length];

       left[0] = 1;
       for(int i=1;i<nums.length;i++){
           left[i] = left[i-1]*nums[i-1];
       }

       right[nums.length-1] = 1;
       for(int i=nums.length-2;i>-1;i--){
           right[i] = right[i+1]*nums[i+1];
       }

       int ans[] = new int[nums.length];
       for(int i=0;i<nums.length;i++){
           ans[i] = left[i]*right[i];
       }
       
       return ans;
  }
}
