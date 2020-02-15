/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-15 22:47:09 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-15 22:55:56
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            backTrack(res, new ArrayList<>(), nums, -1, i);
        }
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> one, int[] nums, int index, int length) {
        if (one.size() == length) {
            res.add(new ArrayList<>(one));
            return;
        }
        for (int i = index + 1; i < nums.length; i++) {
            one.add(nums[i]);
            backTrack(res, one, nums, i, length);
            one.remove(one.size() - 1);
        }
    }
}
