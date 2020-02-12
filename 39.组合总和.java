/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-12 15:20:15 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-12 16:06:51
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), candidates, 0, target, 0);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> nums, int[] candidates, int sum, int target,
            int index) {
        if (sum == target) {
            res.add(new ArrayList<>(nums));
            return;
        }
        if (sum < target) {
            for (int i = index; i < candidates.length; i++) {
                nums.add(candidates[i]);
                backTrack(res, nums, candidates, sum + candidates[i], target, i);
                nums.remove(nums.size() - 1);
            }
        }
    }
}
