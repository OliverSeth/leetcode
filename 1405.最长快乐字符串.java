/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-06 22:55:38 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-06 22:55:38 
 */
/*
 * @lc app=leetcode.cn id=1405 lang=java
 *
 * [1405] 最长快乐字符串
 */

// @lc code=start
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int[][] arr = new int[3][2];
        arr[0][0] = a;
        arr[0][1] = 0;
        arr[1][0] = b;
        arr[1][1] = 1;
        arr[2][0] = c;
        arr[2][1] = 2;
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        arr[2][0] = Math.min(arr[2][0], (arr[0][0] + arr[1][0] + 1) * 2);
        StringBuilder sb = new StringBuilder();
        int[] num = new int[3];
        while (!((arr[0][0] == 0) && (arr[1][0] == 0) && (arr[2][0] == 0))) {
            int maxSize = maxNum(arr[0][0], arr[1][0], arr[2][0]);
            int temp = (maxSize + 1) % 3;
            if (num[maxSize] == 2) {
                for (int i = 0; i < 3; i++) {
                    if (i != maxSize) {
                        if (arr[i][0] > arr[temp][0]) {
                            temp = i;
                        }
                    }
                }
                sb.append((char) (arr[temp][1] + 'a'));
                arr[temp][0]--;
                for (int i = 0; i < 3; i++) {
                    if (i == temp) {
                        num[i] = 1;
                    } else {
                        num[i] = 0;
                    }
                }
            } else {
                sb.append((char) (arr[maxSize][1] + 'a'));
                arr[maxSize][0]--;
                for (int i = 0; i < 3; i++) {
                    if (i == maxSize) {
                        num[i]++;
                    } else {
                        num[i] = 0;
                    }
                }
            }
        }
        return sb.toString();
    }

    private int maxNum(int a, int b, int c) {
        if (a >= b && a >= c) {
            return 0;
        } else if (b >= c) {
            return 1;
        } else {
            return 2;
        }
    }
}
// @lc code=end

