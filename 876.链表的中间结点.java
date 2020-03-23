/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-23 13:54:30 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-23 14:01:34
 */
/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        len >>= 1;
        p = head;
        for (int i = 0; i < len; i++) {
            p = p.next;
        }
        return p;
    }
}
// @lc code=end
