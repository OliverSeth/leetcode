import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-29 14:27:33 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-29 14:50:47
 */
/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }
        Comparator<int[]> cmp = new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        };
        Arrays.sort(intervals, cmp);
        List<int[]> temp = new ArrayList<>();
        temp.add(0, intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (temp.get(temp.size() - 1)[1] >= intervals[i][0]) {
                int[] one = new int[] { temp.get(temp.size() - 1)[0],
                        Math.max(temp.get(temp.size() - 1)[1], intervals[i][1]) };
                temp.set(temp.size() - 1, one);
            } else {
                temp.add(intervals[i]);
            }
        }
        return temp.toArray(new int[temp.size()][]);
    }
}

// @lc code=end
