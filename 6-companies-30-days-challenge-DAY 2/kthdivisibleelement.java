/*
 Given an integer array nums and two integers k and p, return the number of distinct subarrays, which have at most k elements that are divisible by p.

Two arrays nums1 and nums2 are said to be distinct if:

They are of different lengths, or
There exists at least one index i where nums1[i] != nums2[i].
A subarray is defined as a non-empty contiguous sequence of elements in an array.

 
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<String> distinctSubarrays = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            StringBuilder subarrayBuilder = new StringBuilder();

            for (int j = i; j < nums.length; j++) {
                if (nums[j] % p == 0) {
                    count++;
                }
                
                if (count > k) {
                    break;
                }

                subarrayBuilder.append(nums[j]).append(" ");
                distinctSubarrays.add(subarrayBuilder.toString().trim());
            }
        }

        return distinctSubarrays.size();
    }
  }
