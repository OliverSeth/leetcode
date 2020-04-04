/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-04 20:37:42 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-04 20:37:42 
 */
/*
 * @lc app=leetcode.cn id=1387 lang=java
 *
 * [1387] 将整数按权重排序
 */

// @lc code=start
class Solution {
    public int getKth(int lo, int hi, int k) {
        int[][] arr = new int[hi - lo + 1][2];
        for (int i = 0; i < hi - lo + 1; i++) {
            int num = lo + i;
            int cnt = 0;
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                cnt++;
            }
            arr[i][0] = lo + i;
            arr[i][1] = cnt;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        return arr[k - 1][0];
    }
}
// @lc code=end

