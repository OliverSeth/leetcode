import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-19 13:14:55 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-19 13:47:07
 */
/*
 * @lc app=leetcode.cn id=57 lang=java
 *
 * [57] 插入区间
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval.length == 0) {
            if (intervals.length == 0) {
                return new int[1][0];
            } else {
                return intervals;
            }
        }
        int left = newInterval[0];
        int right = newInterval[1];
        boolean insert = true;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < newInterval[0]) {
                list.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else if (intervals[i][0] > newInterval[1]) {
                if (insert) {
                    list.add(Arrays.asList(left, right));
                    insert = false;
                }
                list.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                left = Math.min(left, intervals[i][0]);
                right = Math.max(right, intervals[i][1]);
            }
        }
        if (insert) {
            list.add(Arrays.asList(left, right));
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }
        return res;
    }
}
// @lc code=end
