/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-19 19:07:50 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-19 19:20:51
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), 0, target, -1, nums);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> one, int sum, int target, int index, int[] nums) {
        if (one.size() == 4) {
            if (sum == target && !res.contains(one)) {
                res.add(new ArrayList<>(one));
            }
            return;
        }
        for (int i = index + 1; i < nums.length; i++) {
            one.add(nums[i]);
            backTrack(res, one, sum + nums[i], target, i, nums);
            one.remove(one.size() - 1);
        }
    }
}
