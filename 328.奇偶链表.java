/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-13 12:39:27 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-13 12:39:27 
 */
/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-13 12:39:11 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-13 12:39:11 
 */
/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode evenList = head.next;
        ListNode p = head;
        ListNode q = evenList;
        while (q != null && q.next != null) {
            p.next = q.next;
            p = p.next;
            q.next = p.next;
            q = q.next;
        }
        p.next = evenList;
        return head;
    }
}
// @lc code=end

