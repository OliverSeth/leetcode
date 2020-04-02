/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-02 17:22:16 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-02 17:22:16 
 */
/*
 * @lc app=leetcode.cn id=1338 lang=java
 *
 * [1338] 数组大小减半
 */

// @lc code=start
class Solution {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] != arr[i - 1]) {
                list.add(cnt);
                cnt = 1;
            } else {
                cnt++;
            }
        }
        list.add(cnt);
        cnt = 0;
        Integer[] num = list.toArray(new Integer[0]);
        Arrays.sort(num);
        int sum = 0;
        for (int i = num.length - 1; sum < arr.length / 2; i--) {
            cnt++;
            sum += num[i];
        }
        return cnt;
    }
}
// @lc code=end

