class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        int i ,j,flag=0;
        Arrays.sort(nums);
        long n=nums.length;
        for(i=0;i<n-1;i++)
        {
                if(nums[i]==nums[i+1])
                {
                    flag=1;
                    break;
                }
            
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}

/*
 Given an integer array nums, return true if any
value appears at least twice in the array,
and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

