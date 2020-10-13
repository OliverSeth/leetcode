/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-13 23:18:51 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-13 23:18:51 
 */
/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode othHead = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(othHead);
        ListNode p = new ListNode(0);
        ListNode q = p;
        while (left != null && right != null) {
            if (left.val < right.val) {
                q.next = left;
                left = left.next;
            } else {
                q.next = right;
                right = right.next;
            }
            q = q.next;
        }
        q.next = left == null ? right : left;
        return p.next;
    }
}
// @lc code=end

