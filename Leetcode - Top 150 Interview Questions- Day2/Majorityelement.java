/*
 Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
 */

 //BOYER MOORE'S VOTING ALROGITHM 
class Solution {
  public int majorityElement(int[] nums) {

      int candidate = 0;
      int point = 0;
      for(int i=0;i<nums.length;i++){
          if(point==0){
              candidate = nums[i];
          }
          if(candidate==nums[i]){
              point++;
          }
          else{
              point--;
          }
      }
      return candidate;

  }
}    

/*
class Solution {
  public int majorityElement(int[] nums) {
 Arrays.sort(nums);
 return nums[nums.length/2];
     }
}
*/

