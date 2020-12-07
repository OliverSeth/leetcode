/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-05 18:33:49 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-05 18:33:49 
 */
/*
 * @lc app=leetcode.cn id=621 lang=java
 *
 * [621] 任务调度器
 */

// @lc code=start
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int maxCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
            maxCount = Math.max(maxCount, map.get(task));
        }
        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                cnt++;
            }
        }
        return Math.max(tasks.length, (maxCount - 1) * (n + 1) + cnt);
    }
}
// @lc code=end

