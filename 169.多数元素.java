/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-13 17:05:38 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-13 17:10:30
 */
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int fre = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > fre) {
                return nums[i];
            }
        }
        return 0;
    }
}