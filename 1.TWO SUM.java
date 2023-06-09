class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int[] result = new int[2];
     Map<Integer, Integer> map = new HashMap<Integer, Integer>();
     for (int i = 0; i < numbers.length; i++) {
         if (map.containsKey(target - numbers[i])) {
             result[1] = i;
             result[0] = map.get(target - numbers[i]);
             return result;
         }
         map.put(numbers[i], i);
     }
     return result;
  }
 }
 /* 
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/
