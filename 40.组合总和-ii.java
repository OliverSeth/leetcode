/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-12 16:07:54 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-12 16:33:16
 */
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        // newCan = deduplicate(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), 0, target, candidates, 0);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> nums, int sum, int target, int[] candidates,
            int index) {
        if (sum == target) {
            if (!res.contains(new ArrayList<>(nums))) {
                res.add(new ArrayList<>(nums));
            }
            return;
        }
        if (sum < target) {
            for (int i = index; i < candidates.length; i++) {
                nums.add(candidates[i]);
                backTrack(res, nums, sum + candidates[i], target, candidates, i + 1);
                nums.remove(nums.size() - 1);
            }
        }
    }
}
