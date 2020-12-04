/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-03 14:55:39 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-03 14:55:39 
 */
/*
 * @lc app=leetcode.cn id=382 lang=java
 *
 * [382] 链表随机节点
 */

// @lc code=start
class Solution {

    private ListNode head;

    /**
     * @param head The linked list's head.
     *             Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    public Solution(ListNode head) {
        this.head = head;
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        ListNode p = head;
        int cnt = 1;
        int res = 0;
        while (p != null) {
            Random random = new Random();
            int num = random.nextInt(cnt);
            System.out.print(num);
            if (num == cnt - 1) {
                res = p.val;
            }
            cnt++;
            p = p.next;
        }
        return res;
    }
}
// @lc code=end

