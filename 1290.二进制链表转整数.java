/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-19 13:49:52 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-19 13:49:52 
 */
/*
 * @lc app=leetcode.cn id=1290 lang=java
 *
 * [1290] 二进制链表转整数
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num *= 2;
            num += head.val;
            head = head.next;
        }
        return num;
    }
}
// @lc code=end
