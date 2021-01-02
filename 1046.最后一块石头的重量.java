/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-30 10:17:40 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-30 10:22:47
 */
/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int stone : stones) {
            queue.offer(stone);
        }
        while (queue.size() > 1) {
            queue.offer(queue.poll() - queue.poll());
        }
        return queue.isEmpty() ? 0 : queue.peek();
    }
}
// @lc code=end

