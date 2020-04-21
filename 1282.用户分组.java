/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-21 11:43:12 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-21 11:43:12 
 */
// @lc code=start
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int[][] group = new int[groupSizes.length][2];
        for (int i = 0; i < groupSizes.length; i++) {
            group[i][0] = i;
            group[i][1] = groupSizes[i];
        }
        Arrays.sort(group, Comparator.comparingInt(o -> o[1]));
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for (int[] ints : group) {
            one.add(ints[0]);
            if (one.size() == ints[1]) {
                res.add(one);
                one = new ArrayList<>();
            }
        }
        return res;
    }
}
// @lc code=end
