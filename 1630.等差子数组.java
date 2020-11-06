/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-04 10:08:18 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-04 10:08:18 
 */
/*
 * @lc app=leetcode.cn id=1630 lang=java
 *
 * [1630] 等差子数组
 */

// @lc code=start
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int[][] array = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            array[i][0] = nums[i];
            array[i][1] = i;
        }
        List<Boolean> res = new ArrayList<>();
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0]) {
                    return -1;
                } else if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return 1;
                }
            }
        });
        int pos;
        for (int i = 0; i < l.length; i++) {
            List<Integer> list = new ArrayList<>();
            boolean isAri = true;
            for (pos = 0; pos < nums.length; pos++) {
                if (array[pos][1] >= l[i] && array[pos][1] <= r[i]) {
                    list.add(array[pos][0]);
                }
            }
            for (int j = 1; j < list.size() - 1; j++) {
                if (list.get(j) - list.get(j - 1) != list.get(j + 1) - list.get(j)) {
                    isAri = false;
                    break;
                }
            }
            res.add(isAri);
        }
        return res;
    }
}
// @lc code=end

