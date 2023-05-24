class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int n = Integer.MAX_VALUE;
        nums = Arrays.copyOf(nums, nums.length + 1);
        nums[nums.length - 1] = n;
        
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        
        return 0;
    }
}