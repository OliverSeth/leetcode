/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-17 15:19:09 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-17 15:57:34
 */
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), n, k, 0);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> nums, int n, int k, int index) {
        if (nums.size() == k) {
            res.add(new ArrayList<>(nums));
            return;
        }
        if (nums.size() + n - index < k) {
            return;
        }
        for (int i = index + 1; i <= n; i++) {
            nums.add(i);
            backTrack(res, nums, n, k, i);
            nums.remove(nums.size() - 1);
        }
    }
}
