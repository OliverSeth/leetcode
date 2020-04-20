/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-20 12:04:24 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-20 12:04:24 
 */
/*
 * @lc app=leetcode.cn id=1288 lang=java
 *
 * [1288] 删除被覆盖区间
 */

// @lc code=start
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                }
                return o1[0] - o2[0];
            }
        });
        boolean[] isCover = new boolean[intervals.length];
        int cnt = 0;
        int left = 0;
        while (left < intervals.length) {
            for (int i = left + 1; i < intervals.length; i++) {
                if (!isCover[i]) {
                    if (intervals[left][1] >= intervals[i][1]) {
                        isCover[i] = true;
                        cnt++;
                    }
                }
            }
            left++;
            while (left < intervals.length && isCover[left]) {
                left++;
            }
        }
        return intervals.length - cnt;
    }
}
// @lc code=end
