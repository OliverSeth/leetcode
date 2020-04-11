/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-11 17:20:18 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-11 17:20:18 
 */
/*
 * @lc app=leetcode.cn id=1313 lang=java
 *
 * [1313] 解压缩编码列表
 */

// @lc code=start
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
// @lc code=end
