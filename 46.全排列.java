/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-13 23:30:34 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-14 00:22:14
 */
/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> one, int[] nums) {
        if (one.size() == nums.length) {
            res.add(new ArrayList<>(one));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!one.contains(nums[i])) {
                one.add(nums[i]);
                backTrack(res, one, nums);
                one.remove(one.size() - 1);
            }
        }
    }
}
// @lc code=end
