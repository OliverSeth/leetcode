/*
 * @lc app=leetcode.cn id=1399 lang=java
 *
 * [1399] 统计最大组的数目
 */

// @lc code=start
class Solution {
    public int countLargestGroup(int n) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int sum = countSum(i);
            if (nums.size() == sum - 1) {
                nums.add(1);
            } else {
                nums.set(sum - 1, nums.get(sum - 1) + 1);
            }
        }
        int maxNum = 0;
        int cnt = 0;
        for (Integer num : nums) {
            if (num > maxNum) {
                cnt = 1;
                maxNum = num;
            } else if (num == maxNum) {
                cnt++;
            }
        }
        return cnt;
    }

    private int countSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
// @lc code=end
