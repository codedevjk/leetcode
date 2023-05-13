class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxsum =nums[0];
        int currsum=0;

        for(int i=0;i<nums.length;i++)
        {
            currsum=currsum+nums[i];
            maxsum=Math.max(maxsum,currsum);
            if(currsum<0)
            {
                currsum=0;
            }
        }
        return maxsum;
    }
} //Kaden's Algorithm

/*
Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1. 
 */