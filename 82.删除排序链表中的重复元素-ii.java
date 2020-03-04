/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-04 19:30:23 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-04 19:47:05
 */
/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        int val = head.val;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead;
        ListNode q = p.next;
        while (q != null && q.next != null) {
            if (q != head && q.val == val) {
                p.next = q.next;
                q = p.next;
            } else if (p.next.val == q.next.val) {
                val = p.next.val;
                p.next = q.next;
                q = p.next;
            } else {
                p = p.next;
                q = q.next;
            }
        }
        if (q != head && q != null && q.val == val) {
            p.next = null;
        }
        return newHead.next;
    }
}
// @lc code=end
