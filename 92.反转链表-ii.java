/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-28 14:23:47 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-28 14:23:47 
 */
/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode root = new ListNode(0);
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        head = root;
        for (int i = 0; i < m - 1; i++) {
            head.next = list.get(i);
            head = head.next;
        }
        for (int i = n - 1; i >= m - 1; i--) {
            head.next = list.get(i);
            head = head.next;
        }
        for (int i = n; i < list.size(); i++) {
            head.next = list.get(i);
            head = head.next;
        }
        head.next = null;
        return root.next;
    }
}
// @lc code=end

