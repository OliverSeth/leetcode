/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-02 17:32:07 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-02 17:45:59
 */
/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode newHead = new ListNode(head.val);
        ListNode p = newHead;
        ListNode q;
        boolean isInsert;
        while (head.next != null) {
            isInsert = false;
            head = head.next;
            p = newHead;
            if (head.val < newHead.val) {
                q = new ListNode(head.val);
                q.next = newHead;
                newHead = q;
                continue;
            }
            while (p != null && p.next != null) {
                if (head.val >= p.next.val) {
                    p = p.next;
                } else {
                    isInsert = true;
                    q = new ListNode(head.val);
                    q.next = p.next;
                    p.next = q;
                    break;
                }
            }
            if (!isInsert) {
                q = new ListNode(head.val);
                p.next = q;
                q.next = null;
            }
        }
        return newHead;
    }
}
// @lc code=end
