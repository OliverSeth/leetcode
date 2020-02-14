/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-14 00:28:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-02-14 00:28:54 
 */
/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] array = new int[nums.length];
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums, used);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> one, int[] nums, boolean[] used) {
        if (one.size() == nums.length) {
            if (!res.contains(one)) {
                res.add(new ArrayList<>(one));
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                one.add(nums[i]);
                used[i] = true;
                backTrack(res, one, nums, used);
                one.remove(one.size() - 1);
                used[i] = false;
            }
        }
    }
}
// @lc code=end
