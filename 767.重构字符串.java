/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-30 13:32:14 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-11-30 13:49:30
 */
/*
 * @lc app=leetcode.cn id=767 lang=java
 *
 * [767] 重构字符串
 */

// @lc code=start
class Solution {
    public String reorganizeString(String S) {
        int[][] arr = new int[26][2];
        for (int i = 0; i < 26; i++) {
            arr[i][1] = i;
        }
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'][0]++;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int sum = 0;
        for (int i = 0; i < 25; i++) {
            sum += arr[i][0];
        }
        if (arr[25][0] - sum > 1) {
            return "";
        }
        char[] res = new char[S.length()];
        if (arr[25][0] == sum + 1) {
            int pos = 0;
            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) {
                    res[i] = (char) ('a' + arr[25][1]);
                } else {
                    while (arr[pos][0] == 0) {
                        pos++;
                    }
                    res[i] = (char) ('a' + arr[pos][1]);
                    arr[pos][0]--;
                }
            }
        } else {
            int pos = 0;
            int tmp = 1;
            for (int i = 0; i < S.length(); i++, tmp += 2) {
                if (i * 2 + 1 >= S.length() && tmp % 2 == 1) {
                    tmp = 0;
                }
                while (arr[pos][0] == 0) {
                    pos++;
                }
                res[tmp] = (char) (arr[pos][1] + 'a');
                arr[pos][0]--;
            }
        }
        return String.valueOf(res);
    }
}
// @lc code=end

