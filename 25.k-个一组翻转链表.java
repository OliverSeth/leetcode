/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-11 14:08:59 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-11 14:52:27
 */
/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead;
        ListNode q = newHead;
        ListNode start = newHead;
        ListNode newEnd = start.next;
        ListNode end = newHead.next.next;
        boolean isEnough = true;
        while (end != null) {
            isEnough = true;
            p = start.next;
            q = start;
            for (int i = 0; i < k; i++) {
                q = q.next;
                if (q == null) {
                    isEnough = false;
                    break;
                }
            }
            if (!isEnough) {
                return newHead.next;
            }
            for (int i = 0; i < k - 1; i++) {
                q = end;
                end = end.next;
                q.next = p;
                p = q;
                if (i == k - 2) {
                    start.next = q;
                    newEnd.next = end;
                }
                if (end == null) {
                    return newHead.next;
                }
            }
            start = newEnd;
            newEnd = start.next;
            end = end.next;
        }
        return newHead.next;
    }
}
// @lc code=end
